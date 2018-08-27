/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level5_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class InOutPlus_algebra5_3 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            second = rn.nextInt(high_threshold) + 1;
            third = second - first;
            
            correct_answer = "a + " + third + " = b";
            
            if (first < second) { // matches criteria
                String question = "Write an eqution to show the relationship between "
                        + "the in and out: (a) " + first + " IN  (b) " + second + " OUT.";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // use minus
                results.addElement("a - " + third + " = b");
                inverse_used = true;
            } else if (plusone_used == false) { // + 1
                results.addElement("a + " + (third+1) + " = b");
                plusone_used = true;
            } else if (minusone_used == false) { // - 1
                results.addElement("a + " + (third-1) + " = b");
                minusone_used = true;
            } else { // random question within the threshold
                int random = rn.nextInt(high_threshold) + 1;
                if (random == third) {
                    random = random + 5;
                }
                results.addElement("a - " + (random) + " = b");

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
            results = "What operation would I use to get from " + first + " to " + second + "?";

        } else {
            results = hint;
        }

        return results;
    }
}
