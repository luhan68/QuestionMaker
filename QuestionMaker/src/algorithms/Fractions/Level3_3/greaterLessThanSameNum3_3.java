/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level3_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class greaterLessThanSameNum3_3 {
    public String HintImg = "";
    public String SubjectType = "fraction";
    public String SubjectImage = "fraction.png";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        
        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean inverse_used = false;
        String sign = "";
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = first;
            fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            if ((second) < fourth) { // eg: 3/6 > 3/8
                sign = " > ";
            } else if ((second) >fourth) {
                sign = " < ";
            } else {
                sign = " = ";
            }

            correct_answer = first + "/" + second + sign + third + "/" + fourth;
            if (first < second && third < fourth) { // matches criteria
                if (first != second) {
                    String question = "Which Statement Is True?";
                    results.addElement(question);
                    Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E

                    found = true;
                }
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random question within the threshold
                int one = 0;
                int two = 0;
                int three = 0;
                int four = 0;
                String theSign;
                
                do{                  
                    one = rn.nextInt(high_threshold - low_threshold) + low_threshold;//num
                    two = rn.nextInt(high_threshold - low_threshold) + low_threshold;//denom
                    three = one;//num
                    four = rn.nextInt(high_threshold - low_threshold) + low_threshold;//denom
                }while(one >= two || three >= four);
                
                if ((two) < four) {
                    theSign = " < ";
                } else if ((two) > four) {
                    theSign = " > ";
                } else {
                    theSign = " < ";
                }
                
                String wrong = one + "/" + two + theSign + three + "/" + four;
                results.addElement(wrong);
            }
        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, first, second, third));
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

    public String CreateHint(String hint, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "If the numerators are the same, look at the denominators."
                    + " Careful: a bigger denominator does not necessarily mean"
                    + " a bigger fraction.";
        } else {
            results = hint;
        }

        return results;
    }
}
