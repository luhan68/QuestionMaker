/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Equations.Level6_2;

import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class whichExpressionXsubFromY6_2 {
    public String HintImg = "";
    public String SubjectType = "Equations";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0;
        int whichSign = 0;
        String sign = "";
        String wrongSign = "";
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;

        Random rn = new Random();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            whichSign = rn.nextInt(2); //randomize between + or - sign
            String addOrSub = "";
            if(whichSign == 0){
                sign = "+"; //0
                wrongSign = "-";
                addOrSub = "added to ";
            }else{
                sign = "-"; //1
                wrongSign = "+";
                addOrSub = "subtracted from ";
            }
            correct_answer = first + " " + sign + " x";
            
            if (second % first == 0 && second != first) {
                // add question
                String question = "Which expression represents x " + addOrSub
                        + first + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //add
                results.addElement(first + " " + wrongSign + " x");
                inverse_used = true;
            } else if (plusone_used == false) { //x in front (make sure its minus)
                results.addElement("x - " + first);
                plusone_used = true;
            } else if (minusone_used == false) { //other
                results.addElement(first+3 + " " + wrongSign + " x");
                minusone_used = true;
            } else { // x in front change other number
                results.addElement("x " + sign + " " + (first+1));
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
            results = "Think about the operation that is being used and in what order.";
        } else {
            results = hint;
        }

        return results;
    }
}
