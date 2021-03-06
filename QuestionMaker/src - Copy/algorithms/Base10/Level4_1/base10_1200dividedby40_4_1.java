/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level4_1;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class base10_1200dividedby40_4_1 {
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean inverse_used = false;
        boolean plusone_used = false;
        boolean minusone_used = false;
        int other_threshold = 100;
        
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            first = first - (first % 100);
            second = rn.nextInt(other_threshold - 20) + 20;
            second = second - (second % 10);
            correct_answer = first / second;
            
            if (first % second == 0 && correct_answer % 10 == 0) {
                String question = first + " / " + second + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the wrong answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // round in the opposite direction
                int answer = Inverse(correct_answer, first, second, high_threshold);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) {
                int answer = plusone(correct_answer, first, second, high_threshold);
                if (answer > high_threshold){
                    answer = answer - 10;
                }
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) {
                int answer = minusone(correct_answer, first, second);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                boolean isDuplicate = true;
                int randomanswer = 0;
                
                while (isDuplicate == true) { // check for duplicates
                    randomanswer = rn.nextInt(1000) + 10;
                    if (randomanswer != correct_answer && !results.contains(randomanswer)) {
                        isDuplicate = false;
                    }
                }             
                results.addElement(randomanswer);
            }

        }
        
        eliminateDuplicates(results, correct_answer, high_threshold, low_threshold, Random_correct_letter);
        
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
    

    public int Inverse(int correct, int first, int second, int threshold) { //add or take off a zero
        int results = 0;
        results = correct * 10;
        if(results > threshold){
            results = results / 100;
        }            
        return results;
    }

    public int plusone(int correct, int first, int second, int threshold) {
        int results = correct + 10;
        if(results > threshold){
            results -= 20;
        }
        return results;
    }

    public int minusone(int correct, int first, int second) {
        int results = correct - 10;
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

    public String CreateHint(String hint, int correct_answer, int first, int second) {
        while(first % 10 == 0){
            first = first / 10;
        }
        while(second % 10 == 0){
            second = second / 10;
        }
        
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = first + " / " + second + " = " + (first / second);

        } else {
            results = hint;
        }

        return results;
    }
}
