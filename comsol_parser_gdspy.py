# comsol_parser.py
# The operating environment : Comsol 5.3
import numpy as np
from collections import deque
import re
import sys
import gdspy

# Basic operation
def vec_angle(v0, v1):
    m = np.array([[v0[0], v0[1]], [v1[0], v1[1]]])
    return np.arctan2(np.linalg.det(m), np.dot(v0, v1))


def rot_vec(v, angle):
    mat = np.array([[np.cos(angle), -np.sin(angle)],
                    [np.sin(angle), np.cos(angle)]])
    return np.dot(mat, v)

# gdspy geometry func
def gdspy_shift_size(polyset, shift, layer):
    new_polygons = []

    for ps in polyset.polygons:
        new_ps = []
        N = len(ps)
        for idx in range(N):
            vec = ps[idx] - ps[idx-1]
            vec_len = np.linalg.norm(vec)
            vec_t = vec / vec_len
            vec_n = np.array([vec_t[1], -vec_t[0]])

            new_ps.extend((ps[idx-1]+vec_n*shift, ps[idx]+vec_n*shift))

        new_polygons.append(gdspy.Polygon(np.array(new_ps)))

    #union_shape = polyset
    union_shape = None
    for poly in new_polygons:
        union_shape = gdspy.boolean(union_shape, poly, 'or', max_points=0, layer=layer)

    return union_shape

# parse utils
def parse_list_arg(input_str):
    out_list = []
    depth = 0
    paren_found = False
    for i, c in enumerate(input_str):
        if c == '{':
            paren_found = True
            if depth == 0:
                beg = i
                depth += 1
            elif c == '}':
                depth -= 1
            if depth == 0:
                out_list.append(parse_list_arg(input_str[beg+1:i]))
            elif depth < 0:
                raise Exception('Could not find the corresponding paren.')
    if paren_found == False:
        return list(map(lambda x: x.strip(' "'), split_cs_str(input_str)))
    else:
        return out_list

def split_cs_str(input_str, quote_char='"'):
    beg_idx = 0
    quote_flag = False
    out_list = []
    for i, c in enumerate(input_str):
        if c == quote_char:
            quote_flag = not quote_flag
        if c == ',' and (not quote_flag):
            out_list.append(input_str[beg_idx:i])
            beg_idx = i+1
    out_list.append(input_str[beg_idx:])
    return out_list

def make_method_arg_list(cmd_str):
    method_arg_list = []
    func_call_list = cmd_str.split(').')
    func_call_list[:-1] = list(map(lambda x: x + ')', func_call_list[:-1]))
    pattern = '(?P<method>\\w+)\\((?P<args>.*)\\)'
    regex = re.compile(pattern)
    arg_pattern = '(new (\\w+?)(\\[\\])+\\{.+\\}|".+?"|[-]?[0-9]+|true|false)'
    arg_regexp = re.compile(arg_pattern)
    list_pattern = 'new \\w+?(\\[\\])+\\{(.+)\\}'
    list_regexp = re.compile(list_pattern)

    for func_call in func_call_list:
        m = regex.match(func_call)
        if m:
            method = m.groupdict()['method']
            args = m.groupdict()['args']
            arg_list = []

            for m_arg in arg_regexp.finditer(args):
                arg = m_arg.group(0)
                m_list = list_regexp.match(arg)
                if m_list:
                    arg_list.append(parse_list_arg(m_list.group(2)))
                else:
                    arg_list.append(arg.strip(' "'))

            method_arg_list.append({'method': method,'args': arg_list})

    return method_arg_list


def recur_replace(input_str, user_dict):
    output_str = input_str
    for key, val in unit_dict.items():
        output_str = output_str.replace(key, val)
    return output_str


def cos_deg(deg):
    return np.cos(deg*(np.pi/180.0))
def sin_deg(deg):
    return np.sin(deg*(np.pi/180.0))
def tan_deg(deg):
    return np.tan(deg*(np.pi/180.0))
def comsol_range(start, step, stop):
    n = int((stop - start)/step)
    return np.array([start + step*i for i in range(n+1)])

