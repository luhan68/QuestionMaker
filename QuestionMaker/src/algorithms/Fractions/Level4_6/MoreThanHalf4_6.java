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
public class MoreThanHalf4_6 {
    public String HintImg = "placechart_decimals.png";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int one = 0; // num
        int two = 0;// denom
        int three = 0; //
        int four = 0; // 
        String first = "";
        String second = "";
        String third = "";
        String fourth = "";
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            one = rn.nextInt(40) + 10;
            do{
                two = rn.nextInt(40) + 10;
            }while(two == one);
            do{
                three = rn.nextInt(40) + 10;
            }while(three == one || three == two);
            do{
                four = rn.nextInt(40) + 10;
            }while(four == one || four == two || four == three);
            
            if(one % 10 == 0){
                one = one / 10;
            }
            if(two % 10 == 0){
                two = two / 10;
            }
            if(three % 10 == 0){
                three = three / 10;
            }
            if(four % 10 == 0){
                four = four / 10;
            }
            first = "." + one;
            second = "." + two;
            third = "." + three;
            fourth = "." + four;
            
            int correct_num = rn.nextInt(49) + 51;
            if(correct_num % 10 == 0){
                correct_num = correct_num / 10;
            }
            correct_answer = "." + correct_num;
            
            if (true) { 
                //add question
                String question = "Which is more than half?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
            
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //
                results.addElement(first);
                inverse_used = true;
            } else if (plusone_used == false) { // 
                results.addElement(second);
                plusone_used = true;
            } else if (minusone_used == false) { // 
                results.addElement(third);
                minusone_used = true;
            } else { //
                results.addElement(fourth);
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

    public String CreateHint(String hint, String correct_answer, String first, String second, String third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "half = .50";
        } else {
            results = hint;
        }

        return results;
    }
}
