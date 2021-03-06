/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.NumberSystem.Level6_4;

import Fractions.Fraction;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class LeastCommonMultiple6_4 {
    public String HintImg = "";
    public String SubjectType = "NumberSystem";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0; // 
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;

        Random rn = new Random();
        Fraction mathHelper = new Fraction();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            correct_answer = mathHelper.findLCM(first, second);
            
            if (correct_answer > first && correct_answer < 30 && first != second) { 
                // add question
                String question = "What is the least common multiple of "
                        + first + " and " + second + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //use LCM
                int wrong = mathHelper.findGCD(first, second);
                results.addElement(wrong);
                inverse_used = true;
            } else if (plusone_used == false) { //  + 5
                results.addElement(correct_answer + 5);
                plusone_used = true;
            } else if (minusone_used == false) { //  - 2
                results.addElement(correct_answer - 2);
                minusone_used = true;
            } else { // random
                int wrong = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                results.addElement(wrong);
            }

        }
        dupFix.eliminateIntAsStringDuplicates(results, subjectype, high_threshold,
                low_threshold, Random_correct_letter);
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second));
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
        // add syntax for hint image generation here
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

    public String CreateHint(String hint, int correct_answer, int first, int second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use the order of operations.";
        } else {
            results = hint;
        }

        return results;
    }
}