func_dict = {
   'range': comsol_range,
   'cos': cos_deg,
   'sin': sin_deg,
   'tan': tan_deg,
   'sqrt': np.sqrt,
   'ceil': np.ceil,
   'floor': np.floor,
   'round': np.round,
   'mod': np.mod,
   'pi': np.pi,
   'true': True,
   'false': False
   }
unit_dict = {
   '[m]': '*1e6',
   '[mm]': '*1e3',
   '[um]': '*1',
   '[rad]': '*(180.0/pi)',
   '[deg]': '*1'
   }

def eval_val(val, global_params={}, local_params={}):
    if isinstance(val, list):
        return [ eval_val(elt, global_params, local_params) for elt in val ]
    val_exp = recur_replace(val, unit_dict)
    try:
        f_val = eval(val_exp, global_params, local_params)
    except:
        f_val = val_exp
    return f_val


class comsol_parser(object):

    def __init__(self, filename=None):
        if filename:
            self.load(filename)
        self.g_params = {}

    def load(self, filename):
        self.load_cmd(filename)
        self.parse_g_params()
        self.parse_geom_parts()

    def load_cmd(self, filename):
        self.input_file = filename
        cmd_pattern = '\\s*model.(?P<cmd>.*);'
        cmd_regex = re.compile(cmd_pattern)
        cmd_beg_pattern = '\\s*model.'
        cmd_beg_regex = re.compile(cmd_beg_pattern)
        f = open(self.input_file)
        self.cmd_list = []
        line_q = deque([])
        code_lines = []
        cmd_line_flag = False
        for line in f:
            line_s = line.strip()
            if line_s:
                m = cmd_beg_regex.match(line_s)
                if m:
                    cmd_line_flag = True
                if cmd_line_flag:
                    line_q.append(line_s)
                if line_s[-1] == ';':
                    code_lines.append(('').join(line_q))
                    line_q.clear()
                    cmd_line_flag = False

        for line in code_lines:
            m = cmd_regex.match(line)
            if m:
                x = make_method_arg_list(m.groupdict()['cmd'])
                if x:
                    self.cmd_list.append(x)

        f.close()

    def parse_g_params(self):
        for cmd in self.cmd_list:
            if cmd[0]['method'] == 'param':
                if cmd[1]['method'] == 'set':
                    key = cmd[1]['args'][0]
                    val = cmd[1]['args'][1]
                    self.g_params[key] = val   

    def eval_g_params(self):
        param_q = deque(self.g_params.items())

        self.g_params_evaluated = {}
        eval_g_params = func_dict.copy()
        err_count = 0
        while len(param_q) > 0:
            if err_count >= len(param_q):
                break
            key, val = param_q.popleft()
            val_exp = recur_replace(val, unit_dict)
            try:
                f_val = eval(val_exp, eval_g_params)
                self.g_params_evaluated[key] = f_val
                eval_g_params[key] = f_val
            except NameError as e:
                err_count += 1
                param_q.append((key, val))
            else:
                err_count = 0

        for param in param_q:
            print ('Warning: Parameter {} could not be evaluated. it was neglected.'.format(param), file=sys.stderr)

        return self.g_params_evaluated

    def parse_geom_parts(self):
        two_dim_part_cmd_list = {}
        part_id_str_list = []
        for cmd in self.cmd_list:
            if cmd[0]['method'] == 'geom':
                geom_cmd = cmd[1:]
                if geom_cmd[0]['method'] == 'create' and not cmd[0]['args']:
                    if geom_cmd[0]['args'][1] == 'Part' and geom_cmd[0]['args'][2] == '2':
                        part_id = geom_cmd[0]['args'][0]
                        two_dim_part_cmd_list[part_id] = []
                else:
                    part_id = cmd[0]['args'][0]
                    if part_id in two_dim_part_cmd_list:
                        if not part_id in part_id_str_list:
                            part_id_str_list.append(part_id)
                        two_dim_part_cmd_list[part_id].append(geom_cmd)

        self.two_dim_part_dict = {}

        for part_id, geom_cmd in two_dim_part_cmd_list.items():
            self.two_dim_part_dict[part_id] = comsol_two_dim_part(geom_cmd)
            #print ('Geometry Part Loaded: id = "{0}", name = "{1}"').format(part_id, self.two_dim_part_dict[part_id].get_part_name())

        part_id_int_list = []
        for part_id in part_id_str_list:
            m = re.match('part(\d+)', part_id)
            if m:
                part_id_int_list.append(int(m.group(1)))

        self.default_part_id = 'part{0}'.format(part_id_int_list[0])
        self.default_part_id_wp = 'part{0}'.format(min(part_id_int_list))

        two_dim_wp_cmd_list = {}
        for cmd in self.cmd_list:
            if len(cmd) > 2 and cmd[1]['method'] == 'geom':
                if cmd[2]['method'] == 'create' and cmd[2]['args'][1] == 'WorkPlane':
                    wp_id = cmd[2]['args'][0]
                    two_dim_wp_cmd_list[wp_id] = []
                elif cmd[2]['method'] == 'feature' and cmd[2]['args'][0] in two_dim_wp_cmd_list.keys():
                    if cmd[3]['method'] == 'label':
                        geom_cmd = cmd[3:]
                        wp_id = cmd[2]['args'][0]
                        two_dim_wp_cmd_list[wp_id].append(geom_cmd)
                    if cmd[3]['method'] == 'geom':
                        geom_cmd = cmd[4:]
                        wp_id = cmd[2]['args'][0]
                        two_dim_wp_cmd_list[wp_id].append(geom_cmd)

        self.two_dim_wp_dict = {}
        for wp_id, geom_cmd in two_dim_wp_cmd_list.items():
            self.two_dim_wp_dict[wp_id] = comsol_two_dim_part(geom_cmd)
            #print ('WorkPlane Loaded: id = "{0}", name = "{1}"').format(wp_id, self.two_dim_wp_dict[wp_id].get_part_name())

    def ls_geom(self):
        if self.two_dim_part_dict:
            print ("---- Geometry Parts ----")
            for part_id, geom_cmd in self.two_dim_part_dict.items():
                print ('id = "{0}", name = "{1}"'.format(part_id, self.two_dim_part_dict[part_id].get_part_name()))
            print ("----- Work Planes ------")
        if self.two_dim_part_dict:
            for wp_id, geom_cmd in self.two_dim_wp_dict.items():
                print ('id = "{0}", name = "{1}"'.format(wp_id, self.two_dim_wp_dict[wp_id].get_part_name()))

    def get_part_name(self, part_id):
        if part_id in self.two_dim_part_dict:
            part_name = self.two_dim_part_dict[part_id].get_part_name()
        elif part_id in self.two_dim_wp_dict:
            part_name = self.two_dim_wp_dict[part_id].get_part_name()
        else:
            raise Exception('Could not find the corresponding parts or wp.')
        return part_name

    def ls_g_params(self, eval=False):
        if eval:
            g_params = self.eval_g_params()
        else:
            g_params = self.g_params

        for key, val in g_params.items():
            print ('{0} = {1}'.format(key, val))

    def ls_objs(self, part_id, active_only=True, eval_params=False):
        if part_id in self.two_dim_part_dict:
            part = self.two_dim_part_dict[part_id]
            is_wp = False
        elif part_id in self.two_dim_wp_dict:
            part = self.two_dim_wp_dict[part_id]
            is_wp = True
        else:
            raise Exception('Could not find the corresponding parts or wp.')

        for idx, obj_id in enumerate(part.obj_order):
            obj = part.objs[obj_id]
            if active_only and (not obj.is_active):
                pass
            else:
                print ("{0}. id:{1}, type:{2}".format(idx, obj.id, obj.type))
                if obj.params:
                    print ("    params:")
                    for k, v in obj.params.items():
                        print ("      {0:<20} {1}".format(k, v))
                if obj.selections:
                    print ("    selections:")
                    for k, v in obj.selections.items():
                        print ("      {0:<20} {1}".format(k, v))

    def get_geom_obj(self, part_id, obj_id):
        if part_id in self.two_dim_part_dict:
            part = self.two_dim_part_dict[part_id]
        elif part_id in self.two_dim_wp_dict:
            part = self.two_dim_wp_dict[part_id]
        else:
            print ('Error: No part or workplane found.', file=sys.stderr)
            return
        return part.objs[obj_id]

    def activate_geom_obj(self, part_id, obj_ids, is_active):
        if isinstance(obj_ids, list):
            for obj_id in obj_ids:
                self.get_geom_obj(part_id, obj_id).is_active = is_active
        else:
            obj_id = obj_ids
            get_geom_obj(part_id, obj_id).is_active = is_active

    def export(self, part_id, layer=1, dbu=0.001, n_points_for_circle=128, max_points=199, input_params={}):
        gds_objs, export_obj_ids = self.gdsgen(part_id, layer=layer, dbu=dbu, n_points_for_circle=n_points_for_circle, input_params=input_params)
        
        polyset = None
        for obj_id in export_obj_ids:
            polyset = gdspy.boolean(polyset, gds_objs[obj_id], 'or', max_points=max_points, layer=layer)
        return polyset

    def gdsgen(self, part_id, layer=1, dbu=0.001, n_points_for_circle=128, input_params={}):
        self.eval_g_params()
        return self.gdsgen_part(part_id=part_id, layer=layer, dbu=dbu, n_points_for_circle=n_points_for_circle, input_params=input_params)

    def gdsgen_part(self, part_id, layer=1, dbu=0.001, n_points_for_circle=128, input_params={}):
        ##
        if isinstance(n_points_for_circle, float):
          n_points_for_circle = int(n_points_for_circle/dbu)
        ##
    
        export_obj_ids = []
        export_kl_obj_ids = []
        gds_objs = {}
        kl_objs = {}
        skipped_obj_ids = []
        
        if part_id in self.two_dim_part_dict:
            part = self.two_dim_part_dict[part_id]
            is_wp = False
        elif part_id in self.two_dim_wp_dict:
            part = self.two_dim_wp_dict[part_id]
            is_wp = True
        else:
            raise Exception('Could not find the corresponding parts or wp.')
            
        eval_g_params = func_dict.copy()
        eval_g_params.update(self.g_params_evaluated)
        if_skip_flag = False
  
        for obj_id in part.obj_order:
            local_params = None
            obj = part.objs[obj_id]
            if input_params:
                local_params = part.get_local_params(input_params)
                local_params.update(input_params)
            else:
                local_params = part.get_local_params()
                local_params.update(part.input_params)

            obj.eval_params(eval_g_params, local_params)

            if obj.is_active == False:
                pass

            elif obj.type == 'EndIf':
                if_skip_flag = False

            elif if_skip_flag == True:
                skipped_obj_ids.append(obj.id)

            elif obj.type == 'If':
                if obj.params_evaluated['condition'] == False:
                    if_skip_flag = True
                else:
                    if_skip_flag = False

            elif obj.type == 'Circle':
                r = obj.params_evaluated['r']
                angle_i = 0.
                angle_f = 2*np.pi
                r_i = 0.

                if 'angle' in obj.params_evaluated:
                    angle_f = obj.params_evaluated['angle'] * np.pi / 180.0

                if 'layer' in obj.params_evaluated:
                    if len(obj.params_evaluated['layer']) > 1:
                        print ('Warning: Circle with more than 1 layer is not supported ({}).'.format(obj.id), file=sys.stderr)
                    r_i = r - obj.params_evaluated['layer'][0]
                
                gds_obj = gdspy.Round((0, 0), r, initial_angle=angle_i, final_angle=angle_f, inner_radius=r_i, number_of_points=n_points_for_circle, layer=layer)
                if 'rot' in obj.params_evaluated:
                    gds_obj.rotate(obj.params_evaluated['rot'] * np.pi / 180.0)
                if 'pos' in obj.params_evaluated:
                    gds_obj.translate(*obj.params_evaluated['pos'])
                gds_objs[obj_id] = gds_obj
                export_obj_ids.append(obj_id)

            elif obj.type == 'Rectangle':
                size = np.array(obj.params_evaluated['size'])
                if 'base' in obj.params_evaluated and obj.params_evaluated['base'] == 'center':
                    gds_obj = gdspy.Rectangle(-size / 2.0, size / 2.0, layer=layer)
                else:
                    gds_obj = gdspy.Rectangle((0, 0), size, layer=layer)
                if 'rot' in obj.params_evaluated:
                    gds_obj.rotate(obj.params_evaluated['rot'] * np.pi / 180.0)
                if 'pos' in obj.params_evaluated:
                    gds_obj.translate(*obj.params_evaluated['pos'])
                gds_objs[obj_id] = gds_obj
                export_obj_ids.append(obj_id)
                

            elif obj.type == 'Polygon':
                if 'source' in obj.params_evaluated:
                    if obj.params_evaluated['source'] == 'table':
                        gds_obj = gdspy.Polygon(obj.params_evaluated['table'], layer=layer)
                        gds_objs[obj_id] = gds_obj
                        export_obj_ids.append(obj_id)
                    else:
                        print ('Unsupported source ({0}) in {1}'.format(params_evaluated['source'], obj.id, file=sys.stderr))
                else:
                    print ('Source not specified in {}'.format(obj.id), file=sys.stderr)

            elif obj.type == 'Union':
                sel = obj.selections['input']                
                union_list = []

                for sel_obj_id_org in sel:
                    if sel_obj_id_org in skipped_obj_ids:
                        sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                    else:
                        sel_obj_id = sel_obj_id_org
                    
                    union_list.append(sel_obj_id)
  
                    if sel_obj_id in export_obj_ids:
                        export_obj_ids.remove(sel_obj_id)

                if union_list:
                    union_obj = None
                    for sel_obj_id in union_list:
                        union_obj = gdspy.boolean(union_obj, gds_objs[sel_obj_id], 'or', precision=dbu, layer=layer)   
                    gds_objs[obj_id] = union_obj
                    export_obj_ids.append(obj_id)


            ### from here
            elif obj.type == 'Difference':
                selA = obj.selections['input']
                selB = obj.selections['input2']

                objA_list = []
                objB_list = []

                for sel_obj_id_org in selA:
                    if sel_obj_id_org in skipped_obj_ids:
                        sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                    else:
                        sel_obj_id = sel_obj_id_org
                        
                    objA_list.append(sel_obj_id)
                    
                    if sel_obj_id in export_obj_ids:
                        export_obj_ids.remove(sel_obj_id)

                for sel_obj_id_org in selB:
                    if sel_obj_id_org in skipped_obj_ids:
                        sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                    else:
                        sel_obj_id = sel_obj_id_org
                        
                    objB_list.append(sel_obj_id)
                    
                    if sel_obj_id in export_obj_ids:
                        export_obj_ids.remove(sel_obj_id)

                if objA_list:
                    objA = None
                    for sel_obj_id in objA_list:
                        objA = gdspy.boolean(objA, gds_objs[sel_obj_id], 'or', precision=dbu, layer=layer) 
                if objB_list:
                    objB = None
                    for sel_obj_id in objB_list:
                        objB = gdspy.boolean(objB, gds_objs[sel_obj_id], 'or', precision=dbu, layer=layer) 

                diff_obj = gdspy.boolean(objA, objB, 'not', precision=dbu, layer=layer) 
                gds_objs[obj_id] = diff_obj
                export_obj_ids.append(obj_id)

            elif obj.type == 'Move':
                if 'displx' in obj.params_evaluated:
                    displx = obj.params_evaluated['displx']
                else:
                    displx = 0
                if 'disply' in obj.params_evaluated:
                    disply = obj.params_evaluated['disply']
                else:
                    disply = 0
                sel = obj.selections['input']
                
                # for single slection
                if len(sel) > 1:
                    print ('Warning: {} of more than 1 object is not supported.'.format(obj.type), file=sys.stderr)
                sel_obj_id_org = sel[0]
                if sel_obj_id_org in skipped_obj_ids:
                    sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                else:
                    sel_obj_id = sel_obj_id_org

                sel_obj = gds_objs[sel_obj_id]
                move_obj = gdspy.copy(sel_obj, displx, disply)
                gds_objs[obj_id] = move_obj
                export_obj_ids.append(obj_id)
                if 'keep' in obj.params_evaluated and obj.params_evaluated['keep'] == True:
                    pass
                elif sel_obj_id in export_obj_ids:
                    export_obj_ids.remove(sel_obj_id)

            elif obj.type == 'Mirror':
                if 'pos' in obj.params_evaluated:
                    pos = np.array(obj.params_evaluated['pos'])
                else:
                    pos = np.array([0., 0.])

                if 'axis' in obj.params_evaluated:
                    axis = np.array(obj.params_evaluated['axis'])
                else:
                    axis = np.array([1., 0.])

                sel = obj.selections['input']
               
                # for single selection
                if len(sel) > 1:
                    print ('Warning: {} of more than 1 object is not supported.'.format(obj.type), file=sys.stderr)
                sel_obj_id_org = sel[0]
                if sel_obj_id_org in skipped_obj_ids:
                    sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                else:
                    sel_obj_id = sel_obj_id_org

                sel_obj = gds_objs[sel_obj_id]
                mirror_obj = gdspy.copy(sel_obj).mirror(pos, pos + np.array([-axis[1], axis[0]]))
                gds_objs[obj_id] = mirror_obj
                export_obj_ids.append(obj_id)
                if 'keep' in obj.params_evaluated and obj.params_evaluated['keep'] == True:
                    pass
                elif sel_obj_id in export_obj_ids:
                    export_obj_ids.remove(sel_obj_id)

            elif obj.type == 'Rotate':
                if 'rot' in obj.params_evaluated:
                    if isinstance(obj.params_evaluated['rot'], (list, tuple, np.ndarray)):  # can be ndarray when use range
                        rot = np.array(obj.params_evaluated['rot'])*np.pi/180  # rot can be the list of angle
                    else:
                        rot = np.array([obj.params_evaluated['rot']])*np.pi/180
                else:
                    rot = np.array([0.])

                if 'pos' in obj.params_evaluated:
                    pos = np.round(np.array(obj.params_evaluated['pos']))
                else:
                    pos = np.array([0., 0.])

                sel = obj.selections['input']
                if len(sel) > 1:
                    print ('Warning: {} of more than 1 object is not supported.'.format(obj.type), file=sys.stderr)
                sel_obj_id_org = sel[0]
                if sel_obj_id_org in skipped_obj_ids:
                    sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                else:
                    sel_obj_id = sel_obj_id_org

                sel_obj = gds_objs[sel_obj_id]
                rot_obj = gdspy.copy(sel_obj).rotate(rot[0], center=pos)

                for angle in rot[1:]:
                    rot_obj = gdspy.boolean(rot_obj, gdspy.copy(sel_obj).rotate(angle, center=pos), 'or', precision=dbu, layer=layer) 

                gds_objs[obj_id] = rot_obj
                export_obj_ids.append(obj_id)
                if 'keep' in obj.params_evaluated and obj.params_evaluated['keep'] == True:
                    pass
                elif sel_obj_id in export_obj_ids:
                    export_obj_ids.remove(sel_obj_id)

            elif obj.type == 'Array':
                if 'type' in obj.params_evaluated and obj.params_evaluated['type'] == 'linear':
                    linearsize = obj.params_evaluated['linearsize']
                    displ = np.array(obj.params_evaluated['displ'])
                    sel = obj.selections['input']
                    if len(sel) > 1:
                        print ('Warning: {} of more than 1 object is not supported.'.format(obj.type), file=sys.stderr)
                    sel_obj_id_org = sel[0]
                    if sel_obj_id_org in skipped_obj_ids:
                        sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                    else:
                        sel_obj_id = sel_obj_id_org
                        
                    sel_obj = gds_objs[sel_obj_id]
                    arr_obj = gdspy.copy(sel_obj)

                    for i in range(1, int(linearsize)):
                        displ_i = displ*i
                        arr_obj = gdspy.boolean(arr_obj, gdspy.copy(sel_obj).translate(*displ_i), 'or', precision=dbu, layer=layer)

                    if sel_obj_id in export_obj_ids:
                        export_obj_ids.remove(sel_obj_id)
                    gds_objs[obj_id] = arr_obj
                    export_obj_ids.append(obj_id)
                else:
                    fullsize = obj.params_evaluated['fullsize']
                    displ = np.array(obj.params_evaluated['displ'])
                    sel = obj.selections['input']
                    if len(sel) > 1:
                        print ('Warning: {} of more than 1 object is not supported.'.format(obj.type), file=sys.stderr)
                    sel_obj_id_org = sel[0]
                    if sel_obj_id_org in skipped_obj_ids:
                        sel_obj_id = part.objs[sel_obj_id_org].selections['input'][0]
                    else:
                        sel_obj_id = sel_obj_id_org

                    sel_obj = gds_objs[sel_obj_id]
                    arr_obj = gdspy.copy(sel_obj)

                    for i in range(int(fullsize[0])):
                        for j in range(int(fullsize[1])):
                            if (i, j) is (0, 0):
                                continue
                            displ_ij = np.array([i, j])*displ
                            arr_obj = gdspy.boolean(arr_obj, gdspy.copy(sel_obj).translate(*displ_ij), 'or', precision=dbu, layer=layer)

                    if sel_obj_id in export_obj_ids:
                        export_obj_ids.remove(sel_obj_id)
                    gds_objs[obj_id] = arr_obj
                    export_obj_ids.append(obj_id)

            elif obj.type == 'PartInstance':
                if 'part' in obj.params_evaluated:
                    pi_part_id = obj.params_evaluated['part']
                else:
                    if is_wp == True:
                        pi_part_id = self.default_part_id_wp
                    else:
                        pi_part_id = self.default_part_id

                if isinstance(obj.params_evaluated['inputexpr'][0], list): # 3.5a
                    pi_params = dict(obj.params_evaluated['inputexpr'])
                else:
                    pi_param_keys = self.two_dim_part_dict[pi_part_id].input_param_names
                    pi_param_vals = obj.params_evaluated['inputexpr']
                    pi_params = dict(zip(pi_param_keys, pi_param_vals))
  
                pi_objs, pi_export_obj_ids = self.gdsgen_part(pi_part_id, layer=layer, dbu=dbu, n_points_for_circle=n_points_for_circle, input_params=pi_params)

                if len(pi_export_obj_ids) > 1:
                    print ('Warning: PartInstance with more than 1 final objects is not supported ({}).'.format(pi_part_id), file=sys.stderr)
                    print ('         Take union in the definition of Geometry Parts', file=sys.stderr)

                pi_obj = pi_objs[pi_export_obj_ids[0]]
                if 'rot' in obj.params_evaluated:
                    angle = obj.params_evaluated['rot']*np.pi/180
                    pi_obj = pi_obj.rotate(angle)     
                if 'displ' in obj.params_evaluated:
                    displ = np.array(obj.params_evaluated['displ'])
                    pi_obj = pi_obj.translate(*displ)
                gds_objs[obj_id] = pi_obj
                export_obj_ids.append(obj_id)
                
            else:
                print ('Warning: object({}) was skipped.'.format(obj_id), file=sys.stderr)

        return (gds_objs, export_obj_ids)


