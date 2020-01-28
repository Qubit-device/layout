#!/usr/bin/env python
import gdspy
import numpy as np
import comsol_parser_gdspy as cp

def main():

    # load file
    comsol_filename = "fourQ_test_pattern_cell_divide.java"
    parser = cp.comsol_parser()
    parser.load(comsol_filename)
    
    # show info
    #parser.ls_g_params()
    #parser.ls_geom()
    #parser.ls_objs("wp2")

    # change_paramter
    ## parser.g_params['read_D_pad'] = '0.660[mm]'

    # change geometric object
    parser.activate_geom_obj('wp2', ['c15', 'c16', 'c18', 'c17'], False)  # c15-18: positioning via
    parser.activate_geom_obj('wp2', ['c8'], False)  # c8: center via
    #print (parser.get_geom_obj('wp2', 'c15').__dict__)


    ## TiN pattern
    dry_etch_layer = 11
    cell_qc = gdspy.Cell('Qubit_Coplanar')
    poly_q = parser.export('wp1', layer=11, n_points_for_circle=256)
    poly_c = parser.export('wp5', layer=11, n_points_for_circle=128)
    poly_qc = gdspy.boolean(poly_q, poly_c, 'or', max_points=0, layer=dry_etch_layer)  ## disable max_points check


    ## JJ
    cell_JJ = gdspy.Cell('JJ')
    JJ_polys = generate_JJ()
    cell_JJ.add(JJ_polys)

    q_r_outer_hole = 300
    q_r_inner = 95
    q_gap = q_r_inner + (q_r_outer_hole - q_r_inner)/2
    q_dist = 2400

    p_JJ0 = (-q_dist/2+q_gap/np.sqrt(2), q_dist/2-q_gap/np.sqrt(2))
    p_JJ1 = (q_dist/2-q_gap/np.sqrt(2), q_dist/2-q_gap/np.sqrt(2))
    p_JJ2 = (-q_dist/2+q_gap/np.sqrt(2), -q_dist/2+q_gap/np.sqrt(2))
    p_JJ3 = (q_dist/2-q_gap/np.sqrt(2), -q_dist/2+q_gap/np.sqrt(2))
    p_JJ_list = [p_JJ0, p_JJ1, p_JJ2, p_JJ3]

    JJ_list = map(lambda x: gdspy.CellReference(cell_JJ, x), p_JJ_list)
    cell_qc.add(JJ_list)
    

    ## hook for JJ
    gap_for_JJ = 90/np.sqrt(2)
    hook_path_base = gdspy.FlexPath([(0, 0), (0, -4.5), (-3.5, -4.5)], 3, layer=dry_etch_layer)
    hook_path_base.translate(5, gap_for_JJ/2)

    hook_path_list = map(lambda x: gdspy.copy(hook_path_base).translate(*x), p_JJ_list)
    hook_path_union = None
    for path in hook_path_list:
        hook_path_union = gdspy.boolean(hook_path_union, path, 'or', max_points=0, layer=dry_etch_layer)

    #poly_qc_hook = gdspy.boolean(poly_qc, hook_path_union, 'not', max_points=0, layer=dry_etch_layer)
    #cell_qc.add(poly_qc_hook)
    cell_qc.add(hook_path_union)
    cell_qc.add(poly_c)
    cell_qc.add(poly_q)


   ## mask
    mask_layer = 100

    shift = 20

    cell_mask_shifted = gdspy.Cell('Shifted Pattern Mask')

    polyset_shifted = cp.gdspy_shift_size(poly_qc, shift ,layer=mask_layer)
    unit_size = 4000

    rect_fill_lr = gdspy.Path(150, (-unit_size/2, 0))
    rect_fill_lr.segment(unit_size, '+x', layer=mask_layer)
    rect_fill_bt = gdspy.Path(150, (0, -unit_size/2))
    rect_fill_bt.segment(unit_size, '+y', layer=mask_layer)

    rect_list = [gdspy.copy(rect_fill_lr).translate(0, -q_dist/2), gdspy.copy(rect_fill_lr).translate(0, q_dist/2),
                 gdspy.copy(rect_fill_bt).translate(-q_dist/2, 0), gdspy.copy(rect_fill_bt).translate(q_dist/2, 0)]

    rect_union = None
    for rect in rect_list:
        rect_union = gdspy.boolean(rect_union, rect, 'or', max_points=0, layer=mask_layer)

    mask_shifted = gdspy.boolean(polyset_shifted, rect_union, 'or', max_points=0, layer=mask_layer)

    cell_mask_shifted.add(mask_shifted)


    ## Via
    via_layer = 13
    top_Al_layer = 8
    bottom_Al_layer = 9

    cell_via = gdspy.Cell('Via')
    via_poly = parser.export('wp2', layer=via_layer)
    via_poly_Al_t = cp.gdspy_shift_size(via_poly, 35, layer=top_Al_layer)
    via_poly_Al_b = cp.gdspy_shift_size(via_poly, 20, layer=bottom_Al_layer)

    via_poly_Al_t = gdspy.boolean(via_poly_Al_t, mask_shifted, 'not', layer=top_Al_layer)   ## mask the top pattern

    cell_via.add([via_poly, via_poly_Al_t, via_poly_Al_b])

    ### center via
    center_via = gdspy.Round((0, 0), 75, layer=via_layer)
    center_via_Al_t = gdspy.Round((0, 0), 95, layer=top_Al_layer)
    center_via_Al_b = gdspy.Round((0, 0), 95, layer=bottom_Al_layer)
    cell_via.add([center_via, center_via_Al_t, center_via_Al_b])

    ### positioning via
    pos_via_dist = 7400
    pos_via_lt = gdspy.Round((-pos_via_dist/2, pos_via_dist/2), 520, layer=via_layer)
    pos_via_lt_Al_t = gdspy.Round((-pos_via_dist/2, pos_via_dist/2), 620, layer=top_Al_layer)
    pos_via_lt_Al_b = gdspy.Round((-pos_via_dist/2, pos_via_dist/2), 600, layer=bottom_Al_layer)
    pos_via_rb = gdspy.Round((pos_via_dist/2, -pos_via_dist/2), 520, layer=via_layer)
    pos_via_rb_Al_t = gdspy.Round((pos_via_dist/2, -pos_via_dist/2), 620, layer=top_Al_layer)
    pos_via_rb_Al_b = gdspy.Round((pos_via_dist/2, -pos_via_dist/2), 600, layer=bottom_Al_layer)
    cell_via.add([pos_via_lt, pos_via_lt_Al_t, pos_via_lt_Al_b, pos_via_rb, pos_via_rb_Al_t, pos_via_rb_Al_b])

    ### tiling Via
    cell_single_via = gdspy.Cell('single_via')
    via_s = gdspy.Round((0, 0), 75, layer=via_layer)
    via_s_Al_t = gdspy.Round((0, 0), 110, layer=top_Al_layer)
    via_s_Al_b = gdspy.Round((0, 0), 95, layer=bottom_Al_layer)
    cell_single_via.add([via_s, via_s_Al_t, via_s_Al_b])

    tiled_via_list = tile_cell(cell_single_via, (-4500, -4500), (4500, 4500), 500)

    cell_mask_via = gdspy.Cell('Via Mask')

    rect_mask_lr = gdspy.Rectangle((-2300, -400), (2300, 400), layer=mask_layer)
    rect_mask_bt = gdspy.Rectangle((-400, -2300), (400, 2300), layer=mask_layer)
    rect_mask_c =  gdspy.Rectangle((-1200, -1200), (1200, 1200), layer=mask_layer)
    rect_mask_lr1 = gdspy.copy(rect_mask_lr).translate(0, -1200)
    rect_mask_lr2 = gdspy.copy(rect_mask_lr).translate(0, 1200)
    rect_mask_bt1 = gdspy.copy(rect_mask_bt).translate(-1200, 0)
    rect_mask_bt2 = gdspy.copy(rect_mask_bt).translate(1200, 0)
    pos_via_mask_lt = gdspy.Round((-pos_via_dist/2, pos_via_dist/2), 600, layer=mask_layer)
    pos_via_mask_br = gdspy.Round((pos_via_dist/2, -pos_via_dist/2), 600, layer=mask_layer)

    cell_mask_via.add([rect_mask_lr1, rect_mask_lr2, rect_mask_bt1, rect_mask_bt2, rect_mask_c, pos_via_mask_lt, pos_via_mask_br])

    for via_ref in tiled_via_list:
        if np.any(gdspy.inside([via_ref.origin], cell_mask_via.polygons)):
            pass
        else:
            cell_via.add(via_ref)

 
    generate_flux_trap = False

    if generate_flux_trap:
        # Flux trap
        cell_single_flux_trap = gdspy.Cell('single_flux_trap')

        trap_size = np.array([5, 5])
        cell_single_flux_trap.add(gdspy.Rectangle(-trap_size/2, trap_size/2, layer=dry_etch_layer))

        cell_flux_trap = gdspy.Cell('Flux trap')
        flux_trap_list = tile_cell(cell_single_flux_trap, (-2500, -2500), (2500, 2500), 20)

        cell_mask_flux_trap = gdspy.Cell("Mask for flux trap")

        mask_flux_trap_on_via = cp.gdspy_shift_size(via_poly, 40, layer=mask_layer)
        mask_pos_via_lt = gdspy.Round((-pos_via_dist/2, pos_via_dist/2), 630, layer=mask_layer)
        mask_pos_via_rb = gdspy.Round((pos_via_dist/2, -pos_via_dist/2), 630, layer=mask_layer)
        cell_mask_flux_trap.add([mask_shifted, mask_flux_trap_on_via, mask_pos_via_lt, mask_pos_via_rb])


        ###
        for flux_trap_ref in flux_trap_list:
            if np.any(gdspy.inside([flux_trap_ref.origin], cell_mask_flux_trap.polygons)):
                pass
            else:
                cell_flux_trap.add(flux_trap_ref)


    # Top
    total_cell = gdspy.Cell('4Q total pattern')
    total_cell.add(gdspy.CellReference(cell_qc))
    total_cell.add(gdspy.CellReference(cell_via))

    if generate_flux_trap:
        total_cell.add(gdspy.CellReference(cell_flux_trap))

    #gdspy.LayoutViewer()

    gdspy.write_gds("4Q_pattern.gds", unit=1.0e-6, precision=1.0e-9)

    return 0


