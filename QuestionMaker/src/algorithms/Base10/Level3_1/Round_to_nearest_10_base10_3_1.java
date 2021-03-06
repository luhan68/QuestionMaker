/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level3_1;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Round_to_nearest_10_base10_3_1 {
    public String HintImg = "rounding_chart.png"; // rounding charts
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int correct_answer = 20;
        int Random_correct_letter = 0;
        int random_second = 0;
        int round_to = 10; // round to nearest 10
        boolean round_100s_up = false;
        boolean round_100s_down = false;
        boolean inverse_used = false;
        boolean rounded_down = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            correct_answer = round(first, round_to);
            if(correct_answer <= first){ 
                rounded_down = true; // needed for inverse()
            }
            if (first >= low_threshold && first <= high_threshold) {
                String question = "Round " + first + " to the nearest 10.";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the wrong answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // round in the opposite direction
                int answer = Inverse(correct_answer, round_to, rounded_down);
                results.addElement(answer);
                inverse_used = true;
            } else if (round_100s_up == false) { // round by 100s up
                int answer = 100;
                results.addElement(answer);
                round_100s_up = true;
            } else if (round_100s_down == false) { // round by 100s down
                int answer = 0;
                results.addElement(answer);
                round_100s_down = true;
            } else { // random question within the threshold
                boolean isDuplicate = true;
                int randomanswer = 0;
                
                while (isDuplicate == true) { // check for duplicates
                    randomanswer = rn.nextInt(high_threshold) + 1;
                    if (randomanswer != correct_answer && !results.contains(randomanswer)) {
                        isDuplicate = false;
                    }
                }             
                results.addElement(randomanswer);
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

    public int round(int first, int round_to){
        int rounded = 0;
        int remainder = first % round_to;
        if(remainder < round_to/2){
            rounded = first - remainder;
            return rounded;
        }
        else{
            rounded = first + (round_to - remainder);
            return rounded;
        }
    }
    public int Inverse(int correct, int round_to, boolean rounded_down) {
        // round in the opposite direction
        int results = 0;
        if(rounded_down == true){
            results = correct + round_to;
        }
        else{
            results = correct - round_to;
        }
            
        return results;
    }

    public int to_100() {

        int results = 100;
        return results;
    }

    public int to_0() {

        int results = 0;
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
            results = "Use rounding chart.";

        } else {
            results = hint;
        }

        return results;
    }
}
