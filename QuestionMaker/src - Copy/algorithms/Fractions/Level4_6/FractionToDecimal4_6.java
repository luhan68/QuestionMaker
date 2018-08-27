/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level4_6;

import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class FractionToDecimal4_6 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // num
        int second = 0;// denom
        int third = 0; //
        int fourth = 0; // 
        String reversed = "";
        int newNum = 0;
        int newDenom = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction();  
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = 100;
            
            correct_answer = getDecimal(first, second);
            
            if (first < second) { 
                //add question
                String question = first + "/" + second + " =";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
            
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //reverse tenths and hundreths place
                reversed = first + "";
                char ones = reversed.charAt(0);
                char tens = ' ';
                try{
                    tens = reversed.charAt(1);
                } catch (Exception e) {
                    tens = ones;
                }
                reversed = "" + tens + ones;
                if(ones == tens){
                    reversed = "" + (first + 10); //add 10
                }
                results.addElement("." + reversed);
                inverse_used = true;
            } else if (plusone_used == false) { // add extra 0 before
                String answer = ".0" + first;
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // add extra 0 before inversed
                String answer = ".0" + reversed;
                results.addElement(answer);
                minusone_used = true;
            } else { // add two extra zeros
                String answer = ".00" + reversed;
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
    
    public String getDecimal(int numerator, int denominator){
        int afterDecimal = numerator % denominator;
        String asString = "";
        if(afterDecimal < 10){
            asString = "0" + afterDecimal;
        }else{
            asString = "" + afterDecimal;
        }
        return "." + asString;
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
            results = "";
        } else {
            results = hint;
        }

        return results;
    }
}
