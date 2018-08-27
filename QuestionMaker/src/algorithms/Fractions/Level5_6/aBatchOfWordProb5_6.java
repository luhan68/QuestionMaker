/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level5_6;

import Fractions.Fraction;
import RandomItems.GetRandomNames;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class aBatchOfWordProb5_6 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // num
        int second = 0;// denom
        String firstFrac = "";
        String firstFracNoWholes = "";
        int third = 0; //num
        int fourth = 1; //  denom
        String secondFrac = "";
        String secondFracNoWholes = "";
        int newNum = 0;
        int newDenom = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        String unit = " cups";
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction();  
        GetRandomNames nameHelper = new GetRandomNames();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(20) + 1;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = rn.nextInt(20) + 1;
            fourth = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            firstFrac = fractionHelper.simplifyFractions(first, second);
            firstFracNoWholes = fractionHelper.getWithoutWholeNumber();
            secondFrac = fractionHelper.simplifyFractions(third, fourth);
            secondFracNoWholes = fractionHelper.getWithoutWholeNumber();
            
          //  String temp = fractionHelper.Fraction_Math("multiply", first, 1, second, third);
          //  try {
          //      fourth = Integer.parseInt(temp);
          //  }catch(Exception e){
           //     fourth = 0;
          //  }
            
            correct_answer = fractionHelper.Fraction_Math("multiply", first, second, third, fourth);;
            String foodItem = oneFoodItem();
            String ingredientItem = oneIngredientItem();
            
            
            if (firstFrac.contains("/") && secondFrac.contains("/") && first > second && third > fourth) { //both are fractions
                String question = "A batch of " + foodItem + " requires " + firstFrac
                        + " cups of " + ingredientItem + ". If the baker was making " + secondFrac
                        + " batches, how much " + ingredientItem + " would he need?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + unit);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, third, fourth);
                results.addElement(answer + unit);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusone(first, second, third, fourth);
                results.addElement(answer + unit);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = minusone(first, second, third, fourth);
                results.addElement(answer + unit);
                minusone_used = true;
            } else { // random question within the threshold
                // int randomanswer = rn.nextInt(high_threshold) + 1;
                boolean fin = false;
                while (fin == false) {
                    int first2 = rn.nextInt(high_threshold) + 1;
                    int second2 = rn.nextInt(high_threshold) + 1;
                    int third2 = rn.nextInt(high_threshold) + 1;
                    int numerator2 = 0;
                    int deno2 = 0;
                    if (first2 > second2) {
                        numerator2 = first2;
                        deno2 = second2;
                    } else {
                        numerator2 = second2;
                        deno2 = first2;
                    }
                    String randomanswer = fractionHelper.Fraction_Math("divide", numerator2, deno2, third, fourth);

                    if (randomanswer != correct_answer) {
                        results.addElement(randomanswer);
                        fin = true;
                    }
                    //  results.addElement(randomanswer);
                }
            }
        }
        dupFix.eliminateFractionDuplicates(results, correct_answer, high_threshold,
                low_threshold, Random_correct_letter);
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, firstFrac, secondFrac,
                firstFracNoWholes, secondFracNoWholes));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public String Inverse(int first, int second, int third, int fourth) {
        Fraction fraction = new Fraction();
        String results = fraction.Fraction_Math("divide", first, second, third, fourth);



        return results;
    }

    public String plusone(int first, int second, int third, int fourth) {

        Fraction fraction = new Fraction();
        String results = "";
        if (third < 9) {
            third = third + 1;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);

        } else {
            third = third - 2;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);
        }

        return results;
    }

    public String minusone(int first, int second, int third, int fourth) {

        Fraction fraction = new Fraction();
        String results = "";
        if (third > 1) {
            third = third - 1;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);

        } else {
            third = third + 2;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);
        }

        return results;
    }

    public String oneFoodItem(){ //
        Random rn = new Random();
        int i = rn.nextInt(3);
        String place = "";
        
        switch(i){
            case 0:
                place = "cookies";
                break;
            case 1:
                place = "muffins";
                break;
            case 2:
                place = "pancakes";
                break;
            default:
                place = "INVALID";
                break;
        }
        return place;
    }
    
    public String oneIngredientItem(){ //
        Random rn = new Random();
        int i = rn.nextInt(3);
        String place = "";
        
        switch(i){
            case 0:
                place = "flour";
                break;
            case 1:
                place = "sugar";
                break;
            case 2:
                place = "water";
                break;
            default:
                place = "INVALID";
                break;
        }
        return place;
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

    public String CreateHint(String hint, String correct_answer,
            String firstFrac, String secondFrac, String firstFracNoWholes, String secondFracNoWholes) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results =  firstFrac + " = " + firstFracNoWholes + "NEWLINE"
                    + secondFrac + " = " + secondFracNoWholes + "NEWLINE"
                    + firstFracNoWholes + "x" + secondFracNoWholes + " = ";
        } else {
            results = hint;
        }

        return results;
    }
}
