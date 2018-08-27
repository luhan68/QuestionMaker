/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level2_3;

import java.util.Random;
import java.util.Vector;
import PlaceChart.WordsToNumbersPlace;

/**
 *
 * @author Karl
 */
public class WriteExpandedForm_base10_2_3 {
    public String HintImg = "placechart.png";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int other_threshold = 9;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        WordsToNumbersPlace helper = new WordsToNumbersPlace();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;

            correct_answer = helper.ExpandedForm(first);
            
            if (first <= high_threshold && first >= low_threshold) {
                String question = "What is " + first + " in expanded form?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add 100
                int number = first + 100;
                if(number > high_threshold){
                    number = first - 100;
                }
                String answer = helper.ExpandedForm(number);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // add 10
                int number = first + 10;
                if(number > high_threshold){
                    number = first - 10;
                }
                String answer = helper.ExpandedForm(number);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // minus 50
                int number = first - 50;
                if(number < low_threshold){
                    number = first + 50;
                }
                String answer = helper.ExpandedForm(number);
                results.addElement(answer);
                minusone_used = true;
            } else { // random number
                int randomanswer = first;
                while(randomanswer == first){
                    randomanswer = rn.nextInt(high_threshold - low_threshold) + low_threshold; 
                }
                String answer = helper.ExpandedForm(randomanswer);
                results.addElement(answer);
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Use place value chart. Match the digits to the correct column.";
        } else {
            results = hint;
        }

        return results;
    }
}
