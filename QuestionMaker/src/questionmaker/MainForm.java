/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionmaker;

import QuestionManipulation.CapitalizeFirstLetter;
import QuestionManipulation.FruitsPluralizer;
import algorithms.Algebra.Level1_1.WordProb_Within20;
import algorithms.NumberSystem.Level6_1.WordDividingFractions;
import algorithms.NumberSystem.Level6_2.DivisionWholeNumbers6_2;
import algorithms.NumberSystem.Level6_3.AdditionDecimals6_3;
import algorithms.NumberSystem.Level6_4.MinorFactoring6_4;
import algorithms.NumberSystem.Level6_4.GreatestCommonFactor6_4;
import algorithms.NumberSystem.Level6_4.LeastCommonMultiple6_4;
import algorithms.NumberSystem.Level6_5.DebtNumber6_5;
import algorithms.NumberSystem.Level6_7.WhichInequalityRepresents6_7;
import algorithms.NumberSystem.Level6_7.AbsoluteValue6_7;
import algorithms.NumberSystem.Level6_8.DistanceBetweenCoordinates6_8;
import algorithms.Fractions.Level3_3.SimplifyFraction_3_3;
import algorithms.Fractions.Level3_3.DivideNumByDenom_3_3;
import algorithms.Fractions.Level4_1.EquivalentFraction4_1;
import algorithms.Fractions.Level4_1.SimplifyBiggerFractions4_1;
import algorithms.Fractions.Level4_3.AddingFractions4_3;
import algorithms.Fractions.Level4_4.MultiplyingFractions4_4;
import algorithms.Fractions.Level4_5.AddOver10and100_fraction4_5;
import algorithms.Fractions.Level4_6.FractionToDecimal4_6;
import algorithms.Fractions.Level4_7.DecimalLessThan_Fractions4_7;
import algorithms.Fractions.Level5_1.AddingUnlikeDenominators5_1;
import algorithms.Fractions.Level5_2.FractionWordAddition5_2;
import algorithms.Fractions.Level5_3.Division_fraction5_3;
import algorithms.Fractions.Level5_4.FractionsMultiply5_4;
import algorithms.Fractions.Level5_6.WordProbMinusWithin20;
import algorithms.Fractions.Level5_6.FractionWordProblem;
import algorithms.Measure.Level2_4.LengthWordProblems_measure_2_4;
import algorithms.Measure.Level2_4.LengthWordProbsAdd_Measure2_4;
import algorithms.Measure.Level2_7.HowMuchMoney_meaure2_7;
import algorithms.Measure.Level3_1.TimeWordProblems_measure3_1;
import algorithms.Measure.Level3_2.QuartsToCups3_2;
import algorithms.Measure.Level4_1.PoundsToOunces4_1;
import algorithms.Measure.Level4_2.HowMuchChangeMeasure4_2;
import algorithms.Measure.Level4_3.AreaOfSwimmingPoolMeasure4_3;
import algorithms.Measure.Level4_5.TypeOfAngle_measure_4_5;
import algorithms.Measure.Level5_1.FeetToInches;
import algorithms.Statistics.Level6_3.FindRangeStats6_3;
import algorithms.Statistics.Level6_5.FindMedianModeMean;
import algorithms.Ratios.Level6_1.RatioWordProblems_6_1;
import algorithms.Ratios.Level6_2.MoneyWordProblem;
import algorithms.Geometry.Level3_1.HowManySides_geo3_1;
import algorithms.Geometry.Level3_1.WhatShapeHas_geo3_1;
import algorithms.Geometry.Level6_2.RectangularPrismVolumeGeo6_2;
import algorithms.Geometry.Level6_3.MissingCoordinateGeo6_3;
import algorithms.Algebra.Level1_2.WordProbAnimalsAdd_1_2;
import algorithms.Algebra.Level1_2.WordProb_Money_Level_1_2;
import algorithms.Algebra.Level1_3.A_PLUS_B_PLUS_C;
import algorithms.Algebra.Level1_3.A_Plus_blank_equal_c;
import algorithms.Algebra.Level1_4.A_Minus_BLANK_Equals_C;
import algorithms.Algebra.Level1_5.Start_AT_x_CountDown_By_Y_1_5_Alg;
import algorithms.Algebra.Level1_5.Start_At_x_CountUP_Y;
import algorithms.Algebra.Level1_6.Related_Facts_1_6_alg;
import algorithms.Algebra.Level1_6.a_minus_b_equals_c_lvl_1_6_alg;
import algorithms.Algebra.Level1_6.a_plus_b_equals_c_lvl_1_6_Alg;
import algorithms.Algebra.Level1_7.Which_Statement_True_Add_lvl_1_7;
import algorithms.Algebra.Level1_8.C_equals_A_Plus_Blank_1_8_alg;
import algorithms.Algebra.Level1_8.A_minus_BLANK_equals_C_alg_1_8;
import algorithms.Algebra.Level2_1.Algebra_Addition_WordProb;
import algorithms.Algebra.Level2_2.A_Plus_b_equals_c_Alg_2_2;
import algorithms.Algebra.Level2_2.a_minus_blank_equals_c_Alg_2_2;
import algorithms.Algebra.Level2_2.blank_plus_b_equals_c_Alg_2_2;
import algorithms.Algebra.Level2_3.Alg_which_number_odd_even_2_3;
import algorithms.Algebra.Level2_3.Number_Between_Alg_2_3;
import algorithms.Algebra.Level2_3.Which_Number_Even_2_3;
import algorithms.Algebra.Level2_5.abc_2_5;
import algorithms.Algebra.Level2_5.abc_Subtract_2_5;
import algorithms.Algebra.Level2_6.If_first_plus_second_equls_third_then_second_plus_blank_equals_third;
import algorithms.Algebra.Level2_6.If_first_plus_second_equls_third_then_third_minus_what_equals_third1;
import algorithms.Algebra.Level3_1.how_many_rows_of_numbers_alg_3_1;
import algorithms.Algebra.Level3_1.which_number_sentence_alg_3_1;
import algorithms.Algebra.Level3_2.MovieTheaterHas3_2;
import algorithms.Algebra.Level3_2.WordProb_division_Alg_3_2;
import algorithms.Algebra.Level3_3.JakeHasBooks3_3;
import algorithms.Algebra.Level3_3.MultiplicationWordProbAlg3_3;
import algorithms.Algebra.Level3_4.a_equals_b_dividedby_blank_alg_3_4;
import algorithms.Algebra.Level3_4.blank_times_b_equals_alg_3_4;
import algorithms.Algebra.Level3_4.four_times_blank_equals_20alg_3_4;
import algorithms.Algebra.Level3_4.ten_equals_blank_times_fivealg_3_4;
import algorithms.Algebra.Level3_5.commutative_multiplication_alg_3_5;
import algorithms.Algebra.Level3_5.associative_with_multiplication_alg_3_5;
import algorithms.Algebra.Level3_6.blank_groups_of_b_equals_c_alg_3_6;
import algorithms.Algebra.Level3_6.blank_times_b_equals_c_alg_3_6;
import algorithms.Algebra.Level3_6.four_timex_blank_equals_20;
import algorithms.Algebra.Level3_6.fourty_divide_by_8_equals_blank;
import algorithms.Algebra.Level3_7.a_dividedby_b_within100_alg_3_7;
import algorithms.Algebra.Level3_7.a_times_b_equals_alg_3_7;
import algorithms.Algebra.Level3_8.MathHomework3_8;
import algorithms.Algebra.Level3_8.WordProblemPetStore_3_8;
import algorithms.Algebra.Level3_9.InOutMultiply_3_9;
import algorithms.Algebra.Level3_9.InOutPlus_3_9;
import algorithms.Algebra.Level4_1.TimesAsManyAs4_1;
import algorithms.Algebra.Level4_1.a_times_asManyAs_b_alg_4_1;
import algorithms.Algebra.Level4_2.BakerySold4_2;
import algorithms.Algebra.Level4_2.WordProblemMoneyMultiply_4_2;
import algorithms.Algebra.Level4_3.Money_WordProblem_multiStep;
import algorithms.Algebra.Level4_3.MuffinsWord4_3;
import algorithms.Algebra.Level4_4.GreatestCommonFactor4_4;
import algorithms.Algebra.Level4_4.LCM_alg4_4;
import algorithms.Algebra.Level4_4.which_is_a_factor_of_alg_4_4;
import algorithms.Algebra.Level4_5.sequence_of_numbers_alg_4_5;
import algorithms.Algebra.Level5_0.MultiStepMath;
import algorithms.Algebra.Level5_1.MultiStepDivisionFirst5_1;
import algorithms.Algebra.Level5_1.MultiStepWithDivision5_1;
import algorithms.Algebra.Level5_2.FindProductTakeAway5_2;
import algorithms.Algebra.Level5_2.MultiStepMath5_2;
import algorithms.Base10.Level1_1.Base10_1_2_3_space_lvl_1_1;
import algorithms.Base10.Level1_1.Base10_8_9_10_blank_1_1;
import algorithms.Base10.Level1_4.A_Plus_b_equals_c_Base10_Lvl_1_4;
import algorithms.Base10.Level1_4.equals_tens1_4;
import algorithms.Base10.Level1_5.WhatisXLessThanY_lvl_1_5_Base101;
import algorithms.Base10.Level1_5.WhatisXMoreThanY_lvl_1_5_Base10;
import algorithms.Base10.Level1_6.SubtractMultiplesOfTen_BASE10_1_6;
import algorithms.Base10.Level2_2.count_456_457_blank_Base10_2_2;
import algorithms.Base10.Level2_2.count_246_blank_446_base10_2_2;
import algorithms.Base10.Level2_2.count_230_blank_250_base10_2_2;
import algorithms.Base10.Level2_2.count_330_335_blank_base10_2_2;
import algorithms.Base10.Level2_3.WriteExpandedForm_base10_2_3;
import algorithms.Base10.Level2_3.WriteWordForm_base10_2_3;
import algorithms.Base10.Level2_3.WriteInStandardFormBase10_2_3;
import algorithms.Base10.Level2_4.blank_greater_than_b_base10_2_4;
import algorithms.Base10.Level2_5.a_plus_b_equals_blank_Base10_2_5;
import algorithms.Base10.Level2_5.a_minus_b_equals_blank_base10_2_5;
import algorithms.Base10.Level2_6.a_plus_b_plus_c_Base10_2_6;
import algorithms.Base10.Level2_6.a_plus_b_plus_c_plus_d_base10_2_6;
import algorithms.Base10.Level2_7.a_plus_b_within_1000_base10_2_7;
import algorithms.Base10.Level2_7.a_minus_b_within_1000_base10_2_7;
import algorithms.Base10.Level2_8.minus_10_or_100_base10_2_8;
import algorithms.Base10.Level2_8.plus_10_or100_base10_2_8;
import algorithms.Base10.Level2_9.if_then_a_plus_blank_equals_c_base10_2_9;
import algorithms.Base10.Level2_9.if_then_a_minus_blank_equals_c_base10_2_9;
import algorithms.Base10.Level2_9.fact_family_within_100_base10_2_9;
import algorithms.Base10.Level3_1.Round_to_nearest_10_base10_3_1;
import algorithms.Base10.Level3_1.Round_to_nearest_100_base10_3_1;
import algorithms.Base10.Level3_2.a_plus_b_within_thousand_base10_3_2;
import algorithms.Base10.Level3_2.a_minus_b_within_thousand_base10_3_2;
import algorithms.Base10.Level3_3.a_times_b_10_to_90_base10_3_3;
import algorithms.Base10.Level4_1.base10_64_times_30_4_1;
import algorithms.Base10.Level4_1.base10_1200dividedby40_4_1;
import algorithms.Base10.Level4_2.ExpandedFormToNumberBase10_4_2;
import algorithms.Base10.Level4_2.NumberToExpandedFormBase10_4_2;
import algorithms.Base10.Level4_2.GreaterLessEqualBase10_4_2;
import algorithms.Base10.Level4_2.WordsToNumbersBase10_4_2;
import algorithms.Base10.Level4_3.round_nearest_ten_within_million_base10_4_3;
import algorithms.Base10.Level4_3.round_100s_within_million_base10_4_3;
import algorithms.Base10.Level4_3.round_1000s_within_million_base10_4_3;
import algorithms.Base10.Level4_4.add_within_hundredthousand_base10_4_4;
import algorithms.Base10.Level4_4.minus_within_hundredthousand_base10_4_4;
import algorithms.Base10.Level4_5.withinthousands_times_withinones_base10_4_5;
import algorithms.Base10.Level4_5.twodigit_times_twodigit_base10_4_5;
import algorithms.Base10.Level4_6.divide_with_remainders_base10_4_6;
import algorithms.Base10.Level5_2.DivideByTenPower5_2;
import algorithms.Base10.Level5_2.TimesTenPower5_2;
import algorithms.Base10.Level5_4.round_to_tenth_base10_5_4;
import algorithms.Base10.Level5_4.round_to_hundredth_base10_5_4;
import algorithms.Base10.Level5_4.round_to_whole_base10_5_4;
import algorithms.Base10.Level5_5.multiply_multidigit_base10_5_5;
import algorithms.Base10.Level5_6.divide_with_remainders_largernumbers_base10_5_6;
import algorithms.Base10.Level5_7.add_decimals_to_hundreths_base10_5_7;
import algorithms.Base10.Level5_7.divide_decimals_hundreths_base10_5_7;
import algorithms.Base10.Level5_7.minus_decimals_hundreths_base10_5_7;
import algorithms.Base10.Level5_7.multiply_decimals_hundreths_base10_5_7;
import algorithms.Counting.Level1_1.abc1_1;
import algorithms.Counting.Level1_1.startatxcountdownbyy1;
import algorithms.Counting.Level1_1.startatxcountupbyy;
import algorithms.Counting.Level1_1.x_plus_space_equals_y;
import algorithms.Counting.Level1_1.x_plus_y_equal_z_so_z_minus_space_equals_blank;
import algorithms.Counting.Level1_2.A_plus_b_equals_What;
import algorithms.Counting.Level1_2.X_minus_y_equals_what;
import algorithms.Counting.Level1_3.counting_1_2_3_space_lvel_1_3;
import algorithms.Counting.Level1_3.counting_1_2_space_3_lvel_1_3;
import algorithms.Counting.Level1_4.Blank_LESSTHAN_X;
import algorithms.Counting.Level1_4.x_equals_blank1_4;
import algorithms.Counting.Level1_4.z_equals_x_plus_space;
import algorithms.Counting.Level1_5.X_LESS_THAN_Y;
import algorithms.Counting.Level1_5.X_MORE_THAN_Y;
import algorithms.Counting.Level1_5.abc1_5;
import algorithms.Counting.Level1_5.abc_Subtract_1_5;
import algorithms.Equations.Level6_1.ToThePower6_1;
import algorithms.Equations.Level6_2.whichExpressionXsubFromY6_2;
import algorithms.Equations.Level6_3.whichExpression2_4PlusX_;
import algorithms.Equations.Level6_4.xPlusXPlusXPlusXEquals6_4;
import algorithms.Expressions_Level_6_2.Which_ProductOf_x_Y;
import algorithms.Equations.PMDAS_6_1;
import algorithms.Equations.Level6_5.equation4xEquals20;
import algorithms.Equations.Level6_7.numberPlusXEqualsNumber6_7;
import algorithms.Expressions_Level6_3.WhichExp_Equiv;
import algorithms.Expressions_Level6_4.WhichExpressEquiv_6_4;
import algorithms.Expressions_Level6_5.WhichMakeStatementTrue;
import algorithms.Expressions_Level6_6.ExpressionWordProblem_6_6;
import algorithms.Expressions_Level6_7.SolveEquations;
import algorithms.Expressions_Level6_8.Inequality;
import algorithms.Expressions_Level6_9.Expressions_6_9;
import algorithms.Fractions.Level3_3.greaterLessThan3_3;
import algorithms.Fractions.Level3_3.greaterLessThanSameNum3_3;
import algorithms.Fractions.Level4_1.Equivalent2_4_1;
import algorithms.Fractions.Level4_1.Equivalent3_4_1;
import algorithms.Fractions.Level4_2.GreaterLessOrEqualFraction4_2;
import algorithms.Fractions.Level4_3.AddingWithWhole4_3;
import algorithms.Fractions.Level4_3.SeveralFractions4_3;
import algorithms.Fractions.Level4_3.SubtractingWithWhole4_3;
import algorithms.Fractions.Level4_4.WholeTimesFrac4_4;
import algorithms.Fractions.Level4_5.HundredAndTen4_5;
import algorithms.Fractions.Level4_6.EqualToHalf4_6;
import algorithms.Fractions.Level4_6.LessThanHalf4_6;
import algorithms.Fractions.Level4_6.MoreThanHalf4_6;
import algorithms.Fractions.Level4_7.GreatestValue4_7;
import algorithms.Fractions.Level4_7.LeastValue4_7;
import algorithms.Fractions.Level5_1.Subtracting5_1;
import algorithms.Fractions.Level5_2.JohnReadWordProb5_2;
import algorithms.Fractions.Level5_6.aBatchOfWordProb5_6;
import algorithms.Fractions_5_7.FractionDivision;
import algorithms.Fractions_5_7.NumberDivideByFraction5_7;
import algorithms.Geometry.Level7_6.VolumeOfRectangularPrism_geo7_6;
import algorithms.Measure.Level3_1.BaseballGame3_1;
import algorithms.Measure.Level3_1.TedHomework3_1;
import algorithms.Measure.Level3_2.GallonsCups3_2;
import algorithms.Measure.Level3_2.GallonsQuarts3_2;
import algorithms.Measure.Level3_2.PintsCups3_2;
import algorithms.Measure.Level3_2.QuartsPints3_2;
import algorithms.Measure.Level4_1.CupsToPints4_1;
import algorithms.Measure.Level4_1.HoursToMinutes4_1;
import algorithms.Measure.Level4_1.YardsToFeet4_1;
import algorithms.Measure.Level4_2.ChrisBought4_2;
import algorithms.Measure.Level4_3.AreaGarden4_3;
import algorithms.Measure.Level5_1.CupsToOunces5_1;
import algorithms.Measure.Level5_1.CupsToPints;
import algorithms.Measure.Level5_1.FeetToYards5_1;
import algorithms.Measure.Level5_1.LitersToMilliliters5_1;
import algorithms.Measure.Level5_1.MillitersToLiters5_1;
import algorithms.Measure.Level5_1.OuncesToCups5_1;
import algorithms.Measure.Level5_1.PintsToQuarts5_1;
import algorithms.Measure.Level5_1.QuartsToGallons5_1;
import algorithms.NumberSystem.Level6_1.HowManyServingsWordProb6_1;
import algorithms.NumberSystem.Level6_3.DivisionClass6_3;
import algorithms.NumberSystem.Level6_3.MultiplicationClass6_3;
import algorithms.NumberSystem.Level6_3.SubtractionDecimals6_3;
import algorithms.NumberSystem.Level6_6.NegativeNegativeNumber6_6;
import algorithms.Ratios.Level6_1.RatioWordProblems2_6_11;
import algorithms.Ratios.Level6_1.WordProbCookiesRatio6_1;
import algorithms.Ratios.Level6_2.MilesWordProblem6_2;
import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Gene
 */
