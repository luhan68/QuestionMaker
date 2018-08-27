/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionManipulation;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class DuplicateFixer {
    
    // answer format: 14
    public void eliminateIntDuplicates(Vector results, int correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        
        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                // if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                }while(results.contains(randomValue));
                
                results.set(i, randomValue); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    // same as eliminateIntDuplicates but answers are strings instead of ints
    // ex: the strings 12, 13.5, 566
    public void eliminateIntAsStringDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        String answer = "";
        
        for(int i = 1; i < 6; i++){ // convert all answer to strings
            String temp = "" + results.elementAt(i);
            results.set(i, temp);
        }
        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                // if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    answer = "" + randomValue;
                }while(results.contains(answer));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    // answer format: 12 + 14 = 26
    public void eliminateAdditionDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        String answer = "";
        String answer_flipped;
        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                //if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int randomValue2 = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int calculation = randomValue + randomValue2;
                    answer = randomValue + " + " + randomValue2 + " = " + calculation;
                    answer_flipped = randomValue2 + " + " + randomValue + " = " + calculation;
                }while(results.contains(answer) || results.contains(answer_flipped));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    //answer format: 12 + 14
    public void eliminateAdditionNoEqualDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        String answer = "";
        String answer_flipped;
        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                //if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int randomValue2 = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    answer = randomValue + " + " + randomValue2;
                    answer_flipped = randomValue2 + " + " + randomValue;
                }while(results.contains(answer) || results.contains(answer_flipped));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    // answer format: 12 < 110 
    public void eliminateSymbolDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        String answer = "";

        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                //if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold - 3) + low_threshold + 3;
                    int randomValue2 = randomValue - 2;
                    answer = randomValue + " < " + randomValue2;
                }while(results.contains(answer));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    // answer format: 9 with remainder of 5
    public void eliminateRemainderDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;
        String answer = "";

        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                //if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int randomRemainder = rn.nextInt(9) + 1;
                    answer = makeRemainderAnswer(randomValue, randomRemainder);
                }while(results.contains(answer));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
 
    // answer format: 1/3
    // this method is missing a way to check if any new random fraction is equivalent to
    // the correct answer (whether SIMPLIFIED or not)
    public void eliminateFractionDuplicates(Vector results, String correct_answer,
                        int high_threshold, int low_threshold, int random_correct_letter){
        
        Random rn = new Random();
        Object current_element_value = null;
        String answer = "";
        

        for(int i = 1; i < 6; i++){ // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if(results.contains(current_element_value) && i != random_correct_letter){
                //if value exists in vector and is not the correct answer
                do{
                    int randomDenom = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    int randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    answer = randomNum + "/" + randomDenom;
                }while(results.contains(answer));
                
                results.set(i, answer); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    //helper methods
    public String makeRemainderAnswer(int number, int remainder){
        // used by eliminateRemainderDuplicates 
        if(remainder != 0){
            return number + " with remainder of " + remainder;
        }else{
            return number + " with no remainder ";
        }
    }

    
    
}