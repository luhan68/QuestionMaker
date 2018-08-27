/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level5_6;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class divide_with_remainders_largernumbers_base10_5_6 {

    public String HintImg = "divisionparts.png";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int remainder = 0;
        String correct_answer = "";
        int other_threshold = 99;
        int other_threshold_low = 10;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + 1;
            first = first + low_threshold;

            second = (rn.nextInt(other_threshold - other_threshold_low) + 1);
            second = second + other_threshold_low;

            third = first / second;
            remainder = first % second;

            correct_answer = makeAnswer(first, second, third, remainder);

            if (1 == 1) {
                String question = first + " / " + second + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, third);
                String answerString = makeAnswer(first, second, answer, remainder);
                results.addElement(answerString);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = plusone(third);
                String answerString = makeAnswer(first, second, answer, remainder);
                results.addElement(answerString);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = minusone(third);
                String answerString = makeAnswer(first, second, answer, remainder);
                results.addElement(answerString);
                minusone_used = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(other_threshold) + 1;
                String answerString = makeAnswer(first, second, randomanswer, remainder);
                results.addElement(answerString);
            }

        }

        //   eliminateDuplicates(results, correct_answer, other_threshold, low_threshold, Random_correct_letter);

        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, remainder));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public String makeAnswer(int first, int second, int third, int remainder) {
        if (remainder != 0) {
            return  third + " remainder " + remainder + "/" + second;
        } else {
            return third+"";
        }
    }

    public int Inverse(int first, int second, int third) {
        int results = 0;
        results = first + second; // using addition instead
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
            int high_threshold, int low_threshold, int random_correct_letter) {
        // replace suplicates with random numbers within threshold
        Random rn = new Random();
        Object current_element_value = null;
        int randomValue = 0;

        for (int i = 1; i < 6; i++) { // goes throuh all 5 answers
            current_element_value = results.elementAt(i); // grab value at i
            results.set(i, "KLP,KJ,K;,...K"); //replace with temporary value
            if (results.contains(current_element_value) && i != random_correct_letter) { // value is in vector and is not the correct answer
                do {
                    randomValue = rn.nextInt(high_threshold - low_threshold) + 1;
                    randomValue = randomValue + low_threshold;
                } while (results.contains(randomValue));

                results.set(i, randomValue); // add new value
            } else { // value is not in vector
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third, int remainder) {
        String results = "";

        if (hint.contains("Algorithm Generated")) {
            results = "Use the division chart to solve the problem.";
        } else {
            results = hint;
        }

        return results;
    }
}
