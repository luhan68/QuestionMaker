/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.NumberSystem.Level6_5;

import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class DebtNumber6_5 {
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
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            correct_answer = first * -1;
            
            if (true) { // matches criteria
                // add question
                String question = "Which number represents a debit of $" + first + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //make positive
                results.addElement(first);
                inverse_used = true;
            } else if (plusone_used == false) { // + 1
                results.addElement(correct_answer + 1);
                plusone_used = true;
            } else if (minusone_used == false) { //- 1
                results.addElement(correct_answer - 1);
                minusone_used = true;
            } else { // 
                int random = correct_answer;
                while(random == correct_answer || results.contains(random)){
                    random = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                }
                results.addElement(random);
            }

        }
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
            results = "Use the inverse to solve the problem.";
        } else {
            results = hint;
        }

        return results;
    }
}
