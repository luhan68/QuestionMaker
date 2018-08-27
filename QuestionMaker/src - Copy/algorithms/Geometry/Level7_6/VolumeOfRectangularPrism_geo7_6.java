/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level7_6;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class VolumeOfRectangularPrism_geo7_6 {
    public String HintImg = "";
    public String SubjectType = "Geometry";
    public String SubjectImage = "";
    
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // length
        int second = 0; // width
        int third = 0; // height
        int correct_answer = 0; // area 
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        String measurement = "";
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = first * second * third; // A = (1/2)bh
            
            measurement = oneMeasurement();
            
            if (first * second % 2 == 0) { // matches criteria
                // add question
                String question = "Find the volume of a rectangular prism with length " + first + measurement
                        + ", width " + second + measurement + ", and height " + third + measurement + ".";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + " cubic" + measurement);
            } else if (inverse_used == false) { // 
                int answer = Inverse(first, second, correct_answer);
                if (answer == correct_answer){
                    answer += 5;
                }
                results.addElement(answer + " cubic" + measurement);
                inverse_used = true;
            } else if (plusone_used == false) { // 
                int answer = plusOne(first, second, correct_answer);
                results.addElement(answer + " cubic" + measurement);
                plusone_used = true;
            } else if (minusone_used == false) { // 
                int answer = minusOne(first, second, correct_answer);
                results.addElement(answer + " cubic" + measurement);
                minusone_used = true;
            } else { // random
                int randomNum = correct_answer;
                if (results.contains(randomNum) || randomNum == correct_answer) {
                    randomNum = rn.nextInt(100) + 1;
                }
                results.addElement(randomNum + " cubic" + measurement);
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
    
    public String oneMeasurement(){
        Random rn = new Random();
        int i = rn.nextInt(3);
        String measurement = "";
        
        switch(i){
            case 0:
                measurement = " cm";
                break;
            case 1:
                measurement = " m";
                break;
            case 2:
                measurement = " in";
                break;
            default:
                measurement = " INVALID";
                break;
        }
        return measurement;
    }
    
    public int Inverse(int first, int second, int correct) {
        int answer = first * second / 2;        
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

    public String CreateHint(String hint, int correct_answer, int first, int second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "The volume of a rectangular prism is V = lwh";

        } else {
            results = hint;
        }

        return results;
    }
}