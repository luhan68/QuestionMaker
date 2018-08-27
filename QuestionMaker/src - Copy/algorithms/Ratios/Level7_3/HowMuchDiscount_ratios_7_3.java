/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level7_3;

import Fractions.Fraction;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class HowMuchDiscount_ratios_7_3 {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // the cost
        int second = 0; // the discount
        int correct_answer = 0;
        int other_threshold = 60; // for the discount
        int other_threshold_low = 5;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(other_threshold - other_threshold_low) + other_threshold_low;
            correct_answer = first - (first * second / 100);
            
            if (first % 1000 == 0 && second % 5 == 0) { // matches criteria               
                // add question
                String question = "If you ordered a shirt for $" + first/100 + " at " + second + "% off,"
                        + " how much would you pay?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(formatMoney(correct_answer));
            } else if (inverse_used == false) { // add instead
                int answer = first + (first * second / 100);
                results.addElement(formatMoney(answer));
                inverse_used = true;
            } else if (plusone_used == false) { //  plus 20
                int answer = correct_answer + 20;
                results.addElement(formatMoney(answer));
                plusone_used = true;
            } else if (minusone_used == false) { //  - 30
                int answer = correct_answer - 30;
                if(answer < 0){
                    answer = 0;
                }
                results.addElement(formatMoney(answer));
                minusone_used = true;
            } else { // random 
                int randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                if (randomNum == correct_answer) {
                    randomNum += 12;
                }
                results.addElement(formatMoney(randomNum));
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
    
    public String formatMoney(int amount){
        int afterDecimal = amount%100;
        String asString = "";
        if(afterDecimal < 10){
            asString = "0" + afterDecimal;
        }else{
            asString = "" + afterDecimal;
        }
        return "$" + amount/100 + "." + asString;
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
            results = "Find the percent of the number. Then ask yourself whether you should add or subtract.~"
                + "Is this a tip, tax, markup? Add~Is this a discount or percent decrease? Subtract" ;

        } else {
            results = hint;
        }

        return results;
    }
}
