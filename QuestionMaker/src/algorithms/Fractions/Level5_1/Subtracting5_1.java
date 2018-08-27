/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level5_1;

import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Subtracting5_1 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // num
        int second = 0;// denom
        int third = 0; //num
        int fourth = 0;//denom
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
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;;

            fractionHelper.Fraction_Math("subtract", first, second, third, fourth);
            correct_answer = fractionHelper.getWithoutWholeNumber();
            
            newNum = fractionHelper.getNumSimplified();
            newDenom = fractionHelper.getDenomSimplified();
            
            if (first < second && third < fourth && first*1.0/second > third*1.0/fourth) { //the question
                String question = first + " / " + second + " - " + third + " / " + fourth + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add denoms as well as nums
                results.addElement((first + third) + "/" + (second + fourth));
                inverse_used = true;
            } else if (plusone_used == false) { // + 3 num
                fractionHelper.Fraction_Math("add", first + 3, second, third, fourth);
                String fraction = fractionHelper.getWithoutWholeNumber();
                results.addElement(fraction);
                plusone_used = true;
            } else if (minusone_used == false) { // -1 denom
                fractionHelper.Fraction_Math("add", first - 1, second, third, fourth);
                String fraction = fractionHelper.getWithoutWholeNumber();
                results.addElement(fraction);
                minusone_used = true;
            } else { // random
                String fraction = unusedRandomFraction(low_threshold, high_threshold, results);
                results.addElement(fraction);
            }
        }
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, fourth));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public String unusedRandomFraction(int low, int high, Vector a){
        Random r = new Random();
        Fraction frac = new Fraction();
        String fraction = "";
        int num = 0;
        int denom = 0;
        do{
            num = r.nextInt(high - low) + low;
            denom = r.nextInt(high - low) + low;
            fraction = num + "/" + denom;
        }while(a.contains(fraction) || num >= denom);
        return fraction;
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third, int fourth) {
        String results = "";
        int firstNum = first * fourth;
        int secondNum = second * third;
        int denom = (second * fourth);
        
        String firstLine = first + "/" + second + " = " + firstNum + "/" + denom;
        String secondLine = third + "/" + fourth + " = " + secondNum + "/" + denom;
        String thirdLine = firstNum + "/" + denom + " + " + secondNum + "/" + denom + " =";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Convert to common denominator and then subtract. You should simplify your answer.";
        } else {
            results = hint;
        }

        return results;
    }
}
