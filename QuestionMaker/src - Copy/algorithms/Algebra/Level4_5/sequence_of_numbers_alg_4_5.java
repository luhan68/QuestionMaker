/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level4_5;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class sequence_of_numbers_alg_4_5 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0; 
        int third = 0; 
        int correct_answer = 20;
        int other_threshold = 8;
        int Random_correct_letter = 0;
        String sequence = "";
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - 1) + 1; // starting number
        //    first = first + 1; // ensures first is not 1;           
            second = rn.nextInt(other_threshold) + 1; // add by this number
        //    second = second + 1; // ensure is not a 1;
            
            sequence = "" + first; // add one number in string
            for(int i = 0; i < 5; i++){ // add 5 more numbers in string
                first = first + second;
                sequence = sequence + "~ " + first;
            }
            sequence = sequence + "~ ___"; // add blank space
            
            correct_answer = first + second;
            
            if (correct_answer >= low_threshold && correct_answer <= high_threshold) {
                String question = sequence;
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, third, correct_answer);
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
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;            
                results.addElement(randomanswer);
            }
        }
        
        eliminateDuplicates(results, correct_answer, other_threshold, low_threshold, Random_correct_letter);
        
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
    
    public int Inverse(int first, int second, int third, int correct) {
        int results = 0;
        results = first - second; // using subtraction instead
        if (results < 0) {
            results = 0;
        }
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
        /*    results = "Factors are the numbers you multiply together to get another number."
                    + "~You can't multiply 7, 8, or 20 by another number and get 12 as your answer."
                    + "~Factors of 12- 1,2,3,4,6,12"
                    + "~Factors of 20- 1,2,4,5,10,20"
                    + "~They have 3 common factors 1,2,4, with 4 being the greatest.";*/
            results = "hi";
        } else {
            results = hint;
        }

        return results;
    }
}
