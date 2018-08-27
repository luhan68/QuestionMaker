/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level2_4;

import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class LengthWordProbsAdd_Measure2_4 {
    public String HintImg = "100schart.png";
    public String SubjectType = "Measure";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        GetRandomNames namesHelper = new GetRandomNames();
        
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            correct_answer = second + first;
            
            String nameOne = namesHelper.OneName();
            String nameTwo = namesHelper.OneName();
            if (!nameOne.equals(nameTwo) && second > first && correct_answer < high_threshold) {
                String question = nameOne + " climbed " + first + " inches up the rock wall. "
                        + nameTwo + " climbed " + second + " inches. How many inches did they climb all together?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + " inches");
            } else if (inverse_used == false) { // subtract instead
                int number = second - first;
                if(number < 0){ //make positive
                    number = number * -1;
                }
                results.addElement(number + " inches");
                inverse_used = true;
            } else if (plusone_used == false) { // add 10
                int number = correct_answer + 10;
                results.addElement(number + " inches");
                plusone_used = true;
            } else if (minusone_used == false) { // add 20
                int number = correct_answer + 20;
                results.addElement(number + " inches");
                minusone_used = true;
            } else { // random number
                int randomanswer = correct_answer;
                while(randomanswer == correct_answer){
                    randomanswer = rn.nextInt(high_threshold - low_threshold) + low_threshold; 
                }
                results.addElement(randomanswer + " inches");
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Use hundreds chart. Start at " + first+ " and count up by " + second + ".";
        } else {
            results = hint;
        }

        return results;
    }
}
