/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Legacy;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Gene
 */
public class MultiplyXbyY {

    public Vector Multiply(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int correct_answer = 100;
        int Random_correct_letter = 0;
        int max_num = 0;
        int low_num = 0;

        //choose a random number between 1 and 10
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds

            // start with the max threshold
            first = rn.nextInt(high_threshold ) + 1;
            second = rn.nextInt(high_threshold / first ) + 1;
          
            
            if (first * second <= high_threshold) {
                correct_answer = first * second;
                if (first > second) {
                    max_num = first;
                    low_num = second;
                } else {
                    max_num = second;
                    low_num = first;
                }
                String question = first + " x " + second + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D
                found = true;
            }

        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;
                results.addElement(randomanswer);
            }

        }
        //add in the hint and level
         results.addElement(RandomAnswer(Random_correct_letter));
        results.addElement(level);
        results.addElement(CreateHint(hint, correct_answer, max_num, low_num));

        return results;
    }

    public String CreateHint(String hint, int correct_answer, int max_num, int low_num) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            String script = "";
            for (int i = 0; i < low_num; i++) {
                if (i == 0) {
                    script = max_num + "";
                } else {
                    script = script + " + " + max_num;
                }

            }

            results = "Try Adding " + script;

        } else {
            results = hint;
        }

        return results;
    }
  public String RandomAnswer(int selection){
        String results = "";
         if(selection == 1){
            results = "optionA";
        }else  if(selection == 2){
           results = "optionB"; 
        } if(selection == 3){
            results = "optionC";
        } if(selection == 4){
            results = "optionD";
        } if(selection == 5){
            results = "optionE";
        } 
        
        
        
        
        return results;
    }
    
}
