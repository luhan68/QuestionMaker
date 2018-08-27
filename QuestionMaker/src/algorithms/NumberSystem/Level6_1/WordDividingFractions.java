/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.NumberSystem.Level6_1;

import RandomItems.GetRandomNames;
import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class WordDividingFractions {
    public String HintImg = "";
    public String SubjectType = "NUMBERSYSTEM";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

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
        GetRandomNames nameHelper = new GetRandomNames();
        Fraction fractionHelper = new Fraction();
        String name = nameHelper.OneName();
       // String unit = oneUnit();
        String unit = " lbs";
        String stuff = oneStuff();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            
            
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(4) + 1;
            third = rn.nextInt(4) + 1;

            correct_answer = fractionHelper.Fraction_Math("divide", second, third, first, 1);
            
            if (second < third) { // matches criteria               
                // add question
                String question = "If " + first + " people share " + second + "/" + third
                         + unit + " of " + stuff + " equally, how many " + stuff + " will each person get?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement((correct_answer + unit));
            } else if (inverse_used == false) { // multiply instead
                String answer = fractionHelper.Fraction_Math("multiply", second, third, first, 1);
                results.addElement((answer + unit));
                inverse_used = true;
            } else if (plusone_used == false) { //  add instead
                String answer = fractionHelper.Fraction_Math("add", second, third, first, 1);
                results.addElement((answer + unit));
                plusone_used = true;
            } else if (minusone_used == false) { //  + 1 whole number
                String answer = fractionHelper.Fraction_Math("divide", second, third, first + 1, 1);
                results.addElement((answer + unit));
                minusone_used = true;
            } else { // -1 whole number
                String answer = fractionHelper.Fraction_Math("divide", second, third, first - 1, 1);
                results.addElement((answer + unit));
            }

        }
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
        int i = rn.nextInt(5);
        String place = "";
        
        switch(i){
            case 0:
                place = "lollipops";
                break;
            case 1:
                place = "snacks";
                break;
            case 2:
                place = "chips";
                break;
            case 3:
                place = "cookies";
                break;
            case 4:
                place = "crackers";
                break;
            default:
                place = "INVALID";
                break;
        }
        return place;
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
            results = "Divide the amount of " + stuff + " by the number of people.";

        } else {
            results = hint;
        }

        return results;
    }
}
