/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level7_4;

import Fractions.Fraction;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class FindCircumGivenRadius {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    GetRandomNames rnd_names = new GetRandomNames();
    
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // radius
        double second = Math.PI; // pi
        double third = 0;
        double correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        String name = rnd_names.OneName();
        Fraction fractionHelper = new Fraction();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;

            correct_answer = second * first * 2;
            correct_answer = fractionHelper.round(correct_answer, 3); // three decimals
            
            if (true) { // matches criteria               
                // add question
                String question = "Find the circumference of a circle with radius " + first + " cm";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + " cm");
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                double answer = Inverse(first, second, third, correct_answer);
                answer = fractionHelper.round(answer, 3);
                if (answer >= correct_answer - .01 && answer <= correct_answer + .01){
                    answer += .5;
                }
                results.addElement(answer + " cm");
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = plusOne(first, second, correct_answer);
                answer = fractionHelper.round(answer, 3);
                results.addElement(answer + " cm");
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = minusOne(first, second, correct_answer);
                answer = fractionHelper.round(answer, 3);
                results.addElement(answer + " cm");
                minusone_used = true;
            } else { // random question within the threshold
                double randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                if (randomNum == correct_answer) {
                    randomNum += 3;
                }
                results.addElement(randomNum + " cm");
            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public double Inverse(int first, double second, double third, double correct) {
        double answer = first * first * second;
        return answer;
    }

    public double plusOne(int first, double second, double correct) {

        return correct + 0.2;
    }

    public double minusOne(int first, double second, double correct) {
        double result = correct - 0.3;
        if(result < 0){
            result = .001;
        }
        return result;
    }

    public String HintImg() {
        // add syntax for hint image generation here
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

    public String CreateHint(String hint, double correct_answer, int first, double second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "C = πd. Remember the radius is half the diameter.";

        } else {
            results = hint;
        }

        return results;
    }
}
