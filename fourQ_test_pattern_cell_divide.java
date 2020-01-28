/*
 * fourQ_test_pattern_cell_divide.java
 */

import com.comsol.model.*;
import com.comsol.model.util.*;

/** Model exported on Sep 3 2019, 22:29 by COMSOL 5.3.0.316. */
public class fourQ_test_pattern_cell_divide {

  public static Model run() {
    Model model = ModelUtil.create("Model");

    model
         .modelPath("/home/qipe/bali/Personal Files/tamate/fabrication/design/20190903_4Q_pattern_dense_resonator_freq");

    model.label("4Q_test_pattern_cell_divide.mph");

    model.comments("Untitled\n\n");

    model.param().set("Q_D_inner_cir", "Q_D_inner_hole + 2*Q_w_inner_ring");
    model.param().set("Q_D_outer_cir", "Q_D_outer_hole + 2*Q_w_outer_ring");
    model.param().set("Q_D_outer_hole", "0.6[mm]");
    model.param().set("Q_w_JJ_support", "20[um]");
    model.param().set("Q_w_JJ", "10[um]");
    model.param().set("Q_h_JJ", "110[um]");
    model.param().set("subs_t", "300[um]");
    model.param().set("subs_w", "6[mm]");
    model.param().set("subs_h", "6[mm]");
    model.param().set("cav_h", "1.3[mm]");
    model.param().set("cav_d", "6[mm]");
    model.param().set("cav_w", "6[mm]");
    model.param().set("Q_w_bar", "20[um]");
    model.param().set("Q_l_bar", "(Q_spacing - Q_D_outer_cir)/2 - Q_w_pad");
    model.param().set("Q_w_pad", "0.075[mm]");
    model.param().set("Q_h_pad", "110[um]");
    model.param().set("GND_gap", "40[um]");
    model.param().set("GND_D_via", "150[um]");
    model.param().set("GND_via_dist", "50[um]");
    model.param().set("GND_via_spacing", "(Q_l_bar - 2*GND_gap - 2*GND_via_dist - GND_D_via)/(GND_num_Q_hand_via-1)");
    model.param().set("Q_D_inner_hole", "0[mm]");
    model.param().set("ctrl_bottom_D_pad", "0.3[mm]");
    model.param().set("Ccoax_D_outer", "1.19[mm]");
    model.param().set("Ccoax_D_dielectric", "0.94[mm]");
    model.param().set("Ccoax_D_center", "0.287[mm]");
    model.param().set("Ccoax_L", "1[mm]");
    model.param().set("Ccoax_gap", "0.0[mm]");
    model.param().set("Q2_L_JJ", "6.5[nH]");
    model.param().set("Q_w_outer_ring", "20[um]");
    model.param().set("Q_w_inner_ring", "95[um]");
    model.param().set("read_w_line", "20[um]");
    model.param().set("read_D_pad", "0.646[mm]");
    model.param().set("read_angle_pad", "70[deg]");
    model.param().set("read_w_pad", "20[um]");
    model.param().set("read_l_pad_bar", "230[um]");
    model.param().set("read_meander_spacing", "60[um]");
    model.param()
         .set("read_l_end_bar", "read_diag_dist - (read_D_pad/2 + read_D_end/2 + read_l_pad_bar + read_meander_spacing*(2*read_num_meander_repeat+1))");
    model.param().set("read_l_line", "500[um]");
    model.param().set("read_num_meander_repeat", "5");
    model.param().set("read_s_line", "12[um]");
    model.param().set("read_s_angle_pad", "10[deg]");
    model.param().set("Q_spacing", "2[mm]");
    model.param().set("GND_num_Q_hand_via", "5");
    model.param().set("read_D_end", "0.3[mm]");
    model.param().set("read_w_end", "20[um]");
    model.param().set("read_angle_end", "30[deg]");
    model.param().set("read_D_via_pad", "0.2[mm]");
    model.param().set("read_D_via_pad_comp", "0.42[mm]");
    model.param().set("read_D_via", "150[um]");
    model.param().set("read_bottom_D_via_pad", "0.3[mm]");
    model.param().set("read_bottom_D_via_pad_comp", "0.6[mm]");
    model.param().set("Rcoax_D_center", "0.2[mm]");
    model.param().set("Rcoax_D_dielectric", "0.66[mm]");
    model.param().set("Rcoax_D_outer", "0.86[mm]");
    model.param().set("Rcoax_L", "1[mm]");
    model.param().set("Rcoax_L_center_tip", "0[mm]");
    model.param().set("Q_JJ_pos_offset", "0[mm]");
    model.param().set("ctrl_bottom_D_pad_comp", "0.5[mm]");
    model.param().set("num_Q_x", "2");
    model.param().set("num_Q_y", "1");
    model.param().set("Q1_L_JJ", "6.9[nH]");
    model.param().set("Q_L_JJ", "6.5[nH]");
    model.param().set("ctrl_stub_w", "40[um]");
    model.param().set("Qg_zig_width", "100[um]");
    model.param().set("Qg_zig_height", "20[um]");
    model.param().set("Qg_n_zigzag", "(floor(Q_h_pad / Qg_zig_height))");
    model.param().set("Qg_line_width", "10[um]");
    model.param().set("read_diag_dist", "sqrt(2)*(Q_spacing/2 + abs(Q_center_xoffset))");
    model.param().set("read1_l_line", "489[um]");
    model.param().set("read2_l_line", "477[um]");
    model.param().set("Q_JJ_angle", "45[deg]");
    model.param().set("GND_num_bar_via", "5");
    model.param().set("Q_center_xoffset", "-0.2[mm]");
    model.param().set("Q_r_winding", "45[um]");
    model.param().set("Q_winding_offset", "0.2[mm]");
    model.param().set("Ccoax_center_yoffset", "0[mm]");
    model.param().set("ctrl_stub_w_single", "50[um]");
    model.param().set("Ccoax_D_probe", "0.22[mm]");
    model.param().set("Ccoax_D_iris_hole", "0.7[mm]");
    model.param().set("Ccoax_t_iris", "0.3[mm]");
    model.param().set("Q_center_yoffset", "-0.2[mm]");
    model.param().set("Q3_L_JJ", "6.7[nH]");
    model.param().set("Q4_L_JJ", "6.3[nH]");
    model.param().set("read3_l_line", "471[um]");
    model.param().set("read4_l_line", "483[um]");
    model.param().set("Q_l_horiz_support", "65[um]");
    model.param().set("read_D_via_center", "0.8[mm]");

    model.component().create("comp1", true);

    model.component("comp1").geom().create("geom1", 3);

    model.result().table().create("evl3", "Table");
    model.result().table().create("tbl1", "Table");

    model.component("comp1").mesh().create("mesh1");

    model.geom().create("part1", "Part", 2);
    model.geom().create("part2", "Part", 2);
    model.geom().create("part3", "Part", 2);
    model.geom().create("part4", "Part", 2);
    model.geom().create("part5", "Part", 3);
    model.geom().create("part7", "Part", 2);
    model.geom().create("part6", "Part", 2);
    model.geom().create("part8", "Part", 2);
    model.geom().create("part9", "Part", 2);
    model.geom().create("part10", "Part", 2);
    model.geom().create("part11", "Part", 2);
    model.geom().create("part12", "Part", 2);
    model.geom().create("part13", "Part", 2);
    model.geom().create("part14", "Part", 2);
    model.geom().create("part15", "Part", 3);
    model.geom().create("part16", "Part", 3);
    model.geom().create("part17", "Part", 2);
    model.geom().create("part18", "Part", 2);
    model.geom().create("part19", "Part", 2);
    model.geom().create("part20", "Part", 2);
    model.geom().create("part21", "Part", 2);
    model.geom("part1").label("Qubit_base");
    model.geom("part1").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part1").inputParam().set("D_inner_hole", "0[mm]");
    model.geom("part1").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part1").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part1").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part1").inputParam().set("h_JJ", "30[um]");
    model.geom("part1").inputParam().set("w_JJ", "10[um]");
    model.geom("part1").inputParam().set("JJ_pos_offset", "-10[um]");
    model.geom("part1").create("c5", "Circle");
    model.geom("part1").feature("c5").label("inner_cir");
    model.geom("part1").feature("c5").set("r", "D_inner_cir/2.0");
    model.geom("part1").create("c3", "Circle");
    model.geom("part1").feature("c3").label("outer_cir");
    model.geom("part1").feature("c3").set("type", "curve");
    model.geom("part1").feature("c3").set("layername", new String[]{"Layer 1"});
    model.geom("part1").feature("c3").setIndex("layer", "(D_outer_cir - D_outer_hole)/2", 0);
    model.geom("part1").feature("c3").set("r", "D_outer_cir/2.0");
    model.geom("part1").create("r1", "Rectangle");
    model.geom("part1").feature("r1").label("connection");
    model.geom("part1").feature("r1").set("pos", new String[]{"-w_JJ_support/2", "D_inner_hole/2"});
    model.geom("part1").feature("r1").set("size", new String[]{"w_JJ_support", "(D_outer_hole - D_inner_hole)/2.0"});
    model.geom("part1").create("r3", "Rectangle");
    model.geom("part1").feature("r3").label("JJ_blank");
    model.geom("part1").feature("r3")
         .set("pos", new String[]{"-w_JJ_support/2", "(D_outer_hole + D_inner_cir)/4.0 - h_JJ/2 + JJ_pos_offset"});
    model.geom("part1").feature("r3").set("size", new String[]{"w_JJ_support", "h_JJ"});
    model.geom("part1").create("dif3", "Difference");
    model.geom("part1").feature("dif3").label("connection_electrode");
    model.geom("part1").feature("dif3").selection("input").set(new String[]{"r1"});
    model.geom("part1").feature("dif3").selection("input2").set(new String[]{"r3"});
    model.geom("part1").create("uni1", "Union");
    model.geom("part1").feature("uni1").label("total_electrode");
    model.geom("part1").feature("uni1").set("intbnd", false);
    model.geom("part1").feature("uni1").selection("input").set(new String[]{"c3", "c5", "dif3"});
    model.geom("part1").run();
    model.geom("part2").label("Qubit_hand");
    model.geom("part2").inputParam().set("w_bar", "20[um]");
    model.geom("part2").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part2").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part2").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part2").create("r1", "Rectangle");
    model.geom("part2").feature("r1").label("bar");
    model.geom("part2").feature("r1").set("pos", new String[]{"0", "-w_bar/2.0"});
    model.geom("part2").feature("r1").set("size", new String[]{"l_bar", "w_bar"});
    model.geom("part2").create("r2", "Rectangle");
    model.geom("part2").feature("r2").label("pad");
    model.geom("part2").feature("r2").set("pos", new String[]{"l_bar", "-h_pad/2.0"});
    model.geom("part2").feature("r2").set("size", new String[]{"w_pad", "h_pad"});
    model.geom("part2").create("uni1", "Union");
    model.geom("part2").feature("uni1").set("intbnd", false);
    model.geom("part2").feature("uni1").selection("input").set(new String[]{"r1", "r2"});
    model.geom("part2").run();
    model.geom("part3").label("Qubit");
    model.geom("part3").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part3").inputParam().set("D_inner_hole", "0.2[mm]");
    model.geom("part3").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part3").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part3").inputParam().set("w_JJ", "10[um]");
    model.geom("part3").inputParam().set("h_JJ", "30[um]");
    model.geom("part3").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part3").inputParam().set("w_bar", "20[um]");
    model.geom("part3").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part3").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part3").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part3").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part3").create("pi1", "PartInstance");
    model.geom("part3").feature("pi1").label("Qubit_base");
    model.geom("part3").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part3").feature("pi1").set("rot", -45);
    model.geom("part3").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part3").create("pi2", "PartInstance");
    model.geom("part3").feature("pi2").label("Qubit_hand_R");
    model.geom("part3").feature("pi2").set("part", "part2");
    model.geom("part3").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2", "w_pad", "h_pad"});
    model.geom("part3").feature("pi2").set("displ", new String[]{"D_outer_hole/2", "0"});
    model.geom("part3").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part3").create("pi3", "PartInstance");
    model.geom("part3").feature("pi3").label("Qubit_hand_L");
    model.geom("part3").feature("pi3").set("part", "part2");
    model.geom("part3").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2", "w_pad", "h_pad"});
    model.geom("part3").feature("pi3").set("displ", new String[]{"-D_outer_hole/2", "0"});
    model.geom("part3").feature("pi3").set("rot", 180);
    model.geom("part3").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part3").create("pi4", "PartInstance");
    model.geom("part3").feature("pi4").label("Qubit_hand_U");
    model.geom("part3").feature("pi4").set("part", "part2");
    model.geom("part3").feature("pi4")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2", "w_pad", "h_pad"});
    model.geom("part3").feature("pi4").set("displ", new String[]{"0", "D_outer_hole/2"});
    model.geom("part3").feature("pi4").set("rot", 90);
    model.geom("part3").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part3").create("pi5", "PartInstance");
    model.geom("part3").feature("pi5").label("Qubit_hand_D");
    model.geom("part3").feature("pi5").set("part", "part2");
    model.geom("part3").feature("pi5")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2", "w_pad", "h_pad"});
    model.geom("part3").feature("pi5").set("displ", new String[]{"0", "-D_outer_hole/2"});
    model.geom("part3").feature("pi5").set("rot", -90);
    model.geom("part3").feature("pi5").set("selkeepnoncontr", false);
    model.geom("part3").create("uni1", "Union");
    model.geom("part3").feature("uni1").set("intbnd", false);
    model.geom("part3").feature("uni1").selection("input").set(new String[]{"pi1(1)", "pi2", "pi3", "pi4", "pi5"});
    model.geom("part3").run();
    model.geom("part3").run("pi5");
    model.geom("part4").label("GND_comp");
    model.geom("part4").inputParam().set("D_q_cir", "0.6[mm]");
    model.geom("part4").inputParam().set("w_bar", "20[um]");
    model.geom("part4").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part4").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part4").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part4").create("c1", "Circle");
    model.geom("part4").feature("c1").label("Qubit_circle");
    model.geom("part4").feature("c1").set("r", "D_q_cir/2");
    model.geom("part4").create("pi1", "PartInstance");
    model.geom("part4").feature("pi1").label("Qubit_hand_R");
    model.geom("part4").feature("pi1").set("part", "part2");
    model.geom("part4").feature("pi1").set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part4").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part4").create("pi2", "PartInstance");
    model.geom("part4").feature("pi2").label("Qubit_hand_L");
    model.geom("part4").feature("pi2").set("part", "part2");
    model.geom("part4").feature("pi2").set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part4").feature("pi2").set("rot", 180);
    model.geom("part4").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part4").create("pi3", "PartInstance");
    model.geom("part4").feature("pi3").label("Qubit_hand_U");
    model.geom("part4").feature("pi3").set("part", "part2");
    model.geom("part4").feature("pi3").set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part4").feature("pi3").set("rot", 90);
    model.geom("part4").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part4").create("pi4", "PartInstance");
    model.geom("part4").feature("pi4").label("Qubit_hand_D");
    model.geom("part4").feature("pi4").set("part", "part2");
    model.geom("part4").feature("pi4").set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part4").feature("pi4").set("rot", -90);
    model.geom("part4").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part4").create("uni1", "Union");
    model.geom("part4").feature("uni1").set("intbnd", false);
    model.geom("part4").feature("uni1").selection("input").set(new String[]{"c1", "pi1", "pi2", "pi3", "pi4"});
    model.geom("part4").run();
    model.geom("part5").label("coax_cable");
    model.geom("part5").inputParam().set("D_outer", "0.86[mm]");
    model.geom("part5").inputParam().set("D_dielectric", "0.66[mm]");
    model.geom("part5").inputParam().set("D_center", "0.2[mm]");
    model.geom("part5").inputParam().set("L", "5[mm]");
    model.geom("part5").inputParam().set("L_center_tip", "-0.5[mm]");
    model.geom("part5").create("cyl1", "Cylinder");
    model.geom("part5").feature("cyl1").label("outer_cylinder");
    model.geom("part5").feature("cyl1").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl1").set("r", "D_outer/2.0");
    model.geom("part5").feature("cyl1").set("h", "L");
    model.geom("part5").create("cyl6", "Cylinder");
    model.geom("part5").feature("cyl6").active(false);
    model.geom("part5").feature("cyl6").label("outer_diff");
    model.geom("part5").feature("cyl6").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl6").set("r", "D_dielectric/2.0");
    model.geom("part5").feature("cyl6").set("h", "L");
    model.geom("part5").create("dif2", "Difference");
    model.geom("part5").feature("dif2").active(false);
    model.geom("part5").feature("dif2").label("outer");
    model.geom("part5").feature("dif2").selection("input").set(new String[]{"cyl1"});
    model.geom("part5").feature("dif2").selection("input2").set(new String[]{"cyl6"});
    model.geom("part5").create("cyl2", "Cylinder");
    model.geom("part5").feature("cyl2").label("dielectric_cyliner");
    model.geom("part5").feature("cyl2").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl2").set("r", "D_dielectric/2.0");
    model.geom("part5").feature("cyl2").set("h", "L");
    model.geom("part5").create("cyl5", "Cylinder");
    model.geom("part5").feature("cyl5").active(false);
    model.geom("part5").feature("cyl5").label("dielectric_diff");
    model.geom("part5").feature("cyl5").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl5").set("r", "D_center/2.0");
    model.geom("part5").feature("cyl5").set("h", "L");
    model.geom("part5").create("dif1", "Difference");
    model.geom("part5").feature("dif1").active(false);
    model.geom("part5").feature("dif1").label("dielectic_only");
    model.geom("part5").feature("dif1").selection("input").set(new String[]{"cyl2"});
    model.geom("part5").feature("dif1").selection("input2").set(new String[]{"cyl5"});
    model.geom("part5").create("cyl7", "Cylinder");
    model.geom("part5").feature("cyl7").label("center");
    model.geom("part5").feature("cyl7").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl7").set("r", "D_center/2.0");
    model.geom("part5").feature("cyl7").set("h", "L");
    model.geom("part5").create("cyl4", "Cylinder");
    model.geom("part5").feature("cyl4").label("center_plus_tip");
    model.geom("part5").feature("cyl4").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part5").feature("cyl4").set("r", "D_center/2.0");
    model.geom("part5").feature("cyl4").set("h", "L + L_center_tip");
    model.geom("part5").run();
    model.geom("part7").label("circular_line");
    model.geom("part7").inputParam().set("r", "50[um]");
    model.geom("part7").inputParam().set("w", "10[um]");
    model.geom("part7").inputParam().set("angle", "90[deg]");
    model.geom("part7").create("c1", "Circle");
    model.geom("part7").feature("c1").label("outer");
    model.geom("part7").feature("c1").set("r", "r + w/2");
    model.geom("part7").feature("c1").set("angle", "abs(angle)");
    model.geom("part7").create("c2", "Circle");
    model.geom("part7").feature("c2").label("inner");
    model.geom("part7").feature("c2").set("r", "r - w/2");
    model.geom("part7").feature("c2").set("angle", "abs(angle)");
    model.geom("part7").create("dif1", "Difference");
    model.geom("part7").feature("dif1").label("cline");
    model.geom("part7").feature("dif1").selection("input").set(new String[]{"c1"});
    model.geom("part7").feature("dif1").selection("input2").set(new String[]{"c2"});
    model.geom("part7").create("mov1", "Move");
    model.geom("part7").feature("mov1").set("displx", "-r");
    model.geom("part7").feature("mov1").selection("input").set(new String[]{"dif1"});
    model.geom("part7").create("if1", "If");
    model.geom("part7").feature("if1").set("condition", "angle < 0");
    model.geom("part7").create("mir1", "Mirror");
    model.geom("part7").feature("mir1").selection("input").set(new String[]{"mov1"});
    model.geom("part7").create("endif1", "EndIf");
    model.geom("part7").run();
    model.geom("part6").label("coplaner");
    model.geom("part6").inputParam().set("w_line", "20[um]");
    model.geom("part6").inputParam().set("D_pad", "0.65[mm]");
    model.geom("part6").inputParam().set("angle_pad", "30[deg]");
    model.geom("part6").inputParam().set("w_pad", "10[um]");
    model.geom("part6").inputParam().set("l_pad_bar", "100[um]");
    model.geom("part6").inputParam().set("meander_spacing", "100[um]");
    model.geom("part6").inputParam().set("l_line", "1[mm]");
    model.geom("part6").inputParam().set("num_meander_repeat", "2");
    model.geom("part6").inputParam().set("l_end_bar", "100[um]");
    model.geom("part6").inputParam().set("D_end", "0.3[mm]");
    model.geom("part6").inputParam().set("angle_end", "30[deg]");
    model.geom("part6").inputParam().set("w_end", "20[um]");
    model.geom("part6").localParam().set("meander_offset", "D_pad/2 + l_pad_bar");
    model.geom("part6").create("c1", "Circle");
    model.geom("part6").feature("c1").label("pad_hole");
    model.geom("part6").feature("c1").set("rot", "-angle_pad/2 + 90[deg]");
    model.geom("part6").feature("c1").set("r", "D_pad/2");
    model.geom("part6").feature("c1").set("angle", "angle_pad");
    model.geom("part6").create("c2", "Circle");
    model.geom("part6").feature("c2").label("pad_cir");
    model.geom("part6").feature("c2").set("rot", "-angle_pad/2 + 90[deg]");
    model.geom("part6").feature("c2").set("r", "D_pad/2+w_pad");
    model.geom("part6").feature("c2").set("angle", "angle_pad");
    model.geom("part6").create("dif1", "Difference");
    model.geom("part6").feature("dif1").label("pad");
    model.geom("part6").feature("dif1").selection("input").set(new String[]{"c2"});
    model.geom("part6").feature("dif1").selection("input2").set(new String[]{"c1"});
    model.geom("part6").create("r1", "Rectangle");
    model.geom("part6").feature("r1").label("pad_bar");
    model.geom("part6").feature("r1").set("pos", new String[]{"-w_line/2", "D_pad/2"});
    model.geom("part6").feature("r1").set("size", new String[]{"w_line", "l_pad_bar"});
    model.geom("part6").create("pi1", "PartInstance");
    model.geom("part6").feature("pi1").label("first_bend");
    model.geom("part6").feature("pi1").set("part", "part7");
    model.geom("part6").feature("pi1").set("inputexpr", new String[]{"meander_spacing/2", "w_line", "90[deg]"});
    model.geom("part6").feature("pi1").set("displ", new String[]{"0", "meander_offset"});
    model.geom("part6").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part6").create("r2", "Rectangle");
    model.geom("part6").feature("r2").label("meander_line 1");
    model.geom("part6").feature("r2").set("pos", new String[]{"0", "-w_line/2 + meander_spacing/2 + meander_offset"});
    model.geom("part6").feature("r2").set("rot", 90);
    model.geom("part6").feature("r2").set("size", new String[]{"w_line", "(l_line - meander_spacing)/2"});
    model.geom("part6").create("pi2", "PartInstance");
    model.geom("part6").feature("pi2").label("meander_curve 1");
    model.geom("part6").feature("pi2").set("part", "part7");
    model.geom("part6").feature("pi2").set("inputexpr", new String[]{"meander_spacing/2", "w_line", "-180[deg]"});
    model.geom("part6").feature("pi2")
         .set("displ", new String[]{"-l_line/2 + meander_spacing/2", "meander_spacing/2 + meander_offset"});
    model.geom("part6").feature("pi2").set("rot", 90);
    model.geom("part6").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part6").create("r3", "Rectangle");
    model.geom("part6").feature("r3").label("meander_line 2");
    model.geom("part6").feature("r3").set("pos", new String[]{"0", "1.5*meander_spacing + meander_offset"});
    model.geom("part6").feature("r3").set("rot", 90);
    model.geom("part6").feature("r3").set("base", "center");
    model.geom("part6").feature("r3").set("size", new String[]{"w_line", "l_line - meander_spacing"});
    model.geom("part6").create("pi3", "PartInstance");
    model.geom("part6").feature("pi3").label("meander_curve 2");
    model.geom("part6").feature("pi3").set("part", "part7");
    model.geom("part6").feature("pi3").set("inputexpr", new String[]{"meander_spacing/2", "w_line", "180[deg]"});
    model.geom("part6").feature("pi3")
         .set("displ", new String[]{"l_line/2 - meander_spacing/2", "1.5*meander_spacing + meander_offset"});
    model.geom("part6").feature("pi3").set("rot", -90);
    model.geom("part6").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part6").create("r4", "Rectangle");
    model.geom("part6").feature("r4").label("meander_line 3");
    model.geom("part6").feature("r4")
         .set("pos", new String[]{"0", "w_line/2 + 2.5*meander_spacing + meander_offset"});
    model.geom("part6").feature("r4").set("rot", -90);
    model.geom("part6").feature("r4").set("size", new String[]{"w_line", "(l_line - meander_spacing)/2"});
    model.geom("part6").create("uni1", "Union");
    model.geom("part6").feature("uni1").label("meander_unit");
    model.geom("part6").feature("uni1").set("intbnd", false);
    model.geom("part6").feature("uni1").selection("input").set(new String[]{"pi2", "pi3", "r2", "r3", "r4"});
    model.geom("part6").create("arr1", "Array");
    model.geom("part6").feature("arr1").set("type", "linear");
    model.geom("part6").feature("arr1").label("meander_repeat");
    model.geom("part6").feature("arr1").set("linearsize", "num_meander_repeat");
    model.geom("part6").feature("arr1").set("displ", new String[]{"0", "meander_spacing * 2"});
    model.geom("part6").feature("arr1").selection("input").set(new String[]{"uni1"});
    model.geom("part6").create("uni2", "Union");
    model.geom("part6").feature("uni2").label("meander");
    model.geom("part6").feature("uni2").set("intbnd", false);
    model.geom("part6").feature("uni2").selection("input").set(new String[]{"arr1"});
    model.geom("part6").create("r6", "Rectangle");
    model.geom("part6").feature("r6").label("diff_beg");
    model.geom("part6").feature("r6").set("pos", new String[]{"0", "-w_line/2 + meander_spacing/2 + meander_offset"});
    model.geom("part6").feature("r6").set("rot", 90);
    model.geom("part6").feature("r6").set("size", new String[]{"w_line", "meander_spacing/2"});
    model.geom("part6").create("r7", "Rectangle");
    model.geom("part6").feature("r7").label("diff_end");
    model.geom("part6").feature("r7")
         .set("pos", new String[]{"0", "w_line/2 + meander_spacing*(2*num_meander_repeat + 0.5)+ meander_offset"});
    model.geom("part6").feature("r7").set("rot", -90);
    model.geom("part6").feature("r7").set("size", new String[]{"w_line", "meander_spacing/2"});
    model.geom("part6").create("dif2", "Difference");
    model.geom("part6").feature("dif2").label("meander_diff");
    model.geom("part6").feature("dif2").selection("input").set(new String[]{"uni2"});
    model.geom("part6").feature("dif2").selection("input2").set(new String[]{"r6", "r7"});
    model.geom("part6").create("pi4", "PartInstance");
    model.geom("part6").feature("pi4").label("final_bend");
    model.geom("part6").feature("pi4").set("part", "part7");
    model.geom("part6").feature("pi4").set("inputexpr", new String[]{"meander_spacing/2", "w_line", "90[deg]"});
    model.geom("part6").feature("pi4")
         .set("displ", new String[]{"0", "meander_offset + meander_spacing * (2*num_meander_repeat+1)"});
    model.geom("part6").feature("pi4").set("rot", 180);
    model.geom("part6").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part6").create("r5", "Rectangle");
    model.geom("part6").feature("r5").label("end_bar");
    model.geom("part6").feature("r5")
         .set("pos", new String[]{"-w_line/2", "meander_offset + meander_spacing * (2*num_meander_repeat+1)"});
    model.geom("part6").feature("r5").set("size", new String[]{"w_line", "l_end_bar"});
    model.geom("part6").create("c3", "Circle");
    model.geom("part6").feature("c3").label("end_hole");
    model.geom("part6").feature("c3")
         .set("pos", new String[]{"0", "meander_offset + (2*num_meander_repeat+1)*meander_spacing + l_end_bar + D_end/2"});
    model.geom("part6").feature("c3").set("rot", "-90 - angle_end/2");
    model.geom("part6").feature("c3").set("r", "D_end/2");
    model.geom("part6").feature("c3").set("angle", "angle_end");
    model.geom("part6").create("c4", "Circle");
    model.geom("part6").feature("c4").label("end_cir");
    model.geom("part6").feature("c4")
         .set("pos", new String[]{"0", "meander_offset + (2*num_meander_repeat+1)*meander_spacing + l_end_bar + D_end/2"});
    model.geom("part6").feature("c4").set("rot", "-90 - angle_end/2");
    model.geom("part6").feature("c4").set("r", "D_end/2 + w_end");
    model.geom("part6").feature("c4").set("angle", "angle_end");
    model.geom("part6").create("dif3", "Difference");
    model.geom("part6").feature("dif3").label("end_pad");
    model.geom("part6").feature("dif3").selection("input").set(new String[]{"c4"});
    model.geom("part6").feature("dif3").selection("input2").set(new String[]{"c3"});
    model.geom("part6").create("uni3", "Union");
    model.geom("part6").feature("uni3").label("union");
    model.geom("part6").feature("uni3").set("intbnd", false);
    model.geom("part6").feature("uni3").selection("input")
         .set(new String[]{"dif3", "dif1", "dif2", "pi1", "pi4", "r1", "r5"});
    model.geom("part6").run();
    model.geom("part6").run("c4");
    model.geom("part8").label("zigzag");
    model.geom("part8").inputParam().set("zig_width", "0.1[mm]");
    model.geom("part8").inputParam().set("zig_height", "20[um]");
    model.geom("part8").inputParam().set("line_width", "10[um]");
    model.geom("part8").inputParam().set("n_zigzag", "19");
    model.geom("part8").create("r1", "Rectangle");
    model.geom("part8").feature("r1").label("zig_vbar 1");
    model.geom("part8").feature("r1").set("pos", new String[]{"- line_width/2", "0"});
    model.geom("part8").feature("r1").set("size", new String[]{"line_width", "zig_height"});
    model.geom("part8").create("r2", "Rectangle");
    model.geom("part8").feature("r2").label("zig_hbar 1");
    model.geom("part8").feature("r2").set("pos", new String[]{"-line_width/2", "zig_height - line_width/2"});
    model.geom("part8").feature("r2").set("size", new String[]{"zig_width + line_width", "line_width"});
    model.geom("part8").create("r3", "Rectangle");
    model.geom("part8").feature("r3").label("zig_vbar 2");
    model.geom("part8").feature("r3").set("pos", new String[]{"zig_width - line_width/2", "zig_height"});
    model.geom("part8").feature("r3").set("size", new String[]{"line_width", "zig_height"});
    model.geom("part8").create("uni1", "Union");
    model.geom("part8").feature("uni1").label("zig");
    model.geom("part8").feature("uni1").set("intbnd", false);
    model.geom("part8").feature("uni1").selection("input").set(new String[]{"r1", "r2", "r3"});
    model.geom("part8").create("if1", "If");
    model.geom("part8").feature("if1").label("If n_zigzag > 1");
    model.geom("part8").feature("if1").set("condition", "n_zigzag > 1");
    model.geom("part8").create("mir1", "Mirror");
    model.geom("part8").feature("mir1").label("zig_mirrored");
    model.geom("part8").feature("mir1").set("keep", true);
    model.geom("part8").feature("mir1").set("pos", new String[]{"zig_width/2", "0"});
    model.geom("part8").feature("mir1").selection("input").set(new String[]{"uni1"});
    model.geom("part8").create("mov1", "Move");
    model.geom("part8").feature("mov1").label("zag");
    model.geom("part8").feature("mov1").set("disply", "zig_height");
    model.geom("part8").feature("mov1").selection("input").set(new String[]{"uni1"});
    model.geom("part8").create("arr1", "Array");
    model.geom("part8").feature("arr1").label("zig_arr");
    model.geom("part8").feature("arr1").set("selresult", true);

    return model;
  }

  public static Model run2(Model model) {
    model.geom("part8").feature("arr1").set("selresultshow", "obj");
    model.geom("part8").feature("arr1").set("fullsize", new String[]{"1", "floor((n_zigzag + 1)/2)"});
    model.geom("part8").feature("arr1").set("displ", new String[]{"0", "2*zig_height"});
    model.geom("part8").feature("arr1").selection("input").set(new String[]{"mir1"});
    model.geom("part8").create("arr2", "Array");
    model.geom("part8").feature("arr2").label("zag_arr");
    model.geom("part8").feature("arr2").set("selresult", true);
    model.geom("part8").feature("arr2").set("selresultshow", "obj");
    model.geom("part8").feature("arr2").set("fullsize", new String[]{"1", "ceil((n_zigzag - 1)/ 2)"});
    model.geom("part8").feature("arr2").set("displ", new String[]{"0", "2*zig_height"});
    model.geom("part8").feature("arr2").selection("input").set(new String[]{"mov1"});
    model.geom("part8").create("uni2", "Union");
    model.geom("part8").feature("uni2").label("zigunion");
    model.geom("part8").feature("uni2").selection("input").named("arr1");
    model.geom("part8").create("uni3", "Union");
    model.geom("part8").feature("uni3").label("zagunion");
    model.geom("part8").feature("uni3").selection("input").named("arr2");
    model.geom("part8").create("uni4", "Union");
    model.geom("part8").feature("uni4").label("zigzag");
    model.geom("part8").feature("uni4").set("intbnd", false);
    model.geom("part8").feature("uni4").selection("input").set(new String[]{"uni2", "uni3"});
    model.geom("part8").create("endif1", "EndIf");
    model.geom("part8").run();
    model.geom("part9").label("Qubit_single_hand");
    model.geom("part9").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part9").inputParam().set("D_inner_hole", "0.2[mm]");
    model.geom("part9").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part9").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part9").inputParam().set("w_JJ", "10[um]");
    model.geom("part9").inputParam().set("h_JJ", "30[um]");
    model.geom("part9").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part9").inputParam().set("w_bar", "20[um]");
    model.geom("part9").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part9").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part9").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part9").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part9").inputParam().set("JJ_angle", "45[deg]");
    model.geom("part9").inputParam().set("hand_angle", "0[deg]");
    model.geom("part9").create("pi1", "PartInstance");
    model.geom("part9").feature("pi1").label("Qubit_base");
    model.geom("part9").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part9").feature("pi1").set("rot", "JJ_angle - 90");
    model.geom("part9").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part9").create("pi2", "PartInstance");
    model.geom("part9").feature("pi2").label("Qubit_hand");
    model.geom("part9").feature("pi2").set("part", "part2");
    model.geom("part9").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2", "w_pad", "h_pad"});
    model.geom("part9").feature("pi2").set("displ", new String[]{"D_outer_hole/2", "0"});
    model.geom("part9").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part9").create("rot1", "Rotate");
    model.geom("part9").feature("rot1").set("rot", "hand_angle");
    model.geom("part9").feature("rot1").selection("input").set(new String[]{"pi2"});
    model.geom("part9").create("uni1", "Union");
    model.geom("part9").feature("uni1").set("intbnd", false);
    model.geom("part9").feature("uni1").selection("input").set(new String[]{"pi1(1)", "rot1"});
    model.geom("part9").run();
    model.geom("part10").label("GND_comp_single_hand");
    model.geom("part10").inputParam().set("D_q_cir", "0.6[mm]");
    model.geom("part10").inputParam().set("w_bar", "20[um]");
    model.geom("part10").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part10").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part10").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part10").inputParam().set("hand_angle", "0[deg]");
    model.geom("part10").create("c1", "Circle");
    model.geom("part10").feature("c1").label("Qubit_circle");
    model.geom("part10").feature("c1").set("r", "D_q_cir/2");
    model.geom("part10").create("pi1", "PartInstance");
    model.geom("part10").feature("pi1").label("Qubit_hand");
    model.geom("part10").feature("pi1").set("part", "part2");
    model.geom("part10").feature("pi1")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part10").feature("pi1").set("rot", "hand_angle");
    model.geom("part10").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part10").create("uni1", "Union");
    model.geom("part10").feature("uni1").set("intbnd", false);
    model.geom("part10").feature("uni1").selection("input").set(new String[]{"c1", "pi1"});
    model.geom("part10").run();
    model.geom("part11").label("Qubit_double_hand");
    model.geom("part11").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part11").inputParam().set("D_inner_hole", "0.2[mm]");
    model.geom("part11").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part11").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part11").inputParam().set("w_JJ", "10[um]");
    model.geom("part11").inputParam().set("h_JJ", "30[um]");
    model.geom("part11").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part11").inputParam().set("w_bar", "20[um]");
    model.geom("part11").inputParam().set("l_bar", "2.0[mm]");
    model.geom("part11").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part11").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part11").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part11").inputParam().set("JJ_angle", "45[deg]");
    model.geom("part11").inputParam().set("hand_angle", "0[deg]");
    model.geom("part11").inputParam().set("center_xoffset", "0.8[mm]");
    model.geom("part11").create("pi1", "PartInstance");
    model.geom("part11").feature("pi1").label("Qubit_base");
    model.geom("part11").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part11").feature("pi1").set("displ", new String[]{"center_xoffset", "0"});
    model.geom("part11").feature("pi1").set("rot", "JJ_angle - 90");
    model.geom("part11").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part11").create("pi2", "PartInstance");
    model.geom("part11").feature("pi2").label("Qubit_hand_R");
    model.geom("part11").feature("pi2").set("part", "part2");
    model.geom("part11").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_xoffset", "w_pad", "h_pad"});
    model.geom("part11").feature("pi2").set("displ", new String[]{"D_outer_hole/2 + center_xoffset", "0"});
    model.geom("part11").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part11").create("pi3", "PartInstance");
    model.geom("part11").feature("pi3").label("Qubit_hand_L");
    model.geom("part11").feature("pi3").set("part", "part2");
    model.geom("part11").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_xoffset", "w_pad", "h_pad"});
    model.geom("part11").feature("pi3").set("displ", new String[]{"-D_outer_hole/2 + center_xoffset", "0"});
    model.geom("part11").feature("pi3").set("rot", 180);
    model.geom("part11").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part11").create("uni1", "Union");
    model.geom("part11").feature("uni1").set("intbnd", false);
    model.geom("part11").feature("uni1").selection("input").set(new String[]{"pi1(1)", "pi2", "pi3"});
    model.geom("part11").run();
    model.geom("part12").label("GND_comp_double_hand");
    model.geom("part12").inputParam().set("D_q_cir", "0.6[mm]");
    model.geom("part12").inputParam().set("w_bar", "20[um]");
    model.geom("part12").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part12").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part12").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part12").inputParam().set("hand_angle", "0[deg]");
    model.geom("part12").inputParam().set("center_xoffset", "0.2[mm]");
    model.geom("part12").create("c1", "Circle");
    model.geom("part12").feature("c1").label("Qubit_circle");
    model.geom("part12").feature("c1").set("pos", new String[]{"center_xoffset", "0"});
    model.geom("part12").feature("c1").set("r", "D_q_cir/2");
    model.geom("part12").create("pi1", "PartInstance");
    model.geom("part12").feature("pi1").label("Qubit_hand_base");
    model.geom("part12").feature("pi1").set("part", "part2");
    model.geom("part12").feature("pi1")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part12").feature("pi1").set("rot", "hand_angle");
    model.geom("part12").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part12").create("rot1", "Rotate");
    model.geom("part12").feature("rot1").label("Qubit_hand_RL");
    model.geom("part12").feature("rot1").set("rot", "hand_angle hand_angle+180[deg]");
    model.geom("part12").feature("rot1").selection("input").set(new String[]{"pi1"});
    model.geom("part12").create("uni1", "Union");
    model.geom("part12").feature("uni1").set("intbnd", false);
    model.geom("part12").feature("uni1").selection("input").set(new String[]{"c1", "rot1"});
    model.geom("part12").run();
    model.geom("part13").label("squeezed_line_comp");
    model.geom("part13").inputParam().set("w", "20[um]");
    model.geom("part13").inputParam().set("w_squeezed", "10[um]");
    model.geom("part13").inputParam().set("l", "200[um]");
    model.geom("part13").inputParam().set("l_slope", "40[um]");
    model.geom("part13").create("pol1", "Polygon");
    model.geom("part13").feature("pol1").set("source", "table");
    model.geom("part13").feature("pol1")
         .set("table", new String[][]{{"0", "w/2"}, {"l_slope", "w_squeezed/2"}, {"l - l_slope", "w_squeezed/2"}, {"l", "w/2"}});
    model.geom("part13").create("mir1", "Mirror");
    model.geom("part13").feature("mir1").set("keep", true);
    model.geom("part13").feature("mir1").set("axis", new int[]{0, 1});
    model.geom("part13").feature("mir1").selection("input").set(new String[]{"pol1"});
    model.geom("part13").run();
    model.geom("part14").label("winding_line");
    model.geom("part14").inputParam().set("r", "25[um]");
    model.geom("part14").inputParam().set("w", "20[um]");
    model.geom("part14").create("pi2", "PartInstance");
    model.geom("part14").feature("pi2").label("circular_line 1");
    model.geom("part14").feature("pi2").set("part", "part7");
    model.geom("part14").feature("pi2").set("inputexpr", new String[]{"r", "w", "90[deg]"});
    model.geom("part14").feature("pi2").set("rot", -90);
    model.geom("part14").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part14").create("pi3", "PartInstance");
    model.geom("part14").feature("pi3").label("circular_line 2");
    model.geom("part14").feature("pi3").set("part", "part7");
    model.geom("part14").feature("pi3").set("inputexpr", new String[]{"r", "w", "-90[deg]"});
    model.geom("part14").feature("pi3").set("displ", new String[]{"r", "r"});
    model.geom("part14").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part14").create("mir1", "Mirror");
    model.geom("part14").feature("mir1").set("keep", true);
    model.geom("part14").feature("mir1").set("pos", new String[]{"2*r", "0"});
    model.geom("part14").feature("mir1").selection("input").set(new String[]{"pi2", "pi3"});
    model.geom("part14").create("uni1", "Union");
    model.geom("part14").feature("uni1").set("intbnd", false);
    model.geom("part14").feature("uni1").selection("input").set(new String[]{"mir1", "pi2", "pi3"});
    model.geom("part14").run();
    model.geom("part15").label("coax_cable_sp");
    model.geom("part15").inputParam().set("D_outer", "1.19[mm]");
    model.geom("part15").inputParam().set("D_dielectric", "0.94[mm]");
    model.geom("part15").inputParam().set("D_center", "0.287[mm]");
    model.geom("part15").inputParam().set("L", "10[mm]");
    model.geom("part15").inputParam().set("gap", "0.5[mm]");
    model.geom("part15").create("cyl4", "Cylinder");
    model.geom("part15").feature("cyl4").label("outer_cylinder 1");
    model.geom("part15").feature("cyl4").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl4").set("r", "D_outer/2.0");
    model.geom("part15").feature("cyl4").set("h", "L");
    model.geom("part15").create("cyl5", "Cylinder");
    model.geom("part15").feature("cyl5").label("outer_diff");
    model.geom("part15").feature("cyl5").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl5").set("r", "D_dielectric/2.0");
    model.geom("part15").feature("cyl5").set("h", "L");
    model.geom("part15").create("dif1", "Difference");
    model.geom("part15").feature("dif1").label("outer");
    model.geom("part15").feature("dif1").selection("input").set(new String[]{"cyl4"});
    model.geom("part15").feature("dif1").selection("input2").set(new String[]{"cyl5"});
    model.geom("part15").create("cyl6", "Cylinder");
    model.geom("part15").feature("cyl6").label("dielectric_cyliner 1");
    model.geom("part15").feature("cyl6").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl6").set("r", "D_dielectric/2.0");
    model.geom("part15").feature("cyl6").set("h", "L");
    model.geom("part15").create("cyl7", "Cylinder");
    model.geom("part15").feature("cyl7").label("dielectric_diff");
    model.geom("part15").feature("cyl7").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl7").set("r", "D_center/2.0");
    model.geom("part15").feature("cyl7").set("h", "L");
    model.geom("part15").create("dif2", "Difference");
    model.geom("part15").feature("dif2").label("dielectic_only");
    model.geom("part15").feature("dif2").selection("input").set(new String[]{"cyl6"});
    model.geom("part15").feature("dif2").selection("input2").set(new String[]{"cyl7"});
    model.geom("part15").create("cyl3", "Cylinder");
    model.geom("part15").feature("cyl3").label("center");
    model.geom("part15").feature("cyl3").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl3").set("r", "D_center/2.0");
    model.geom("part15").feature("cyl3").set("h", "L - gap - D_center/2");
    model.geom("part15").create("sph1", "Sphere");
    model.geom("part15").feature("sph1").label("tip");
    model.geom("part15").feature("sph1").set("pos", new String[]{"0", "0", "-gap - D_center/2.0"});
    model.geom("part15").feature("sph1").set("r", "D_center/2.0");
    model.geom("part15").create("uni1", "Union");
    model.geom("part15").feature("uni1").set("intbnd", false);
    model.geom("part15").feature("uni1").selection("input").set(new String[]{"cyl3", "sph1"});
    model.geom("part15").create("cyl8", "Cylinder");
    model.geom("part15").feature("cyl8").label("center_fill");
    model.geom("part15").feature("cyl8").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part15").feature("cyl8").set("r", "D_center/2.0");
    model.geom("part15").feature("cyl8").set("h", "L");
    model.geom("part15").run();
    model.geom("part16").label("coax_seiken");
    model.geom("part16").inputParam().set("D_outer", "1.19[mm]");
    model.geom("part16").inputParam().set("D_dielectric", "0.94[mm]");
    model.geom("part16").inputParam().set("D_center", "0.287[mm]");
    model.geom("part16").inputParam().set("L", "3[mm]");
    model.geom("part16").inputParam().set("gap", "0.01[mm]");
    model.geom("part16").inputParam().set("t_iris", "0.3[mm]");
    model.geom("part16").inputParam().set("D_iris_hole", "0.7[mm]");
    model.geom("part16").inputParam().set("D_probe", "0.22[mm]");
    model.geom("part16").create("cyl1", "Cylinder");
    model.geom("part16").feature("cyl1").label("outer_cylinder 1");
    model.geom("part16").feature("cyl1").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part16").feature("cyl1").set("r", "D_outer/2.0");
    model.geom("part16").feature("cyl1").set("h", "L");
    model.geom("part16").create("cyl2", "Cylinder");
    model.geom("part16").feature("cyl2").label("outer_diff");
    model.geom("part16").feature("cyl2").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part16").feature("cyl2").set("r", "D_dielectric/2.0");
    model.geom("part16").feature("cyl2").set("h", "L");
    model.geom("part16").create("dif1", "Difference");
    model.geom("part16").feature("dif1").label("outer");
    model.geom("part16").feature("dif1").selection("input").set(new String[]{"cyl1"});
    model.geom("part16").feature("dif1").selection("input2").set(new String[]{"cyl2"});
    model.geom("part16").create("cyl3", "Cylinder");
    model.geom("part16").feature("cyl3").label("dielectric_cyliner 1");
    model.geom("part16").feature("cyl3").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part16").feature("cyl3").set("r", "D_dielectric/2.0");
    model.geom("part16").feature("cyl3").set("h", "L");
    model.geom("part16").create("cyl4", "Cylinder");
    model.geom("part16").feature("cyl4").label("dielectric_diff");
    model.geom("part16").feature("cyl4").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part16").feature("cyl4").set("r", "D_center/2.0");
    model.geom("part16").feature("cyl4").set("h", "L");
    model.geom("part16").create("dif2", "Difference");
    model.geom("part16").feature("dif2").label("dielectic_only");
    model.geom("part16").feature("dif2").selection("input").set(new String[]{"cyl3"});
    model.geom("part16").feature("dif2").selection("input2").set(new String[]{"cyl4"});
    model.geom("part16").create("cyl5", "Cylinder");
    model.geom("part16").feature("cyl5").label("center");
    model.geom("part16").feature("cyl5").set("pos", new String[]{"0", "0", "-L"});
    model.geom("part16").feature("cyl5").set("r", "D_center/2.0");
    model.geom("part16").feature("cyl5").set("h", "L");
    model.geom("part16").create("uni2", "Union");
    model.geom("part16").feature("uni2").label("coax");
    model.geom("part16").feature("uni2").selection("input").set(new String[]{"cyl5", "dif1", "dif2"});
    model.geom("part16").create("mov1", "Move");
    model.geom("part16").feature("mov1").set("displz", "-t_iris");
    model.geom("part16").feature("mov1").selection("input").set(new String[]{"uni2"});
    model.geom("part16").create("cyl8", "Cylinder");
    model.geom("part16").feature("cyl8").label("probe_cyl");
    model.geom("part16").feature("cyl8").set("pos", new String[]{"0", "0", "-t_iris"});
    model.geom("part16").feature("cyl8").set("r", "D_probe/2");
    model.geom("part16").feature("cyl8").set("h", "t_iris - gap - D_probe/2");
    model.geom("part16").create("sph1", "Sphere");
    model.geom("part16").feature("sph1").label("tip");
    model.geom("part16").feature("sph1").set("pos", new String[]{"0", "0", "-gap - D_probe/2"});
    model.geom("part16").feature("sph1").set("r", "D_probe/2");
    model.geom("part16").create("uni3", "Union");
    model.geom("part16").feature("uni3").label("probe");
    model.geom("part16").feature("uni3").set("intbnd", false);
    model.geom("part16").feature("uni3").selection("input").set(new String[]{"cyl8", "sph1"});
    model.geom("part16").create("cyl6", "Cylinder");
    model.geom("part16").feature("cyl6").label("center_fill");
    model.geom("part16").feature("cyl6").set("pos", new String[]{"0", "0", "-D_probe/2 - gap"});
    model.geom("part16").feature("cyl6").set("r", "D_probe/2.0");
    model.geom("part16").feature("cyl6").set("h", "D_probe/2 + gap");
    model.geom("part16").create("cyl7", "Cylinder");
    model.geom("part16").feature("cyl7").label("iris");
    model.geom("part16").feature("cyl7").set("pos", new String[]{"0", "0", "-t_iris"});
    model.geom("part16").feature("cyl7").set("r", "D_outer/2");
    model.geom("part16").feature("cyl7").set("h", "t_iris");
    model.geom("part16").create("cyl9", "Cylinder");
    model.geom("part16").feature("cyl9").label("iris_hole");
    model.geom("part16").feature("cyl9").set("pos", new String[]{"0", "0", "-t_iris"});
    model.geom("part16").feature("cyl9").set("r", "D_iris_hole/2");
    model.geom("part16").feature("cyl9").set("h", "t_iris");
    model.geom("part16").run();
    model.geom("part17").label("Qubit_winding");
    model.geom("part17").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part17").inputParam().set("D_inner_hole", "0.2[mm]");
    model.geom("part17").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part17").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part17").inputParam().set("w_JJ", "10[um]");
    model.geom("part17").inputParam().set("h_JJ", "30[um]");
    model.geom("part17").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part17").inputParam().set("w_bar", "20[um]");
    model.geom("part17").inputParam().set("l_bar", "2.0[mm]");
    model.geom("part17").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part17").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part17").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part17").inputParam().set("JJ_angle", "45[deg]");
    model.geom("part17").inputParam().set("hand_angle", "0[deg]");
    model.geom("part17").inputParam().set("center_xoffset", "0.8[mm]");
    model.geom("part17").inputParam().set("winding_offset", "0.2[mm]");
    model.geom("part17").inputParam().set("r_winding", "45[um]");
    model.geom("part17").localParam().set("full_width", "D_outer_cir + 2*w_pad + 2*l_bar");
    model.geom("part17").create("pi1", "PartInstance");
    model.geom("part17").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part17").feature("pi1").set("displ", new String[]{"center_xoffset", "0"});
    model.geom("part17").feature("pi1").set("rot", "JJ_angle - 90");
    model.geom("part17").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part17").create("pi2", "PartInstance");
    model.geom("part17").feature("pi2").label("Qubit_hand_R");
    model.geom("part17").feature("pi2").set("part", "part2");
    model.geom("part17").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_xoffset", "w_pad", "h_pad"});
    model.geom("part17").feature("pi2").set("displ", new String[]{"D_outer_hole/2 + center_xoffset", "0"});
    model.geom("part17").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part17").create("pi3", "PartInstance");
    model.geom("part17").feature("pi3").label("Qubit_hand_L");
    model.geom("part17").feature("pi3").set("part", "part2");
    model.geom("part17").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_xoffset", "w_pad", "h_pad"});
    model.geom("part17").feature("pi3").set("displ", new String[]{"-D_outer_hole/2 + center_xoffset", "0"});
    model.geom("part17").feature("pi3").set("rot", 180);
    model.geom("part17").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part17").create("r1", "Rectangle");
    model.geom("part17").feature("r1")
         .set("pos", new String[]{"-full_width/2 + winding_offset - 2*r_winding", "-w_bar/2"});
    model.geom("part17").feature("r1").set("size", new String[]{"4*r_winding", "w_bar"});
    model.geom("part17").create("dif1", "Difference");
    model.geom("part17").feature("dif1").selection("input").set(new String[]{"pi3(1)"});
    model.geom("part17").feature("dif1").selection("input2").set(new String[]{"r1"});
    model.geom("part17").create("pi4", "PartInstance");
    model.geom("part17").feature("pi4").label("winding_line 1");
    model.geom("part17").feature("pi4").set("part", "part14");
    model.geom("part17").feature("pi4").set("inputexpr", new String[]{"r_winding", "w_bar"});
    model.geom("part17").feature("pi4")
         .set("displ", new String[]{"-full_width/2 + winding_offset - 2*r_winding", "0"});
    model.geom("part17").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part17").create("uni2", "Union");
    model.geom("part17").feature("uni2").set("intbnd", false);
    model.geom("part17").feature("uni2").selection("input").set(new String[]{"dif1", "pi1(1)", "pi2", "pi4"});
    model.geom("part17").run();
    model.geom("part18").label("GND_comp_winding");
    model.geom("part18").inputParam().set("D_q_cir", "0.6[mm]");
    model.geom("part18").inputParam().set("w_bar", "20[um]");
    model.geom("part18").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part18").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part18").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part18").inputParam().set("hand_angle", "0[deg]");
    model.geom("part18").inputParam().set("center_xoffset", "0.2[mm]");
    model.geom("part18").inputParam().set("r_winding", "45[um]");
    model.geom("part18").inputParam().set("winding_offset", "0.2[mm]");
    model.geom("part18").localParam().set("full_width", "D_q_cir + 2*w_pad + 2*l_bar");
    model.geom("part18").create("c1", "Circle");
    model.geom("part18").feature("c1").label("Qubit_circle");
    model.geom("part18").feature("c1").set("pos", new String[]{"center_xoffset", "0"});
    model.geom("part18").feature("c1").set("r", "D_q_cir/2");
    model.geom("part18").create("pi2", "PartInstance");
    model.geom("part18").feature("pi2").label("Qubit_hand_base");
    model.geom("part18").feature("pi2").set("part", "part2");
    model.geom("part18").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2", "w_pad", "h_pad"});
    model.geom("part18").feature("pi2").set("rot", "hand_angle");
    model.geom("part18").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part18").create("rot1", "Rotate");
    model.geom("part18").feature("rot1").label("Qubit_hand_RL");
    model.geom("part18").feature("rot1").set("rot", "hand_angle hand_angle+180[deg]");
    model.geom("part18").feature("rot1").selection("input").set(new String[]{"pi2"});
    model.geom("part18").create("r1", "Rectangle");
    model.geom("part18").feature("r1")
         .set("pos", new String[]{"-full_width/2 + winding_offset - 2*r_winding", "-w_bar/2"});
    model.geom("part18").feature("r1").set("size", new String[]{"4*r_winding", "w_bar"});
    model.geom("part18").create("dif1", "Difference");
    model.geom("part18").feature("dif1").selection("input").set(new String[]{"rot1(2)"});
    model.geom("part18").feature("dif1").selection("input2").set(new String[]{"r1"});
    model.geom("part18").create("pi1", "PartInstance");
    model.geom("part18").feature("pi1").label("winding_line 1");
    model.geom("part18").feature("pi1").set("part", "part14");
    model.geom("part18").feature("pi1").set("inputexpr", new String[]{"r_winding", "w_bar"});
    model.geom("part18").feature("pi1")
         .set("displ", new String[]{"-full_width/2 + winding_offset - 2*r_winding", "0"});
    model.geom("part18").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part18").create("uni1", "Union");
    model.geom("part18").feature("uni1").set("intbnd", false);
    model.geom("part18").feature("uni1").selection("input").set(new String[]{"c1", "dif1", "pi1", "rot1(1)"});
    model.geom("part18").run();
    model.geom("part19").label("Qubit_unbalanced");
    model.geom("part19").inputParam().set("D_inner_cir", "0.3[mm]");
    model.geom("part19").inputParam().set("D_inner_hole", "0.2[mm]");
    model.geom("part19").inputParam().set("D_outer_cir", "0.75[mm]");
    model.geom("part19").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part19").inputParam().set("w_JJ", "10[um]");
    model.geom("part19").inputParam().set("h_JJ", "30[um]");
    model.geom("part19").inputParam().set("w_JJ_support", "20[um]");
    model.geom("part19").inputParam().set("w_bar", "20[um]");
    model.geom("part19").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part19").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part19").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part19").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part19").inputParam().set("center_xoffset", "0.2[mm]");
    model.geom("part19").inputParam().set("center_yoffset", "0.2[mm]");
    model.geom("part19").inputParam().set("JJ_angle", "45[deg]");
    model.geom("part19").create("pi1", "PartInstance");
    model.geom("part19").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part19").feature("pi1").set("displ", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part19").feature("pi1").set("rot", "-90[deg] + JJ_angle");
    model.geom("part19").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part19").create("pi2", "PartInstance");
    model.geom("part19").feature("pi2").label("Qubit_hand_R");
    model.geom("part19").feature("pi2").set("part", "part2");
    model.geom("part19").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_xoffset", "w_pad", "h_pad"});
    model.geom("part19").feature("pi2")
         .set("displ", new String[]{"D_outer_hole/2 + center_xoffset", "center_yoffset"});
    model.geom("part19").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part19").create("pi3", "PartInstance");
    model.geom("part19").feature("pi3").label("Qubit_hand_L");
    model.geom("part19").feature("pi3").set("part", "part2");
    model.geom("part19").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_xoffset", "w_pad", "h_pad"});
    model.geom("part19").feature("pi3")
         .set("displ", new String[]{"-D_outer_hole/2 + center_xoffset", "center_yoffset"});
    model.geom("part19").feature("pi3").set("rot", 180);
    model.geom("part19").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part19").create("pi4", "PartInstance");
    model.geom("part19").feature("pi4").label("Qubit_hand_U");
    model.geom("part19").feature("pi4").set("part", "part2");
    model.geom("part19").feature("pi4")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_yoffset", "w_pad", "h_pad"});
    model.geom("part19").feature("pi4")
         .set("displ", new String[]{"center_xoffset", "D_outer_hole/2 + center_yoffset"});
    model.geom("part19").feature("pi4").set("rot", 90);
    model.geom("part19").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part19").create("pi5", "PartInstance");
    model.geom("part19").feature("pi5").label("Qubit_hand_D");
    model.geom("part19").feature("pi5").set("part", "part2");
    model.geom("part19").feature("pi5")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_yoffset", "w_pad", "h_pad"});
    model.geom("part19").feature("pi5")
         .set("displ", new String[]{"center_xoffset", "-D_outer_hole/2 + center_yoffset"});
    model.geom("part19").feature("pi5").set("rot", -90);
    model.geom("part19").feature("pi5").set("selkeepnoncontr", false);
    model.geom("part19").create("uni1", "Union");
    model.geom("part19").feature("uni1").set("intbnd", false);
    model.geom("part19").feature("uni1").selection("input").set(new String[]{"pi1(1)", "pi2", "pi3", "pi4", "pi5"});
    model.geom("part19").run();
    model.geom("part20").label("GND_comp_unbalanced");
    model.geom("part20").inputParam().set("D_q_cir", "0.6[mm]");

    return model;
  }

  public static Model run3(Model model) {
    model.geom("part20").inputParam().set("w_bar", "20[um]");
    model.geom("part20").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part20").inputParam().set("w_pad", "0.1[mm]");
    model.geom("part20").inputParam().set("h_pad", "0.5[mm]");
    model.geom("part20").inputParam().set("center_xoffset", "0.2[mm]");
    model.geom("part20").inputParam().set("center_yoffset", "0.2[mm]");
    model.geom("part20").create("c1", "Circle");
    model.geom("part20").feature("c1").label("Qubit_circle");
    model.geom("part20").feature("c1").set("pos", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part20").feature("c1").set("r", "D_q_cir/2");
    model.geom("part20").create("pi1", "PartInstance");
    model.geom("part20").feature("pi1").label("Qubit_hand_R");
    model.geom("part20").feature("pi1").set("part", "part2");
    model.geom("part20").feature("pi1")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2 - center_xoffset", "w_pad", "h_pad"});
    model.geom("part20").feature("pi1").set("displ", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part20").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part20").create("pi2", "PartInstance");
    model.geom("part20").feature("pi2").label("Qubit_hand_L");
    model.geom("part20").feature("pi2").set("part", "part2");
    model.geom("part20").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2 + center_xoffset", "w_pad", "h_pad"});
    model.geom("part20").feature("pi2").set("displ", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part20").feature("pi2").set("rot", 180);
    model.geom("part20").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part20").create("pi3", "PartInstance");
    model.geom("part20").feature("pi3").label("Qubit_hand_U");
    model.geom("part20").feature("pi3").set("part", "part2");
    model.geom("part20").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2 - center_yoffset", "w_pad", "h_pad"});
    model.geom("part20").feature("pi3").set("displ", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part20").feature("pi3").set("rot", 90);
    model.geom("part20").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part20").create("pi4", "PartInstance");
    model.geom("part20").feature("pi4").label("Qubit_hand_D");
    model.geom("part20").feature("pi4").set("part", "part2");
    model.geom("part20").feature("pi4")
         .set("inputexpr", new String[]{"w_bar", "l_bar + D_q_cir/2 + center_yoffset", "w_pad", "h_pad"});
    model.geom("part20").feature("pi4").set("displ", new String[]{"center_xoffset", "center_yoffset"});
    model.geom("part20").feature("pi4").set("rot", -90);
    model.geom("part20").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part20").create("uni1", "Union");
    model.geom("part20").feature("uni1").set("intbnd", false);
    model.geom("part20").feature("uni1").selection("input").set(new String[]{"c1", "pi1", "pi2", "pi3", "pi4"});
    model.geom("part20").run();
    model.geom("part21").label("Qubit_unbalanced_w_support");
    model.geom("part21").inputParam().set("D_inner_cir", "0.18[mm]");
    model.geom("part21").inputParam().set("D_inner_hole", "0[mm]");
    model.geom("part21").inputParam().set("D_outer_cir", "0.64[mm]");
    model.geom("part21").inputParam().set("D_outer_hole", "0.6[mm]");
    model.geom("part21").inputParam().set("w_JJ", "10[um]");
    model.geom("part21").inputParam().set("h_JJ", "55[um]");
    model.geom("part21").inputParam().set("w_JJ_support", "10[um]");
    model.geom("part21").inputParam().set("w_bar", "20[um]");
    model.geom("part21").inputParam().set("l_bar", "0.5[mm]");
    model.geom("part21").inputParam().set("h_pad", "110[um]");
    model.geom("part21").inputParam().set("w_pad", "75[um]");
    model.geom("part21").inputParam().set("JJ_pos_offset", "0[um]");
    model.geom("part21").inputParam().set("center_xoffset", "0.2[mm]");
    model.geom("part21").inputParam().set("center_yoffset", "0.2[mm]");
    model.geom("part21").inputParam().set("JJ_angle", "45[deg]");
    model.geom("part21").inputParam().set("l_horiz_support", "27.5[um]");
    model.geom("part21").create("pi1", "PartInstance");
    model.geom("part21").feature("pi1")
         .set("inputexpr", new String[]{"D_inner_cir", "D_inner_hole", "D_outer_cir", "D_outer_hole", "w_JJ_support", "h_JJ", "w_JJ", "JJ_pos_offset"});
    model.geom("part21").feature("pi1").set("rot", "-90[deg] + JJ_angle");
    model.geom("part21").feature("pi1").set("selkeepnoncontr", false);
    model.geom("part21").create("r1", "Rectangle");
    model.geom("part21").feature("r1")
         .set("pos", new String[]{"((D_outer_hole + D_inner_cir)/4.0  + JJ_pos_offset - h_JJ/2 + sqrt(2)*l_horiz_support/2 - w_JJ_support/2)*cos(JJ_angle)", "((D_outer_hole + D_inner_cir)/4.0 + JJ_pos_offset - h_JJ/2 - (sqrt(2)-1)*w_JJ_support/2)*sin(JJ_angle)"});
    model.geom("part21").feature("r1").set("base", "center");
    model.geom("part21").feature("r1").set("size", new String[]{"l_horiz_support", "w_JJ_support"});
    model.geom("part21").create("r2", "Rectangle");
    model.geom("part21").feature("r2")
         .set("pos", new String[]{"((D_outer_hole + D_inner_cir)/4.0  + JJ_pos_offset +  h_JJ/2 - l_horiz_support/sqrt(2) + w_JJ_support/2)*cos(JJ_angle)", "((D_outer_hole + D_inner_cir)/4.0 + JJ_pos_offset + h_JJ/2 + (sqrt(2)-1)*w_JJ_support/2)*sin(JJ_angle)"});
    model.geom("part21").feature("r2").set("base", "center");
    model.geom("part21").feature("r2").set("size", new String[]{"l_horiz_support", "w_JJ_support"});
    model.geom("part21").create("uni2", "Union");
    model.geom("part21").feature("uni2").set("intbnd", false);
    model.geom("part21").feature("uni2").selection("input").set(new String[]{"pi1", "r1", "r2"});
    model.geom("part21").create("mov1", "Move");
    model.geom("part21").feature("mov1").set("displx", "center_xoffset");
    model.geom("part21").feature("mov1").set("disply", "center_yoffset");
    model.geom("part21").feature("mov1").selection("input").set(new String[]{"uni2"});
    model.geom("part21").create("pi2", "PartInstance");
    model.geom("part21").feature("pi2").label("Qubit_hand_R");
    model.geom("part21").feature("pi2").set("part", "part2");
    model.geom("part21").feature("pi2")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_xoffset", "w_pad", "h_pad"});
    model.geom("part21").feature("pi2")
         .set("displ", new String[]{"D_outer_hole/2 + center_xoffset", "center_yoffset"});
    model.geom("part21").feature("pi2").set("selkeepnoncontr", false);
    model.geom("part21").create("pi3", "PartInstance");
    model.geom("part21").feature("pi3").label("Qubit_hand_L");
    model.geom("part21").feature("pi3").set("part", "part2");
    model.geom("part21").feature("pi3")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_xoffset", "w_pad", "h_pad"});
    model.geom("part21").feature("pi3")
         .set("displ", new String[]{"-D_outer_hole/2 + center_xoffset", "center_yoffset"});
    model.geom("part21").feature("pi3").set("rot", 180);
    model.geom("part21").feature("pi3").set("selkeepnoncontr", false);
    model.geom("part21").create("pi4", "PartInstance");
    model.geom("part21").feature("pi4").label("Qubit_hand_U");
    model.geom("part21").feature("pi4").set("part", "part2");
    model.geom("part21").feature("pi4")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 - center_yoffset", "w_pad", "h_pad"});
    model.geom("part21").feature("pi4")
         .set("displ", new String[]{"center_xoffset", "D_outer_hole/2 + center_yoffset"});
    model.geom("part21").feature("pi4").set("rot", 90);
    model.geom("part21").feature("pi4").set("selkeepnoncontr", false);
    model.geom("part21").create("pi5", "PartInstance");
    model.geom("part21").feature("pi5").label("Qubit_hand_D");
    model.geom("part21").feature("pi5").set("part", "part2");
    model.geom("part21").feature("pi5")
         .set("inputexpr", new String[]{"w_bar", "l_bar + (D_outer_cir - D_outer_hole)/2 + center_yoffset", "w_pad", "h_pad"});
    model.geom("part21").feature("pi5")
         .set("displ", new String[]{"center_xoffset", "-D_outer_hole/2 + center_yoffset"});
    model.geom("part21").feature("pi5").set("rot", -90);
    model.geom("part21").feature("pi5").set("selkeepnoncontr", false);
    model.geom("part21").create("uni1", "Union");
    model.geom("part21").feature("uni1").set("intbnd", false);
    model.geom("part21").feature("uni1").selection("input").set(new String[]{"mov1", "pi2", "pi3", "pi4", "pi5"});
    model.geom("part21").run();
    model.component("comp1").geom("geom1").repairTolType("relative");
    model.component("comp1").geom("geom1").create("wp1", "WorkPlane");
    model.component("comp1").geom("geom1").feature("wp1").label("Qubit_Plane");
    model.component("comp1").geom("geom1").feature("wp1").set("quickz", "subs_t");
    model.component("comp1").geom("geom1").feature("wp1").set("unite", true);
    model.component("comp1").geom("geom1").feature("wp1").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi1", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi1").label("Qubit 1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi1").set("part", "part21");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi1")
         .set("inputexpr", new String[]{"Q_D_inner_cir", "Q_D_inner_hole", "Q_D_outer_cir", "Q_D_outer_hole", "Q_w_JJ", "Q_h_JJ", "Q_w_JJ_support", "Q_w_bar", "Q_l_bar", "Q_h_pad", 
         "Q_w_pad", "Q_JJ_pos_offset", "Q_center_xoffset", "Q_center_yoffset", "45[deg]", "Q_l_horiz_support"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi1")
         .set("displ", new String[]{"-Q_spacing/2", "-Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi1").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi4", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi4").label("Qubit 2");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi4").set("part", "part21");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi4")
         .set("inputexpr", new String[]{"Q_D_inner_cir", "Q_D_inner_hole", "Q_D_outer_cir", "Q_D_outer_hole", "Q_w_JJ", "Q_h_JJ", "Q_w_JJ_support", "Q_w_bar", "Q_l_bar", "Q_h_pad", 
         "Q_w_pad", "Q_JJ_pos_offset", "-Q_center_xoffset", "Q_center_yoffset", "135[deg]", "Q_l_horiz_support"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi4")
         .set("displ", new String[]{"Q_spacing/2", "-Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi4").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi5", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi5").label("Qubit 3");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi5").set("part", "part21");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi5")
         .set("inputexpr", new String[]{"Q_D_inner_cir", "Q_D_inner_hole", "Q_D_outer_cir", "Q_D_outer_hole", "Q_w_JJ", "Q_h_JJ", "Q_w_JJ_support", "Q_w_bar", "Q_l_bar", "Q_h_pad", 
         "Q_w_pad", "Q_JJ_pos_offset", "-Q_center_xoffset", "-Q_center_yoffset", "225[deg]", "Q_l_horiz_support"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi5")
         .set("displ", new String[]{"Q_spacing/2", "Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi5").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi6", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi6").label("Qubit 4");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi6").set("part", "part21");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi6")
         .set("inputexpr", new String[]{"Q_D_inner_cir", "Q_D_inner_hole", "Q_D_outer_cir", "Q_D_outer_hole", "Q_w_JJ", "Q_h_JJ", "Q_w_JJ_support", "Q_w_bar", "Q_l_bar", "Q_h_pad", 
         "Q_w_pad", "Q_JJ_pos_offset", "Q_center_xoffset", "-Q_center_yoffset", "315[deg]", "Q_l_horiz_support"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi6")
         .set("displ", new String[]{"-Q_spacing/2", "Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi6").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi2", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi2").label("GND_comp_unbalanced 1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi2").set("part", "part20");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi2")
         .set("inputexpr", new String[]{"Q_D_outer_cir + 2*GND_gap", "Q_w_bar + 2*GND_gap", "Q_l_bar - 2*GND_gap", "Q_w_pad + 2*GND_gap", "Q_h_pad + 2*GND_gap", "Q_center_xoffset", "Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi2")
         .set("displ", new String[]{"-Q_spacing/2", "-Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi2").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi7", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi7").label("GND_comp_unbalanced 2");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi7").set("part", "part20");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi7")
         .set("inputexpr", new String[]{"Q_D_outer_cir + 2*GND_gap", "Q_w_bar + 2*GND_gap", "Q_l_bar - 2*GND_gap", "Q_w_pad + 2*GND_gap", "Q_h_pad + 2*GND_gap", "-Q_center_xoffset", "Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi7")
         .set("displ", new String[]{"Q_spacing/2", "-Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi7").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi8", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi8").label("GND_comp_unbalanced 3");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi8").set("part", "part20");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi8")
         .set("inputexpr", new String[]{"Q_D_outer_cir + 2*GND_gap", "Q_w_bar + 2*GND_gap", "Q_l_bar - 2*GND_gap", "Q_w_pad + 2*GND_gap", "Q_h_pad + 2*GND_gap", "-Q_center_xoffset", "-Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi8")
         .set("displ", new String[]{"Q_spacing/2", "Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi8").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi9", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi9").label("GND_comp_unbalanced 4");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi9").set("part", "part20");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi9")
         .set("inputexpr", new String[]{"Q_D_outer_cir + 2*GND_gap", "Q_w_bar + 2*GND_gap", "Q_l_bar - 2*GND_gap", "Q_w_pad + 2*GND_gap", "Q_h_pad + 2*GND_gap", "Q_center_xoffset", "-Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi9")
         .set("displ", new String[]{"-Q_spacing/2", "Q_spacing/2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi9").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("uni1", "Union");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").set("intbnd", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni1").selection("input")
         .set(new String[]{"pi2", "pi7", "pi8", "pi9"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("uni2", "Union");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni2").set("intbnd", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni2").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni2").selection("input")
         .set(new String[]{"pi1(1)", "pi4(1)", "pi5(1)", "pi6(1)"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("pi3", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3").label("zigzag 1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3").set("part", "part8");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3")
         .set("inputexpr", new String[]{"Qg_zig_width", "Qg_zig_height", "Qg_line_width - 1[um]", "Qg_n_zigzag"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3")
         .set("displ", new String[]{"- Qg_zig_width/2", "-Qg_zig_height*(Qg_n_zigzag+1)/2 -Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3")
         .setEntry("selkeepobj", "pi3_arr1", "off");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("pi3")
         .setEntry("selkeepobj", "pi3_arr2", "off");
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot2", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot2").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot2").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot2").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot2").setIndex("rot", "90", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot2").selection("input")
         .set(new String[]{"pi3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot3", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot3").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot3").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot3").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot3").setIndex("rot", "180", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot3").selection("input")
         .set(new String[]{"pi3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot4", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot4").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot4").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot4").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot4").setIndex("rot", "270", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot4").selection("input")
         .set(new String[]{"pi3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("dif1", "Difference");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif1").set("intbnd", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif1").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif1").selection("input")
         .set(new String[]{"uni2(1)"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif1").selection("input2")
         .set(new String[]{"pi3", "rot2", "rot3", "rot4"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("r1", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r1").label("Rectangle_diff 1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r1")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r1")
         .set("size", new String[]{"Q_w_bar/2 + GND_gap", "Q_D_outer_cir/2 + GND_gap"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("r2", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r2").label("Rectangle_diff 2");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r2")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("r2")
         .set("size", new String[]{"Q_D_outer_cir/2 + GND_gap", "Q_w_bar/2 + GND_gap"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("uni3", "Union");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni3").label("Q_mask 1");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni3").set("intbnd", false);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("uni3").selection("input")
         .set(new String[]{"r1", "r2"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("c1", "Circle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").label("read_Q_gap_cir");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").set("r", "Q_D_outer_cir/2 + GND_gap");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c1").set("angle", 90);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("c2", "Circle");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").label("read_Q_gap_diff");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("r", "Q_D_outer_cir/2");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("c2").set("angle", 90);
    model.component("comp1").geom("geom1").feature("wp1").geom().create("dif3", "Difference");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif3").label("Q_read_gap");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif3").selection("input")
         .set(new String[]{"c1"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif3").selection("input2")
         .set(new String[]{"c2", "uni3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot8", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot8").label("Q_read_gap 2");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot8").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot8").setIndex("rot", "90", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot8").selection("input")
         .set(new String[]{"dif3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot9", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot9").label("Q_read_gap 3");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot9").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot9").setIndex("rot", "180", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot9").selection("input")
         .set(new String[]{"dif3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("rot10", "Rotate");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot10").label("Q_read_gap 4");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot10").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot10").setIndex("rot", "270", 0);
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("rot10").selection("input")
         .set(new String[]{"dif3"});
    model.component("comp1").geom("geom1").feature("wp1").geom().create("dif2", "Difference");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif2").label("nega_pattern");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif2").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif2").selection("input")
         .set(new String[]{"uni1"});
    model.component("comp1").geom("geom1").feature("wp1").geom().feature("dif2").selection("input2")
         .set(new String[]{"dif1", "dif3", "rot10", "rot8", "rot9"});
    model.component("comp1").geom("geom1").create("wp5", "WorkPlane");
    model.component("comp1").geom("geom1").feature("wp5").label("Coplaner_Plane");
    model.component("comp1").geom("geom1").feature("wp5").set("quickz", "subs_t");
    model.component("comp1").geom("geom1").feature("wp5").set("unite", true);
    model.component("comp1").geom("geom1").feature("wp5").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi10", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10").label("coplaner 1");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10")
         .set("inputexpr", new String[]{"read_w_line", "read_D_pad", "read_angle_pad", "read_w_pad", "read_l_pad_bar", "read_meander_spacing", "read3_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10").set("rot", "-45[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi10").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi11", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11").label("coplaner 2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11")
         .set("inputexpr", new String[]{"read_w_line", "read_D_pad", "read_angle_pad", "read_w_pad", "read_l_pad_bar", "read_meander_spacing", "read4_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11").set("rot", "45[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi11").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi12", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12").label("coplaner 3");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12")
         .set("inputexpr", new String[]{"read_w_line", "read_D_pad", "read_angle_pad", "read_w_pad", "read_l_pad_bar", "read_meander_spacing", "read2_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12").set("rot", "135[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi12").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi13", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13").label("coplaner 4");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13")
         .set("inputexpr", new String[]{"read_w_line", "read_D_pad", "read_angle_pad", "read_w_pad", "read_l_pad_bar", "read_meander_spacing", "read1_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13").set("rot", "225[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi13").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("c1", "Circle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c1").label("read_via_pad_cir");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c1").set("r", "read_D_via_pad/2");
    model.component("comp1").geom("geom1").feature("wp5").geom().create("c2", "Circle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c2").label("read_via");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c2").set("r", "read_D_via/2");
    model.component("comp1").geom("geom1").feature("wp5").geom().create("dif3", "Difference");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif3").label("read_via_pad");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif3").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif3").selection("input")
         .set(new String[]{"c1"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif3").selection("input2")
         .set(new String[]{"c2"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi14", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14").label("coplaner_comp 1");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14").set("part", "part6");

    return model;
  }

  public static Model run4(Model model) {
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14")
         .set("inputexpr", new String[]{"read_w_line + 2*read_s_line", "read_D_pad", "read_angle_pad + 2*read_s_angle_pad", "read_w_pad + read_s_line", "read_l_pad_bar", "read_meander_spacing", "read3_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14").set("rot", "-45[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi14").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi15", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15").label("coplaner_comp 2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15")
         .set("inputexpr", new String[]{"read_w_line + 2*read_s_line", "read_D_pad", "read_angle_pad + 2*read_s_angle_pad", "read_w_pad + read_s_line", "read_l_pad_bar", "read_meander_spacing", "read4_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15").set("rot", "45[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi15").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi16", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16").label("coplaner_comp 3");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16")
         .set("inputexpr", new String[]{"read_w_line + 2*read_s_line", "read_D_pad", "read_angle_pad + 2*read_s_angle_pad", "read_w_pad + read_s_line", "read_l_pad_bar", "read_meander_spacing", "read2_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16").set("rot", "135[deg]");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi16").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("pi17", "PartInstance");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17").label("coplaner_comp 4");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17").set("part", "part6");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17")
         .set("inputexpr", new String[]{"read_w_line + 2*read_s_line", "read_D_pad", "read_angle_pad + 2*read_s_angle_pad", "read_w_pad + read_s_line", "read_l_pad_bar", "read_meander_spacing", "read1_l_line", "read_num_meander_repeat", "read_l_end_bar", "read_D_end", 
         "read_angle_end", "read_w_end"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17").set("rot", 225);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("pi17").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("c7", "Circle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c7").label("read_via_pad_comp_cir");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c7").set("r", "read_D_via_pad_comp/2");
    model.component("comp1").geom("geom1").feature("wp5").geom().create("r2", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r2").label("Rectangle_diff 1");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r2")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r2")
         .set("size", new String[]{"Q_w_bar/2 + GND_gap", "read_D_pad/2 + read_w_pad + read_s_line"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("r1", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r1").label("Rectangle_diff 2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r1")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("r1")
         .set("size", new String[]{"read_D_pad/2 + read_w_pad + read_s_line", "Q_w_bar/2 + GND_gap"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("uni4", "Union");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("uni4").label("Q_mask 1");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("uni4").set("intbnd", false);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("uni4").selection("input")
         .set(new String[]{"r1", "r2"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot4", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot4").label("Q_mask 2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot4").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot4").setIndex("rot", "90", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot4").selection("input")
         .set(new String[]{"uni4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot5", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot5").label("Q_mask 3");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot5").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot5").setIndex("rot", "180", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot5").selection("input")
         .set(new String[]{"uni4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot6", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot6").label("Q_mask 4");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot6").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot6").setIndex("rot", "270", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot6").selection("input")
         .set(new String[]{"uni4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("c3", "Circle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c3").label("read_Q_gap_cir");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c3")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c3")
         .set("r", "read_D_pad/2 + read_w_pad + read_s_line");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c3").set("angle", 90);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("c8", "Circle");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c8").label("read_Q_gap_diff");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c8")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c8").set("r", "Q_D_outer_cir/2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("c8").set("angle", 90);
    model.component("comp1").geom("geom1").feature("wp5").geom().create("dif4", "Difference");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif4").label("Q_read_gap");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif4").selection("input")
         .set(new String[]{"c3"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif4").selection("input2")
         .set(new String[]{"c8"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot1", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot1").label("Q_read_gap 2");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot1").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot1").setIndex("rot", "90", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot1").selection("input")
         .set(new String[]{"dif4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot2", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot2").label("Q_read_gap 3");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot2").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot2").setIndex("rot", "180", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot2").selection("input")
         .set(new String[]{"dif4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("rot3", "Rotate");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot3").label("Q_read_gap 4");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot3").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot3").setIndex("rot", "270", 0);
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("rot3").selection("input")
         .set(new String[]{"dif4"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("uni3", "Union");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("uni3").label("gap_pattern");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("uni3").selection("input")
         .set(new String[]{"c7", "dif4", "pi14", "pi15", "pi16", "pi17", "rot1", "rot2", "rot3"});
    model.component("comp1").geom("geom1").feature("wp5").geom().create("dif2", "Difference");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif2").label("nega_pattern");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif2").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif2").selection("input")
         .set(new String[]{"uni3"});
    model.component("comp1").geom("geom1").feature("wp5").geom().feature("dif2").selection("input2")
         .set(new String[]{"dif3", "pi10", "pi11", "pi12", "pi13", "rot4", "rot5", "rot6", "uni4"});
    model.component("comp1").geom("geom1").create("wp2", "WorkPlane");
    model.component("comp1").geom("geom1").feature("wp2").label("Q_via_Plane");
    model.component("comp1").geom("geom1").feature("wp2").set("quickz", "subs_t");
    model.component("comp1").geom("geom1").feature("wp2").set("unite", true);
    model.component("comp1").geom("geom1").feature("wp2").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c2", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c2").label("Q1_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c2")
         .set("pos", new String[]{"Q_D_outer_cir/2 + GND_gap + GND_D_via/2 + GND_via_dist", "0"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c2").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot2", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot2").label("Q1_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot2").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot2").set("rot", "range(112.5, 45, 450)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot2").selection("input")
         .set(new String[]{"c2"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mov1", "Move");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov1").label("Q1_via_moved");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov1")
         .set("displx", "(-Q_spacing/2 + Q_center_xoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov1")
         .set("disply", "(-Q_spacing/2 + Q_center_yoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov1").selection("input").named("rot2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c4", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c4").label("Q2_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c4")
         .set("pos", new String[]{"Q_D_outer_cir/2 + GND_gap + GND_D_via/2 + GND_via_dist", "0"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c4").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot3", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot3").label("Q2_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot3").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot3").set("rot", "range(112.5, 45, 450)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot3").selection("input")
         .set(new String[]{"c4"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mov4", "Move");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov4").label("Q2_via_moved");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov4")
         .set("displx", "(Q_spacing/2 - Q_center_xoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov4")
         .set("disply", "(-Q_spacing/2 + Q_center_yoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov4").selection("input").named("rot3");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c5", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c5").label("Q3_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c5")
         .set("pos", new String[]{"Q_D_outer_cir/2 + GND_gap + GND_D_via/2 + GND_via_dist", "0"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c5").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot4", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot4").label("Q3_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot4").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot4").set("rot", "range(112.5, 45, 450)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot4").selection("input")
         .set(new String[]{"c5"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mov5", "Move");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov5").label("Q3_via_moved");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov5")
         .set("displx", "(Q_spacing/2 - Q_center_xoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov5")
         .set("disply", "(Q_spacing/2 - Q_center_yoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov5").selection("input").named("rot4");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c6", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c6").label("Q4_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c6")
         .set("pos", new String[]{"Q_D_outer_cir/2 + GND_gap + GND_D_via/2 + GND_via_dist", "0"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c6").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot5", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot5").label("Q4_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot5").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot5").set("rot", "range(112.5, 45, 450)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot5").selection("input")
         .set(new String[]{"c6"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mov6", "Move");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov6").label("Q4_via_moved");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov6")
         .set("displx", "(-Q_spacing/2 + Q_center_xoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov6")
         .set("disply", "(Q_spacing/2 - Q_center_yoffset)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mov6").selection("input").named("rot5");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c7", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c7").label("R_GND_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c7")
         .set("pos", new String[]{"read_D_via_center/2", "0"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c7").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot6", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot6").label("R_GND_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot6").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot6").set("rot", "range(22.5, 45, 360)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot6").selection("input")
         .set(new String[]{"c7"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c8", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c8").label("R_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c8").set("r", "read_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c9", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c9").label("Q12_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c9")
         .set("pos", new String[]{"-0.45[mm]", "-Q_spacing/2 + Q_center_xoffset + GND_gap + GND_D_via/2 + GND_via_dist + Q_w_bar/2"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c9").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("arr1", "Array");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("arr1").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("arr1").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("arr1").set("fullsize", new int[]{2, 2});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("arr1")
         .set("displ", new String[]{"0.25[mm]", "-(Q_w_bar + 2*GND_gap + 2*GND_via_dist + GND_D_via)"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("arr1").selection("input")
         .set(new String[]{"c9"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni6", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni6").selection("input").named("arr1");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mir1", "Mirror");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir1").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir1").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir1").selection("input")
         .set(new String[]{"uni6"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni1", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni1").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni1").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni1").selection("input")
         .set(new String[]{"mir1", "uni6"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot7", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot7").set("rot", "range(0, 90, 270)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot7").selection("input").named("uni1");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c10", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c10").label("center_line_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c10")
         .set("pos", new String[]{"0", "-Q_spacing/2 + Q_center_yoffset + 0.3[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c10").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c11", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c11").label("center_line_via 1");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c11")
         .set("pos", new String[]{"0", "-Q_spacing/2 + Q_center_yoffset + 0.55[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c11").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni2", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni2").selection("input")
         .set(new String[]{"c10", "c11"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot8", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot8").set("rot", "range(0, 90, 270)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot8").selection("input")
         .set(new String[]{"uni2"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c12", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c12").label("R1_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c12")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset + 0.4[mm]", "-Q_spacing/2 + Q_center_yoffset + 0.95[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c12").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mir2", "Mirror");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir2").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir2").set("axis", new int[]{1, -1});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir2").selection("input")
         .set(new String[]{"c12"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni3", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni3").label("R1_via");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni3").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni3").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni3").selection("input")
         .set(new String[]{"c12", "mir2"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot9", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot9").set("rot", "range(0, 90, 270)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot9").selection("input")
         .set(new String[]{"uni3"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c13", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c13").label("Q1_hand_via_base");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c13")
         .set("pos", new String[]{"-Q_spacing + GND_D_via/2 - Q_w_pad/2", "-Q_spacing/2 + Q_center_xoffset + GND_gap + GND_D_via/2 + GND_via_dist + Q_h_pad/2"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c13").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("mir3", "Mirror");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir3").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir3")
         .set("pos", new String[]{"0", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir3").set("axis", new int[]{0, -1});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("mir3").selection("input")
         .set(new String[]{"c13"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c14", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c14").label("Q1_hand_via_edge");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c14")
         .set("pos", new String[]{"-Q_spacing - GND_D_via/2 - GND_gap - GND_via_dist", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c14").set("r", "GND_D_via/2");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni4", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni4").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni4").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni4").selection("input")
         .set(new String[]{"c13", "c14", "mir3"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot10", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10").set("selresultshow", "obj");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10").set("keep", true);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10").setIndex("rot", "90", 0);
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10")
         .set("pos", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot10").selection("input")
         .set(new String[]{"uni4"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("uni5", "Union");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("uni5").selection("input")
         .set(new String[]{"rot10", "uni4"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("rot11", "Rotate");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot11").set("rot", "range(0, 90, 270)");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("rot11").selection("input")
         .set(new String[]{"uni5"});
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c15", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c15")
         .set("pos", new String[]{"3.7[mm]", "3.7[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c15").set("r", "0.5[mm]");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c16", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c16")
         .set("pos", new String[]{"-3.7[mm]", "3.7[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c16").set("r", "0.5[mm]");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c17", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c17")
         .set("pos", new String[]{"3.7[mm]", "-3.7[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c17").set("r", "0.5[mm]");
    model.component("comp1").geom("geom1").feature("wp2").geom().create("c18", "Circle");
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c18")
         .set("pos", new String[]{"-3.7[mm]", "-3.7[mm]"});
    model.component("comp1").geom("geom1").feature("wp2").geom().feature("c18").set("r", "0.5[mm]");
    model.component("comp1").geom("geom1").create("wp4", "WorkPlane");
    model.component("comp1").geom("geom1").feature("wp4").label("back_plane");
    model.component("comp1").geom("geom1").feature("wp4").set("unite", true);
    model.component("comp1").geom("geom1").feature("wp4").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp4").geom().create("c4", "Circle");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c4").label("ctrl_bottom_pad");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c4").set("r", "ctrl_bottom_D_pad/2");
    model.component("comp1").geom("geom1").feature("wp4").geom().create("c5", "Circle");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c5").label("ctrl_bottom_pad_comp_inner");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c5").set("r", "ctrl_bottom_D_pad_comp/2");
    model.component("comp1").geom("geom1").feature("wp4").geom().create("r2", "Rectangle");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("r2").label("ctrl_stub_single 1");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("r2")
         .set("pos", new String[]{"-ctrl_stub_w/2", "0"});
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("r2")
         .set("size", new String[]{"ctrl_stub_w", "ctrl_bottom_D_pad_comp/2"});
    model.component("comp1").geom("geom1").feature("wp4").geom().create("rot3", "Rotate");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("rot3").label("ctrl_stub_rot 1");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("rot3").set("selresult", true);
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("rot3").set("selresultshow", "obj");

    return model;
  }

  public static Model run5(Model model) {
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("rot3").set("rot", "range(0,45,315)");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("rot3").selection("input")
         .set(new String[]{"r2"});
    model.component("comp1").geom("geom1").feature("wp4").geom().create("dif3", "Difference");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif3").label("ctrl_bottom_pattern_nega");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif3").selection("input")
         .set(new String[]{"c5"});
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif3").selection("input2")
         .set(new String[]{"c4", "rot3"});
    model.component("comp1").geom("geom1").feature("wp4").geom().create("mov1", "Move");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("mov1")
         .set("displx", "(-Q_spacing/2 + Q_center_xoffset)");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("mov1")
         .set("disply", "(-Q_spacing/2 + Q_center_yoffset)");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("mov1").selection("input")
         .set(new String[]{"dif3"});
    model.component("comp1").geom("geom1").feature("wp4").geom().create("arr1", "Array");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("arr1").label("shunt_arr");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("arr1").set("fullsize", new int[]{2, 2});
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("arr1")
         .set("displ", new String[]{"Q_spacing - 2*Q_center_xoffset", "Q_spacing - 2*Q_center_yoffset"});
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("arr1").selection("input")
         .set(new String[]{"mov1"});
    model.component("comp1").geom("geom1").feature("wp4").geom().create("c7", "Circle");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c7").label("read_bottom_pad");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c7").set("r", "read_bottom_D_via_pad/2");
    model.component("comp1").geom("geom1").feature("wp4").geom().create("c8", "Circle");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c8").label("read_bottom_pad_comp");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("c8")
         .set("r", "read_bottom_D_via_pad_comp/2");
    model.component("comp1").geom("geom1").feature("wp4").geom().create("dif2", "Difference");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif2").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif2").selection("input")
         .set(new String[]{"c8"});
    model.component("comp1").geom("geom1").feature("wp4").geom().feature("dif2").selection("input2")
         .set(new String[]{"c7"});
    model.component("comp1").geom("geom1").create("blk1", "Block");
    model.component("comp1").geom("geom1").feature("blk1").label("substrate");
    model.component("comp1").geom("geom1").feature("blk1").set("pos", new String[]{"-subs_w/2", "-subs_h/2", "0"});
    model.component("comp1").geom("geom1").feature("blk1").set("size", new String[]{"subs_w", "subs_h", "subs_t"});
    model.component("comp1").geom("geom1").create("ext1", "Extrude");
    model.component("comp1").geom("geom1").feature("ext1").label("GND_via_qubit");
    model.component("comp1").geom("geom1").feature("ext1").set("extrudefrom", "faces");
    model.component("comp1").geom("geom1").feature("ext1").setIndex("distance", "-subs_t", 0);
    model.component("comp1").geom("geom1").feature("ext1").selection("inputface")
         .set("wp2.uni", new int[]{9, 10, 11, 12, 15, 16, 17, 18, 19, 20, 21, 22, 25, 26, 27, 28, 29, 30, 31, 32, 38, 39, 40, 41, 43, 44, 45, 46, 47, 48, 51, 52, 53, 54, 55, 56, 59, 62, 63, 64, 65, 66, 67, 70, 71, 72, 73, 74, 75, 77, 78, 79, 80, 86, 87, 88, 89, 90, 91, 92, 93, 96, 97, 98, 99, 100, 101, 102, 103, 106, 107, 108, 109});
    model.component("comp1").geom("geom1").create("dif1", "Difference");
    model.component("comp1").geom("geom1").feature("dif1").label("substrate_via");
    model.component("comp1").geom("geom1").feature("dif1").set("repairtoltype", "auto");
    model.component("comp1").geom("geom1").feature("dif1").selection("input").set(new String[]{"blk1"});
    model.component("comp1").geom("geom1").feature("dif1").selection("input2").set(new String[]{"ext1"});
    model.component("comp1").geom("geom1").create("blk2", "Block");
    model.component("comp1").geom("geom1").feature("blk2").label("cavity");
    model.component("comp1").geom("geom1").feature("blk2").set("pos", new String[]{"-cav_w/2", "-cav_d/2", "0"});
    model.component("comp1").geom("geom1").feature("blk2").set("size", new String[]{"cav_w", "cav_d", "cav_h"});
    model.component("comp1").geom("geom1").create("pi1", "PartInstance");
    model.component("comp1").geom("geom1").feature("pi1").label("ctrl_coax_cable 1");
    model.component("comp1").geom("geom1").feature("pi1").set("part", "part16");
    model.component("comp1").geom("geom1").feature("pi1")
         .set("inputexpr", new String[]{"Ccoax_D_outer", "Ccoax_D_dielectric", "Ccoax_D_center", "Ccoax_L", "Ccoax_gap", "Ccoax_t_iris", "Ccoax_D_iris_hole", "Ccoax_D_probe"});
    model.component("comp1").geom("geom1").feature("pi1")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "-Q_spacing/2 + Q_center_yoffset", "0"});
    model.component("comp1").geom("geom1").feature("pi1").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").create("pi2", "PartInstance");
    model.component("comp1").geom("geom1").feature("pi2").label("ctrl_coax_cable 2");
    model.component("comp1").geom("geom1").feature("pi2").set("part", "part16");
    model.component("comp1").geom("geom1").feature("pi2")
         .set("inputexpr", new String[]{"Ccoax_D_outer", "Ccoax_D_dielectric", "Ccoax_D_center", "Ccoax_L", "Ccoax_gap", "Ccoax_t_iris", "Ccoax_D_iris_hole", "Ccoax_D_probe"});
    model.component("comp1").geom("geom1").feature("pi2")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "-Q_spacing/2 + Q_center_xoffset", "0"});
    model.component("comp1").geom("geom1").feature("pi2").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").create("pi3", "PartInstance");
    model.component("comp1").geom("geom1").feature("pi3").label("ctrl_coax_cable 3");
    model.component("comp1").geom("geom1").feature("pi3").set("part", "part16");
    model.component("comp1").geom("geom1").feature("pi3")
         .set("inputexpr", new String[]{"Ccoax_D_outer", "Ccoax_D_dielectric", "Ccoax_D_center", "Ccoax_L", "Ccoax_gap", "Ccoax_t_iris", "Ccoax_D_iris_hole", "Ccoax_D_probe"});
    model.component("comp1").geom("geom1").feature("pi3")
         .set("displ", new String[]{"Q_spacing/2 - Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset", "0"});
    model.component("comp1").geom("geom1").feature("pi3").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").create("pi4", "PartInstance");
    model.component("comp1").geom("geom1").feature("pi4").label("ctrl_coax_cable 4");
    model.component("comp1").geom("geom1").feature("pi4").set("part", "part16");
    model.component("comp1").geom("geom1").feature("pi4")
         .set("inputexpr", new String[]{"Ccoax_D_outer", "Ccoax_D_dielectric", "Ccoax_D_center", "Ccoax_L", "Ccoax_gap", "Ccoax_t_iris", "Ccoax_D_iris_hole", "Ccoax_D_probe"});
    model.component("comp1").geom("geom1").feature("pi4")
         .set("displ", new String[]{"-Q_spacing/2 + Q_center_xoffset", "Q_spacing/2 - Q_center_yoffset", "0"});
    model.component("comp1").geom("geom1").feature("pi4").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").create("pi5", "PartInstance");
    model.component("comp1").geom("geom1").feature("pi5").label("read_coax_cable");
    model.component("comp1").geom("geom1").feature("pi5").set("part", "part16");
    model.component("comp1").geom("geom1").feature("pi5")
         .set("inputexpr", new String[]{"Ccoax_D_outer", "Ccoax_D_dielectric", "Ccoax_D_center", "Ccoax_L", "Ccoax_gap", "Ccoax_t_iris", "Ccoax_D_iris_hole", "Ccoax_D_probe"});
    model.component("comp1").geom("geom1").feature("pi5").set("selkeepnoncontr", false);
    model.component("comp1").geom("geom1").run();
    model.component("comp1").geom("geom1").run("fin");

    model.component("comp1").selection().create("box1", "Box");
    model.component("comp1").selection("box1").set("entitydim", 2);
    model.component("comp1").selection().create("sel1", "Explicit");
    model.component("comp1").selection("sel1").geom("geom1", 3, 2, new String[]{"exterior"});
    model.component("comp1").selection("sel1").set(new int[]{14, 39});
    model.component("comp1").selection().create("sel2", "Explicit");
    model.component("comp1").selection("sel2").geom("geom1", 3, 2, new String[]{"exterior"});
    model.component("comp1").selection("box1").label("vias");
    model.component("comp1").selection("box1").set("xmin", "-subs_w/2 + subs_w/100 + Q_spacing/2");
    model.component("comp1").selection("box1").set("xmax", "subs_w/2 - subs_w/100 + Q_spacing/2");
    model.component("comp1").selection("box1").set("ymin", "-subs_h/2 + subs_h/100");
    model.component("comp1").selection("box1").set("ymax", "subs_h/2 - subs_h/100");
    model.component("comp1").selection("box1").set("zmin", "subs_t/100");
    model.component("comp1").selection("box1").set("zmax", "subs_t - subs_t/100");
    model.component("comp1").selection("sel1").label("ctrl_coax_inner_electrode");
    model.component("comp1").selection("sel2").label("read_coax_inner_electrode");

    model.view("view3").tag("view31");
    model.view("view2").tag("view3");
    model.view("view5").tag("view51");
    model.view("view31").tag("view5");
    model.view("view6").tag("view61");
    model.view("view4").tag("view6");
    model.view("view7").tag("view71");
    model.view("view51").tag("view7");
    model.view("view10").tag("view101");
    model.view("view61").tag("view10");
    model.view("view12").tag("view121");
    model.view("view71").tag("view12");
    model.view("view11").tag("view111");
    model.view("view8").tag("view11");
    model.view("view15").tag("view151");
    model.view("view9").tag("view15");
    model.view("view18").tag("view181");
    model.view("view101").tag("view18");
    model.view("view19").tag("view191");
    model.view("view111").tag("view19");
    model.view("view20").tag("view201");
    model.view("view121").tag("view20");
    model.view("view21").tag("view211");
    model.view("view13").tag("view21");
    model.view("view22").tag("view221");
    model.view("view14").tag("view22");
    model.component("comp1").view("view23").tag("view231");
    model.view("view151").tag("view23");
    model.component("comp1").view("view24").tag("view241");
    model.view("view16").tag("view24");
    model.component("comp1").view("view25").tag("view251");
    model.view("view17").tag("view25");
    model.component("comp1").view("view26").tag("view261");
    model.view("view181").tag("view26");
    model.view("view191").tag("view27");
    model.view("view201").tag("view28");
    model.view("view211").tag("view29");
    model.view("view221").tag("view31");
    model.component("comp1").view("view231").tag("view4");
    model.component("comp1").view("view241").tag("view30");
    model.component("comp1").view("view251").tag("view8");
    model.component("comp1").view("view261").tag("view14");
    model.component("comp1").view("view1").hideObjects().create("hide1");
    model.component("comp1").view("view1").hideEntities().create("hide1");
    model.component("comp1").view("view1").hideEntities().create("hide2");
    model.component("comp1").view("view1").hideEntities("hide2").geom("geom1", 2);
    model.component("comp1").view("view1").hideEntities().create("hide3");
    model.component("comp1").view("view1").hideEntities("hide3").geom("geom1", 2);
    model.component("comp1").view("view1").hideEntities().create("hide4");
    model.component("comp1").view("view1").hideEntities("hide4").geom("geom1", 2);
    model.view().create("view9", 2);
    model.view("view24").hideObjects().create("hide1");

    model.component("comp1").material().create("mat1", "Common");
    model.component("comp1").material().create("mat2", "Common");
    model.component("comp1").material().create("mat3", "Common");
    model.component("comp1").material("mat1").selection()
         .set(new int[]{2, 9, 10, 14, 17, 22, 25, 27, 34, 35, 39, 42});
    model.component("comp1").material("mat1").propertyGroup("def").func().create("eta", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("Cp", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("rho", "Analytic");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("k", "Piecewise");
    model.component("comp1").material("mat1").propertyGroup("def").func().create("cs", "Analytic");
    model.component("comp1").material("mat1").propertyGroup().create("RefractiveIndex", "Refractive index");
    model.component("comp1").material("mat2").selection().set(new int[]{1});
    model.component("comp1").material("mat2").propertyGroup().create("Enu", "Young's modulus and Poisson's ratio");
    model.component("comp1").material("mat2").propertyGroup().create("RefractiveIndex", "Refractive index");
    model.component("comp1").material("mat3").selection().set(new int[]{7, 8, 21, 32, 33});

    model.component("comp1").cpl().create("intop1", "Integration");
    model.component("comp1").cpl().create("intop2", "Integration");
    model.component("comp1").cpl().create("intop3", "Integration");
    model.component("comp1").cpl().create("intop4", "Integration");
    model.component("comp1").cpl("intop1").selection().geom("geom1", 2);
    model.component("comp1").cpl("intop2").selection().geom("geom1", 2);
    model.component("comp1").cpl("intop3").selection().geom("geom1", 2);
    model.component("comp1").cpl("intop4").selection().geom("geom1", 2);

    model.component("comp1").physics().create("emw", "ElectromagneticWaves", "geom1");
    model.component("comp1").physics("emw").selection()
         .set(new int[]{1, 2, 7, 8, 9, 10, 14, 17, 21, 22, 25, 27, 32, 33, 34, 35, 39, 42});
    model.component("comp1").physics("emw").create("pec2", "PerfectElectricConductor", 2);
    model.component("comp1").physics("emw").feature("pec2").selection()
         .set(new int[]{6, 10, 11, 13, 14, 15, 16, 17, 18, 71, 72, 147, 148, 149, 150, 187, 188, 189, 190, 191, 192, 193, 222, 223, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 267, 319, 320, 340, 353, 354, 360, 361, 373, 374, 375, 380, 381, 382, 383, 402, 403, 412, 413, 428, 429, 430, 431, 432, 433, 434, 435, 436, 479, 510, 511, 524, 525, 526, 535, 536, 539, 540, 569, 570, 587, 588, 619, 620, 685, 686, 723, 724, 725, 726, 727, 728});
    model.component("comp1").physics("emw").create("pec6", "PerfectElectricConductor", 2);
    model.component("comp1").physics("emw").feature("pec6").selection()
         .set(new int[]{3, 25, 32, 35, 38, 41, 44, 64, 68, 75, 78, 81, 84, 87, 90, 93, 96, 137, 146, 196, 199, 202, 205, 208, 211, 214, 217, 253, 256, 259, 262, 278, 281, 284, 287, 290, 314, 324, 327, 330, 333, 355, 372, 378, 418, 421, 424, 427, 459, 462, 465, 468, 486, 493, 496, 499, 502, 505, 530, 534, 543, 546, 549, 552, 555, 558, 561, 564, 609, 618, 659, 662, 665, 668, 671, 674, 677, 680, 705, 708, 711, 714});
    model.component("comp1").physics("emw").create("pec3", "PerfectElectricConductor", 2);
    model.component("comp1").physics("emw").feature("pec3").selection().named("box1");
    model.component("comp1").physics("emw").create("pec4", "PerfectElectricConductor", 2);
    model.component("comp1").physics("emw").feature("pec4").selection()
         .set(new int[]{121, 122, 124, 125, 126, 128, 129, 130, 134, 136, 138, 139, 143, 145, 155, 156, 158, 159, 160, 162, 171, 172, 174, 175, 176, 178, 356, 359, 364, 365, 369, 371, 388, 389, 391, 395, 397, 593, 594, 596, 597, 598, 600, 601, 602, 606, 608, 610, 611, 615, 617, 625, 626, 628, 629, 630, 632, 641, 642, 644, 645, 646, 648});
    model.component("comp1").physics("emw").create("lelement3", "LumpedElement", 2);
    model.component("comp1").physics("emw").feature("lelement3").selection().set(new int[]{51, 55, 514, 518});
    model.component("comp1").physics("emw").create("lelement5", "LumpedElement", 2);

    model.component("comp1").mesh("mesh1").create("ftri2", "FreeTri");
    model.component("comp1").mesh("mesh1").create("ftet1", "FreeTet");
    model.component("comp1").mesh("mesh1").feature("ftri2").create("size1", "Size");
    model.component("comp1").mesh("mesh1").feature("ftri2").feature("size1").selection().geom("geom1", 2);

    model.result().table("evl3").label("Evaluation 3D");
    model.result().table("evl3").comments("Interactive 3D values");
    model.result().table("tbl1").comments("Global Evaluation 1 (real(freq), imag(freq))");

    model.component("comp1").view("view1").set("renderwireframe", true);
    model.component("comp1").view("view1").hideObjects("hide1").label("cavity");
    model.component("comp1").view("view1").hideObjects("hide1").init(2);
    model.component("comp1").view("view1").hideObjects("hide1").set("fin(1)", new int[]{1, 2, 4, 5, 7});
    model.component("comp1").view("view1").hideEntities("hide1").label("coax_outer_electrode");
    model.component("comp1").view("view1").hideEntities("hide2").label("coax_boundary");
    model.component("comp1").view("view1").hideEntities("hide3").label("coax_center_gap");
    model.component("comp1").view("view1").hideEntities("hide4").label("center_tip_boundary");
    model.view("view3").label("View 3.1");
    model.view("view3").axis().set("xmin", -5.46671508345753E-4);
    model.view("view3").axis().set("xmax", 5.46671508345753E-4);
    model.view("view3").axis().set("ymin", -4.926453111693263E-4);
    model.view("view3").axis().set("ymax", 4.926453111693263E-4);
    model.view("view3").axis().set("abstractviewlratio", -0.05918605253100395);
    model.view("view3").axis().set("abstractviewrratio", 0.05918605253100395);
    model.view("view3").axis().set("abstractviewbratio", -0.025000035762786865);
    model.view("view3").axis().set("abstractviewtratio", 0.025000035762786865);
    model.view("view3").axis().set("abstractviewxscale", 1.83139536602539E-6);
    model.view("view3").axis().set("abstractviewyscale", 1.8313954797122278E-6);
    model.component("comp1").view("view4").label("View 4");
    model.component("comp1").view("view4").axis().set("xmin", -0.0032999999821186066);
    model.component("comp1").view("view4").axis().set("xmax", 0.0032999999821186066);
    model.component("comp1").view("view4").axis().set("ymin", -0.005569889675825834);
    model.component("comp1").view("view4").axis().set("ymax", 0.005569889675825834);
    model.component("comp1").view("view4").axis().set("abstractviewlratio", -0.04999999329447746);
    model.component("comp1").view("view4").axis().set("abstractviewrratio", 0.04999999329447746);
    model.component("comp1").view("view4").axis().set("abstractviewbratio", -0.4283149242401123);
    model.component("comp1").view("view4").axis().set("abstractviewtratio", 0.4283149242401123);
    model.component("comp1").view("view4").axis().set("abstractviewxscale", 1.823204365791753E-5);
    model.component("comp1").view("view4").axis().set("abstractviewyscale", 1.8232045476906933E-5);
    model.view("view5").label("View 5.1");
    model.view("view5").axis().set("xmin", -2.320773055544123E-4);
    model.view("view5").axis().set("xmax", 8.320774650201201E-4);
    model.view("view5").axis().set("ymin", -4.816700820811093E-4);
    model.view("view5").axis().set("ymax", 4.816700820811093E-4);
    model.view("view5").axis().set("abstractviewlratio", -0.06498219817876816);
    model.view("view5").axis().set("abstractviewrratio", 0.06498223543167114);
    model.view("view5").axis().set("abstractviewbratio", -0.04999997094273567);
    model.view("view5").axis().set("abstractviewtratio", 0.04999997094273567);
    model.view("view5").axis().set("abstractviewxscale", 2.2403257844416657E-6);
    model.view("view5").axis().set("abstractviewyscale", 2.2403257844416657E-6);
    model.view("view6").label("View 6.1");
    model.view("view6").axis().set("xmin", -0.0010237499373033643);
    model.view("view6").axis().set("xmax", 0.0010237499373033643);
    model.view("view6").axis().set("ymin", -0.0033271871507167816);
    model.view("view6").axis().set("ymax", 0.0033271871507167816);
    model.view("view6").axis().set("abstractviewlratio", -0.40397149324417114);
    model.view("view6").axis().set("abstractviewrratio", 0.40397149324417114);
    model.view("view6").axis().set("abstractviewbratio", -0.05000000074505806);
    model.view("view6").axis().set("abstractviewtratio", 0.05000000074505806);
    model.view("view6").axis().set("abstractviewxscale", 8.849287041812204E-6);
    model.view("view6").axis().set("abstractviewyscale", 8.849287041812204E-6);
    model.view("view7").label("View 7.1");
    model.view("view7").axis().set("xmin", -9.449999779462814E-4);
    model.view("view7").axis().set("xmax", 9.449999779462814E-4);
    model.view("view7").axis().set("ymin", -0.0030712499283254147);
    model.view("view7").axis().set("ymax", 0.0030712499283254147);
    model.view("view7").axis().set("abstractviewlratio", -0.7052953243255615);
    model.view("view7").axis().set("abstractviewrratio", 0.7052953243255615);
    model.view("view7").axis().set("abstractviewbratio", -0.04999999329447746);
    model.view("view7").axis().set("abstractviewtratio", 0.04999999329447746);
    model.view("view7").axis().set("abstractviewxscale", 4.032586275570793E-6);
    model.view("view7").axis().set("abstractviewyscale", 4.032586275570793E-6);
    model.component("comp1").view("view8").label("View 8");
    model.component("comp1").view("view8").axis().set("xmin", -0.0013216608203947544);
    model.component("comp1").view("view8").axis().set("xmax", 0.001011593732982874);
    model.component("comp1").view("view8").axis().set("ymin", -9.772279299795628E-4);
    model.component("comp1").view("view8").axis().set("ymax", 0.0011787717230618);
    model.component("comp1").view("view8").axis().set("abstractviewlratio", 0.3426594138145447);
    model.component("comp1").view("view8").axis().set("abstractviewrratio", -0.37957218289375305);
    model.component("comp1").view("view8").axis().set("abstractviewbratio", 0.3836633265018463);
    model.component("comp1").view("view8").axis().set("abstractviewtratio", -0.3596700131893158);
    model.component("comp1").view("view8").axis().set("abstractviewxscale", 3.617449010562268E-6);
    model.component("comp1").view("view8").axis().set("abstractviewyscale", 3.617449010562268E-6);
    model.view("view9").axis().set("xmin", -0.006299999542534351);
    model.view("view9").axis().set("xmax", 0.006300000008195639);
    model.view("view9").axis().set("ymin", -0.007464134134352207);
    model.view("view9").axis().set("ymax", 0.007464127615094185);
    model.view("view9").axis().set("abstractviewlratio", -0.23817913234233856);
    model.view("view9").axis().set("abstractviewrratio", 0.2381790578365326);
    model.view("view9").axis().set("abstractviewbratio", -0.060903072357177734);
    model.view("view9").axis().set("abstractviewtratio", 0.06090295687317848);
    model.view("view9").axis().set("abstractviewxscale", 1.938326022354886E-5);
    model.view("view9").axis().set("abstractviewyscale", 1.938326022354886E-5);
    model.view("view10").label("View 10.1");
    model.view("view11").label("View 11.1");
    model.view("view11").axis().set("xmin", -5.642932374030352E-4);
    model.view("view11").axis().set("xmax", 5.642932374030352E-4);
    model.view("view11").axis().set("ymin", 2.923990832641721E-4);
    model.view("view11").axis().set("ymax", 0.0011965269222855568);
    model.view("view11").axis().set("abstractviewlratio", -0.10493826121091843);
    model.view("view11").axis().set("abstractviewrratio", 0.10493826121091843);
    model.view("view11").axis().set("abstractviewbratio", -0.049999967217445374);
    model.view("view11").axis().set("abstractviewtratio", 0.049999967217445374);
    model.view("view11").axis().set("abstractviewxscale", 1.5179261936282273E-6);
    model.view("view11").axis().set("abstractviewyscale", 1.5179261936282273E-6);
    model.view("view12").label("View 12.1");
    model.view("view12").axis().set("xmin", -7.16528229531832E-5);
    model.view("view12").axis().set("xmax", 2.665282408997882E-5);
    model.view("view12").axis().set("ymin", -1.1877071301569231E-5);
    model.view("view12").axis().set("ymax", 6.687708082608879E-5);
    model.view("view12").axis().set("abstractviewlratio", -0.353322297334671);
    model.view("view12").axis().set("abstractviewrratio", 0.3533223271369934);
    model.view("view12").axis().set("abstractviewbratio", -0.05000001937150955);
    model.view("view12").axis().set("abstractviewtratio", 0.05000001937150955);
    model.view("view12").axis().set("abstractviewxscale", 1.8272424995302572E-7);
    model.view("view12").axis().set("abstractviewyscale", 1.8272424995302572E-7);
    model.component("comp1").view("view14").label("View 14");
    model.component("comp1").view("view14").axis().set("xmin", -0.0019781598821282387);
    model.component("comp1").view("view14").axis().set("xmax", 0.0019781598821282387);
    model.component("comp1").view("view14").axis().set("ymin", -0.001827881089411676);
    model.component("comp1").view("view14").axis().set("ymax", 0.001827881089411676);
    model.component("comp1").view("view14").axis().set("abstractviewlratio", 0.17030668258666992);
    model.component("comp1").view("view14").axis().set("abstractviewrratio", -0.17030668258666992);
    model.component("comp1").view("view14").axis().set("abstractviewbratio", 0.19535315036773682);
    model.component("comp1").view("view14").axis().set("abstractviewtratio", -0.19535315036773682);
    model.component("comp1").view("view14").axis().set("abstractviewxscale", 6.133829174359562E-6);
    model.component("comp1").view("view14").axis().set("abstractviewyscale", 6.133829174359562E-6);
    model.view("view15").label("View 15.1");
    model.view("view15").axis().set("xmin", -1.4615390682592988E-5);
    model.view("view15").axis().set("xmax", 1.1461539543233812E-4);
    model.view("view15").axis().set("ymin", -9.999974281527102E-6);
    model.view("view15").axis().set("ymax", 4.099999787285924E-4);
    model.view("view15").axis().set("abstractviewlratio", -2.182403326034546);
    model.view("view15").axis().set("abstractviewrratio", 2.182403564453125);
    model.view("view15").axis().set("abstractviewbratio", -0.05000001937150955);
    model.view("view15").axis().set("abstractviewtratio", 0.05000001937150955);
    model.view("view15").axis().set("abstractviewxscale", 9.442060218134429E-7);
    model.view("view15").axis().set("abstractviewyscale", 9.442060218134429E-7);
    model.view("view18").label("View 18.1");
    model.view("view18").axis().set("xmin", -4.087500274181366E-4);
    model.view("view18").axis().set("xmax", 0.0010087499395012856);
    model.view("view18").axis().set("ymin", -4.398010205477476E-4);
    model.view("view18").axis().set("ymax", 4.398010205477476E-4);
    model.view("view18").axis().set("abstractviewlratio", -0.05207156389951706);
    model.view("view18").axis().set("abstractviewrratio", 0.05207162722945213);
    model.view("view18").axis().set("abstractviewbratio", -0.04999999329447746);
    model.view("view18").axis().set("abstractviewtratio", 0.04999999329447746);
    model.view("view18").axis().set("abstractviewxscale", 1.3983050166643807E-6);
    model.view("view18").axis().set("abstractviewyscale", 1.3983051303512184E-6);
    model.view("view19").label("View 19.1");
    model.view("view19").axis().set("xmin", -3.3000012626871467E-4);
    model.view("view19").axis().set("xmax", 9.300000383518636E-4);
    model.view("view19").axis().set("ymin", -0.002047500340268016);
    model.view("view19").axis().set("ymax", 0.002047500340268016);
    model.view("view19").axis().set("abstractviewlratio", -0.049999989569187164);
    model.view("view19").axis().set("abstractviewrratio", 0.049999989569187164);
    model.view("view19").axis().set("abstractviewbratio", -0.10881800204515457);
    model.view("view19").axis().set("abstractviewtratio", 0.10881800204515457);
    model.view("view19").axis().set("abstractviewxscale", 1.2382739669192233E-6);
    model.view("view19").axis().set("abstractviewyscale", 1.2382739669192233E-6);
    model.view("view20").label("View 20.1");
    model.view("view20").axis().set("xmin", -0.0025987501721829176);
    model.view("view20").axis().set("xmax", 0.0025987501721829176);
    model.view("view20").axis().set("ymin", -0.008445938117802143);
    model.view("view20").axis().set("ymax", 0.008445938117802143);
    model.view("view20").axis().set("abstractviewlratio", -0.05000000819563866);
    model.view("view20").axis().set("abstractviewrratio", 0.05000000819563866);
    model.view("view20").axis().set("abstractviewbratio", -2.7641727924346924);
    model.view("view20").axis().set("abstractviewtratio", 2.7641727924346924);
    model.view("view20").axis().set("abstractviewxscale", 8.326972420036327E-6);
    model.view("view20").axis().set("abstractviewyscale", 8.326971510541625E-6);
    model.view("view21").label("View 21.1");
    model.view("view21").axis().set("xmin", -9.449998033232987E-4);
    model.view("view21").axis().set("xmax", 9.449998033232987E-4);
    model.view("view21").axis().set("ymin", -0.0030712494626641273);
    model.view("view21").axis().set("ymax", 0.0030712494626641273);
    model.view("view21").axis().set("abstractviewlratio", -0.025000043213367462);
    model.view("view21").axis().set("abstractviewrratio", 0.025000043213367462);
    model.view("view21").axis().set("abstractviewbratio", -0.6340001225471497);
    model.view("view21").axis().set("abstractviewtratio", 0.6340001225471497);
    model.view("view21").axis().set("abstractviewxscale", 2.8000004022032954E-6);
    model.view("view21").axis().set("abstractviewyscale", 2.8000004022032954E-6);
    model.view("view22").label("View 22.1");
    model.view("view22").axis().set("xmin", -4.999987140763551E-6);
    model.view("view22").axis().set("xmax", 2.049999893642962E-4);
    model.view("view22").axis().set("ymin", -3.412499791011214E-4);
    model.view("view22").axis().set("ymax", 3.412499791011214E-4);
    model.view("view22").axis().set("abstractviewlratio", -0.050000015646219254);
    model.view("view22").axis().set("abstractviewrratio", 0.050000015646219254);
    model.view("view22").axis().set("abstractviewbratio", -4.306723594665527);
    model.view("view22").axis().set("abstractviewtratio", 4.306723594665527);
    model.view("view22").axis().set("abstractviewxscale", 3.081232762269792E-7);
    model.view("view22").axis().set("abstractviewyscale", 3.0812330464868865E-7);
    model.view("view23").label("View 23");
    model.view("view23").axis().set("xmin", -1.0714247764553875E-6);
    model.view("view23").axis().set("xmax", 1.039285707520321E-4);
    model.view("view23").axis().set("ymin", -1.4562500291503966E-4);
    model.view("view23").axis().set("ymax", 1.9562500528991222E-4);
    model.view("view23").axis().set("abstractviewlratio", -0.3750000298023224);
    model.view("view23").axis().set("abstractviewrratio", 1.374999761581421);
    model.view("view23").axis().set("abstractviewbratio", -1.2166869640350342);
    model.view("view23").axis().set("abstractviewtratio", 1.2166868448257446);
    model.view("view23").axis().set("abstractviewxscale", 3.851540668620146E-7);
    model.view("view23").axis().set("abstractviewyscale", 3.851540668620146E-7);
    model.view("view24").label("View 24.1");
    model.view("view24").hideObjects("hide1").set(new String[]{"cyl8"});
    model.view("view25").label("View 25");
    model.view("view26").label("View 26");

    return model;
  }

  public static Model run6(Model model) {
    model.view("view26").axis().set("xmin", -0.0025987501721829176);
    model.view("view26").axis().set("xmax", 0.0025987501721829176);
    model.view("view26").axis().set("ymin", -0.008445938117802143);
    model.view("view26").axis().set("ymax", 0.008445938117802143);
    model.view("view26").axis().set("abstractviewlratio", -0.04999998211860657);
    model.view("view26").axis().set("abstractviewrratio", 0.04999998211860657);
    model.view("view26").axis().set("abstractviewbratio", -1.7636840343475342);
    model.view("view26").axis().set("abstractviewtratio", 1.7636840343475342);
    model.view("view26").axis().set("abstractviewxscale", 8.68421011546161E-6);
    model.view("view26").axis().set("abstractviewyscale", 8.68421011546161E-6);
    model.view("view27").label("View 27");
    model.view("view27").axis().set("xmin", -9.449999779462814E-4);
    model.view("view27").axis().set("xmax", 9.449999779462814E-4);
    model.view("view27").axis().set("ymin", -0.003071249695494771);
    model.view("view27").axis().set("ymax", 0.003071249695494771);
    model.view("view27").axis().set("abstractviewlratio", -0.04999999329447746);
    model.view("view27").axis().set("abstractviewrratio", 0.04999999329447746);
    model.view("view27").axis().set("abstractviewbratio", -0.43973508477211);
    model.view("view27").axis().set("abstractviewtratio", 0.43973508477211);
    model.view("view27").axis().set("abstractviewxscale", 2.1854305032320553E-6);
    model.view("view27").axis().set("abstractviewyscale", 2.1854305032320553E-6);
    model.view("view28").label("View 28");
    model.view("view28").axis().set("xmin", -0.0019137548515573144);
    model.view("view28").axis().set("xmax", 0.0019137548515573144);
    model.view("view28").axis().set("ymin", -0.0010725000174716115);
    model.view("view28").axis().set("ymax", 0.0010725000174716115);
    model.view("view28").axis().set("abstractviewlratio", -0.48141270875930786);
    model.view("view28").axis().set("abstractviewrratio", 0.48141270875930786);
    model.view("view28").axis().set("abstractviewbratio", -0.05000002309679985);
    model.view("view28").axis().set("abstractviewtratio", 0.05000002309679985);
    model.view("view28").axis().set("abstractviewxscale", 3.986989213444758E-6);
    model.view("view28").axis().set("abstractviewyscale", 3.986988758697407E-6);
    model.view("view29").label("View 29");
    model.view("view29").axis().set("xmin", -0.0014931438490748405);
    model.view("view29").axis().set("xmax", 0.0014931438490748405);
    model.view("view29").axis().set("ymin", -9.449999779462814E-4);
    model.view("view29").axis().set("ymax", 9.449999779462814E-4);
    model.view("view29").axis().set("abstractviewlratio", -0.4814126789569855);
    model.view("view29").axis().set("abstractviewrratio", 0.4814126789569855);
    model.view("view29").axis().set("abstractviewbratio", -0.04999999329447746);
    model.view("view29").axis().set("abstractviewtratio", 0.04999999329447746);
    model.view("view29").axis().set("abstractviewxscale", 3.680297368191532E-6);
    model.view("view29").axis().set("abstractviewyscale", 3.680297368191532E-6);
    model.component("comp1").view("view30").label("View 30");
    model.component("comp1").view("view30").axis().set("xmin", -0.0032273326069116592);
    model.component("comp1").view("view30").axis().set("xmax", 0.0032273326069116592);
    model.component("comp1").view("view30").axis().set("ymin", -0.003150000236928463);
    model.component("comp1").view("view30").axis().set("ymax", 0.003150000236928463);
    model.component("comp1").view("view30").axis().set("abstractviewlratio", -0.09521815925836563);
    model.component("comp1").view("view30").axis().set("abstractviewrratio", 0.09521815925836563);
    model.component("comp1").view("view30").axis().set("abstractviewbratio", -0.04999998211860657);
    model.component("comp1").view("view30").axis().set("abstractviewtratio", 0.04999998211860657);
    model.component("comp1").view("view30").axis().set("abstractviewxscale", 7.5302009463484865E-6);
    model.component("comp1").view("view30").axis().set("abstractviewyscale", 7.5302009463484865E-6);
    model.view("view31").label("View 31");
    model.view("view31").axis().set("xmin", -0.0010924657108262181);
    model.view("view31").axis().set("xmax", 0.0010924657108262181);
    model.view("view31").axis().set("ymin", -9.84500045888126E-4);
    model.view("view31").axis().set("ymax", 9.84500045888126E-4);
    model.view("view31").axis().set("abstractviewlratio", -0.23503723740577698);
    model.view("view31").axis().set("abstractviewrratio", 0.23503723740577698);
    model.view("view31").axis().set("abstractviewbratio", -0.05000002309679985);
    model.view("view31").axis().set("abstractviewtratio", 0.05000002309679985);
    model.view("view31").axis().set("abstractviewxscale", 3.659851699922001E-6);
    model.view("view31").axis().set("abstractviewyscale", 3.6598514725483255E-6);

    model.component("comp1").material("mat1").label("Air");
    model.component("comp1").material("mat1").set("family", "air");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("eta")
         .set("pieces", new String[][]{{"200.0", "1600.0", "-8.38278E-7+8.35717342E-8*T^1-7.69429583E-11*T^2+4.6437266E-14*T^3-1.06585607E-17*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("Cp")
         .set("pieces", new String[][]{{"200.0", "1600.0", "1047.63657-0.372589265*T^1+9.45304214E-4*T^2-6.02409443E-7*T^3+1.2858961E-10*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").set("expr", "pA*0.02897/8.314/T");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").set("args", new String[]{"pA", "T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("rho").set("dermethod", "manual");
    model.component("comp1").material("mat1").propertyGroup("def").func("rho")
         .set("argders", new String[][]{{"pA", "d(pA*0.02897/8.314/T,pA)"}, {"T", "d(pA*0.02897/8.314/T,T)"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("rho")
         .set("plotargs", new String[][]{{"pA", "0", "1"}, {"T", "0", "1"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("k").set("arg", "T");
    model.component("comp1").material("mat1").propertyGroup("def").func("k")
         .set("pieces", new String[][]{{"200.0", "1600.0", "-0.00227583562+1.15480022E-4*T^1-7.90252856E-8*T^2+4.11702505E-11*T^3-7.43864331E-15*T^4"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("expr", "sqrt(1.4*287*T)");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("args", new String[]{"T"});
    model.component("comp1").material("mat1").propertyGroup("def").func("cs").set("dermethod", "manual");
    model.component("comp1").material("mat1").propertyGroup("def").func("cs")
         .set("argders", new String[][]{{"T", "d(sqrt(1.4*287*T),T)"}});
    model.component("comp1").material("mat1").propertyGroup("def").func("cs")
         .set("plotargs", new String[][]{{"T", "0", "1"}});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("relpermittivity", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("def").set("dynamicviscosity", "eta(T[1/K])[Pa*s]");
    model.component("comp1").material("mat1").propertyGroup("def").set("ratioofspecificheat", "1.4");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("electricconductivity", new String[]{"0[S/m]", "0", "0", "0", "0[S/m]", "0", "0", "0", "0[S/m]"});
    model.component("comp1").material("mat1").propertyGroup("def").set("heatcapacity", "Cp(T[1/K])[J/(kg*K)]");
    model.component("comp1").material("mat1").propertyGroup("def").set("density", "rho(pA[1/Pa],T[1/K])[kg/m^3]");
    model.component("comp1").material("mat1").propertyGroup("def")
         .set("thermalconductivity", new String[]{"k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]", "0", "0", "0", "k(T[1/K])[W/(m*K)]"});
    model.component("comp1").material("mat1").propertyGroup("def").set("soundspeed", "cs(T[1/K])[m/s]");
    model.component("comp1").material("mat1").propertyGroup("def").addInput("temperature");
    model.component("comp1").material("mat1").propertyGroup("def").addInput("pressure");
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex").set("n", "");
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex").set("ki", "");
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex")
         .set("n", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat1").propertyGroup("RefractiveIndex")
         .set("ki", new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"});
    model.component("comp1").material("mat2").label("Silicon");
    model.component("comp1").material("mat2").set("family", "custom");
    model.component("comp1").material("mat2").set("specular", "custom");
    model.component("comp1").material("mat2").set("customspecular", new double[]{0.7843137254901961, 1, 1});
    model.component("comp1").material("mat2").set("diffuse", "custom");
    model.component("comp1").material("mat2")
         .set("customdiffuse", new double[]{0.6666666666666666, 0.6666666666666666, 0.7058823529411765});
    model.component("comp1").material("mat2").set("ambient", "custom");
    model.component("comp1").material("mat2")
         .set("customambient", new double[]{0.6666666666666666, 0.6666666666666666, 0.7058823529411765});
    model.component("comp1").material("mat2").set("noise", true);
    model.component("comp1").material("mat2").set("noisefreq", 1);
    model.component("comp1").material("mat2").set("lighting", "cooktorrance");
    model.component("comp1").material("mat2").set("fresnel", 0.7);
    model.component("comp1").material("mat2").set("roughness", 0.5);
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("electricconductivity", new String[]{"1e-12[S/m]", "0", "0", "0", "1e-12[S/m]", "0", "0", "0", "1e-12[S/m]"});
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("thermalexpansioncoefficient", new String[]{"2.6e-6[1/K]", "0", "0", "0", "2.6e-6[1/K]", "0", "0", "0", "2.6e-6[1/K]"});
    model.component("comp1").material("mat2").propertyGroup("def").set("heatcapacity", "700[J/(kg*K)]");
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("relpermittivity", new String[]{"11.7", "0", "0", "0", "11.7", "0", "0", "0", "11.7"});
    model.component("comp1").material("mat2").propertyGroup("def").set("density", "2329[kg/m^3]");
    model.component("comp1").material("mat2").propertyGroup("def")
         .set("thermalconductivity", new String[]{"130[W/(m*K)]", "0", "0", "0", "130[W/(m*K)]", "0", "0", "0", "130[W/(m*K)]"});
    model.component("comp1").material("mat2").propertyGroup("Enu").set("youngsmodulus", "170e9[Pa]");
    model.component("comp1").material("mat2").propertyGroup("Enu").set("poissonsratio", "0.28");
    model.component("comp1").material("mat2").propertyGroup("RefractiveIndex").set("n", "");
    model.component("comp1").material("mat2").propertyGroup("RefractiveIndex").set("ki", "");
    model.component("comp1").material("mat2").propertyGroup("RefractiveIndex")
         .set("n", new String[]{"3.48", "0", "0", "0", "3.48", "0", "0", "0", "3.48"});
    model.component("comp1").material("mat2").propertyGroup("RefractiveIndex")
         .set("ki", new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"});
    model.component("comp1").material("mat3").label("Teflon");
    model.component("comp1").material("mat3").propertyGroup("def")
         .set("relpermeability", new String[]{"1", "0", "0", "0", "1", "0", "0", "0", "1"});
    model.component("comp1").material("mat3").propertyGroup("def")
         .set("relpermittivity", new String[]{"2.1", "0", "0", "0", "2.1", "0", "0", "0", "2.1"});
    model.component("comp1").material("mat3").propertyGroup("def")
         .set("electricconductivity", new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"});
    model.component("comp1").material("mat3").materialType("nonSolid");

    model.component("comp1").cpl("intop1").label("left_coax");
    model.component("comp1").cpl("intop1").set("opname", "int_l");
    model.component("comp1").cpl("intop2").label("right_coax");
    model.component("comp1").cpl("intop2").set("opname", "int_r");
    model.component("comp1").cpl("intop3").label("up_coax");
    model.component("comp1").cpl("intop3").set("opname", "int_u");
    model.component("comp1").cpl("intop4").label("down_coax");
    model.component("comp1").cpl("intop4").set("opname", "int_d");

    model.component("comp1").physics("emw").feature("pec2").label("PEC(Al_top)");
    model.component("comp1").physics("emw").feature("pec6").label("PEC(Al_bottom)");
    model.component("comp1").physics("emw").feature("pec3").label("PEC(vias)");
    model.component("comp1").physics("emw").feature("pec4").label("PEC(coax_center)");
    model.component("comp1").physics("emw").feature("lelement3").set("ElementName", "3");
    model.component("comp1").physics("emw").feature("lelement3").set("PortType", "Coaxial");
    model.component("comp1").physics("emw").feature("lelement3").label("Ccoax_load");
    model.component("comp1").physics("emw").feature("lelement5").set("ElementName", "4");
    model.component("comp1").physics("emw").feature("lelement5").set("PortType", "Coaxial");
    model.component("comp1").physics("emw").feature("lelement5").label("Rcoax_load");

    model.component("comp1").mesh("mesh1").feature("size").set("hauto", 4);
    model.component("comp1").mesh("mesh1").feature("ftri2").label("electrode");
    model.component("comp1").mesh("mesh1").feature("ftri2").feature("size1").set("hauto", 3);
    model.component("comp1").mesh("mesh1").run();

    model.study().create("std1");
    model.study("std1").create("param", "Parametric");
    model.study("std1").create("eig", "Eigenfrequency");

    model.sol().create("sol1");
    model.sol("sol1").study("std1");
    model.sol("sol1").attach("std1");
    model.sol("sol1").create("st1", "StudyStep");
    model.sol("sol1").create("v1", "Variables");
    model.sol("sol1").create("e1", "Eigenvalue");
    model.sol("sol1").feature("e1").create("d1", "Direct");
    model.sol("sol1").feature("e1").feature().remove("dDef");

    model.result().numerical().create("gev1", "EvalGlobal");
    model.result().numerical("gev1").set("probetag", "none");
    model.result().create("pg1", "PlotGroup3D");
    model.result("pg1").create("mslc1", "Multislice");
    model.result("pg1").create("mslc2", "Multislice");

    model.study("std1").feature("param").active(false);
    model.study("std1").feature("param").set("sweeptype", "filled");
    model.study("std1").feature("param").set("pname", new String[]{"Q2_L_JJ"});
    model.study("std1").feature("param").set("plistarr", new String[]{"range(0.2,0.2,8.0)"});
    model.study("std1").feature("param").set("punit", new String[]{"nH"});
    model.study("std1").feature("eig").set("neigs", 8);
    model.study("std1").feature("eig").set("neigsactive", true);
    model.study("std1").feature("eig").set("shift", "10");

    model.sol("sol1").attach("std1");
    model.sol("sol1").feature("e1").set("transform", "eigenfrequency");
    model.sol("sol1").feature("e1").set("neigs", 8);
    model.sol("sol1").feature("e1").set("shift", "10");
    model.sol("sol1").feature("e1").set("eigref", "8");
    model.sol("sol1").feature("e1").feature("aDef").set("complexfun", true);
    model.sol("sol1").feature("e1").feature("d1").label("Suggested Direct Solver (emw)");
    model.sol("sol1").feature("e1").feature("d1").set("linsolver", "pardiso");
    model.sol("sol1").feature("e1").feature("d1").set("pivotstrategy", true);
    model.sol("sol1").runAll();

    model.result().numerical("gev1").set("table", "tbl1");
    model.result().numerical("gev1").set("expr", new String[]{"real(freq)", "imag(freq)"});
    model.result().numerical("gev1").set("unit", new String[]{"1/s", "1/s"});
    model.result().numerical("gev1").set("descr", new String[]{"", ""});
    model.result().numerical("gev1").setResult();
    model.result("pg1").label("Electric Field (emw)");
    model.result("pg1").set("solnum", 5);
    model.result("pg1").set("frametype", "spatial");
    model.result("pg1").feature("mslc1").label("Multislice");
    model.result("pg1").feature("mslc1").set("xnumber", "0");
    model.result("pg1").feature("mslc1").set("ynumber", "0");
    model.result("pg1").feature("mslc1").set("multiplanezmethod", "coord");
    model.result("pg1").feature("mslc1").set("zcoord", 0);
    model.result("pg1").feature("mslc1").set("rangecoloractive", true);
    model.result("pg1").feature("mslc1").set("rangecolormax", 2800);
    model.result("pg1").feature("mslc1").set("resolution", "normal");
    model.result("pg1").feature("mslc2").set("xnumber", "0");
    model.result("pg1").feature("mslc2").set("multiplanezmethod", "coord");
    model.result("pg1").feature("mslc2").set("zcoord", "subs_t");
    model.result("pg1").feature("mslc2").set("rangecoloractive", true);
    model.result("pg1").feature("mslc2").set("rangecolormax", 100000);
    model.result("pg1").feature("mslc2").set("resolution", "normal");

    return model;
  }

  public static void main(String[] args) {
    Model model = run();
    model = run2(model);
    model = run3(model);
    model = run4(model);
    model = run5(model);
    run6(model);
  }

}
