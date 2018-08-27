/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level4_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class AreaOfSwimmingPoolMeasure4_3 {
    public String HintImg = "";
    public String SubjectType = "Measure";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0; // 
        int second = 0;// 
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
               
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold; //length
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold; // width
            correct_answer = second * first;
            
            String thing = randomThing();
            if (first != second) { //the question
                String question = "A rectangular " + thing + " has a length of " + first
                        + " feet and a width of " + second + " feet. What is the area of the " + thing + "?";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add instead
                int answer = first + second;
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // minus instead
                int answer = 0;
                if(first > second){
                    answer = first - second;
                }else{
                    answer = second - first;
                }
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // plus 3
                int answer = correct_answer + 3;
                if(results.contains(answer)){
                    answer = correct_answer + 6;
                }
                results.addElement(answer);
                minusone_used = true;
            } else { // random
                int answer = 0;
                do{
                    answer = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                }while(results.contains(answer));
                results.addElement(answer);
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
    
    public static String randomThing(){
        Random rn = new Random();
        int i = rn.nextInt(6);
        String thing = "";
        
        switch(i){
            case 0:
                thing = "swimming pool";
                break;
            case 1:
                thing = "garden";
                break;
            case 2:
                thing = "bedroom";
                break;
            case 3:
                thing = "classroom";
                break;
            case 4:
                thing = "field";
                break;
            case 5:
                thing = "park";
                break;
        }
        return thing;
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

    public String CreateHint(String hint, double correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Area of a rectangle = length x width.";
        } else {
            results = hint;
        }

        return results;
    }
}
