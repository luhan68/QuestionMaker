/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level7_1;

import RandomItems.GetRandomNames;
import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class RatioDivisionWordProblems_7_1 {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    GetRandomNames rnd_names = new GetRandomNames();
    
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // first num
        int second = 0;// first denom
        int third = 0;// second num
        int fourth = 0;// second denom
        String firstFraction = "";
        String secondFraction = "";
        String correct_fraction = "";
        double correct_answer = 0;
        double inverse_answer = 0;
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
            first = 1;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = 1;
            fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;

            firstFraction = first + "/" + second;
            secondFraction = third + "/" + fourth;

            correct_fraction = fractionHelper.Fraction_Math("divide", first, second, third, fourth);
            correct_answer = fractionHelper.getAsNumber();
            correct_answer = fractionHelper.round(correct_answer, 2);

            String inverse_fraction = fractionHelper.Fraction_Math("multiply", first, second, third, fourth);
            inverse_answer = fractionHelper.getAsNumber();
            inverse_answer = fractionHelper.round(inverse_answer, 2);
            
            if (second > first && fourth > third) { // matches criteria               
                // add question
                String question = name + " walks " + firstFraction + " miles in "
                        + secondFraction + " hours, compute the unit rate."
                        + " Round to the nearest hundredth if necessary.";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + " miles per hour");
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                results.addElement(inverse_answer + " miles per hour");
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = plusOne(first, second, correct_answer);
                answer = fractionHelper.round(answer, 2);
                results.addElement(answer + " miles per hour");
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = minusOne(first, second, correct_answer);
                answer = fractionHelper.round(answer, 2);
                results.addElement(answer + " miles per hour");
                minusone_used = true;
            } else { // random question within the threshold
                double randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                if (randomNum == correct_answer) {
                    randomNum += 3;
                }
                results.addElement(randomNum + " miles per hour");
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
    
    public double Inverse(int first, int second, double correct) {
            return 0;
    }

    public double plusOne(int first, int second, double correct) {

        return correct + 1;
    }

    public double minusOne(int first, int second, double correct) {
        double result = correct - 1;
        if(result < 1){
            result = 0;
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

    public String CreateHint(String hint, double correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "A unit rate is a rate expressed as a quantity of one. What operation will help you find one unit?" ;

        } else {
            results = hint;
        }

        return results;
    }
}