public class MainForm extends javax.swing.JFrame {

    public String algorithm = "";
    String sqlcode = "";
    int qzid = 0;
    Vector AllOptions = new Vector();

    public MainForm() {
        initComponents();
        LoadOptions();
        Default_config();
    }

    @SuppressWarnings("unchecked")
    public void Default_config() {
        File file = new File("sql_code/test.sql");
        String location = file.getAbsolutePath();;
        savelocation.setText(location);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        algoselect = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        level_select = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        question_sel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Hint = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        savelocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        quizid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Question Maker ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Algorithm "));

        jLabel4.setText("Select A Question Type Algorithm:");

        algoselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "addition 1 - 10", "subtraction 1 - 10", "addition 1 - 100", "subtraction 1 - 10", "subtraction 1 - 100", "multiply 1 - 10", "1+2+3=?", "2+_=12", "2+9=11 11-_=9", "start@xandcountupbyy", "start at x and count down by y", "1+2+3=? lvl_1_2" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(algoselect, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(algoselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Question Configuration "));

        jLabel3.setText("Level:");

        level_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.1", "0.2", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" }));

        jLabel5.setText("Hint:");

        jLabel6.setText("Number Of Questions:");

        Hint.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Algorithm Generated" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(level_select, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question_sel))
                    .addComponent(Hint, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(level_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(question_sel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Hint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), " Generate Questions "));

        jLabel7.setText("Save Results To: ");

