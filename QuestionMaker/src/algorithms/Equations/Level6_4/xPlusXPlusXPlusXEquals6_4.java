/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Equations.Level6_4;

import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class xPlusXPlusXPlusXEquals6_4 {
    public String HintImg = "";
    public String SubjectType = "Equations";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;

        Random rn = new Random();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(5) + 2;
            
            correct_answer = first + "x";
            
            if (true) {
                // add question
                String additionLine = "x";
                for(int i = 0; i < first-1; i++){
                    additionLine = additionLine + " + x";
                }
                String question = "Which expression is equivalent to "
                        + additionLine + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //-1
                int value = first - 1;
                String wrong = value + "x";
                if(value <= 1){
                    wrong = "x";
                }
                results.addElement(wrong);
                inverse_used = true;
            } else if (plusone_used == false) { //+1
                int value = first + 1;
                String wrong = value + "x";
                results.addElement(wrong);
                plusone_used = true;
            } else if (minusone_used == false) { //+2
                int value = first + 2;
                String wrong = value + "x";
                results.addElement(wrong);
                minusone_used = true;
            } else { // +1y
                int value = first + 1;
                String wrong = value + "y";
                results.addElement(wrong);
            }

        }
        //remove duplicates
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

    public String CreateHint(String hint, String correct_answer, int first, int second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use inverse operations to solve the equation.";
        } else {
            results = hint;
        }

        return results;
    }
}
