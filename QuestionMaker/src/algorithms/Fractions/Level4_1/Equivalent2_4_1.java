/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level4_1;

import Fractions.Fraction;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Equivalent2_4_1 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // num
        int second = 0;// denom
        int third = 0;
        int fourth = 0;
        String correct_answer = ""; //shape
        int correct_int = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction(); 
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
        //    third = rn.nextInt(7 - 2) + 2;; //times random number between
            int multiplyBy = rn.nextInt(3) + 2;
            fourth = second * multiplyBy;
            correct_int = first * multiplyBy;
            correct_answer = correct_int + "";
            
            if (first < second) { //the question
                String question = "Make an equivalent fraction: "
                        + first + "/" + second + " = " + "?/" + fourth;
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
            } else if (plusone_used == false) { // +2
                results.addElement(correct_int + 2);
                plusone_used = true;
            } else if (minusone_used == false) { // -1
                int answer = correct_int - 1;
                if (answer < 1){
                    answer += 5;
                }
                results.addElement(answer);
                minusone_used = true;
            } else { // -
                int answer = 0;
                do {
                    answer = rn.nextInt(10 - 2) + 2;
                }while(results.contains(answer) || answer == correct_int);
                results.addElement(answer);
            }
        }
        
        dupFix.eliminateIntAsStringDuplicates(results, ""+correct_answer, high_threshold,
                low_threshold, Random_correct_letter);
        
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Multiply the numerator and the denominator by the same number.";
        } else {
            results = hint;
        }

        return results;
    }
}
