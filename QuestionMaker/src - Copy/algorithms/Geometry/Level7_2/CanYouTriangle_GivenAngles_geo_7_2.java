/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level7_2;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class CanYouTriangle_GivenAngles_geo_7_2 {
    public String HintImg = "";
    public String SubjectType = "Geometry";
    public String SubjectImage = "";   
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // angle
        int second = 0;// angle
        int third = 0;// angle
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean other_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = 180 - first - second;
            int shortSideOne = 0;
            int shortSideTwo = 0;
            int longSide = 0;
            
            // determine if triangle
            if(third < 1){
                correct_answer = "No triangle";
            }else{
                correct_answer = "More than one triangle";
            }
            
            if (true) { // matches criteria               
                // add question
                String question = "Determine whether you can construct a unique triangle,"
                        + " more than one triangle, or no triangle with the following conditions:~"
                        + " Angles of " + first + "°, " + second + "°, " + third + "°";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(3) + 1; // A,B,C
                found = true;
            }
        }
        for (int i = 1; i < 4; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) {
                String answer = Inverse(correct_answer);
                results.addElement(answer);
                inverse_used = true;
            } else if (other_used == false) {
                results.addElement("A unique triangle");
                other_used = true;
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
    
    public String Inverse(String correct) {
        if(correct.equals("More than one triangle")){
            return "No triangle";
        }else{
            return "More than one triangle";
        }
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

        return results;
    }

    public String CreateHint(String hint, String correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Remember you can make a triangle if:~"
                    + "The sum of the two shorter sides is greater than the length of the longest side"
                    + " and the sum of the angles in the triangle are exactly 180 degrees.";

        } else {
            results = hint;
        }

        return results;
    }
}