class geom_obj(object):

    def __init__(self, obj_id, obj_type):
        self.id = obj_id
        self.type = obj_type
        self.features = []
        self.params = {}
        self.params_evaluated = {}
        self.selections = {}
        self.is_active = True

    def add_feature(self, feature):
        self.features.append(feature)

    def parse_features(self):
        def exclude_sub_sel(name):
            m = re.match('(\w+)\(\w+(,\w*)?\)', name)
            if m:
                print ('Warning (obj: {0}): subselection {1} is converted to full selection {2}'.format(self.id, name, m.group(1)), file=sys.stderr)
                return m.group(1)
            else:
                return name

        for feature_cmd in self.features:
            if feature_cmd[0]['method'] == 'label':
                self.name = feature_cmd[0]['args'][0]
            elif feature_cmd[0]['method'] == 'active':
                self.is_active = feature_cmd[0]['args'][0]
            elif feature_cmd[0]['method'] == 'selection' and (feature_cmd[1]['method'] == 'set' or feature_cmd[1]['method'] == 'named'):
                sel_name = feature_cmd[0]['args'][0]
                sel_objs = feature_cmd[1]['args'][0]
                if isinstance(sel_objs, list):
                    self.selections[sel_name] = list(map(exclude_sub_sel, sel_objs))
                else:
                    self.selections[sel_name] = [exclude_sub_sel(sel_objs)]
            elif feature_cmd[0]['method'] == 'set':
                param_name = feature_cmd[0]['args'][0]
                param_val = feature_cmd[0]['args'][1]
                self.params[param_name] = param_val
                
            elif feature_cmd[0]['method'] == 'setEntry':  # for 3.5a inputexpr
                param_name = feature_cmd[0]['args'][0]
                param_val = feature_cmd[0]['args'][1:]
                if not (param_name in self.params):
                    self.params[param_name] = []
                self.params[param_name].append(param_val)
            elif feature_cmd[0]['method'] == 'setIndex':
                param_name = feature_cmd[0]['args'][0]
                param_val = feature_cmd[0]['args'][1]
                param_idx = int(feature_cmd[0]['args'][2])
                if param_name in self.params:
                    cur_len = len(self.params[param_name])
                    if cur_len <= param_idx:
                        diff = param_idx - cur_len
                        self.params[param_name] = self.params[param_name] + [None] * diff + [param_val]
                    else:
                        self.params[param_name][param_idx] = param_val
                else:
                    self.params[param_name] = [None] * param_idx + [param_val]

        return

    def eval_params(self, global_params, local_params):
        for key, val in self.params.items():
            self.params_evaluated[key] = eval_val(val, global_params, local_params)


