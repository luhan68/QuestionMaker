/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level1_1;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Base10_8_9_10_blank_1_1 {
    public String HintImg = ""; // NUMBER LINE
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int correct_answer = 1000;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            correct_answer = first + 3;
            
            if (correct_answer >= low_threshold && correct_answer <= high_threshold) { // matches criteria
                String question =  "Fill in the blank: " + first + ", " + (first+1)
                        + ", " + (first+2) + ", __";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, correct_answer);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = plusone(correct_answer);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = minusone(correct_answer);
                results.addElement(answer);
                minusone_used = true;
            } else { // add 5 to correct answer
                int answer = plusfive(first);
                results.addElement(answer);
            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public int Inverse(int first, int correct) {
        int results = 0;
        // This method creates an answer that is the inverse operation of the correct answer

       results = first - 1;

        return results;
    }

    public int plusone(int correctanswer) {

        int results = correctanswer + 1;

        return results;
    }

    public int minusone(int correctanswer) {

        int results = correctanswer - 1;
        if (results < 1) {
            results = 0;
        }
        return results;
    }
    
    public int plusfive(int first) {

        int results = first + 5;
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

    public String CreateHint(String hint, int correct_answer, int first) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "numberline";

        } else {
            results = hint;
        }

        return results;
    }
}
