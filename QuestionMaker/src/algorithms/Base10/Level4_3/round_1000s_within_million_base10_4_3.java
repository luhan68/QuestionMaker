/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level4_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class round_1000s_within_million_base10_4_3 {
    public String HintImg = "placechart.png"; // rounding charts
    public String SubjectType = "Base10";
    public String SubjectImage = "";

 public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int correct_answer = 20;
        int Random_correct_letter = 0;
        int random_second = 0;
        int round_to = 1000; // round to nearest 10
        boolean round_10 = false;
        boolean round_100 = false;
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
                String question = "Round " + first + " to the nearest 1000.";
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
            } else if (round_10 == false) { // round by 10s
                int answer = round(first, 10);
                results.addElement(answer);
                round_10 = true;
            } else if (round_100 == false) { // round by 1000s
                int answer = round(first, 100);
                results.addElement(answer);
                round_100 = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;         
                results.addElement(randomanswer);
            }

        }
        
        eliminateDuplicates(results, correct_answer, high_threshold, low_threshold, Random_correct_letter);
        
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

     public void eliminateDuplicates(Vector results, int correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        // replace suplicates with random numbers within threshold
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        
        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){ // value is in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + 1;
                    randomValue = randomValue + low_threshold;
                }while(results.contains(randomValue));  
                
                results.set(i, randomValue); // add new value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
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
        results = "Is " + first + " closer to " + (first - (first % 1000) + " or " + (first - (first % 1000) + 1000) + "?");

        } else {
            results = hint;
        }

        return results;
    }
}
