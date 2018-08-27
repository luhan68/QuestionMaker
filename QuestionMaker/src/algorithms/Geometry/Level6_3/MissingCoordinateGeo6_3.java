/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level6_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MissingCoordinateGeo6_3 {
    public String HintImg = "numberline3.png";
    public String SubjectType = "Geometry";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0; // 
        int third = 0; // 
        int fourth = 0;
        String correct_answer = ""; //  
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = makeCoordinate(fourth, third); 
            
            if (third != fourth && first != fourth) { // matches criteria
                // add question
                String question = " On a coordinate plane are the three vertices of a rectangle at the points " + makeCoordinate(first,second)
                        + ", " + makeCoordinate(first,third) + ", and " + makeCoordinate(fourth,second)
                        + ". What is the coordinate of the fourth vertex?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // 
                results.addElement(makeCoordinate(fourth, first));
                inverse_used = true;
            } else if (plusone_used == false) { // 
                results.addElement(makeCoordinate(third, fourth));
                plusone_used = true;
            } else if (minusone_used == false) { // 
                results.addElement(makeCoordinate(first, fourth));
                minusone_used = true;
            } else { // random
                String answer = correct_answer;
                if (results.contains(answer) || answer.equals(correct_answer)) {
                    int randomNumOne = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int randomNumTwo = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    answer = makeCoordinate(randomNumOne, randomNumTwo);
                }
                results.addElement(answer);
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
    
    public String makeCoordinate(int a, int b){
        String coordinate = "(" + a + ", " + b + ")";
        return coordinate;
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
            results = "Use the sketch pad. Draw a coordinate plane and plot the coordinates.";

        } else {
            results = hint;
        }

        return results;
    }
}