class comsol_two_dim_part(object):

    def __init__(self, geom_cmd_list):
        self.eval_g_params = func_dict.copy()
        self.name = ''
        self.input_params = {}
        self.input_param_names = []
        self.local_param_exprs = {}
        self.objs = {}
        self.obj_order = []
        for geom_cmd in geom_cmd_list:
            if geom_cmd[0]['method'] == 'label':
                self.name = geom_cmd[0]['args'][0]
            elif geom_cmd[0]['method'] == 'inputParam':
                if geom_cmd[1]['method'] == 'set':
                    key = geom_cmd[1]['args'][0]
                    val = geom_cmd[1]['args'][1]
                    val_exp = recur_replace(val, unit_dict)
                    f_val = eval(val_exp, self.eval_g_params)
                    self.input_params[key] = f_val
                    self.input_param_names.append(key)
            elif geom_cmd[0]['method'] == 'localParam':
                if geom_cmd[1]['method'] == 'set':
                    key = geom_cmd[1]['args'][0]
                    val = geom_cmd[1]['args'][1]
                    self.local_param_exprs[key] = val
            elif geom_cmd[0]['method'] == 'create':
                obj_id = geom_cmd[0]['args'][0]
                obj_type = geom_cmd[0]['args'][1]
                self.objs[obj_id] = geom_obj(obj_id, obj_type)
                self.obj_order.append(obj_id)
            elif geom_cmd[0]['method'] == 'feature':
                obj_id = geom_cmd[0]['args'][0]
                self.objs[obj_id].add_feature(geom_cmd[1:])
        for obj in self.objs.values():
            obj.parse_features()

    def get_local_params(self, input_params=None):
        if input_params:
            eval_input_params = input_params.copy()
        else:
            eval_input_params = self.input_params.copy()
        local_params = {}
        
        param_q = deque(self.local_param_exprs.items())
        err_count = 0
        while len(param_q) > 0:
            if err_count >= len(param_q):
                break
            key, val = param_q.popleft()
            val_exp = recur_replace(val, unit_dict)
            try:
                f_val = eval(val_exp, self.eval_g_params, eval_input_params)
                local_params[key] = f_val
                eval_input_params[key] = f_val
            except NameError as e:
                err_count += 1
                param_q.append((key, val))
            else:
                err_count = 0
        for param in param_q:
            print ('Warning: Parameter {} could not be evaluated. it was neglected.'.format(param), file=sys.stderr)
        #for key, val in self.local_param_exprs.items():
        #    val_exp = recur_replace(val, unit_dict)
        #    f_val = eval(val_exp, self.eval_g_params, eval_input_params)
        #    local_params[key] = f_val
        return local_params

    def get_part_name(self):
        return self.name