        savelocation.setToolTipText("");
        savelocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savelocationActionPerformed(evt);
            }
        });

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Next QID:");

        quizid.setText("38");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quizid))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savelocation, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(quizid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(savelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        algorithm = algoselect.getSelectedItem().toString();
        String level = level_select.getSelectedItem().toString();
        int numquestions = Integer.parseInt(question_sel.getText());
        String hint = Hint.getSelectedItem().toString();
        String SaveLocation = savelocation.getText();
        LoadAlgorithms(algorithm, level, numquestions, hint, SaveLocation);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void savelocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savelocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savelocationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    public void LoadAlgorithms(String algo, String level, int numquestions, String hint, String SaveLocation) {
        Vector questions = new Vector();
        if (algo.equals("---- ALL ----")) {

            for (int i = 0; i < AllOptions.size(); i++) {
                String line = AllOptions.elementAt(i).toString();

                if (line.contains("---") == false) {
                    algo = line;
                    for (int i2 = 0; i2 < numquestions; i2++) { //loop through and process questions one at a time 
                        Vector RawQuestions = ChooseAlgorithm(algo, level, hint);

                        //when raw questions are returned (with mixed in answers) we must add hint and level to the vector
                        questions.addElement(RawQuestions);

                    }
                    System.out.println(questions);

                    //Save The Questions
                    Save(SaveLocation, questions, true);
                    questions = new Vector();
                }

            }

        } else {

            for (int i = 0; i < numquestions; i++) { //loop through and process questions one at a time 
                Vector RawQuestions = ChooseAlgorithm(algo, level, hint);

                //when raw questions are returned (with mixed in answers) we must add hint and level to the vector
                questions.addElement(RawQuestions);

            }
            System.out.println(questions);

            //Save The Questions
            Save(SaveLocation, questions, false);
            questions = new Vector();
        }

    }

    public Vector ChooseAlgorithm(String algo, String level, String hint) {
        Vector results = new Vector();
        //run the algorithm

        /*subject index 
         1 = Math
               
         */
        //Counting 1.0
        if (algo.equals("1+2+3=?_1_0")) { //checked
            abc1_1 add = new abc1_1();
            results = add.AddToX(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        }
        if (algo.equals("1+2+3=?_1_9")) { //checked
            abc1_1 add = new abc1_1();
            results = add.AddToX(1, 20, hint, "1.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("A_plus_b_equals_What")) {
            A_plus_b_equals_What add = new A_plus_b_equals_What();
            results = add.AddToX(1, 20, hint, "1.0", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("A_plus_b_equals_What_1_7")) {
            A_plus_b_equals_What add = new A_plus_b_equals_What();
            results = add.AddToX(1, 20, hint, "1.7", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start@xandcountupbyy_1_0")) {
            startatxcountupbyy add = new startatxcountupbyy();
            results = add.AddToX(1, 20, hint, "1.0", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start at x and count down by y_1_0")) {
            startatxcountdownbyy1 add = new startatxcountdownbyy1();
            results = add.AddToX(1, 20, hint, "1.0", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start@xandcountupbyy_1_8")) {
            startatxcountupbyy add = new startatxcountupbyy();
            results = add.AddToX(1, 20, hint, "1.8", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start at x and count down by y_1_8")) {
            startatxcountdownbyy1 add = new startatxcountdownbyy1();
            results = add.AddToX(1, 20, hint, "1.8", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } //Counting 1.1
        else if (algo.equals("1+2+3=?")) {
            abc1_1 add = new abc1_1();
            results = add.AddToX(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start@xandcountupbyy")) {
            startatxcountupbyy add = new startatxcountupbyy();
            results = add.AddToX(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("start at x and count down by y")) {
            startatxcountdownbyy1 add = new startatxcountdownbyy1();
            results = add.AddToX(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("2+9=11 11-_=9")) {
            x_plus_y_equal_z_so_z_minus_space_equals_blank add = new x_plus_y_equal_z_so_z_minus_space_equals_blank();
            results = add.generate(1, 20, hint, "1.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("X_minus_y_equals_what_1_0")) {
            X_minus_y_equals_what add = new X_minus_y_equals_what();
            results = add.AddToX(1, 20, hint, "1.0", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("X_minus_y_equals_what")) {
            X_minus_y_equals_what add = new X_minus_y_equals_what();
            results = add.AddToX(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } //start level 1.2 counting
        else if (algo.equals("2+_=12_1_0")) { //checked
            x_plus_space_equals_y add = new x_plus_space_equals_y();
            results = add.AddToX(1, 20, hint, "1.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("x_plus_space_equals_y");
        } else if (algo.equals("2+_=12_1_2")) { //checked
            x_plus_space_equals_y add = new x_plus_space_equals_y();
            results = add.AddToX(1, 20, hint, "1.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("x_plus_space_equals_y");

        } //start level 1.3 counting
        else if (algo.equals("67,68,69,_")) {
            counting_1_2_3_space_lvel_1_3 add = new counting_1_2_3_space_lvel_1_3();
            results = add.generate(1, 20, hint, "1.2", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("67,_,69,70")) {
            counting_1_2_space_3_lvel_1_3 add = new counting_1_2_space_3_lvel_1_3();
            results = add.generate(1, 20, hint, "1.2", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("lvl_1_5_67,68,69,_")) {
            counting_1_2_3_space_lvel_1_3 add = new counting_1_2_3_space_lvel_1_3();
            results = add.generate(1, 100, hint, "1.5", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("lvl_1_5_67,_,69,70")) {
            counting_1_2_space_3_lvel_1_3 add = new counting_1_2_space_3_lvel_1_3();
            results = add.generate(1, 100, hint, "1.5", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("67,68,69,_b10")) {
            counting_1_2_3_space_lvel_1_3 add = new counting_1_2_3_space_lvel_1_3();
            results = add.generate(1, 20, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("67,_,69,70b10")) {
            counting_1_2_space_3_lvel_1_3 add = new counting_1_2_space_3_lvel_1_3();
            results = add.generate(1, 20, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("lvl_1_5_67,68,69,_b10")) {
            counting_1_2_3_space_lvel_1_3 add = new counting_1_2_3_space_lvel_1_3();
            results = add.generate(1, 100, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("lvl_1_5_67,_,69,70b10")) {
            counting_1_2_space_3_lvel_1_3 add = new counting_1_2_space_3_lvel_1_3();
            results = add.generate(1, 100, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //start level 1.4 counting
        else if (algo.equals("15=10+_")) {
            z_equals_x_plus_space add = new z_equals_x_plus_space();
            results = add.generate(1, 20, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("15=10+__lvl_1_6")) {
            z_equals_x_plus_space add = new z_equals_x_plus_space();
            results = add.generate(1, 100, hint, "1.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("_<X")) {
            Blank_LESSTHAN_X add = new Blank_LESSTHAN_X();
            results = add.generate(1, 100, hint, "1.4", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } //start level 1.5 counting
        else if (algo.equals("72+20=?_level_1.5")) {
            abc1_5 add = new abc1_5();
            results = add.generate(20, 100, hint, "1.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x less than y?")) {
            X_LESS_THAN_Y add = new X_LESS_THAN_Y();
            results = add.generate(1, 100, hint, "1.6", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x more than y?")) {
            X_MORE_THAN_Y add = new X_MORE_THAN_Y();
            results = add.generate(1, 100, hint, "1.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x less than y?8")) {
            X_LESS_THAN_Y add = new X_LESS_THAN_Y();
            results = add.generate(1, 100, hint, "1.8", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x more than y?8")) {
            X_MORE_THAN_Y add = new X_MORE_THAN_Y();
            results = add.generate(1, 100, hint, "1.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x less than y?b10")) {
            X_LESS_THAN_Y add = new X_LESS_THAN_Y();
            results = add.generate(1, 100, hint, "1.6", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("What is x more than y?b10")) {
            X_MORE_THAN_Y add = new X_MORE_THAN_Y();
            results = add.generate(1, 100, hint, "1.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("x-y=?_level_1_5")) {
            abc_Subtract_1_5 add = new abc_Subtract_1_5();
            results = add.generate(1, 100, hint, "1.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // Start Algebra 1.1
        else if (algo.equals("WordProbAnimalsAdd_1_1")) {
            WordProbAnimalsAdd_1_2 add = new WordProbAnimalsAdd_1_2();
            results = add.generate(1, 20, hint, "1.1", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProbMinusWithin20")) {
            WordProbMinusWithin20 add = new WordProbMinusWithin20();
            results = add.generate(2, 20, hint, "1.1");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra 1.2
        else if (algo.equals("WordProbAnimalsAdd_1_2")) {
            WordProbAnimalsAdd_1_2 add = new WordProbAnimalsAdd_1_2();
            results = add.generate(1, 20, hint, "1.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProb_Money_Level_1_2")) {
            WordProb_Money_Level_1_2 add = new WordProb_Money_Level_1_2();
            results = add.generate(1, 20, hint, "1.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProb_Money_Level_1_1")) {
            WordProb_Money_Level_1_2 add = new WordProb_Money_Level_1_2();
            results = add.generate(1, 20, hint, "1.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProb_Money_Level_1_5")) {
            WordProb_Money_Level_1_2 add = new WordProb_Money_Level_1_2();
            results = add.generate(1, 20, hint, "1.5", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }//1.3 Algebra
        else if (algo.equals("A_PLUS_B_PLUS_C")) {
            A_PLUS_B_PLUS_C add = new A_PLUS_B_PLUS_C();
            results = add.generate(1, 100, hint, "1.3", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("A_Plus_blank_equal_c")) {
            A_Plus_blank_equal_c add = new A_Plus_blank_equal_c();
            results = add.generate(10, 100, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
            //1.4 Algebra
        } else if (algo.equals("A_Minus_BLANK_Equals_C")) {
            A_Minus_BLANK_Equals_C add = new A_Minus_BLANK_Equals_C();
            results = add.generate(1, 20, hint, "1.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("2+9=11 11-_=9 lvl_1_2")) {
            x_plus_y_equal_z_so_z_minus_space_equals_blank add = new x_plus_y_equal_z_so_z_minus_space_equals_blank();
            results = add.generate(1, 20, hint, "1.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("2+9=11 11-_=9 lvl_1_6")) {
            x_plus_y_equal_z_so_z_minus_space_equals_blank add = new x_plus_y_equal_z_so_z_minus_space_equals_blank();
            results = add.generate(1, 20, hint, "1.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("2+9=11 11-_=9 lvl_1_9")) {
            x_plus_y_equal_z_so_z_minus_space_equals_blank add = new x_plus_y_equal_z_so_z_minus_space_equals_blank();
            results = add.generate(1, 20, hint, "1.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //1.5 Algebra
        else if (algo.equals("Start_At_x_CountUP_Y")) {
            Start_At_x_CountUP_Y add = new Start_At_x_CountUP_Y();
            results = add.generate(1, 20, hint, "1.4", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Start_AT_x_CountDown_By_Y_1_5_Alg")) {
            Start_AT_x_CountDown_By_Y_1_5_Alg add = new Start_AT_x_CountDown_By_Y_1_5_Alg();
            results = add.generate(1, 20, hint, "1.4", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        } //1.6 Algebra
        else if (algo.equals("a_plus_b_equals_c_lvl_1_6_Alg")) {
            a_plus_b_equals_c_lvl_1_6_Alg add = new a_plus_b_equals_c_lvl_1_6_Alg();
            results = add.generate(1, 20, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_plus_b_equals_c_lvl_1_9_Alg")) {
            a_plus_b_equals_c_lvl_1_6_Alg add = new a_plus_b_equals_c_lvl_1_6_Alg();
            results = add.generate(1, 20, hint, "1.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_equals_c_lvl_1_6_alg")) {
            a_minus_b_equals_c_lvl_1_6_alg add = new a_minus_b_equals_c_lvl_1_6_alg();
            results = add.generate(1, 20, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Related_Facts_1_6_alg")) {
            Related_Facts_1_6_alg add = new Related_Facts_1_6_alg();
            results = add.generate(1, 20, hint, "1.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
            //1.7 algebra
        } else if (algo.equals("Related_Facts_1_9_alg")) {
            Related_Facts_1_6_alg add = new Related_Facts_1_6_alg();
            results = add.generate(1, 20, hint, "1.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
            //1.7 algebra
        } else if (algo.equals("Which_Statement_True_Add_lvl_1_7")) {
            Which_Statement_True_Add_lvl_1_7 add = new Which_Statement_True_Add_lvl_1_7();
            results = add.generate(1, 20, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
            //1.8 algebra
        } else if (algo.equals("C_equals_A_Plus_Blank_1_8_alg")) {
            C_equals_A_Plus_Blank_1_8_alg add = new C_equals_A_Plus_Blank_1_8_alg();
            results = add.generate(1, 20, hint, "1.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("A_minus_BLANK_equals_C_alg_1_6")) {
            A_minus_BLANK_equals_C_alg_1_8 add = new A_minus_BLANK_equals_C_alg_1_8();
            results = add.generate(1, 20, hint, "1.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("A_minus_BLANK_equals_C_alg_1_8")) {
            A_minus_BLANK_equals_C_alg_1_8 add = new A_minus_BLANK_equals_C_alg_1_8();
            results = add.generate(1, 20, hint, "1.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Start Base 10 Level 1.1
        else if (algo.equals("Base10_1_2_3_space_lvl_1_1")) {
            Base10_1_2_3_space_lvl_1_1 add = new Base10_1_2_3_space_lvl_1_1();
            results = add.generate(1, 20, hint, "1.3", "COUNTING");
            results.addElement("1");
            results.addElement("abc");

            //base 10 Level 1.3
        } else if (algo.equals("WhichTrue_Greater_Less")) {
            Blank_LESSTHAN_X add = new Blank_LESSTHAN_X();
            results = add.generate(1, 20, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Which_Statement_True_Add_1_3")) {
            Which_Statement_True_Add_lvl_1_7 add = new Which_Statement_True_Add_lvl_1_7();
            results = add.generate(1, 20, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base 10 Level 1.4
        else if (algo.equals("A_Plus_b_equals_c_Base10_Lvl_1_4")) {
            A_Plus_b_equals_c_Base10_Lvl_1_4 add = new A_Plus_b_equals_c_Base10_Lvl_1_4();
            results = add.generate(10, 100, hint, "1.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base 10 Level 1.5
        else if (algo.equals("WhatisXMoreThanY_lvl_1_5_Base10")) {
            WhatisXMoreThanY_lvl_1_5_Base10 add = new WhatisXMoreThanY_lvl_1_5_Base10();
            results = add.generate(10, 100, hint, "1.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WhatisXLessThanY_lvl_1_5_Base10")) {
            WhatisXLessThanY_lvl_1_5_Base101 add = new WhatisXLessThanY_lvl_1_5_Base101();
            results = add.generate(10, 100, hint, "1.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base 10 Level 1.6
        else if (algo.equals("SubtractMultiplesOfTen_BASE10_1_6")) {
            SubtractMultiplesOfTen_BASE10_1_6 add = new SubtractMultiplesOfTen_BASE10_1_6();
            results = add.generate(10, 100, hint, "1.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // *************************  LEVEL 2 *******************************************
        //Algebra Level 2.0
        else if (algo.equals("Alg_WordProblems_lvl2_0")) {
            Algebra_Addition_WordProb add = new Algebra_Addition_WordProb();
            results = add.generate(1, 100, hint, "2.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProb_Money_Level_2_0")) {
            WordProb_Money_Level_1_2 add = new WordProb_Money_Level_1_2();
            results = add.generate(1, 100, hint, "2.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 2.1
        else if (algo.equals("Alg_WordProblems_lvl2_1")) {
            Algebra_Addition_WordProb add = new Algebra_Addition_WordProb();
            results = add.generate(1, 100, hint, "2.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Alg_WordProblem_x_plus_y_plus_minus")) {
            WordProb_Money_Level_1_2 add = new WordProb_Money_Level_1_2();
            results = add.generate(1, 100, hint, "2.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 2.2
        else if (algo.equals("A_Plus_b_equals_c_Alg_2_2")) {
            A_Plus_b_equals_c_Alg_2_2 add = new A_Plus_b_equals_c_Alg_2_2();
            results = add.generategenerate(1, 20, hint, "2.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_blank_equals_c_Alg_2_0")) {
            a_minus_blank_equals_c_Alg_2_2 add = new a_minus_blank_equals_c_Alg_2_2();
            results = add.generate(1, 20, hint, "2.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_blank_equals_c_Alg_2_2")) {
            a_minus_blank_equals_c_Alg_2_2 add = new a_minus_blank_equals_c_Alg_2_2();
            results = add.generate(1, 20, hint, "2.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_plus_b_equals_c_Alg_1_2")) {
            blank_plus_b_equals_c_Alg_2_2 add = new blank_plus_b_equals_c_Alg_2_2();
            results = add.generate(1, 20, hint, "1.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_plus_b_equals_c_Alg_2_2")) {
            blank_plus_b_equals_c_Alg_2_2 add = new blank_plus_b_equals_c_Alg_2_2();
            results = add.generate(1, 20, hint, "2.0", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 2.3
        else if (algo.equals("Alg_which_number_odd_even_2_3")) { // Karl
            Alg_which_number_odd_even_2_3 add = new Alg_which_number_odd_even_2_3();
            results = add.generate(1, 20, hint, "2.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Which_Number_Even_2_3")) { // Karl
            Which_Number_Even_2_3 add = new Which_Number_Even_2_3();
            results = add.generate(1, 20, hint, "2.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 2.5
        else if (algo.equals("abc_2_5")) { // Karl
            abc_2_5 add = new abc_2_5();
            results = add.generate(1, 100, hint, "2.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("abc_Subtract_2_5")) {
            abc_Subtract_2_5 add = new abc_Subtract_2_5();
            results = add.generate(1, 100, hint, "2.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 2.6
        else if (algo.equals("algebra_2_6_x_y_z")) {
            If_first_plus_second_equls_third_then_second_plus_blank_equals_third add = new If_first_plus_second_equls_third_then_second_plus_blank_equals_third();
            results = add.generate(1, 20, hint, "2.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("algebra_2_6_x_y_z_what")) {
            If_first_plus_second_equls_third_then_third_minus_what_equals_third1 add = new If_first_plus_second_equls_third_then_third_minus_what_equals_third1();
            results = add.generate(1, 20, hint, "2.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("algebra_2_8_x_y_z")) {
            If_first_plus_second_equls_third_then_second_plus_blank_equals_third add = new If_first_plus_second_equls_third_then_second_plus_blank_equals_third();
            results = add.generate(1, 20, hint, "2.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("algebra_2_8_x_y_z_what")) {
            If_first_plus_second_equls_third_then_third_minus_what_equals_third1 add = new If_first_plus_second_equls_third_then_third_minus_what_equals_third1();
            results = add.generate(1, 20, hint, "2.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Number_Between_Alg_2_3")) { // Karl
            Number_Between_Alg_2_3 add = new Number_Between_Alg_2_3();
            results = add.generate(1, 20, hint, "2.0", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 2.2
        else if (algo.equals("count_456_457_blank_Base10_2_2")) { // Karl
            count_456_457_blank_Base10_2_2 add = new count_456_457_blank_Base10_2_2();
            results = add.generate(1, 1000, hint, "2.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } 
        else if (algo.equals("count_456_457_blank_Base10_2_7")) { // Karl
            count_246_blank_446_base10_2_2 add = new count_246_blank_446_base10_2_2();
            results = add.generate(1, 1000, hint, "2.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("count_246_blank_446_base10_2_2")) { // Karl
            count_246_blank_446_base10_2_2 add = new count_246_blank_446_base10_2_2();
            results = add.generate(1, 1000, hint, "2.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("count_230_blank_250_base10_2_2")) { // Karl
            count_230_blank_250_base10_2_2 add = new count_230_blank_250_base10_2_2();
            results = add.generate(1, 1000, hint, "2.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("count_330_335_blank_base10_2_2")) { // Karl
            count_330_335_blank_base10_2_2 add = new count_330_335_blank_base10_2_2();
            results = add.generate(1, 1000, hint, "2.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 Level 2.4
        else if (algo.equals("blank_greater_than_b_base10_2_4")) { // Karl
            blank_greater_than_b_base10_2_4 add = new blank_greater_than_b_base10_2_4();
            results = add.generate(100, 1000, hint, "2.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_greater_than_b_base10_2_9")) { // Karl
            blank_greater_than_b_base10_2_4 add = new blank_greater_than_b_base10_2_4();
            results = add.generate(100, 1000, hint, "2.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_greater_than_b_base10_2_5")) { // Karl
            blank_greater_than_b_base10_2_4 add = new blank_greater_than_b_base10_2_4();
            results = add.generate(100, 1000, hint, "2.5", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //base10 level 2.5
        else if (algo.equals("a_plus_b_equals_blank_Base10_2_5")) { // Karl
            a_plus_b_equals_blank_Base10_2_5 add = new a_plus_b_equals_blank_Base10_2_5();
            results = add.generate(1, 1000, hint, "2.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_equals_blank_base10_2_5")) { // Karl
            a_minus_b_equals_blank_base10_2_5 add = new a_minus_b_equals_blank_base10_2_5();
            results = add.generate(1, 1000, hint, "2.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //base10 level 2.6
        else if (algo.equals("a_plus_b_plus_c_Base10_2_6")) { // Karl
            a_plus_b_plus_c_Base10_2_6 add = new a_plus_b_plus_c_Base10_2_6();
            results = add.generate(1, 100, hint, "2.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_plus_b_plus_c_plus_d_base10_2_6")) { // Karl
            a_plus_b_plus_c_plus_d_base10_2_6 add = new a_plus_b_plus_c_plus_d_base10_2_6();
            results = add.generate(10, 100, hint, "2.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //base10 level 2.7
        else if (algo.equals("a_plus_b_within_1000_base10_2_7")) { // Karl
            a_plus_b_within_1000_base10_2_7 add = new a_plus_b_within_1000_base10_2_7();
            results = add.generate(100, 1000, hint, "2.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_within_1000_base10_2_7")) { // Karl
            a_minus_b_within_1000_base10_2_7 add = new a_minus_b_within_1000_base10_2_7();
            results = add.generate(1, 1000, hint, "2.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //base10 level 2.8
        else if (algo.equals("minus_10_or_100_base10_2_8")) { // Karl
            minus_10_or_100_base10_2_8 add = new minus_10_or_100_base10_2_8();
            results = add.generate(100, 900, hint, "2.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("plus_10_or100_base10_2_8")) { // Karl
            plus_10_or100_base10_2_8 add = new plus_10_or100_base10_2_8();
            results = add.generate(100, 900, hint, "2.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_10_or_100_op_2_8")) { // Karl
            minus_10_or_100_base10_2_8 add = new minus_10_or_100_base10_2_8();
            results = add.generate(100, 900, hint, "2.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_10_or_100_op_2_8")) { // Karl
            minus_10_or_100_base10_2_8 add = new minus_10_or_100_base10_2_8();
            results = add.generate(100, 900, hint, "2.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("plus_10_or100_2_9")) { // Karl
            plus_10_or100_base10_2_8 add = new plus_10_or100_base10_2_8();
            results = add.generate(100, 900, hint, "2.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }
        else if (algo.equals("plus_10_or100_op_2_8")) { // Karl
            plus_10_or100_base10_2_8 add = new plus_10_or100_base10_2_8();
            results = add.generate(100, 900, hint, "2.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }
        
        
        //base10 level 2.9
        else if (algo.equals("if_then_a_plus_blank_equals_c_base10_2_9")) { // Karl
            if_then_a_plus_blank_equals_c_base10_2_9 add = new if_then_a_plus_blank_equals_c_base10_2_9();
            results = add.generate(1, 100, hint, "2.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("if_then_a_minus_blank_equals_c_base10_2_9")) { // Karl
            if_then_a_minus_blank_equals_c_base10_2_9 add = new if_then_a_minus_blank_equals_c_base10_2_9();
            results = add.generate(1, 100, hint, "2.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("fact_family_within_100_base10_2_9")) { // Karl
            fact_family_within_100_base10_2_9 add = new fact_family_within_100_base10_2_9();
            results = add.generate(1, 20, hint, "2.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // *************************  LEVEL 3 *******************************************
        //Algebra Level 3.1
        else if (algo.equals("how_many_rows_of_numbers_alg_3_1")) { // Karl
            how_many_rows_of_numbers_alg_3_1 add = new how_many_rows_of_numbers_alg_3_1();
            results = add.generate(2, 8, hint, "3.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("which_number_sentence_alg_3_1")) { // Karl
            which_number_sentence_alg_3_1 add = new which_number_sentence_alg_3_1();
            results = add.generate(2, 8, hint, "3.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 3.2
        else if (algo.equals("WordProb_division_Alg_3_2")) { // Karl
            WordProb_division_Alg_3_2 add = new WordProb_division_Alg_3_2();
            results = add.generate(2, 100, hint, "3.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordProb_division_Alg_3_1")) { // Karl
            WordProb_division_Alg_3_2 add = new WordProb_division_Alg_3_2();
            results = add.generate(2, 100, hint, "3.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Algebra Level 3.4
        else if (algo.equals("blank_times_b_equals_alg_3_4")) { // Karl
            blank_times_b_equals_alg_3_4 add = new blank_times_b_equals_alg_3_4();
            results = add.generate(1, 20, hint, "3.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_times_b_equals_alg_3_1")) { // Karl
            blank_times_b_equals_alg_3_4 add = new blank_times_b_equals_alg_3_4();
            results = add.generate(1, 20, hint, "3.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("4_times_blank_equals_20alg_3_4")) {
            four_times_blank_equals_20alg_3_4 add = new four_times_blank_equals_20alg_3_4();
            results = add.generate(1, 20, hint, "3.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("ten_equals_blank_times_fivealg_3_4")) {
            ten_equals_blank_times_fivealg_3_4 add = new ten_equals_blank_times_fivealg_3_4();
            results = add.generate(1, 20, hint, "3.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("ten_equals_blank_times_fivealg_3_5")) {
            ten_equals_blank_times_fivealg_3_4 add = new ten_equals_blank_times_fivealg_3_4();
            results = add.generate(1, 20, hint, "3.5", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("ten_equals_blank_times_fivealg_3_2")) {
            ten_equals_blank_times_fivealg_3_4 add = new ten_equals_blank_times_fivealg_3_4();
            results = add.generate(1, 20, hint, "3.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_equals_b_dividedby_blank_alg_3_4")) { // Karl
            a_equals_b_dividedby_blank_alg_3_4 add = new a_equals_b_dividedby_blank_alg_3_4();
            results = add.generate(1, 90, hint, "3.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //algebra level 3.5
        else if (algo.equals("commutative_multiplication_alg_3_5")) { // Karl
            commutative_multiplication_alg_3_5 add = new commutative_multiplication_alg_3_5();
            results = add.generate(1, 90, hint, "3.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("associative_with_multiplication_alg_3_5")) { // Karl
            associative_with_multiplication_alg_3_5 add = new associative_with_multiplication_alg_3_5();
            results = add.generate(1, 90, hint, "3.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("associative_with_multiplication_alg_3_9")) { // Karl
            associative_with_multiplication_alg_3_5 add = new associative_with_multiplication_alg_3_5();
            results = add.generate(1, 90, hint, "3.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //algebra level 3.6
        else if (algo.equals("blank_times_b_equals_c_alg_3_6")) { // Karl
            blank_times_b_equals_c_alg_3_6 add = new blank_times_b_equals_c_alg_3_6();
            results = add.generate(1, 90, hint, "3.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_times_b_equals_c_alg_3_9")) { // Karl
            blank_times_b_equals_c_alg_3_6 add = new blank_times_b_equals_c_alg_3_6();
            results = add.generate(1, 90, hint, "3.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("blank_groups_of_b_equals_c_alg_3_6")) { // Karl
            blank_groups_of_b_equals_c_alg_3_6 add = new blank_groups_of_b_equals_c_alg_3_6();
            results = add.generate(1, 90, hint, "3.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("four_timex_blank_equals_20")) {
            four_timex_blank_equals_20 add = new four_timex_blank_equals_20();
            results = add.generate(1, 90, hint, "3.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("fourty_divide_by_8_equals_blank")) {
            fourty_divide_by_8_equals_blank add = new fourty_divide_by_8_equals_blank();
            results = add.generate(1, 10, hint, "3.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //algebra level 3.7
        else if (algo.equals("a_dividedby_b_within100_alg_3_7")) { // Karl
            a_dividedby_b_within100_alg_3_7 add = new a_dividedby_b_within100_alg_3_7();
            results = add.generate(1, 100, hint, "3.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_equals_alg_3_4")) { // Karl
            a_times_b_equals_alg_3_7 add = new a_times_b_equals_alg_3_7();
            results = add.generate(1, 100, hint, "3.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_equals_alg_3_2")) { // Karl
            a_times_b_equals_alg_3_7 add = new a_times_b_equals_alg_3_7();
            results = add.generate(1, 100, hint, "3.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_equals_alg_3_7")) { // Karl
            a_times_b_equals_alg_3_7 add = new a_times_b_equals_alg_3_7();
            results = add.generate(1, 100, hint, "3.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 Level 3.1        
        else if (algo.equals("Round_to_nearest_10_base10_3_0")) { // Karl
            Round_to_nearest_10_base10_3_1 add = new Round_to_nearest_10_base10_3_1();
            results = add.generate(11, 89, hint, "3.0", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_10_base10_3_1")) { // Karl
            Round_to_nearest_10_base10_3_1 add = new Round_to_nearest_10_base10_3_1();
            results = add.generate(11, 89, hint, "3.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_3_1")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "3.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_3_5")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "3.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_3_8")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "3.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_3_8")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "3.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_3_9")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "3.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_4_7")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "4.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Round_to_nearest_100_base10_4_8")) { // Karl
            Round_to_nearest_100_base10_3_1 add = new Round_to_nearest_100_base10_3_1();
            results = add.generate(101, 899, hint, "4.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 Level 3.2        
        else if (algo.equals("a_plus_b_within_hundreds_base10_3_2")) { // Karl
            a_plus_b_within_thousand_base10_3_2 add = new a_plus_b_within_thousand_base10_3_2();
            results = add.generate(10, 100, hint, "3.0", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_plus_b_within_thousand_base10_3_2")) { // Karl
            a_plus_b_within_thousand_base10_3_2 add = new a_plus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_plus_b_within_thousand_base10_3_8")) { // Karl
            a_plus_b_within_thousand_base10_3_2 add = new a_plus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_plus_b_within_thousand_base10_3_5")) { // Karl
            a_plus_b_within_thousand_base10_3_2 add = new a_plus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_within_hundreds_base10_3_2")) { // Karl
            a_minus_b_within_thousand_base10_3_2 add = new a_minus_b_within_thousand_base10_3_2();
            results = add.generate(10, 100, hint, "3.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_within_thousand_base10_3_2")) { // Karl
            a_minus_b_within_thousand_base10_3_2 add = new a_minus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_within_thousand_base10_3_5")) { // Karl
            a_minus_b_within_thousand_base10_3_2 add = new a_minus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_minus_b_within_thousand_base10_3_9")) { // Karl
            a_minus_b_within_thousand_base10_3_2 add = new a_minus_b_within_thousand_base10_3_2();
            results = add.generate(101, 899, hint, "3.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //base10 Level 3.3
        else if (algo.equals("a_times_b_10_to_90_base10_3_3")) { // Karl
            a_times_b_10_to_90_base10_3_3 add = new a_times_b_10_to_90_base10_3_3();
            results = add.generate(10, 99, hint, "3.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_10_to_1000_base10_3_3")) { // Karl
            a_times_b_10_to_90_base10_3_3 add = new a_times_b_10_to_90_base10_3_3();
            results = add.generate(10, 9999, hint, "3.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_10_to_1000_base10_3_3_1")) { // Karl
            a_times_b_10_to_90_base10_3_3 add = new a_times_b_10_to_90_base10_3_3();
            results = add.generate(10, 9999, hint, "3.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("a_times_b_10_to_1000_base10_3_3_2")) { // Karl
            a_times_b_10_to_90_base10_3_3 add = new a_times_b_10_to_90_base10_3_3();
            results = add.generate(10, 99, hint, "3.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // *************************  LEVEL 4 *******************************************
        //algebra level 4.1
        else if (algo.equals("a_times_asManyAs_b_alg_4_1")) { // Karl
            a_times_asManyAs_b_alg_4_1 add = new a_times_asManyAs_b_alg_4_1();
            results = add.generate(1, 100, hint, "4.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //algebra level 4.4
        else if (algo.equals("which_is_a_factor_of_alg_4_4")) { // Karl
            which_is_a_factor_of_alg_4_4 add = new which_is_a_factor_of_alg_4_4();
            results = add.generate(1, 100, hint, "4.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //algebra level 4.5
        else if (algo.equals("sequence_of_numbers_alg_4_5")) { // Karl
            sequence_of_numbers_alg_4_5 add = new sequence_of_numbers_alg_4_5();
            results = add.generate(1, 100, hint, "4.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Karl ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Base10 level 4.3
        else if (algo.equals("round_nearest_ten_within_million_base10_4_3")) { // Karl
            round_nearest_ten_within_million_base10_4_3 add = new round_nearest_ten_within_million_base10_4_3();
            results = add.generate(10, 1000, hint, "4.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_100s_within_million_base10_4_3")) { // Karl
            round_100s_within_million_base10_4_3 add = new round_100s_within_million_base10_4_3();
            results = add.generate(1000, 10000, hint, "4.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_1000s_within_million_base10_4_3")) { // Karl
            round_1000s_within_million_base10_4_3 add = new round_1000s_within_million_base10_4_3();
            results = add.generate(1000, 100000, hint, "4.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 4.4
        else if (algo.equals("add_within_hundredthousand_base10_4_4")) { // Karl
            add_within_hundredthousand_base10_4_4 add = new add_within_hundredthousand_base10_4_4();
            results = add.generate(10000, 100000, hint, "4.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("add_within_hundredthousand_base10_4_6")) { // Karl
            add_within_hundredthousand_base10_4_4 add = new add_within_hundredthousand_base10_4_4();
            results = add.generate(10000, 100000, hint, "4.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("add_within_hundredthousand_base10_4_9")) { // Karl
            add_within_hundredthousand_base10_4_4 add = new add_within_hundredthousand_base10_4_4();
            results = add.generate(10000, 100000, hint, "4.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("add_within_tenthousand_base10_4_4")) { // Karl
            add_within_hundredthousand_base10_4_4 add = new add_within_hundredthousand_base10_4_4();
            results = add.generate(1000, 10000, hint, "4.5", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_within_hundredthousand_base10_4_4")) { // Karl
            minus_within_hundredthousand_base10_4_4 add = new minus_within_hundredthousand_base10_4_4();
            results = add.generate(1000, 100000, hint, "4.5", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_within_tenthousand_base10_4_4")) { // Karl
            minus_within_hundredthousand_base10_4_4 add = new minus_within_hundredthousand_base10_4_4();
            results = add.generate(1000, 10000, hint, "4.6", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_within_tenthousand_base10_4_8")) { // Karl
            minus_within_hundredthousand_base10_4_4 add = new minus_within_hundredthousand_base10_4_4();
            results = add.generate(1000, 10000, hint, "4.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }//Base10 level 4.5
        else if (algo.equals("withinthousands_times_withinones_base10_4_5")) { // Karl
            withinthousands_times_withinones_base10_4_5 add = new withinthousands_times_withinones_base10_4_5();
            results = add.generate(1, 9998, hint, "4.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("withinhundreds_times_withinones_base10_4_5")) { // Karl
            withinthousands_times_withinones_base10_4_5 add = new withinthousands_times_withinones_base10_4_5();
            results = add.generate(1, 999, hint, "4.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("withinhundreds_times_withinones_base10_4_6")) { // Karl
            withinthousands_times_withinones_base10_4_5 add = new withinthousands_times_withinones_base10_4_5();
            results = add.generate(1, 999, hint, "4.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("withintens_times_withinones_base10_4_5")) { // Karl
            withinthousands_times_withinones_base10_4_5 add = new withinthousands_times_withinones_base10_4_5();
            results = add.generate(1, 99, hint, "4.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("twodigit_times_twodigit_base10_4_5")) { // Karl
            twodigit_times_twodigit_base10_4_5 add = new twodigit_times_twodigit_base10_4_5();
            results = add.generate(10, 99, hint, "4.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 4.6
        else if (algo.equals("divide_with_remainders_base10_4_6")) { // Karl
            divide_with_remainders_base10_4_6 add = new divide_with_remainders_base10_4_6();
            results = add.generate(10, 9998, hint, "4.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("divide_with_remainders3digits_base10_4_6")) { // Karl
            divide_with_remainders_base10_4_6 add = new divide_with_remainders_base10_4_6();
            results = add.generate(10, 999, hint, "4.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("divide_with_remainders2digits_base10_4_6")) { // Karl
            divide_with_remainders_base10_4_6 add = new divide_with_remainders_base10_4_6();
            results = add.generate(10, 98, hint, "4.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 5.4
        else if (algo.equals("round_to_tenth_base10_5_4")) { // Karl
            round_to_tenth_base10_5_4 add = new round_to_tenth_base10_5_4();
            results = add.generate(1, 1000, hint, "5.0", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_tenth_base10_5_2")) { // Karl
            round_to_tenth_base10_5_4 add = new round_to_tenth_base10_5_4();
            results = add.generate(1, 1000, hint, "5.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_tenth_base10_5_6")) { // Karl
            round_to_tenth_base10_5_4 add = new round_to_tenth_base10_5_4();
            results = add.generate(1, 1000, hint, "5.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_hundredth_base10_5_4")) { // Karl
            round_to_hundredth_base10_5_4 add = new round_to_hundredth_base10_5_4();
            results = add.generate(1, 1000, hint, "5.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_hundredth_base10_5_8")) { // Karl
            round_to_hundredth_base10_5_4 add = new round_to_hundredth_base10_5_4();
            results = add.generate(1, 1000, hint, "5.8", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_whole_base10_5_4")) {
            round_to_whole_base10_5_4 add = new round_to_whole_base10_5_4();
            results = add.generate(1, 1000, hint, "5.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("round_to_whole_base10_5_7")) {
            round_to_whole_base10_5_4 add = new round_to_whole_base10_5_4();
            results = add.generate(1, 1000, hint, "5.7", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 5.5
        else if (algo.equals("multiply_multidigit_base10_5_5")) { // Karl
            multiply_multidigit_base10_5_5 add = new multiply_multidigit_base10_5_5();
            results = add.generate(10, 100000, hint, "5.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("multiply_multidigit_3digitsbase10_5_5")) { // Karl
            multiply_multidigit_base10_5_5 add = new multiply_multidigit_base10_5_5();
            results = add.generate(10, 10000, hint, "5.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 5.6
        else if (algo.equals("divide_with_remainders_largernumbers_base10_5_6")) { // Karl
            divide_with_remainders_largernumbers_base10_5_6 add = new divide_with_remainders_largernumbers_base10_5_6();
            results = add.generate(100, 9998, hint, "5.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } //Base10 level 5.7
        else if (algo.equals("add_decimals_to_hundreths_base10_5_7")) { // Karl
            add_decimals_to_hundreths_base10_5_7 add = new add_decimals_to_hundreths_base10_5_7();
            results = add.generate(1, 100, hint, "5.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("minus_decimals_hundreths_base10_5_7")) { // Karl
            minus_decimals_hundreths_base10_5_7 add = new minus_decimals_hundreths_base10_5_7();
            results = add.generate(1, 100, hint, "5.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("multiply_decimals_hundreths_base10_5_7")) { // Karl
            multiply_decimals_hundreths_base10_5_7 add = new multiply_decimals_hundreths_base10_5_7();
            results = add.generate(1, 100, hint, "5.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("divide_decimals_hundreths_base10_5_7")) { // Karl
            divide_decimals_hundreths_base10_5_7 add = new divide_decimals_hundreths_base10_5_7();
            results = add.generate(1, 100, hint, "5.9", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // RATIOS Level 6.1     
        else if (algo.equals("RatioWordProblems_6_1")) { // Karl
            RatioWordProblems_6_1 add = new RatioWordProblems_6_1();
            results = add.generate(1, 30, hint, "6.0", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("RatioWordProblems_6_6")) { // Karl
            RatioWordProblems_6_1 add = new RatioWordProblems_6_1();
            results = add.generate(1, 30, hint, "6.6", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("RatioWordProblems2_6_11")) { // Karl
            RatioWordProblems2_6_11 add = new RatioWordProblems2_6_11();
            results = add.generate(1, 30, hint, "6.8", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("RatioWordProblems2_6_2")) { // Karl
            RatioWordProblems2_6_11 add = new RatioWordProblems2_6_11();
            results = add.generate(1, 30, hint, "6.2", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        } // RATIOS Level 7.1     
        //  else if (algo.equals("RatioDivisionWordProblems_7_1")) { // Karl
        //      RatioDivisionWordProblems_7_1 add = new RatioDivisionWordProblems_7_1();
        //      results = add.generate(2, 20, hint, "7.1");
        //      results.addElement("1");
        //      results.addElement("abc");
        //   } // RATIOS Level 7.3     
        //   else if (algo.equals("HowMuchTip_ratios_7_3")) { // Karl
        //       HowMuchTip_ratios_7_3 add = new HowMuchTip_ratios_7_3();
        //       results = add.generate(1000, 5001, hint, "7.3");
        //       results.addElement("1");
        //       results.addElement("abc");
        //    } else if (algo.equals("HowMuchDiscount_ratios_7_3")) { // Karl
        //        HowMuchDiscount_ratios_7_3 add = new HowMuchDiscount_ratios_7_3();
        //       results = add.generate(1000, 6001, hint, "7.3");
        //      results.addElement("1");
        //     results.addElement("abc");
        //   } // GEOMETRY Level 7.2    
        //      else if (algo.equals("CanYouTriangle_GivenSides_geo_7_2")) { // Karl
        //           CanYouTriangle_GivenSides_geo_7_2 add = new CanYouTriangle_GivenSides_geo_7_2();
        //          results = add.generate(1, 15, hint, "7.2");
        //         results.addElement("1");
        //        results.addElement("abc");
        //   } else if (algo.equals("CanYouTriangle_GivenAngles_geo_7_2")) { // Karl
        //          CanYouTriangle_GivenAngles_geo_7_2 add = new CanYouTriangle_GivenAngles_geo_7_2();
        //          results = add.generate(1, 180, hint, "7.2");
        //         results.addElement("1");
        //         results.addElement("abc");
        //     } // GEOMETRY Level 7.4  
        //     else if (algo.equals("FindAreaOfCircle_GivenRadius_geo_7_4")) { // Karl
        //         FindAreaOfCircle_GivenRadius_geo_7_4 add = new FindAreaOfCircle_GivenRadius_geo_7_4();
        //        results = add.generate(1, 20, hint, "7.4");
        //       results.addElement("1");
        //      results.addElement("abc");
        //        } else if (algo.equals("FindCircleCircumGivenDiameter_geo_7_4")) { // Karl
        //           FindCircleCircumGivenDiameter_geo_7_4 add = new FindCircleCircumGivenDiameter_geo_7_4();
        //          results = add.generate(1, 20, hint, "7.4");
        //         results.addElement("1");
        ///        results.addElement("abc");
        //     }
        // else if (algo.equals("AreaCircleGivenDiameter")) { // Karl
        //        AreaCircleGivenDiameter add = new AreaCircleGivenDiameter();
        //       results = add.generate(1, 20, hint, "7.4");
        //      results.addElement("1");
        //        results.addElement("abc");
        ///    } else if (algo.equals("FindCircumGivenRadius")) { // Karl
        //        FindCircumGivenRadius add = new FindCircumGivenRadius();
        //            results = add.generate(1, 20, hint, "7.4");
        //           results.addElement("1");
        //           results.addElement("abc");
        //       } // GEOMETRY Level 7.5  
        //      else if (algo.equals("ComplementaryAngles")) { // Karl
        //          ComplementaryAngles add = new ComplementaryAngles();
        //          results = add.generate(1, 90, hint, "7.5");
        //          results.addElement("1");
        //          results.addElement("abc");
        //      } else if (algo.equals("SupplementaryAngles")) { // Karl
        //         SupplementaryAngles add = new SupplementaryAngles();
        //        results = add.generate(1, 180, hint, "7.5");
        //       results.addElement("1");
        //      results.addElement("abc");
        //       } // GEOMETRY Level 7.6 
        //      else if (algo.equals("AreaOfTriangle_Geo7_6")) { // Karl
        //         AreaOfTriangle_Geo7_6 add = new AreaOfTriangle_Geo7_6();
        //        results = add.generate(1, 20, hint, "7.6");
        //       results.addElement("1");
        //         results.addElement("abc");
        //                } 
        else if (algo.equals("VolumeOfRectangularPrism_geo7_6")) { // Karl
            VolumeOfRectangularPrism_geo7_6 add = new VolumeOfRectangularPrism_geo7_6();
            results = add.generate(2, 12, hint, "6.1", "GEOMETRY");
            results.addElement("1");
            results.addElement("abc");
        } //       } // STATISTICS Level 7.8
        //       else if (algo.equals("WordTiles_Stats7_8")) { // Karl
        //          WordTiles_Stats7_8 add = new WordTiles_Stats7_8();
        //           results = add.generate(1, 20, hint, "7.8");
        //          results.addElement("1");
        //         results.addElement("abc");
        //    } else if (algo.equals("WordTiles_FirstLetter")) { // Karl
        //          WordTiles_FirstLetter add = new WordTiles_FirstLetter();
        //          results = add.generate(1, 20, hint, "7.8");
        //         results.addElement("1");
        //        results.addElement("abc");
        //   } // karl new stuff (going back and filling in)
        // ALGEBRA level 3.3
        else if (algo.equals("MultiplicationWordProbAlg3_3")) { // Karl
            MultiplicationWordProbAlg3_3 add = new MultiplicationWordProbAlg3_3();
            results = add.generate(2, 8, hint, "3.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("MultiplicationWordProbAlg3_5")) { // Karl
            MultiplicationWordProbAlg3_3 add = new MultiplicationWordProbAlg3_3();
            results = add.generate(2, 8, hint, "352", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 5.3
        //      else if (algo.equals("InOutPlus_algebra5_3")) { // Karl
        //          InOutPlus_algebra5_3 add = new InOutPlus_algebra5_3();
        //         results = add.generate(2, 100, hint, "2.3");
        //        results.addElement("1");
        //       results.addElement("abc");
        //    } else if (algo.equals("InOutMultiply_algebra5_3")) { // Karl
        //       InOutMultiply_algebra5_3 add = new InOutMultiply_algebra5_3();
        //      results = add.generate(2, 11, hint, "2.3");
        //     results.addElement("1");
        //    results.addElement("abc");
        //  } // BASE10 level 2.3
        else if (algo.equals("WriteExpandedForm_base10_2_3")) { // Karl
            WriteExpandedForm_base10_2_3 add = new WriteExpandedForm_base10_2_3();
            results = add.generate(102, 998, hint, "2.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WriteWordForm_base10_2_3")) { // Karl
            WriteWordForm_base10_2_3 add = new WriteWordForm_base10_2_3();
            results = add.generate(102, 998, hint, "2.6", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WriteWordForm_base10_2_4")) { // Karl
            WriteWordForm_base10_2_3 add = new WriteWordForm_base10_2_3();
            results = add.generate(102, 998, hint, "2.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WriteInStandardFormBase10_2_3")) { // Karl
            WriteInStandardFormBase10_2_3 add = new WriteInStandardFormBase10_2_3();
            results = add.generate(102, 998, hint, "2.3", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } // BASE10 level 4.1
        else if (algo.equals("base10_64_times_30_4_1")) { // Karl
            base10_64_times_30_4_1 add = new base10_64_times_30_4_1();
            results = add.generate(11, 99, hint, "4.7", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("base10_1200dividedby40_4_1")) { // Karl
            base10_1200dividedby40_4_1 add = new base10_1200dividedby40_4_1();
            results = add.generate(1000, 10000, hint, "4.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } // BASE10 level 4.2
        else if (algo.equals("ExpandedFormToNumberBase10_4_2")) { // Karl
            ExpandedFormToNumberBase10_4_2 add = new ExpandedFormToNumberBase10_4_2();
            results = add.generate(1002, 1000000, hint, "4.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("NumberToExpandedFormBase10_4_2")) { // Karl
            NumberToExpandedFormBase10_4_2 add = new NumberToExpandedFormBase10_4_2();
            results = add.generate(1002, 1000000, hint, "4.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }   else if (algo.equals("WordsToNumbersBase10_4_2")) { // Karl
              WordsToNumbersBase10_4_2 add = new WordsToNumbersBase10_4_2();
              results = add.generate(1002, 1000000, hint, "4.2");
              results.addElement("1");
              results.addElement("abc");
        }
        else if (algo.equals("GreaterLessEqualBase10_4_2")) { // Karl
            GreaterLessEqualBase10_4_2 add = new GreaterLessEqualBase10_4_2();
            results = add.generate(1002, 1000000, hint, "4.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("GreaterLessEqualBasetenthousands10_4_9")) { // Karl
            GreaterLessEqualBase10_4_2 add = new GreaterLessEqualBase10_4_2();
            results = add.generate(1002, 100000, hint, "4.9", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("GreaterLessEqualBasetenthousands10_4_1")) { // Karl
            GreaterLessEqualBase10_4_2 add = new GreaterLessEqualBase10_4_2();
            results = add.generate(1002, 100000, hint, "4.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("GreaterLessEqualBasetenthousands10_4_2")) { // Karl
            GreaterLessEqualBase10_4_2 add = new GreaterLessEqualBase10_4_2();
            results = add.generate(1002, 100000, hint, "4.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } // MEASURE level 2.4
        else if (algo.equals("LengthWordProblems_measure_2_4")) { // Karl
            LengthWordProblems_measure_2_4 add = new LengthWordProblems_measure_2_4();
            results = add.generate(10, 100, hint, "2.1", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("LengthWordProbsAdd_Measure2_4")) { // Karl
            LengthWordProbsAdd_Measure2_4 add = new LengthWordProbsAdd_Measure2_4();
            results = add.generate(10, 100, hint, "2.2", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("LengthWordProblems_measure_2_7")) { // Karl
            LengthWordProblems_measure_2_4 add = new LengthWordProblems_measure_2_4();
            results = add.generate(10, 100, hint, "2.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("LengthWordProbsAdd_Measure2_7")) { // Karl
            LengthWordProbsAdd_Measure2_4 add = new LengthWordProbsAdd_Measure2_4();
            results = add.generate(10, 100, hint, "2.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } // MEASURE level 2.7
        else if (algo.equals("HowMuchMoney_meaure2_7")) { // Karl
            HowMuchMoney_meaure2_7 add = new HowMuchMoney_meaure2_7();
            results = add.generate(2, 9, hint, "2.2", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("HowMuchMoney_meaure2_3")) { // Karl
            HowMuchMoney_meaure2_7 add = new HowMuchMoney_meaure2_7();
            results = add.generate(2, 9, hint, "2.3", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("HowMuchMoney_meaure2_6")) { // Karl
            HowMuchMoney_meaure2_7 add = new HowMuchMoney_meaure2_7();
            results = add.generate(2, 9, hint, "2.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("HowMuchMoney_meaure2_6")) { // Karl
            HowMuchMoney_meaure2_7 add = new HowMuchMoney_meaure2_7();
            results = add.generate(2, 9, hint, "2.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } // MEASURE level 3.1
        else if (algo.equals("TimeWordProblems_measure3_1")) { // Karl
            TimeWordProblems_measure3_1 add = new TimeWordProblems_measure3_1();
            results = add.generate(1, 60, hint, "3.1", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("TimeWordProblems_measure3_6")) { // Karl
            TimeWordProblems_measure3_1 add = new TimeWordProblems_measure3_1();
            results = add.generate(1, 60, hint, "3.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("TimeWordProblems_measure3_3")) { // Karl
            TimeWordProblems_measure3_1 add = new TimeWordProblems_measure3_1();
            results = add.generate(1, 60, hint, "3.3", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("TimeWordProblems_measure3_9")) { // Karl
            TimeWordProblems_measure3_1 add = new TimeWordProblems_measure3_1();
            results = add.generate(1, 60, hint, "3.9", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.2
        else if (algo.equals("QuartsToCups3_2")) { // Karl
            QuartsToCups3_2 add = new QuartsToCups3_2();
            results = add.generate(2, 6, hint, "3.2", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("QuartsToCups3_4")) { // Karl
            QuartsToCups3_2 add = new QuartsToCups3_2();
            results = add.generate(2, 6, hint, "3.4", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("QuartsToCups3_7")) { // Karl
            QuartsToCups3_2 add = new QuartsToCups3_2();
            results = add.generate(2, 6, hint, "3.7", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("QuartsToCups3_8")) { // Karl
            QuartsToCups3_2 add = new QuartsToCups3_2();
            results = add.generate(2, 6, hint, "3.8", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } // MEASURE level 4.1
        else if (algo.equals("PoundsToOunces4_1")) { // Karl
            PoundsToOunces4_1 add = new PoundsToOunces4_1();
            results = add.generate(2, 6, hint, "4.1", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.2
        else if (algo.equals("HowMuchChangeMeasure4_2")) { // Karl
            HowMuchChangeMeasure4_2 add = new HowMuchChangeMeasure4_2();
            results = add.generate(101, 300, hint, "4.2", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("PoundsToOunces4_3")) { // Karl
            PoundsToOunces4_1 add = new PoundsToOunces4_1();
            results = add.generate(2, 6, hint, "4.3", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.2
        else if (algo.equals("HowMuchChangeMeasure4_3")) { // Karl
            HowMuchChangeMeasure4_2 add = new HowMuchChangeMeasure4_2();
            results = add.generate(101, 300, hint, "4.3", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } // MEASURE level 4.3
        else if (algo.equals("AreaOfSwimmingPoolMeasure4_3")) { // Karl
            AreaOfSwimmingPoolMeasure4_3 add = new AreaOfSwimmingPoolMeasure4_3();
            results = add.generate(5, 31, hint, "4.4", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.5
        else if (algo.equals("TypeOfAngle_measure_4_5")) { // Karl
            TypeOfAngle_measure_4_5 add = new TypeOfAngle_measure_4_5();
            results = add.generate(1, 181, hint, "4.5", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("TypeOfAngle_measure_4_9")) { // Karl
            TypeOfAngle_measure_4_5 add = new TypeOfAngle_measure_4_5();
            results = add.generate(1, 181, hint, "4.9", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("FeetToInches")) { // Karl
            FeetToInches add = new FeetToInches();
            results = add.generate(2, 11, hint, "4.6", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FeetToInches5_0")) { // Karl
            FeetToInches add = new FeetToInches();
            results = add.generate(2, 11, hint, "5.0", "MEASUREMENT");
            results.addElement("1");
            results.addElement("abc");
        }// GEOMETRY level 3.1
        else if (algo.equals("HowManySides_geo3_1")) { // Karl
            HowManySides_geo3_1 add = new HowManySides_geo3_1();
            results = add.generate(3, 11, hint, "3.1");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WhatShapeHas_geo3_1")) { // Karl
            WhatShapeHas_geo3_1 add = new WhatShapeHas_geo3_1();
            results = add.generate(3, 11, hint, "3.1");
            results.addElement("1");
            results.addElement("abc");
        }// GEOMETRY level 6.2
        else if (algo.equals("RectangularPrismVolumeGeo6_2")) { // Karl
            RectangularPrismVolumeGeo6_2 add = new RectangularPrismVolumeGeo6_2();
            results = add.generate(2, 10, hint, "6.5", "GEOMETRY");
            results.addElement("1");
            results.addElement("abc");
        }// GEOMETRY level 6.3
        else if (algo.equals("MissingCoordinateGeo6_3")) { // Karl
            MissingCoordinateGeo6_3 add = new MissingCoordinateGeo6_3();
            results = add.generate(-10, 11, hint, "6.3", "GEOMETRY");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("MissingCoordinateGeo6_7")) { // Karl
            MissingCoordinateGeo6_3 add = new MissingCoordinateGeo6_3();
            results = add.generate(-10, 11, hint, "6.7", "GEOMETRY");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 3.3
        else if (algo.equals("SimplifyFraction_3_1")) { // Karl
            SimplifyFraction_3_3 add = new SimplifyFraction_3_3();
            results = add.generate(2, 9, hint, "3.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SimplifyFraction_3_3")) { // Karl
            SimplifyFraction_3_3 add = new SimplifyFraction_3_3();
            results = add.generate(2, 9, hint, "3.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SimplifyFraction_3_5")) { // Karl
            SimplifyFraction_3_3 add = new SimplifyFraction_3_3();
            results = add.generate(2, 9, hint, "3.5", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SimplifyFraction_3_6")) { // Karl
            SimplifyFraction_3_3 add = new SimplifyFraction_3_3();
            results = add.generate(2, 9, hint, "3.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("DivideNumByDenom_3_3")) { // Karl
            DivideNumByDenom_3_3 add = new DivideNumByDenom_3_3();
            results = add.generate(1, 51, hint, "3.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.1
        else if (algo.equals("EquivalentFraction4_0")) { // Karl
            EquivalentFraction4_1 add = new EquivalentFraction4_1();
            results = add.generate(1, 6, hint, "4.0", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("EquivalentFraction4_1")) { // Karl
            EquivalentFraction4_1 add = new EquivalentFraction4_1();
            results = add.generate(1, 6, hint, "4.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SimplifyBiggerFractions4_1")) { // Karl
            SimplifyBiggerFractions4_1 add = new SimplifyBiggerFractions4_1();
            results = add.generate(1, 50, hint, "4.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SimplifyBiggerFractions4_4")) { // Karl
            SimplifyBiggerFractions4_1 add = new SimplifyBiggerFractions4_1();
            results = add.generate(1, 50, hint, "4.4", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.3
        else if (algo.equals("AddingFractions4_3")) { // Karl
            AddingFractions4_3 add = new AddingFractions4_3();
            results = add.generate(1, 10, hint, "4.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.4
        else if (algo.equals("MultiplyingFractions4_4")) { // Karl
            MultiplyingFractions4_4 add = new MultiplyingFractions4_4();
            results = add.generate(1, 8, hint, "4.4", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.5
        else if (algo.equals("AddOver10and100_fraction4_5")) { // Karl
            AddOver10and100_fraction4_5 add = new AddOver10and100_fraction4_5();
            results = add.generate(1, 101, hint, "4.5", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("AddOver10and100_fraction4_8")) { // Karl
            AddOver10and100_fraction4_5 add = new AddOver10and100_fraction4_5();
            results = add.generate(1, 101, hint, "4.8", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("AddOver10and100_fraction4_9")) { // Karl
            AddOver10and100_fraction4_5 add = new AddOver10and100_fraction4_5();
            results = add.generate(1, 101, hint, "4.9", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.6
        else if (algo.equals("FractionToDecimal4_6")) { // Karl
            FractionToDecimal4_6 add = new FractionToDecimal4_6();
            results = add.generate(1, 101, hint, "4.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 4.7
        else if (algo.equals("DecimalLessThan_Fractions4_7")) { // Karl
            DecimalLessThan_Fractions4_7 add = new DecimalLessThan_Fractions4_7();
            results = add.generate(1, 10, hint, "4.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("DecimalLessThan_Fractions4_9")) { // Karl
            DecimalLessThan_Fractions4_7 add = new DecimalLessThan_Fractions4_7();
            results = add.generate(1, 10, hint, "4.9", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 5.1
        else if (algo.equals("AddingUnlikeDenominators5_1")) { // Karl
            AddingUnlikeDenominators5_1 add = new AddingUnlikeDenominators5_1();
            results = add.generate(1, 7, hint, "5.0", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 5.2
        else if (algo.equals("FractionWordAddition5_2")) { // Karl
            FractionWordAddition5_2 add = new FractionWordAddition5_2();
            results = add.generate(2, 6, hint, "5.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionWordAddition5_7")) { // Karl
            FractionWordAddition5_2 add = new FractionWordAddition5_2();
            results = add.generate(2, 6, hint, "5.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 5.3
        else if (algo.equals("Division_fraction5_3")) { // Karl
            Division_fraction5_3 add = new Division_fraction5_3();
            results = add.generate(2, 10, hint, "5.2", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 5.4
        else if (algo.equals("FractionsMultiply5_4")) { // Karl
            FractionsMultiply5_4 add = new FractionsMultiply5_4();
            results = add.generate(1, 9, hint, "5.4", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTION level 5.6
        else if (algo.equals("FractionWordProblem")) { // Karl
            FractionWordProblem add = new FractionWordProblem();
            results = add.generate(10, 100, hint, "5.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionWordProblem_5_8")) { // Karl
            FractionWordProblem add = new FractionWordProblem();
            results = add.generate(10, 100, hint, "5.8", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.1
        else if (algo.equals("WordDividingFractions_6_0")) { // Karl
            WordDividingFractions add = new WordDividingFractions();
            results = add.generate(2, 6, hint, "6.0", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WordDividingFractions")) { // Karl
            WordDividingFractions add = new WordDividingFractions();
            results = add.generate(2, 6, hint, "6.1", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.2
        else if (algo.equals("DivisionWholeNumbers6_2")) { // Karl
            DivisionWholeNumbers6_2 add = new DivisionWholeNumbers6_2();
            results = add.generate(1, 1000, hint, "6.1", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("DivisionWholeNumbers6_4")) { // Karl
            DivisionWholeNumbers6_2 add = new DivisionWholeNumbers6_2();
            results = add.generate(1, 1000, hint, "6.4", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.3
        else if (algo.equals("AdditionDecimals6_3")) { // Karl
            AdditionDecimals6_3 add = new AdditionDecimals6_3();
            results = add.generate(1, 11, hint, "6.2", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("AdditionDecimals6_6")) { // Karl
            AdditionDecimals6_3 add = new AdditionDecimals6_3();
            results = add.generate(1, 11, hint, "6.6", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        } // NUMBERSYSTEM level 6.4
        else if (algo.equals("MinorFactoring6_4")) { // Karl
            MinorFactoring6_4 add = new MinorFactoring6_4();
            results = add.generate(1, 61, hint, "6.6", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.5
        else if (algo.equals("DebtNumber6_5")) { // Karl
            DebtNumber6_5 add = new DebtNumber6_5();
            results = add.generate(1, 31, hint, "6.3", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.7
        else if (algo.equals("WhichInequalityRepresents6_7")) { // Karl
            WhichInequalityRepresents6_7 add = new WhichInequalityRepresents6_7();
            results = add.generate(-10, 0, hint, "6.7", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.8
        else if (algo.equals("DistanceBetweenCoordinates6_8")) { // Karl
            DistanceBetweenCoordinates6_8 add = new DistanceBetweenCoordinates6_8();
            results = add.generate(1, 11, hint, "6.7", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("DistanceBetweenCoordinates6_5")) { // Karl
            DistanceBetweenCoordinates6_8 add = new DistanceBetweenCoordinates6_8();
            results = add.generate(1, 11, hint, "6.5", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// RATIOS level 6.2
        else if (algo.equals("MoneyWordProblem")) { // Karl
            MoneyWordProblem add = new MoneyWordProblem();
            results = add.generate(1, 11, hint, "6.2", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }  else if (algo.equals("MoneyWordProblem64")) { // Karl
            MoneyWordProblem add = new MoneyWordProblem();
            results = add.generate(1, 11, hint, "6.4", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }  else if (algo.equals("MoneyWordProblem69")) { // Karl
            MoneyWordProblem add = new MoneyWordProblem();
            results = add.generate(1, 11, hint, "6.9", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// STATISTICS level 6.3
        else if (algo.equals("FindRangeStats6_3")) { // Karl
            FindRangeStats6_3 add = new FindRangeStats6_3();
            results = add.generate(80, 101, hint, "6.0", "STATISTICS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FindRangeStats6_3")) { // Karl
            FindRangeStats6_3 add = new FindRangeStats6_3();
            results = add.generate(80, 101, hint, "6.4", "STATISTICS");
            results.addElement("1");
            results.addElement("abc");
        } //GENE START   
        //algebra 3_8
        else if (algo.equals("WordProblemPetStore_3_8")) { // Gene
            WordProblemPetStore_3_8 add = new WordProblemPetStore_3_8();
            results = add.generate(1, 50, hint, "3.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
                } else if (algo.equals("InOutPlus_3_9")) { // Gene
                   InOutPlus_3_9 add = new InOutPlus_3_9();
                     results = add.generate(1, 50, hint, "3.9");
                      results.addElement("1");
                      results.addElement("abc");
                  } else if (algo.equals("InOutMultiply_3_9")) { // Gene
                       InOutMultiply_3_9 add = new InOutMultiply_3_9();
                       results = add.generate(1, 50, hint, "3.9");
                       results.addElement("1");
                       results.addElement("abc");
                   } else if (algo.equals("InOutPlus_4_0")) { // Gene
                       InOutPlus_3_9 add = new InOutPlus_3_9();
            results = add.generate(1, 100, hint, "4.0");
                       results.addElement("1");
                       results.addElement("abc");
                   } else if (algo.equals("InOutMultiply_4_0")) { // Gene
                       InOutMultiply_3_9 add = new InOutMultiply_3_9();
                       results = add.generate(1, 100, hint, "4.0");
                       results.addElement("1");
                      results.addElement("abc");
        } else if (algo.equals("WordProblemMoneyMultiply_4_2")) { // Gene
            WordProblemMoneyMultiply_4_2 add = new WordProblemMoneyMultiply_4_2();
            results = add.generate(10, 900, hint, "4.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Money_WordProblem_multiStep")) { // Gene
            Money_WordProblem_multiStep add = new Money_WordProblem_multiStep();
            results = add.generate(1, 100, hint, "4.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("sequence_of_numbers_alg_4_6")) { // Gene
            sequence_of_numbers_alg_4_5 add = new sequence_of_numbers_alg_4_5();
            results = add.generate(1, 100, hint, "4.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("sequence_of_numbers_alg_4_7")) { // Gene
            sequence_of_numbers_alg_4_5 add = new sequence_of_numbers_alg_4_5();
            results = add.generate(1, 1000, hint, "4.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("sequence_of_numbers_alg_4_8")) { // Gene
            sequence_of_numbers_alg_4_5 add = new sequence_of_numbers_alg_4_5();
            results = add.generate(1, 10000, hint, "4.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("sequence_of_numbers_alg_4_9")) { // Gene
            sequence_of_numbers_alg_4_5 add = new sequence_of_numbers_alg_4_5();
            results = add.generate(1, 100000, hint, "4.5", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("MultiStepMath")) { // Gene
            MultiStepMath add = new MultiStepMath();
            results = add.generate(2, 100, hint, "5.0", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("MultiStepMath_5_1")) { // Gene
            MultiStepMath add = new MultiStepMath();
            results = add.generate(2, 1000, hint, "5.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("MultiStepMath5_2")) { // Gene
            MultiStepMath5_2 add = new MultiStepMath5_2();
            results = add.generate(2, 20, hint, "5.2", "OPERATIONS");
            results.addElement("1");    
            results.addElement("abc");
            /*} 
        
        
             else if (algo.equals("WriteOutHundredsPlace")) { // Gene
             WriteOutHundredsPlace add = new WriteOutHundredsPlace();
             results = add.generate(1, 500, hint, "5.3");
             results.addElement("1");
             results.addElement("abc");
             } else if (algo.equals("WriteOutThousandsPlace")) { // Gene
             WriteOutThousandsPlace add = new WriteOutThousandsPlace();
             results = add.generate(1, 500, hint, "5.3");
             results.addElement("1");
             results.addElement("abc");
            }
             */

        } else if (algo.equals("FractionDivision")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(1, 10, hint, "5.5", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionDivision_5_6")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(10, 100, hint, "5.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionDivision")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(100, 1000, hint, "5.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionDivision_5_8")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(1000, 10000, hint, "5.8", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionDivision_6_0")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(1000, 10000, hint, "5.9", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("FractionDivision_5_9")) { // Gene
            FractionDivision add = new FractionDivision();
            results = add.generate(1000, 10000, hint, "6.0", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }else if (algo.equals("PMDAS_6_0")) { // Gene
            PMDAS_6_1 add = new PMDAS_6_1();
            results = add.generate(1, 20, hint, "6.0", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("PMDAS_6_1")) { // Gene
            PMDAS_6_1 add = new PMDAS_6_1();
            results = add.generate(1, 20, hint, "6.1", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Which_x_minus_y")) { // Gene
            Which_ProductOf_x_Y add = new Which_ProductOf_x_Y();
            results = add.generate(1, 20, hint, "6.2", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Which_ProductOf_x_Y")) { // Gene
            Which_ProductOf_x_Y add = new Which_ProductOf_x_Y();
            results = add.generate(1, 20, hint, "6.0", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WhichExp_Equiv")) { // Gene
            WhichExp_Equiv add = new WhichExp_Equiv();
            results = add.generate(1, 20, hint, "6.3", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WhichExpressEquiv_6_4")) { // Gene
            WhichExpressEquiv_6_4 add = new WhichExpressEquiv_6_4();
            results = add.generate(1, 20, hint, "6.4", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("WhichMakeStatementTrue")) { // Gene
            WhichMakeStatementTrue add = new WhichMakeStatementTrue();
            results = add.generate(1, 100, hint, "6.5", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("ExpressionWordProblem_6_6")) { // Gene
            ExpressionWordProblem_6_6 add = new ExpressionWordProblem_6_6();
            results = add.generate(10, 99, hint, "6.6", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("ExpressionWordProblem_6_9")) { // Gene
            ExpressionWordProblem_6_6 add = new ExpressionWordProblem_6_6();
            results = add.generate(10, 99, hint, "6.9", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("SolveEquations")) { // Gene
            SolveEquations add = new SolveEquations();
            results = add.generate(10, 99, hint, "6.7", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Inequality")) { // Gene
            Inequality add = new Inequality();
            results = add.generate(10, 99, hint, "6.8", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        } else if (algo.equals("Expressions_6_9")) { // Gene
            Expressions_6_9 add = new Expressions_6_9();
            results = add.generate(10, 99, hint, "6.9", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }
        
        
        /*********** Karloo new stuff start here ******************************/
        // BASE10 level 1.1
        else if (algo.equals("Base10_8_9_10_blank_1_1")) { // Karl
            Base10_8_9_10_blank_1_1 add = new Base10_8_9_10_blank_1_1();
            results = add.generate(1, 120, hint, "1.1", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }// BASE10 level 5.2
        else if (algo.equals("DivideByTenPower5_2")) { // Karl
            DivideByTenPower5_2 add = new DivideByTenPower5_2();
            results = add.generate(1, 10, hint, "5.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }// BASE10 level 5.2
        else if (algo.equals("TimesTenPower5_2")) { // Karl
            TimesTenPower5_2 add = new TimesTenPower5_2();
            results = add.generate(1, 10, hint, "5.2", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 3.3
        else if (algo.equals("greaterLessThanSameNum3_3")) { // Karl
            greaterLessThanSameNum3_3 add = new greaterLessThanSameNum3_3();
            results = add.generate(1, 9, hint, "3.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 3.3
        else if (algo.equals("greaterLessThan3_3")) { // Karl
            greaterLessThan3_3 add = new greaterLessThan3_3();
            results = add.generate(1, 9, hint, "3.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.1
        else if (algo.equals("Equivalent3_4_1")) { // Karl
            Equivalent3_4_1 add = new Equivalent3_4_1();
            results = add.generate(1, 9, hint, "4.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.1
        else if (algo.equals("Equivalent2_4_1")) { // Karl
            Equivalent2_4_1 add = new Equivalent2_4_1();
            results = add.generate(1, 9, hint, "4.1", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.3
        else if (algo.equals("AddingWithWhole4_3")) { // Karl
            AddingWithWhole4_3 add = new AddingWithWhole4_3();
            results = add.generate(1, 9, hint, "4.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.2
        else if (algo.equals("GreaterLessOrEqualFraction4_2")) { // Karl
            GreaterLessOrEqualFraction4_2 add = new GreaterLessOrEqualFraction4_2();
            results = add.generate(1, 7, hint, "4.2", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.3
        else if (algo.equals("SeveralFractions4_3")) { // Karl
            SeveralFractions4_3 add = new SeveralFractions4_3();
            results = add.generate(1, 7, hint, "4.3", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.4
        else if (algo.equals("WholeTimesFrac4_4")) { // Karl
            WholeTimesFrac4_4 add = new WholeTimesFrac4_4();
            results = add.generate(1, 7, hint, "4.4", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.5
        else if (algo.equals("HundredAndTen4_5")) { // Karl
            HundredAndTen4_5 add = new HundredAndTen4_5();
            results = add.generate(1, 10, hint, "4.5", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.6
        else if (algo.equals("EqualToHalf4_6")) { // Karl
            EqualToHalf4_6 add = new EqualToHalf4_6();
            results = add.generate(1, 10, hint, "4.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.6
        else if (algo.equals("LessThanHalf4_6")) { // Karl
            LessThanHalf4_6 add = new LessThanHalf4_6();
            results = add.generate(1, 10, hint, "4.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.6
        else if (algo.equals("MoreThanHalf4_6")) { // Karl
            MoreThanHalf4_6 add = new MoreThanHalf4_6();
            results = add.generate(1, 10, hint, "4.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.7
        else if (algo.equals("GreatestValue4_7")) { // Karl
            GreatestValue4_7 add = new GreatestValue4_7();
            results = add.generate(1, 10, hint, "4.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 4.7
        else if (algo.equals("LeastValue4_7")) { // Karl
            LeastValue4_7 add = new LeastValue4_7();
            results = add.generate(1, 10, hint, "5.2", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 5.1
        else if (algo.equals("Subtracting5_1")) { // Karl
            Subtracting5_1 add = new Subtracting5_1();
            results = add.generate(1, 10, hint, "4.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 5.2
        else if (algo.equals("JohnReadWordProb5_2")) { // Karl
            JohnReadWordProb5_2 add = new JohnReadWordProb5_2();
            results = add.generate(1, 9, hint, "5.2", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 5.6
        else if (algo.equals("aBatchOfWordProb5_6")) { // Karl
            aBatchOfWordProb5_6 add = new aBatchOfWordProb5_6();
            results = add.generate(1, 5, hint, "5.6", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// FRACTIONS level 5.7
        else if (algo.equals("NumberDivideByFraction5_7")) { // Karl
            NumberDivideByFraction5_7 add = new NumberDivideByFraction5_7();
            results = add.generate(1, 7, hint, "5.7", "FRACTIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 1.1
        else if (algo.equals("WordProb_Within20")) {
            WordProb_Within20 add = new WordProb_Within20();
            results = add.generate(1, 20, hint, "1.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 1.3
         else if (algo.equals("Which_Statement_True_1_3_alg")) { // Karl
            Which_Statement_True_Add_lvl_1_7 add = new Which_Statement_True_Add_lvl_1_7();
            results = add.generate(2, 10, hint, "1.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 3.3
         else if (algo.equals("MovieTheaterHas3_2")) { // Karl
            MovieTheaterHas3_2 add = new MovieTheaterHas3_2();
            results = add.generate(60, 101, hint, "3.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 3.3
         else if (algo.equals("JakeHasBooks3_3")) { // Karl
            JakeHasBooks3_3 add = new JakeHasBooks3_3();
            results = add.generate(16, 40, hint, "3.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 3.8
         else if (algo.equals("MathHomework3_8")) { // Karl
            MathHomework3_8 add = new MathHomework3_8();
            results = add.generate(2, 7, hint, "3.8", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 4.1
         else if (algo.equals("TimesAsManyAs4_1")) { // Karl
            TimesAsManyAs4_1 add = new TimesAsManyAs4_1();
            results = add.generate(2, 7, hint, "4.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 4.2
         else if (algo.equals("BakerySold4_2")) { // Karl
            BakerySold4_2 add = new BakerySold4_2();
            results = add.generate(2, 70, hint, "4.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 4.3
         else if (algo.equals("MuffinsWord4_3")) { // Karl
            MuffinsWord4_3 add = new MuffinsWord4_3();
            results = add.generate(2, 30, hint, "4.3", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 4.4
         else if (algo.equals("LCM_alg4_4")) { // Karl
            LCM_alg4_4 add = new LCM_alg4_4();
            results = add.generate(2, 10, hint, "4.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 4.4
         else if (algo.equals("GreatestCommonFactor4_4")) { // Karl
            GreatestCommonFactor4_4 add = new GreatestCommonFactor4_4();
            results = add.generate(2, 30, hint, "4.4", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 5.1
         else if (algo.equals("MultiStepDivisionFirst5_1")) { // Karl
            MultiStepDivisionFirst5_1 add = new MultiStepDivisionFirst5_1();
            results = add.generate(2, 100, hint, "5.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 5.1
         else if (algo.equals("MultiStepWithDivision5_1")) { // Karl
            MultiStepWithDivision5_1 add = new MultiStepWithDivision5_1();
            results = add.generate(2, 100, hint, "5.1", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// ALGEBRA level 5.2
         else if (algo.equals("FindProductTakeAway5_2")) { // Karl
            FindProductTakeAway5_2 add = new FindProductTakeAway5_2();
            results = add.generate(2, 20, hint, "5.2", "OPERATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// RATIOS level 6.1
        else if (algo.equals("WordProbCookiesRatio6_1")) { // Karl
            WordProbCookiesRatio6_1 add = new WordProbCookiesRatio6_1();
            results = add.generate(1, 7, hint, "6.1", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        }// RATIOS level 6.2
        else if (algo.equals("MilesWordProblem6_2")) { // Karl
            MilesWordProblem6_2 add = new MilesWordProblem6_2();
            results = add.generate(200, 400, hint, "6.2", "RATIOS");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.1
        else if (algo.equals("HowManyServingsWordProb6_1")) { // Karl
            HowManyServingsWordProb6_1 add = new HowManyServingsWordProb6_1();
            results = add.generate(2, 13, hint, "6.1", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.3
        else if (algo.equals("DivisionClass6_3")) { // Karl
            DivisionClass6_3 add = new DivisionClass6_3();
            results = add.generate(2, 13, hint, "6.3", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.3
        else if (algo.equals("MultiplicationClass6_3")) { // Karl
            MultiplicationClass6_3 add = new MultiplicationClass6_3();
            results = add.generate(2, 13, hint, "6.3", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.3
        else if (algo.equals("SubtractionDecimals6_3")) { // Karl
            SubtractionDecimals6_3 add = new SubtractionDecimals6_3();
            results = add.generate(2, 13, hint, "6.3", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.4
        else if (algo.equals("LeastCommonMultiple6_4")) { // Karl
            LeastCommonMultiple6_4 add = new LeastCommonMultiple6_4();
            results = add.generate(2, 13, hint, "6.4", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.4
        else if (algo.equals("GreatestCommonFactor6_4")) { // Karl
            GreatestCommonFactor6_4 add = new GreatestCommonFactor6_4();
            results = add.generate(2, 50, hint, "6.4", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.6
        else if (algo.equals("NegativeNegativeNumber6_6")) { // Karl
            NegativeNegativeNumber6_6 add = new NegativeNegativeNumber6_6();
            results = add.generate(1, 100, hint, "6.6", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// NUMBERSYSTEM level 6.7
        else if (algo.equals("AbsoluteValue6_7")) { // Karl
            AbsoluteValue6_7 add = new AbsoluteValue6_7();
            results = add.generate(-100, 100, hint, "6.7", "NUMBERSYSTEM");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.1
        else if (algo.equals("ToThePower6_1")) { // Karl
            ToThePower6_1 add = new ToThePower6_1();
            results = add.generate(2, 9, hint, "6.1", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.2
        else if (algo.equals("whichExpressionXsubFromY6_2")) { // Karl
            whichExpressionXsubFromY6_2 add = new whichExpressionXsubFromY6_2();
            results = add.generate(2, 51, hint, "6.2", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.3
        else if (algo.equals("whichExpression2_4PlusX_")) { // Karl
            whichExpression2_4PlusX_ add = new whichExpression2_4PlusX_();
            results = add.generate(2, 10, hint, "6.3", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.4
        else if (algo.equals("xPlusXPlusXPlusXEquals6_4")) { // Karl
            xPlusXPlusXPlusXEquals6_4 add = new xPlusXPlusXPlusXEquals6_4();
            results = add.generate(2, 50, hint, "6.4", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.5
        else if (algo.equals("equation4xEquals20")) { // Karl
            equation4xEquals20 add = new equation4xEquals20();
            results = add.generate(2, 50, hint, "6.5", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// EQUATIONS level 6.7
        else if (algo.equals("numberPlusXEqualsNumber6_7")) { // Karl
            numberPlusXEqualsNumber6_7 add = new numberPlusXEqualsNumber6_7();
            results = add.generate(1, 20, hint, "6.7", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// STATISTICS level 6.5
        else if (algo.equals("FindMedianModeMean")) { // Karl
            FindMedianModeMean add = new FindMedianModeMean();
            results = add.generate(1, 20, hint, "6.5", "EQUATIONS");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.1
        else if (algo.equals("TedHomework3_1")) { // Karl
            TedHomework3_1 add = new TedHomework3_1();
            results = add.generate(1, 60, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.1
        else if (algo.equals("BaseballGame3_1")) { // Karl
            BaseballGame3_1 add = new BaseballGame3_1();
            results = add.generate(1, 60, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.2
        else if (algo.equals("GallonsCups3_2")) { // Karl
            GallonsCups3_2 add = new GallonsCups3_2();
            results = add.generate(1, 5, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.2
        else if (algo.equals("GallonsQuarts3_2")) { // Karl
            GallonsQuarts3_2 add = new GallonsQuarts3_2();
            results = add.generate(1, 7, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.2
        else if (algo.equals("PintsCups3_2")) { // Karl
            PintsCups3_2 add = new PintsCups3_2();
            results = add.generate(1, 10, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 3.2
        else if (algo.equals("QuartsPints3_2")) { // Karl
            QuartsPints3_2 add = new QuartsPints3_2();
            results = add.generate(1, 10, hint, "3.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.1
        else if (algo.equals("HoursToMinutes4_1")) { // Karl
            HoursToMinutes4_1 add = new HoursToMinutes4_1();
            results = add.generate(1, 5, hint, "4.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.1
        else if (algo.equals("YardsToFeet4_1")) { // Karl
            YardsToFeet4_1 add = new YardsToFeet4_1();
            results = add.generate(1, 16, hint, "4.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.1
        else if (algo.equals("CupsToPints4_1")) { // Karl
            CupsToPints4_1 add = new CupsToPints4_1();
            results = add.generate(1, 11, hint, "4.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.2
        else if (algo.equals("ChrisBought4_2")) { // Karl
            ChrisBought4_2 add = new ChrisBought4_2();
            results = add.generate(1, 300, hint, "4.2", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 4.3
        else if (algo.equals("AreaGarden4_3")) { // Karl
            AreaGarden4_3 add = new AreaGarden4_3();
            results = add.generate(2, 9, hint, "4.3", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("CupsToOunces5_1")) { // Karl
            CupsToOunces5_1 add = new CupsToOunces5_1();
            results = add.generate(2, 11, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("PintsToQuarts5_1")) { // Karl
            PintsToQuarts5_1 add = new PintsToQuarts5_1();
            results = add.generate(2, 40, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("QuartsToGallons5_1")) { // Karl
            QuartsToGallons5_1 add = new QuartsToGallons5_1();
            results = add.generate(2, 40, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("CupsToPints")) { // Karl
            CupsToPints add = new CupsToPints();
            results = add.generate(2, 40, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("OuncesToCups5_1")) { // Karl
            OuncesToCups5_1 add = new OuncesToCups5_1();
            results = add.generate(2, 80, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("FeetToYards5_1")) { // Karl
            FeetToYards5_1 add = new FeetToYards5_1();
            results = add.generate(2, 80, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("MillitersToLiters5_1")) { // Karl
            MillitersToLiters5_1 add = new MillitersToLiters5_1();
            results = add.generate(1, 20, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }// MEASURE level 5.1
        else if (algo.equals("LitersToMilliliters5_1")) { // Karl
            LitersToMilliliters5_1 add = new LitersToMilliliters5_1();
            results = add.generate(1, 20, hint, "5.1", "MEASURE");
            results.addElement("1");
            results.addElement("abc");
        }//COUNTING level 1.4
        else if (algo.equals("49=_")) { // Karl
            x_equals_blank1_4 add = new x_equals_blank1_4();
            results = add.generate(1, 100, hint, "1.4", "COUNTING");
            results.addElement("1");
            results.addElement("abc");
        }//BASE10 level 1.4
        else if (algo.equals("62+8=")) { // Karl
            equals_tens1_4 add = new equals_tens1_4();
            results = add.generate(1, 100, hint, "1.4", "BASE10");
            results.addElement("1");
            results.addElement("abc");
        }
        
        return results;
    }

    public void LoadOptions() {
        DefaultComboBoxModel model;
        Vector options = new Vector();
        // options.addElement("addition 1 - 10");
        //  options.addElement("subtraction 1 - 10");
        //    options.addElement("addition 1 - 100");
        //    options.addElement("subtraction 1 - 10");
        //    options.addElement("subtraction 1 - 100");
        //     options.addElement("multiply 1 - 10");
        options.addElement("---- ALL ----");
        options.addElement("---- START COUNTING LEVEL 1.0 ----");

        options.addElement("1+2+3=?_1_0");
        options.addElement("1+2+3=?_1_9");
        options.addElement("A_plus_b_equals_What");
        options.addElement("A_plus_b_equals_What_1_7");
        options.addElement("start@xandcountupbyy_1_0");
        options.addElement("start at x and count down by y_1_0");
        options.addElement("start@xandcountupbyy_1_8");
        options.addElement("start at x and count down by y_1_8");
        options.addElement("X_minus_y_equals_what_1_0");

        options.addElement("---- START COUNTING LEVEL 1.1 ----");
        options.addElement("1+2+3=?");
        options.addElement("start@xandcountupbyy");
        options.addElement("start at x and count down by y");
        options.addElement("X_minus_y_equals_what");

        options.addElement("---- START COUNTING LEVEL 1.2 ----");
        options.addElement("2+_=12_1_2");

        //   options.addElement("2+9=11 11-_=9 lvl_1_2");
        // options.addElement("start@xandcountupbyy_lvl_1_2");
        //   options.addElement("start at x and count down by y_lvl_1_2");
        options.addElement("---- START COUNTING LEVEL 1.3 ----");
        options.addElement("67,68,69,_");
        options.addElement("67,_,69,70");
        options.addElement("lvl_1_5_67,68,69,_");
        options.addElement("lvl_1_5_67,_,69,70");
        options.addElement("67,68,69,_b10");
        options.addElement("67,_,69,70b10");
        options.addElement("lvl_1_5_67,68,69,_b10");
        options.addElement("lvl_1_5_67,_,69,70b10");

        options.addElement("---- START COUNTING LEVEL 1.4 ----");
        options.addElement("15=10+_");
        options.addElement("15=10+__lvl_1_6");
        options.addElement("_<X");
        options.addElement("---- START COUNTING LEVEL 1.5 ----");
        options.addElement("72+20=?_level_1.5");
        options.addElement("What is x less than y?");
        options.addElement("What is x more than y?");
        options.addElement("What is x less than y?8");
        options.addElement("What is x more than y?8");
        options.addElement("What is x less than y?b10");
        options.addElement("What is x more than y?b10");
        options.addElement("x-y=?_level_1_5");
        options.addElement("---- START ALGEBRA LEVEL 1.1 ----");
        options.addElement("WordProbAnimalsAdd_1_1");
        options.addElement("WordProbMinusWithin20");
        options.addElement("---- START ALGEBRA LEVEL 1.2 ----");
        options.addElement("WordProbAnimalsAdd_1_2");
        options.addElement("WordProb_Money_Level_1_2");
        options.addElement("WordProb_Money_Level_1_1");
        options.addElement("WordProb_Money_Level_1_5");
        options.addElement("---- START ALGEBRA LEVEL 1.3 ----");
        options.addElement("A_PLUS_B_PLUS_C");
        options.addElement("A_Plus_blank_equal_c");
        options.addElement("---- START ALGEBRA LEVEL 1.4 ----");
        options.addElement("A_Minus_BLANK_Equals_C");
        options.addElement("2+9=11 11-_=9 lvl_1_2");
        options.addElement("2+9=11 11-_=9 lvl_1_6");
        options.addElement("2+9=11 11-_=9 lvl_1_9");
        options.addElement("---- START ALGEBRA LEVEL 1.5 ----");
        options.addElement("Start_At_x_CountUP_Y");
        options.addElement("Start_AT_x_CountDown_By_Y_1_5_Alg");
        options.addElement("---- START ALGEBRA LEVEL 1.6 ----");
        options.addElement("a_plus_b_equals_c_lvl_1_6_Alg");
        options.addElement("a_plus_b_equals_c_lvl_1_9_Alg");
        //    options.addElement("a_minus_b_equals_c_lvl_1_6_alg");
        options.addElement("Related_Facts_1_6_alg");
        options.addElement("Related_Facts_1_9_alg");
        options.addElement("---- START ALGEBRA LEVEL 1.7 ----");
        options.addElement("Which_Statement_True_Add_lvl_1_7");
        options.addElement("---- START ALGEBRA LEVEL 1.8 ----");
        options.addElement("C_equals_A_Plus_Blank_1_8_alg");
        options.addElement("A_minus_BLANK_equals_C_alg_1_8");
        options.addElement("A_minus_BLANK_equals_C_alg_1_6");

        options.addElement("---- START Base10 LEVEL 1.1 ----");
        options.addElement("Base10_1_2_3_space_lvl_1_1");
        options.addElement("---- START Base10 LEVEL 1.2 ----");
        options.addElement("---- START Base10 LEVEL 1.3 ----");
        options.addElement("WhichTrue_Greater_Less");
        options.addElement("Which_Statement_True_Add_1_3");
        options.addElement("---- START Base10 LEVEL 1.4 ----");
        options.addElement("A_Plus_b_equals_c_Base10_Lvl_1_4");
        options.addElement("---- START Base10 LEVEL 1.5 ----");
        options.addElement("WhatisXMoreThanY_lvl_1_5_Base10");
        options.addElement("WhatisXLessThanY_lvl_1_5_Base10");
        options.addElement("---- START Base10 LEVEL 1.6 ----");
        options.addElement("SubtractMultiplesOfTen_BASE10_1_6");
        options.addElement("---------------------- START LEVEL 2 --------------------------");
        options.addElement("---- START Algebra LEVEL 2.0 ----");
        options.addElement("Alg_WordProblems_lvl2_0");
        options.addElement("WordProb_Money_Level_2_0");

        options.addElement("---- START Algebra LEVEL 2.1 ----");
        options.addElement("Alg_WordProblems_lvl2_1");
        options.addElement("Alg_WordProblem_x_plus_y_plus_minus");

        options.addElement("---- START Algebra LEVEL 2.2 ----");
        options.addElement("A_Plus_b_equals_c_Alg_2_2");
        options.addElement("a_minus_blank_equals_c_Alg_2_2");
        options.addElement("a_minus_blank_equals_c_Alg_2_0");
        options.addElement("blank_plus_b_equals_c_Alg_1_2");
        options.addElement("blank_plus_b_equals_c_Alg_2_2");
        options.addElement("---- START Algebra LEVEL 2.3 ----");
        options.addElement("Alg_which_number_odd_even_2_3");
        options.addElement("Which_Number_Even_2_3");
        // options.addElement("Number_Between_Alg_2_3");
        options.addElement("---- START Algebra LEVEL 2.5 ----");
        options.addElement("abc_2_5");
        options.addElement("abc_Subtract_2_5");
        options.addElement("---- START Algebra LEVEL 2.6 ----");
        options.addElement("algebra_2_6_x_y_z");
        options.addElement("algebra_2_6_x_y_z_what");
        options.addElement("algebra_2_8_x_y_z");
        options.addElement("algebra_2_8_x_y_z_what");

        options.addElement("---- START Base10 LEVEL 2.2 ----");
        options.addElement("count_456_457_blank_Base10_2_2");
        options.addElement("count_456_457_blank_Base10_2_7");
        options.addElement("count_246_blank_446_base10_2_2");
        options.addElement("count_230_blank_250_base10_2_2");
        options.addElement("count_330_335_blank_base10_2_2");
        options.addElement("---- START Base10 LEVEL 2.4 ----");
        options.addElement("blank_greater_than_b_base10_2_4");
        options.addElement("blank_greater_than_b_base10_2_5");
        options.addElement("blank_greater_than_b_base10_2_9");
        options.addElement("---- START Base10 LEVEL 2.5 ----");
        options.addElement("a_plus_b_equals_blank_Base10_2_5");
        options.addElement("a_minus_b_equals_blank_base10_2_5");
        options.addElement("---- START Base10 LEVEL 2.6 ----");
        options.addElement("a_plus_b_plus_c_Base10_2_6");
        options.addElement("a_plus_b_plus_c_plus_d_base10_2_6");
        options.addElement("---- START Base10 LEVEL 2.7 ----");
        options.addElement("a_plus_b_within_1000_base10_2_7");
        options.addElement("a_minus_b_within_1000_base10_2_7");
        options.addElement("---- START Base10 LEVEL 2.8 ----");
        options.addElement("minus_10_or_100_base10_2_8");
        options.addElement("plus_10_or100_base10_2_8");
        options.addElement("minus_10_or_100_op_2_8");
        options.addElement("plus_10_or100_2_9");
        options.addElement("plus_10_or100_op_2_8");
        options.addElement("---- START Base10 LEVEL 2.9 ----");
        options.addElement("if_then_a_plus_blank_equals_c_base10_2_9");
        options.addElement("if_then_a_minus_blank_equals_c_base10_2_9");
        options.addElement("fact_family_within_100_base10_2_9");
        options.addElement("---------------------- START LEVEL 3 --------------------------");
        options.addElement("---- START Algebra Level 3.1 ---");
        options.addElement("how_many_rows_of_numbers_alg_3_1");
        options.addElement("which_number_sentence_alg_3_1");
        options.addElement("---- START Algebra Level 3.2 ---");
        options.addElement("WordProb_division_Alg_3_2");
        options.addElement("WordProb_division_Alg_3_1");
        options.addElement("---- START Algebra LEVEL 3.4 ----");
        options.addElement("blank_times_b_equals_alg_3_4");
        options.addElement("blank_times_b_equals_alg_3_1");
        options.addElement("4_times_blank_equals_20alg_3_4");
        options.addElement("ten_equals_blank_times_fivealg_3_4");
        options.addElement("ten_equals_blank_times_fivealg_3_5");
        options.addElement("ten_equals_blank_times_fivealg_3_2");
        options.addElement("a_equals_b_dividedby_blank_alg_3_4");
        options.addElement("---- START Algebra LEVEL 3.5 ----");
        options.addElement("commutative_multiplication_alg_3_5");
        options.addElement("associative_with_multiplication_alg_3_5");
        options.addElement("associative_with_multiplication_alg_3_9");
        options.addElement("---- START Algebra LEVEL 3.6 ----");
        options.addElement("blank_times_b_equals_c_alg_3_9");
        options.addElement("blank_times_b_equals_c_alg_3_6");
        options.addElement("blank_groups_of_b_equals_c_alg_3_6");
        options.addElement("four_timex_blank_equals_20");
        options.addElement("fourty_divide_by_8_equals_blank");

        options.addElement("---- START Algebra LEVEL 3.7 ----");
        // options.addElement("a_dividedby_b_within100_alg_3_7");
        options.addElement("a_times_b_equals_alg_3_4");
        options.addElement("a_times_b_equals_alg_3_2");

        options.addElement("a_times_b_equals_alg_3_7");
        options.addElement("---- START Base10 LEVEL 3.1 ----");
        options.addElement("Round_to_nearest_10_base10_3_0");
        options.addElement("Round_to_nearest_10_base10_3_1");

        options.addElement("Round_to_nearest_100_base10_3_1");
        options.addElement("Round_to_nearest_100_base10_3_5");
        options.addElement("Round_to_nearest_100_base10_3_8");
        options.addElement("Round_to_nearest_100_base10_3_8");

        options.addElement("Round_to_nearest_100_base10_3_9");
        options.addElement("Round_to_nearest_100_base10_3_9");
        options.addElement("Round_to_nearest_100_base10_4_7");
        options.addElement("Round_to_nearest_100_base10_4_8");
        options.addElement("---- START Base10 LEVEL 3.2 ----");
        options.addElement("a_plus_b_within_thousand_base10_3_2");
        options.addElement("a_plus_b_within_thousand_base10_3_8");
        options.addElement("a_plus_b_within_thousand_base10_3_5");

        options.addElement("a_minus_b_within_thousand_base10_3_2");
        options.addElement("a_minus_b_within_thousand_base10_3_5");
        options.addElement("a_minus_b_within_thousand_base10_3_9");
        options.addElement("a_minus_b_within_hundreds_base10_3_2");

        options.addElement("a_plus_b_within_hundreds_base10_3_2");

        options.addElement("---- START Base10 LEVEL 3.3 ----");
        options.addElement("a_times_b_10_to_90_base10_3_3");
        options.addElement("a_times_b_10_to_1000_base10_3_3");
        options.addElement("a_times_b_10_to_1000_base10_3_3_1");
        options.addElement("a_times_b_10_to_1000_base10_3_3_2");

        options.addElement("---------------------- START LEVEL 4 --------------------------");
        options.addElement("---- START Algebra LEVEL 4.1 ----");
        options.addElement("a_times_asManyAs_b_alg_4_1");
        options.addElement("---- START Algebra LEVEL 4.4 ----");
        options.addElement("which_is_a_factor_of_alg_4_4");
        options.addElement("---- START Algebra LEVEL 4.5 ----");
        options.addElement("sequence_of_numbers_alg_4_5");
        //Karl start
        options.addElement("---- START Base10 LEVEL 4.3 ----");
        options.addElement("round_nearest_ten_within_million_base10_4_3");
        options.addElement("round_100s_within_million_base10_4_3");
        options.addElement("round_1000s_within_million_base10_4_3");
        options.addElement("---- START Base10 LEVEL 4.4 ----");
        options.addElement("add_within_hundredthousand_base10_4_6");
        options.addElement("add_within_hundredthousand_base10_4_9");
        options.addElement("add_within_tenthousand_base10_4_4");
        options.addElement("minus_within_tenthousand_base10_4_4");
        options.addElement("minus_within_tenthousand_base10_4_8");
        options.addElement("minus_within_hundredthousand_base10_4_4");
        options.addElement("---- START Base10 LEVEL 4.5 ----");
        options.addElement("withinthousands_times_withinones_base10_4_5");
        options.addElement("withinhundreds_times_withinones_base10_4_5");
        options.addElement("withinhundreds_times_withinones_base10_4_6");
        options.addElement("withintens_times_withinones_base10_4_5");
        options.addElement("twodigit_times_twodigit_base10_4_5");
        options.addElement("---- START Base10 LEVEL 4.6 ----");
        options.addElement("divide_with_remainders_base10_4_6");
        options.addElement("divide_with_remainders3digits_base10_4_6");
        options.addElement("divide_with_remainders2digits_base10_4_6");
        options.addElement("---- START Base10 LEVEL 5.4 ----");
        options.addElement("round_to_tenth_base10_5_4");
        options.addElement("round_to_tenth_base10_5_2");
        options.addElement("round_to_tenth_base10_5_6");
        options.addElement("round_to_hundredth_base10_5_4");
        options.addElement("round_to_hundredth_base10_5_8");

        options.addElement("round_to_whole_base10_5_4");
        options.addElement("round_to_whole_base10_5_7");
        options.addElement("---- START Base10 LEVEL 5.5 ----");
        options.addElement("multiply_multidigit_base10_5_5");
        options.addElement("multiply_multidigit_3digitsbase10_5_5");
        options.addElement("---- START Base10 LEVEL 5.6 ----");
        options.addElement("divide_with_remainders_largernumbers_base10_5_6");
        options.addElement("---- START Base10 LEVEL 5.7 ----");
        options.addElement("add_decimals_to_hundreths_base10_5_7");
        options.addElement("minus_decimals_hundreths_base10_5_7");
        options.addElement("multiply_decimals_hundreths_base10_5_7");
        options.addElement("divide_decimals_hundreths_base10_5_7");
        options.addElement("---- START Ratios LEVEL 6.1 ----");
        options.addElement("RatioWordProblems_6_1");
        options.addElement("RatioWordProblems_6_6");
        options.addElement("RatioWordProblems2_6_11");
        options.addElement("RatioWordProblems2_6_2");
        /*
         options.addElement("---- START Ratios LEVEL 7.1 ----");
         options.addElement("RatioDivisionWordProblems_7_1");
         options.addElement("---- START Ratios LEVEL 7.3 ----");
         options.addElement("HowMuchTip_ratios_7_3");
         options.addElement("HowMuchDiscount_ratios_7_3");
         options.addElement("---- START Geometry LEVEL 7.2 ----");
         options.addElement("CanYouTriangle_GivenSides_geo_7_2");
         options.addElement("CanYouTriangle_GivenAngles_geo_7_2");
         options.addElement("---- START Geometry LEVEL 7.4 ----");
         options.addElement("FindAreaOfCircle_GivenRadius_geo_7_4");
         options.addElement("FindCircleCircumGivenDiameter_geo_7_4");
         options.addElement("AreaCircleGivenDiameter");
         options.addElement("FindCircumGivenRadius");
         options.addElement("---- START Geometry LEVEL 7.5 ----");
         options.addElement("ComplementaryAngles");
         options.addElement("SupplementaryAngles");
         options.addElement("---- START Geometry LEVEL 7.6 ----");
         options.addElement("AreaOfTriangle_Geo7_6");
         options.addElement("VolumeOfRectangularPrism_geo7_6");
         options.addElement("---- START Statistics LEVEL 7.8 ----");
         options.addElement("WordTiles_Stats7_8");
         options.addElement("WordTiles_FirstLetter");
         */
        // karl new stuff going back and filling in
        options.addElement("-----------GOING BACK AND FILLING IN STUFF -------------");
        //algebra
        options.addElement("---- START algebra LEVEL 3.3 ----");
        options.addElement("MultiplicationWordProbAlg3_3");
        options.addElement("MultiplicationWordProbAlg3_5");
        options.addElement("---- START algebra LEVEL 5.3 ----");
        options.addElement("InOutPlus_algebra5_3");
        options.addElement("InOutMultiply_algebra5_3");

        //statistics
        options.addElement("---- START Statistics LEVEL 6.3 ----");
        options.addElement("FindRangeStats6_3");
        //ratios
        options.addElement("---- START Ratios LEVEL 6.2 ----");
        options.addElement("MoneyWordProblem");
        options.addElement("MoneyWordProblem64");
        options.addElement("MoneyWordProblem69");
        // number system
        options.addElement("---- START NumberSystem LEVEL 6.1 ----");
        options.addElement("WordDividingFractions");
        options.addElement("WordDividingFractions_6_0");
        options.addElement("---- START NumberSystem LEVEL 6.2 ----");
        options.addElement("DivisionWholeNumbers6_2");
        options.addElement("DivisionWholeNumbers6_4");
        options.addElement("---- START NumberSystem LEVEL 6.3 ----");
        options.addElement("AdditionDecimals6_3");
        options.addElement("AdditionDecimals6_6");
        options.addElement("---- START NumberSystem LEVEL 6.4 ----");
        options.addElement("MinorFactoring6_4");
        options.addElement("---- START NumberSystem LEVEL 6.5 ----");
        options.addElement("DebtNumber6_5");
        options.addElement("---- START NumberSystem LEVEL 6.7 ----");
        options.addElement("WhichInequalityRepresents6_7");
        options.addElement("---- START NumberSystem LEVEL 6.8 ----");
        options.addElement("DistanceBetweenCoordinates6_8");
        options.addElement("DistanceBetweenCoordinates6_5");
        //base10
        options.addElement("---- START Base10 LEVEL 2.3 ----");
        options.addElement("WriteExpandedForm_base10_2_3");
        options.addElement("WriteWordForm_base10_2_3");
        options.addElement("WriteWordForm_base10_2_4");
        options.addElement("WriteInStandardFormBase10_2_3");
        options.addElement("---- START Base10 LEVEL 4.1 ----");
        options.addElement("base10_64_times_30_4_1");
        options.addElement("base10_1200dividedby40_4_1");
        options.addElement("---- START Base10 LEVEL 4.2 ----");
        options.addElement("ExpandedFormToNumberBase10_4_2");
        options.addElement("NumberToExpandedFormBase10_4_2");
        options.addElement("WordsToNumbersBase10_4_2");
        options.addElement("GreaterLessEqualBase10_4_2");
        options.addElement("GreaterLessEqualBasetenthousands10_4_2");
        options.addElement("GreaterLessEqualBasetenthousands10_4_9");
        options.addElement("GreaterLessEqualBasetenthousands10_4_1");
        //measurement and data
        options.addElement("---- START Measure LEVEL 2.4 ----");
        options.addElement("LengthWordProblems_measure_2_4");
        options.addElement("LengthWordProbsAdd_Measure2_4");
        options.addElement("LengthWordProblems_measure_2_7");
        options.addElement("LengthWordProbsAdd_Measure2_7");

        options.addElement("---- START Measure LEVEL 2.7 ----");
        options.addElement("HowMuchMoney_meaure2_7");
        options.addElement("HowMuchMoney_meaure2_3");
        options.addElement("HowMuchMoney_meaure2_6");
        options.addElement("HowMuchMoney_meaure2_6");

        options.addElement("---- START Measure LEVEL 3.1 ----");
        options.addElement("TimeWordProblems_measure3_1");
        options.addElement("TimeWordProblems_measure3_6");
        options.addElement("TimeWordProblems_measure3_3");
        options.addElement("TimeWordProblems_measure3_9");
        options.addElement("---- START Measure LEVEL 3.2 ----");
        options.addElement("QuartsToCups3_2");
        options.addElement("QuartsToCups3_4");
        options.addElement("QuartsToCups3_7");
        options.addElement("QuartsToCups3_8");

        options.addElement("---- START Measure LEVEL 4.1 ----");
        options.addElement("PoundsToOunces4_1");
        options.addElement("PoundsToOunces4_3");

        options.addElement("---- START Measure LEVEL 4.2 ----");
        options.addElement("HowMuchChangeMeasure4_2");

        options.addElement("HowMuchChangeMeasure4_3");
        options.addElement("---- START Measure LEVEL 4.3 ----");
        options.addElement("AreaOfSwimmingPoolMeasure4_3");
        options.addElement("---- START Measure LEVEL 4.5 ----");
        options.addElement("TypeOfAngle_measure_4_5");
        options.addElement("TypeOfAngle_measure_4_9");
        options.addElement("---- START Measure LEVEL 5.1 ----");
        options.addElement("FeetToInches");
        options.addElement("FeetToInches5_0");
        //geometry
        options.addElement("---- START Geometry LEVEL 3.1 ----");
        options.addElement("HowManySides_geo3_1");
        options.addElement("WhatShapeHas_geo3_1");
        options.addElement("---- START Geometry LEVEL 6.2 ----");
        options.addElement("RectangularPrismVolumeGeo6_2");
        options.addElement("---- START Geometry LEVEL 6.3 ----");
        options.addElement("MissingCoordinateGeo6_3");
        options.addElement("MissingCoordinateGeo6_7");
        //fractions
        options.addElement("---- START Fractions LEVEL 3.3 ----");
        options.addElement("SimplifyFraction_3_1");
        options.addElement("SimplifyFraction_3_3");
        options.addElement("SimplifyFraction_3_5");
        options.addElement("SimplifyFraction_3_6");
        options.addElement("DivideNumByDenom_3_3");
        options.addElement("---- START Fractions LEVEL 4.1 ----");
        options.addElement("EquivalentFraction4_0");
        options.addElement("EquivalentFraction4_1");
        options.addElement("SimplifyBiggerFractions4_1");
        options.addElement("SimplifyBiggerFractions4_4");
        options.addElement("---- START Fractions LEVEL 4.3 ----");
        options.addElement("AddingFractions4_3");
        options.addElement("---- START Fractions LEVEL 4.4 ----");
        options.addElement("MultiplyingFractions4_4");
        options.addElement("---- START Fractions LEVEL 4.5 ----");
        options.addElement("AddOver10and100_fraction4_5");
        options.addElement("AddOver10and100_fraction4_8");
        options.addElement("AddOver10and100_fraction4_9");
        options.addElement("---- START Fractions LEVEL 4.6 ----");
        options.addElement("FractionToDecimal4_6");
        options.addElement("---- START Fractions LEVEL 4.7 ----");
        options.addElement("DecimalLessThan_Fractions4_7");
        options.addElement("DecimalLessThan_Fractions4_9");
        options.addElement("---- START Fractions LEVEL 5.1 ----");
        options.addElement("AddingUnlikeDenominators5_1");
        options.addElement("---- START Fractions LEVEL 5.2 ----");
        options.addElement("FractionWordAddition5_2");
        options.addElement("FractionWordAddition5_7");
        options.addElement("---- START Fractions LEVEL 5.3 ----");
        options.addElement("Division_fraction5_3");
        options.addElement("---- START Fractions LEVEL 5.4 ----");
        options.addElement("FractionsMultiply5_4");
        options.addElement("---- START Fractions LEVEL 5.6 ----");
        options.addElement("FractionWordProblem");
        options.addElement("FractionWordProblem_5_8");

        //GENE START
        options.addElement("---- START Algebra LEVEL 3.8 ----");
        options.addElement("WordProblemPetStore_3_8");
        options.addElement("---- START Algebra LEVEL 3.9 ----");
        options.addElement("InOutPlus_3_9");
        options.addElement("InOutMultiply_3_9");
        options.addElement("---- START Algebra LEVEL 4.0 ----");
     //   options.addElement("InOutPlus_4_0");
      //  options.addElement("InOutMultiply_4_0");
        options.addElement("---- START Algebra LEVEL 4.2 ----");
        options.addElement("WordProblemMoneyMultiply_4_2");
        options.addElement("---- START Algebra LEVEL 4.3 ----");
        options.addElement("Money_WordProblem_multiStep");
        options.addElement("---- START Algebra LEVEL 4.6 ----");
        options.addElement("sequence_of_numbers_alg_4_6");
        options.addElement("---- START Algebra LEVEL 4.7---");
        options.addElement("sequence_of_numbers_alg_4_7");
        options.addElement("---- START Algebra LEVEL 4.8 ----");
        options.addElement("sequence_of_numbers_alg_4_8");
        options.addElement("---- START Algebra LEVEL 4.9 ----");
        options.addElement("sequence_of_numbers_alg_4_9");
        options.addElement("---- START Algebra LEVEL 5.0 ----");
        options.addElement("MultiStepMath");
        options.addElement("---- START Algebra LEVEL 5.1 ----");
        options.addElement("MultiStepMath_5_1");
        options.addElement("---- START Algebra LEVEL 5.2 ----");
        options.addElement("MultiStepMath5_2");
        options.addElement("---- START Algebra LEVEL 5.3 ----");
      //  options.addElement("WriteOutHundredsPlace");
    //    options.addElement("WriteOutThousandsPlace");
        options.addElement("---- START Fraction LEVEL 5.7 ----");
        options.addElement("FractionDivision_5_6");

        options.addElement("---- START Fraction LEVEL 5.7 ----");
        options.addElement("FractionDivision");
        options.addElement("---- START Fraction LEVEL 5.8 ----");
        options.addElement("FractionDivision_5_8");
        options.addElement("---- START Fraction LEVEL 5.9 ----");
        options.addElement("FractionDivision_5_9");

        options.addElement("---- START Fraction LEVEL 6.0 ----");
        options.addElement("FractionDivision_6_0");
        options.addElement("---- START Equations LEVEL 6.1 ----");
        options.addElement("PMDAS_6_1");
        options.addElement("PMDAS_6_0");
        options.addElement("---- START Expressions LEVEL 6.2 ----");
        options.addElement("Which_ProductOf_x_Y");
        options.addElement("---- START Expressions LEVEL 6.3 ----");
        options.addElement("WhichExp_Equiv");
        options.addElement("---- START Expressions LEVEL 6.4 ----");
        options.addElement("WhichExpressEquiv_6_4");
        options.addElement("---- START Expressions LEVEL 6.5 ----");
        options.addElement("WhichMakeStatementTrue");
        options.addElement("---- START Expressions LEVEL 6.6 ----");
        options.addElement("ExpressionWordProblem_6_6");
        options.addElement("ExpressionWordProblem_6_9");
        options.addElement("---- START Expressions LEVEL 6.7 ----");
        options.addElement("SolveEquations");
        options.addElement("---- START Expressions LEVEL 6.8 ----");
        options.addElement("Inequality");
        options.addElement("---- START Expressions LEVEL 6.9 ----");
        options.addElement("Expressions_6_9");
        
        
        /******** Karloo new stuff starts here****************************/
        options.addElement("---- Karl new stuff ----");
        options.addElement("---- Week 1 & 2 ----");
        //base10 5.2
        options.addElement("DivideByTenPower5_2");
        //base10 5.2
        options.addElement("TimesTenPower5_2");
        //fractions 5.2
        options.addElement("JohnReadWordProb5_2");
        //fractions 5.6
        options.addElement("aBatchOfWordProb5_6");
        //fractions 5.7
        options.addElement("NumberDivideByFraction5_7");
        //algebra 5.1
        options.addElement("MultiStepDivisionFirst5_1");
        //algebra 5.1
        options.addElement("MultiStepWithDivision5_1");
        //algebra 5.2
        options.addElement("FindProductTakeAway5_2");
        //ratios 6.1
        options.addElement("WordProbCookiesRatio6_1");
        //ratios 6.2
        options.addElement("MilesWordProblem6_2");
        //numberSystem 6.1
        options.addElement("HowManyServingsWordProb6_1");
        //numberSystem 6.3
        options.addElement("SubtractionDecimals6_3");
        options.addElement("MultiplicationClass6_3");
        options.addElement("DivisionClass6_3");
        //numberSystem 6.4
        options.addElement("GreatestCommonFactor6_4");
        //numberSystem 6.4
        options.addElement("LeastCommonMultiple6_4");
        //numberSystem 6.6
        options.addElement("NegativeNegativeNumber6_6");
        //numberSystem 6.7
        options.addElement("AbsoluteValue6_7");
        //equations 6.1
        options.addElement("ToThePower6_1");
        //equations 6.2
        options.addElement("whichExpressionXsubFromY6_2");
        //equations 6.3
        options.addElement("whichExpression2_4PlusX_");
        //equations 6.4
        options.addElement("xPlusXPlusXPlusXEquals6_4");
        //equations 6.5
        options.addElement("equation4xEquals20");
        //equations 6.7
        options.addElement("numberPlusXEqualsNumber6_7");
        //statistics 6.5
        options.addElement("FindMedianModeMean");
        //measure 5.1
        options.addElement("CupsToOunces5_1");
        options.addElement("PintsToQuarts5_1");
        options.addElement("QuartsToGallons5_1");
        options.addElement("CupsToPints");
        options.addElement("OuncesToCups5_1");
        options.addElement("FeetToYards5_1");
        options.addElement("MillitersToLiters5_1");
        options.addElement("LitersToMilliliters5_1"); 
        
        options.addElement("---- Week 3 ----");
        options.addElement("Subtracting5_1");
        options.addElement("LeastValue4_7");
        options.addElement("GreatestValue4_7");
        options.addElement("MoreThanHalf4_6");//fractions
        options.addElement("LessThanHalf4_6");//fractions
        options.addElement("EqualToHalf4_6");//fractions
        options.addElement("HundredAndTen4_5"); //fractions
        options.addElement("GreatestCommonFactor4_4"); //algebra
        options.addElement("LCM_alg4_4"); //algebra
        options.addElement("WholeTimesFrac4_4"); //fractions
        options.addElement("MuffinsWord4_3"); //algebra
        options.addElement("AreaGarden4_3"); //measurement
        options.addElement("SeveralFractions4_3"); //fraction
        options.addElement("AddingWithWhole4_3"); //fraction
        options.addElement("SubtractingWithWhole4_3"); //fraction
        options.addElement("BakerySold4_2"); //alg
        options.addElement("ChrisBought4_2"); //measure
        options.addElement("GreaterLessOrEqualFraction4_2"); //frac
        options.addElement("CupsToPints4_1"); //measure
        options.addElement("HoursToMinutes4_1"); //measure
        options.addElement("YardsToFeet4_1"); //measure
        
        options.addElement("---- Week 4 ----");
        options.addElement("TimesAsManyAs4_1");
        options.addElement("Equivalent2_4_1");
        options.addElement("Equivalent3_4_1");
        options.addElement("MathHomework3_8");
        options.addElement("JakeHasBooks3_3");
        options.addElement("GreaterLessOrEqualFraction4_2");
        options.addElement("greaterLessThan3_3");
        options.addElement("greaterLessThanSameNum3_3");
        options.addElement("MovieTheaterHas3_2");
        options.addElement("GallonsCups3_2");
        options.addElement("QuartsPints3_2");
        options.addElement("PintsCups3_2");
        options.addElement("GallonsQuarts3_2");
        options.addElement("TedHomework3_1");
        options.addElement("BaseballGame3_1");
        
        options.addElement("---- Week 5 ----");
        options.addElement("49=_");
        options.addElement("62+8=");
        options.addElement("Which_Statement_True_1_3_alg");
        options.addElement("WordProb_Within20");
        options.addElement("Base10_8_9_10_blank_1_1");
        
        AllOptions = options;

// ComboBox Items have gotten from Data Base initially.
        algoselect.setModel(new javax.swing.DefaultComboBoxModel(options));

    }

    public void Save(String location, Vector questions, boolean append) {
        try {
            FileWriter fw = new FileWriter(location, append); //the true will append the new data
            CapitalizeFirstLetter c = new CapitalizeFirstLetter();
            FruitsPluralizer fruitcheck = new FruitsPluralizer();
            //  PrintWriter out = new PrintWriter(location);

            String question = "";
            String A = "";
            String B = "";
            String C = "";
            String D = "";
            String E = "";
            String Correct_Select = "";
            int qzid = Integer.parseInt(quizid.getText());
            String hint = "";
            String hintimg = "";
            String level = "";
            String subject = "";
            String subjecttype = "";
            String uid = "";
            String sid = "";
            String img = "";
            //generate sql code
            sqlcode = "INSERT INTO question_bank VALUES";
            for (int i = 0; i < questions.size(); i++) {
                String Raw_Row = questions.elementAt(i).toString();
                Raw_Row = Raw_Row.substring(1, Raw_Row.length() - 1);
                //  Raw_Row = Raw_Row.replaceAll("]", "");
                System.out.println(Raw_Row);

                StringTokenizer st = new StringTokenizer(Raw_Row, ",");
                //  while (st.hasMoreTokens()) {
                qzid = qzid++;
                int qid = qzid;
                try {
                    question = st.nextToken();
                    A = st.nextToken();
                    B = st.nextToken();
                    C = st.nextToken();
                    D = st.nextToken();
                    E = st.nextToken();
                    Correct_Select = st.nextToken();
                    //   st.nextToken(); QID goes here
                    hint = st.nextToken();
                    hintimg = st.nextToken();
                    level = st.nextToken();
                    subject = st.nextToken();
                    subjecttype = st.nextToken();
                    subjecttype = subjecttype.toUpperCase();
                    uid = st.nextToken();
                    sid = st.nextToken();
                    img = st.nextToken();
                } catch (Exception e) {
                }
                //            subjecttype = st.nextToken();
                if (i > 0) {
                    sqlcode = sqlcode + ",";
                }
                // }
                qid = qid + i;
                quizid.setText("" + (qid + 1));
                if (question.contains("~")) { //escape char for , 
                    question = question.replaceAll("~", ",");
                }
                //    question = c.Capitalize(question); // capitalize the first letter and after period
                question = fruitcheck.CheckFruitPlural(question); // check if contains a fruit and if plural

                hint = hint.replaceAll(">", ","); // custom escape char for commas 
                hint = hint.replaceAll("~", ","); // custom escape char for commas 
                hint = hint.replaceAll("@", ">"); // custom escape char for > 
                //  hint = hint.replaceAll("@1", ">"); // custom escape char for commas

                //  hint = c.Capitalize(hint); // capitalize the first letter and after period
                hint = fruitcheck.CheckFruitPlural(hint); // check if contains a fruit and if plural

                sqlcode = sqlcode + "("
                        + "'" + question + "',"
                        + "'" + A.trim() + "',"
                        + "'" + B.trim() + "',"
                        + "'" + C.trim() + "',"
                        + "'" + D.trim() + "',"
                        + "'" + E.trim() + "',"
                        + "'" + Correct_Select.trim() + "',"
                        + qid++ + ","
                        + "'" + hint.trim() + "',"
                        + "'" + hintimg.trim() + "',"
                        + "'" + level.trim() + "',"
                        + "'" + subject.trim() + "',"
                        + "'" + subjecttype.trim() + "',"
                        + uid.trim() + "," + sid.trim() + ","
                        + "''"
                        + ")";

                //  out.println(sqlcode);
            }
            sqlcode = sqlcode + ";";
            // out.println("\n");
            fw.write("\n");
            fw.write(sqlcode);
            fw.close();
            //   out.println(sqlcode);
            //   out.close();
            // Add save code here
            System.out.println(sqlcode);
            sqlcode = "";

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Hint;
    private javax.swing.JComboBox algoselect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox level_select;
    private javax.swing.JTextField question_sel;
    private javax.swing.JTextField quizid;
    private javax.swing.JTextField savelocation;
    // End of variables declaration//GEN-END:variables
}
