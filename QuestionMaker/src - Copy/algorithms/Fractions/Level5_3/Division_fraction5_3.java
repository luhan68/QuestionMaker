/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level5_3;

import Fractions.Fraction;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Division_fraction5_3 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

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
        GetRandomNames nameHelper = new GetRandomNames();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            String name = nameHelper.OneName();
            
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            first = rn.nextInt(second * 5) + 1;
       //     String simplifiedOne = fractionHelper.simplifyFractions(first, second);
       //     fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;
        //    third = rn.nextInt(fourth * 5) + 1;;
        //    String simplifiedTwo = fractionHelper.simplifyFractions(third, fourth);
            
            correct_answer = fractionHelper.simplifyFractions(first, second);
          //   = fractionHelper.getWithoutWholeNumber();
            
        //    newNum = fractionHelper.getNumSimplified();
        //    newDenom = fractionHelper.getDenomSimplified();
            
            if (first > second && first%second != 0) { //the question
                String question = first + "/" + second + " =";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // flip
                String fraction = fractionHelper.simplifyFractions(second, first);
                results.addElement(fraction);
                inverse_used = true;
            } else if (plusone_used == false) { // + 2 num
                String fraction = fractionHelper.simplifyFractions(first + 2, second);
                results.addElement(fraction);
                plusone_used = true;
            } else if (minusone_used == false) { // -1 denom
                String fraction = fractionHelper.simplifyFractions(first - 1, second);
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
        
      //  String firstLine = first + "/" + second + " = " + firstNum + "/" + denom;
     //   String secondLine = third + "/" + fourth + " = " + secondNum + "/" + denom;
     //   String thirdLine = firstNum + "/" + denom + " + " + secondNum + "/" + denom + " =";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Write the whole number that can be evenly "
                    + "divided by " + second + " to get " + first + " and write the remainder as a fraction. "
                    + "So what times " + second + " is close to " + first + " but not greater than " + first + "?";
        } else {
            results = hint;
        }

        return results;
    }
}