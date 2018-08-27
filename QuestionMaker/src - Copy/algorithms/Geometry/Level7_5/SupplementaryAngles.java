/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level7_5;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class SupplementaryAngles {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";   
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // first angle
        int second = 0; // second angle
        int third = 0; // number a in ax + b
        int fourth = 0; // number b in ax + b
        String equation = "";
        int other_threshold = 20;
        int other_threshold_low = 2;
        int correct_answer = 0; // value of x in ax + b
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold; // between 1 and 89
            second = 180 - first;
            third = rn.nextInt(other_threshold - other_threshold_low) + other_threshold_low;
            fourth = rn.nextInt(other_threshold - other_threshold_low) + other_threshold_low;
            equation = "(" + third + "x" + " - " + fourth + ")";
            correct_answer = (second + fourth) / third;

            if ((second + fourth) % third == 0 && correct_answer >= 0) { // answer is a whole integer and >= 0              
                // add question
                String question = "Two angles, one " + first + "° and one " + equation + "°, are supplementary. Find the value of x";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement("x = " + correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, third, fourth, correct_answer);
                if (answer == correct_answer){
                    answer += 5;
                }
                results.addElement("x = " + answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = plusOne(first, second, correct_answer);
                results.addElement("x = " + answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = minusOne(first, second, correct_answer);
                results.addElement("x = " + answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                if (randomNum == correct_answer) {
                    randomNum += 3;
                }
                results.addElement("x = " + randomNum);
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
    
    public int Inverse(int first, int second, int third, int fourth, int correct) {
        int answer = (second - fourth) / third;
        return answer;
    }

    public int plusOne(int first, int second, int correct) {

        return correct + 2;
    }

    public int minusOne(int first, int second, int correct) {
        int result = correct - 3;
        if(result < 0){
            result = 0;
        }
        if(result == correct){
            result += 10;
        }
        return result;
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

    public String CreateHint(String hint, double correct_answer, int first, double second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Two angles are supplementary if the sum of their measures is 180 degrees.";

        } else {
            results = hint;
        }

        return results;
    }
}
