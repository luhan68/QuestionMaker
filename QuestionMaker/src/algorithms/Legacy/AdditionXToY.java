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
public class AdditionXToY {

    public Vector AddToX(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int correct_answer = 100;
        int Random_correct_letter = 0;
        //choose a random number between 1 and 10
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            second = rn.nextInt(high_threshold) + 1;
           
            correct_answer = first + second;
            if (correct_answer >= low_threshold && correct_answer <= high_threshold) { // matches criteria
                String question = first + " + " + second + " = ?";
                results.addElement(question);
                 Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            
            if(i == Random_correct_letter){ //this is the randomly selected letter
                results.addElement(correct_answer);
            }else{ // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;
                if(randomanswer == correct_answer){
                    randomanswer = randomanswer + 5;
                }
                results.addElement(randomanswer);
                
                }
            
        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        results.addElement(level);
        results.addElement(CreateHint(hint, correct_answer, first, second));
        
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
    
    
    
    public String CreateHint(String hint, int correct_answer, int first, int second){
        String results = "";
        if(hint.contains("Algorithm Generated")){
            results = "";           
            
        } else{
            results = hint;
        }
        
        
        
        return results;
    }
    
    
    
}
