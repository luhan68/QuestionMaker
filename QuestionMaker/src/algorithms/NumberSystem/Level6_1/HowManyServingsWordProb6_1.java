/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.NumberSystem.Level6_1;

import Fractions.Fraction;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class HowManyServingsWordProb6_1 {
    public String HintImg = "";
    public String SubjectType = "NUMBERSYSTEM";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // num1
        int second = 0; //denom1
        int third = 0;//num2
        int fourth = 0;//denom2
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction();
        String unit = oneUnit();
        String stuff = oneStuff();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            
            
            first = rn.nextInt(4) + 1;
            second = rn.nextInt(4) + 1;
            third = rn.nextInt(4) + 1;
            fourth = rn.nextInt(4) + 1;

            correct_answer = fractionHelper.Fraction_Math("divide",
                    third, fourth, first, second);
            
            if (first < second && third < fourth) { // matches criteria               
                // add question
                String question = "How many " + first + "/" + second + " cup servings"
                        + " are in " + third + "/" + fourth + " of a cup of " + stuff + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // multiply instead
                String answer = fractionHelper.Fraction_Math("multiply",
                    third, fourth, first, second);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { //  add instead
                String answer = fractionHelper.Fraction_Math("add",
                    third, fourth, first, second);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // divide opposite
                String answer = fractionHelper.Fraction_Math("divide",
                    first, second, third, fourth);
                results.addElement(answer);
                minusone_used = true;
            } else { // subtract
                String answer = fractionHelper.Fraction_Math("subtract",
                    third, fourth, first, second);
                results.addElement(answer);
            }

        }
        dupFix.eliminateFractionDuplicates(results, correct_answer,
                5, 1, Random_correct_letter);
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, stuff));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public String oneStuff(){ // example: 5 lb of (stuff)
        Random rn = new Random();
        int i = rn.nextInt(6);
        String item = "";
        
        switch(i){
            case 0:
                item = "yogurt";
                break;
            case 1:
                item = "ice cream";
                break;
            case 2:
                item = "flour";
                break;
            case 3:
                item = "sugar";
                break;
            case 4:
                item = "raisins";
                break;
            case 5:
                item = "chocolate chips";
                break;
            default:
                item = "INVALID";
                break;
        }
        return item;
    }
    
    public String oneUnit(){ //
        Random rn = new Random();
        int i = rn.nextInt(3);
        String place = "";
        
        switch(i){
            case 0:
                place = " lb";
                break;
            case 1:
                place = " g";
                break;
            case 2:
                place = " kg";
                break;
            default:
                place = "INVALID";
                break;
        }
        return place;
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

    public String CreateHint(String hint, String correct_answer, int first, int second, String stuff) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Divide the AMOUNT of " + stuff + " by the serving.";

        } else {
            results = hint;
        }

        return results;
    }
}
