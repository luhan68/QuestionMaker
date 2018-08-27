/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level3_2;

import RandomItems.CreateImageFromBase;
import RandomItems.GetRandomItems;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class WordProb_division_Alg_3_2 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";
    GetRandomNames names = new GetRandomNames();
    GetRandomItems rnd_items = new GetRandomItems();

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int other_threshold = 20;
        int correct_answer = 20;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;

        //Request Random Items
        String Name = names.OneName();
        String item = rnd_items.OneItem();

        while (found == false) { // try to produce a formula that is within the bounds

            first = rn.nextInt(high_threshold - low_threshold) + 1;
            first = first + low_threshold;
            
            second = rn.nextInt(other_threshold - low_threshold) + 1;
            second = second + low_threshold;
            
            correct_answer = first / second;
            
            if (first % second == 0) { // matches criteria
                String question = Name + " has " + first + " " + item + " that he wants to share with " + second
                        + " friends. How many " + item + " does each friend get?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, correct_answer);
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
                int randomanswer = rn.nextInt(first) + 1;
                results.addElement(randomanswer);
            }

        }
        
        eliminateDuplicates(results, correct_answer, high_threshold, low_threshold, Random_correct_letter);
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, item));
        results.addElement(HintImg(item, first, second));
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
            if(results.contains(current_element_value) && i != random_correct_letter){ // if value exists in vector and is not the correct answer
                do{
                    randomValue = rn.nextInt(high_threshold - low_threshold) + 1;
                    randomValue = randomValue + low_threshold;
                }while(results.contains(randomValue));  
                
                results.set(i, randomValue); // add new random value
            }
            else{ // value is not in vector
                results.set(i, current_element_value); // return original value
            }
        }
    }
    
    public int Inverse(int first, int second, int correct) {
        int results = 0;
            results = first - second;

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

    public String HintImg(String item, int first, int second) {
        // add syntax for hint image generation here
//CreateImageFromBase img = new CreateImageFromBase();
//String HintImg = img.Create(item, first, item, second,true, false ); // first bool is plud, second is minus




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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third, String item) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Divide " + first + " into " + second + " equal groups.";

        } else {
            results = hint;
        }

        return results;
    }
}
