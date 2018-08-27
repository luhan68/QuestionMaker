/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level5_2;

import java.text.DecimalFormat;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class TimesTenPower5_2 {
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        double first = 0; //
        int second = 0; // 
        int third = 10;
        double correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        DecimalFormat formatter = new DecimalFormat("######.#####");
        DuplicateFixer dupfix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            double decimal = (rn.nextInt(100) + 1) / 100.0;
            first += decimal;
            second = rn.nextInt(3) + 2;
            correct_answer = first * Math.pow(third, second);
            
            if (true) { // matches criteria               
                // add question
                String question = formatter.format(first) + " x " + third + supered(second + "") + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(formatter.format(correct_answer));
            } else if (inverse_used == false) { // one decimal place less
                double answer = correct_answer / 10;
                results.addElement(formatter.format(answer));
                inverse_used = true;
            } else if (plusone_used == false) { // add a decimal place
                double answer = correct_answer * 10;
                results.addElement(formatter.format(answer));
                plusone_used = true;
            } else if (minusone_used == false) { // 
                double answer = (correct_answer / 10) - 13 ;
                if(answer < 0){
                    answer = 0;
                }
                results.addElement(formatter.format(answer));
                minusone_used = true;
            } else { // random 
                double randomNum = correct_answer;
                while (results.contains(randomNum) || randomNum == correct_answer) {
                    randomNum = rn.nextInt(1000) + 1;
                }
                results.addElement(formatter.format(randomNum));
            }

        }
        dupfix.eliminateIntAsStringDuplicates(results, correct_answer+"", high_threshold, low_threshold, Random_correct_letter);
        
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
    
    public String supered(String num) {
        num = num.replaceAll("0", "⁰");
        num = num.replaceAll("1", "¹");
        num = num.replaceAll("2", "²");
        num = num.replaceAll("3", "³");
        num = num.replaceAll("4", "⁴");
        num = num.replaceAll("5", "⁵");
        num = num.replaceAll("6", "⁶");
        num = num.replaceAll("7", "⁷");
        num = num.replaceAll("8", "⁸");
        num = num.replaceAll("9", "⁹");         
        return num;
    }

    /*
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
    */

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

    public String CreateHint(String hint, double correct_answer, double first, int second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "When multiplying by 10 to the power of " + second
                    + ", move the decimal place to the right by " + second + " places.";

        } else {
            results = hint;
        }

        return results;
    }
}
