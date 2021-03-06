/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.NumberSystem.Level6_3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class AdditionDecimals6_3 {
    public String HintImg = "";
    public String SubjectType = "NumberSystem";
    public String SubjectImage = "";
    
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        double first = 0; // 
        double second = 0; // 
        double correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;

        Random rn = new Random();
        DecimalFormat formatter = new DecimalFormat("######.######");
 
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            double decimal = (rn.nextInt(100) + 1) / 100.0;
            first += decimal;
            second = (rn.nextInt(1000) + 1) / 1000.0;
            
            correct_answer = first + second;
            
            if (true) { // matches criteria
                // add question
                String question = formatter.format(first) + " + " + formatter.format(second) + " =";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(formatter.format(correct_answer));
            } else if (inverse_used == false) { // subtract instead
                double answer = first - second;
                results.addElement(formatter.format(answer));
                inverse_used = true;
            } else if (plusone_used == false) { //  plus 2.574
                double answer = correct_answer + 2.574;
                results.addElement(formatter.format(answer));
                plusone_used = true;
            } else if (minusone_used == false) { //  - .63
                double answer = correct_answer - .63;
                if(answer < 0){
                    answer = correct_answer + 6.7;
                }
                results.addElement(formatter.format(answer));
                minusone_used = true;
            } else { // random 
                double randomNum = correct_answer;
                while (results.contains(randomNum) || randomNum == correct_answer) {
                    randomNum = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    double decimal = (rn.nextInt(1000) + 1) / 1000.0;
                    randomNum += decimal;
                }
                results.addElement(formatter.format(randomNum));
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

    public String CreateHint(String hint, double correct_answer, double first, double second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "";
        } else {
            results = hint;
        }

        return results;
    }
}