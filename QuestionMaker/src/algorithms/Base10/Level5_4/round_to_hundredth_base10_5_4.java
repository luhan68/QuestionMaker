/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level5_4;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class round_to_hundredth_base10_5_4 {
    public String HintImg = "placechart_decimals.png";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int first_decimal = 0;
        double first_complete = 0;
        int decimal_high_threshold = 999;
        int decimal_low_threshold = 100;
        double correct_answer = 20;
        int Random_correct_letter = 0;
        int random_second = 0;
        int round_to = 3; 
        boolean round_10 = false;
        boolean round_100 = false;
        boolean inverse_used = false;
        boolean rounded_down = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            
            first = rn.nextInt(high_threshold) + 1;
            int decimal =0;
            boolean foundit = false;
            while(foundit ==false){
                if(decimal < 1000 && decimal > 99){
                foundit = true;    
                }
                else{
                    decimal = rn.nextInt(999);
                }
                
            }       
          
            String temp = first + "." + decimal;
            correct_answer = Double.parseDouble(temp);
            correct_answer = round(correct_answer, 2);
           
            if (first >= low_threshold && first <= high_threshold) {
                String question = "Round " + first + "." + decimal + " to the nearest hundredth";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the wrong answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // round in the opposite direction
                String answer = Inverse(correct_answer +3, rounded_down);
                results.addElement(answer);
                inverse_used = true;
            } else if (round_10 == false) { // round by 10s
                double answer = round(correct_answer + 1, 2);
                results.addElement(answer);
                round_10 = true;
            } else if (round_100 == false) { // round by 1000s
                double answer = round(correct_answer +2, 3);
                results.addElement(answer);
                round_100 = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;         
                results.addElement(randomanswer);
            }

        }
        
      //  eliminateDuplicates(results, correct_answer, high_threshold, low_threshold, Random_correct_letter);
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, first));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
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
     
  
    public String Inverse(double correct, boolean rounded_down) {
        // round in the opposite direction
     
       
        return correct + "0";
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

    public String CreateHint(String hint, int first) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use the decimal place chart.";

        } else {
            results = hint;
        }

        return results;
    }
}
