/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level4_2;

import PlaceChart.WordsToNumbersPlace;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class ExpandedFormToNumberBase10_4_2 {
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        String first = "";
        int second = 0;
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        WordsToNumbersPlace helper = new WordsToNumbersPlace();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            correct_answer = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            first = helper.ExpandedForm(correct_answer);
            
            if (correct_answer <= high_threshold && correct_answer >= low_threshold) {
                String question = first + " =";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add 100
                int number = correct_answer + 100;
                if(number > high_threshold){
                    number = correct_answer - 100;
                }
                results.addElement(number);
                inverse_used = true;
            } else if (plusone_used == false) { // add 10
                int number = correct_answer + 10;
                if(number > high_threshold){
                    number = correct_answer - 10;
                }
                results.addElement(number);
                plusone_used = true;
            } else if (minusone_used == false) { // minus 50
                int number = correct_answer - 50;
                if(number < low_threshold){
                    number = correct_answer + 50;
                }
                results.addElement(number);
                minusone_used = true;
            } else { // random number
                int randomanswer = correct_answer;
                while(randomanswer == correct_answer){
                    randomanswer = rn.nextInt(high_threshold - low_threshold) + low_threshold; 
                }
                results.addElement(randomanswer);
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

    public String CreateHint(String hint, int correct_answer, String first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "";
        } else {
            results = hint;
        }

        return results;
    }
}