def tile_cell(tiled_cell, p_lb, p_rt, spacing):  
    ref_list = []
    left, bottom = p_lb
    right, top = p_rt
    for xpos in np.arange(left, right+spacing, spacing):
        for ypos in np.arange(bottom, top+spacing, spacing):
            ref_list.append(gdspy.CellReference(tiled_cell, (xpos, ypos)))
    
    return ref_list


def generate_JJ():
    root_width = 5
    root_height = 15
    tip_width = 2
    tip_height = 4
    taper_height=15

    cross_dist = 5
    cross_len = 8
    cross_width = 0.2

    uc_shift = 1
    uc_tip_height = 2.5

    base_layer = 30
    uc_layer = 40

    # base pattern
    base_path = gdspy.Path(root_width, (0, 0))
    base_path.segment(root_height, '+y', layer=base_layer)
    base_path.segment(taper_height, '+y', final_width=tip_width, layer=base_layer)
    base_path.segment(tip_height, '+y', layer=base_layer)

    tip_cir = gdspy.Round((0, root_height+taper_height+tip_height), tip_width/2, initial_angle=0, final_angle=np.pi, layer=base_layer)
    JJ_base1 = gdspy.boolean(base_path, tip_cir, 'or', max_points=0, layer=base_layer)
    JJ_base2 = gdspy.copy(JJ_base1).rotate(np.pi, (0, root_height+taper_height+tip_height)).translate(cross_dist, cross_dist)
    JJ_base = gdspy.boolean(JJ_base1, JJ_base2, 'or', max_points=0, layer=base_layer)

    JJ_cross1 = gdspy.Path(cross_width, (0, root_height+taper_height+tip_height))
    JJ_cross1.segment(cross_len, '+x', layer=base_layer)

    JJ_cross2 = gdspy.Path(cross_width, initial_point=(cross_dist, root_height+taper_height+tip_height+cross_dist))
    JJ_cross2.segment(cross_len, '-y', layer=base_layer)
    JJ_cross = gdspy.boolean(JJ_cross1, JJ_cross2, 'or', max_points=0, layer=base_layer)

    JJ_total = gdspy.boolean(JJ_base, JJ_cross, 'or', max_points=0, layer=base_layer)

    # under cut
    uc_path = gdspy.Path(root_width+2*uc_shift, (0, -uc_shift))
    uc_path.segment(root_height+uc_shift, '+y', layer=uc_layer)
    uc_path.segment(taper_height, '+y', final_width=tip_width+2*uc_shift, layer=uc_layer)
    uc_path.segment(tip_height+tip_width/2+uc_shift, '+y', layer=uc_layer)

    uc_base1 = uc_path
    uc_base2 = gdspy.copy(uc_base1).rotate(np.pi, (0, root_height+taper_height+tip_height)).translate(cross_dist, cross_dist)
    uc_base = gdspy.boolean(uc_base1, uc_base2, 'or', max_points=0, layer=uc_layer)

    uc_tip1 = gdspy.Path(uc_shift, (cross_len - uc_tip_height/2, root_height+taper_height+tip_height))
    uc_tip1.segment(uc_tip_height, '+x', layer=uc_layer)
    uc_tip2 = gdspy.Path(uc_shift, (cross_dist, root_height+taper_height+tip_height+cross_dist-cross_len+uc_tip_height/2))
    uc_tip2.segment(uc_tip_height, '-y', layer=uc_layer)
    uc_tip = gdspy.boolean(uc_tip1, uc_tip2, 'or', max_points=0, layer=uc_layer)

    uc = gdspy.boolean(uc_base, uc_tip, 'or', max_points=0, layer=uc_layer)    

    dx = -cross_dist/2
    dy = -(root_height+taper_height+tip_height+cross_dist/2)

    return [JJ_total.translate(dx, dy), uc.translate(dx, dy)]

if __name__ == '__main__':
    main()