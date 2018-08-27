/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level4_7;

import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class LeastValue4_7 {
    public String HintImg = "placechart_decimals.png";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int one = 0;
        int two = 0;
        int three = 0;
        String first = ""; // 
        String second = "";// 
        String third = ""; //
        String fourth = "";
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction();  
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            one = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            two = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            three = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = one + "." + two + three;
            first = three + "." + two + one;
            second = two + "." + three + one;
            third = three + "." + one + two;
            fourth = two + "." + one + three;
            
            double correctAsDub = Double.parseDouble(correct_answer);
            
            if (correctAsDub < Double.parseDouble(first) && correctAsDub < Double.parseDouble(second)
                    && correctAsDub < Double.parseDouble(third) && correctAsDub < Double.parseDouble(fourth)
                    && one != two && one != three && two != three) { 
                //add question
                String question = "Which number has the least value?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
            
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //
                results.addElement(first);
                inverse_used = true;
            } else if (plusone_used == false) { // 
                results.addElement(second);
                plusone_used = true;
            } else if (minusone_used == false) { // 
                results.addElement(third);
                minusone_used = true;
            } else { // 
                results.addElement(fourth);
            }
        }
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
  
    public String HintImg() {
        return HintImg;
    }

    public String SubjectType() {
        return SubjectType;
    }

    public String SubjectImage() {
        return SubjectImage;
    }

    public String RandomAnswer(int selection) {
        String results = "";

        if (selection == 1) {
            results = "optionA";
        } else if (selection == 2) {
            results = "optionB";
        }
        if (selection == 3) {
            results = "optionC";
        }
        if (selection == 4) {
            results = "optionD";
        }
        if (selection == 5) {
            results = "optionE";
        }

        return results;
    }

    public String CreateHint(String hint, String correct_answer, String first, String second, String third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Use the decimal place chart.";
        } else {
            results = hint;
        }

        return results;
    }
}
