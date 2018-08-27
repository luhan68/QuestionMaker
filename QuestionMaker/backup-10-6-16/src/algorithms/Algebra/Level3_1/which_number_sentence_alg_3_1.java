/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level3_1;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class which_number_sentence_alg_3_1 {
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0; 
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean addition_used = false;
        boolean subtraction_used = false;
        boolean division_used = false;
        int wrong_answer = 0;
        
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + 1;
            first = first + low_threshold;
            
            second = rn.nextInt(high_threshold - low_threshold) + 1;
            second = second + low_threshold;
            
            third = first * second;
            
            correct_answer = first + " x " + second + " = " + third;
            
            if (first % second == 0 && first != second) {
                String question = "Which number sentence equals " + first + " rows of " + second + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            }else if (addition_used == false){
                String answer = "";
                wrong_answer = first + second;
                answer = first + " + " + second + " = " + wrong_answer;
                results.addElement(answer);
                addition_used = true;
            }
            else if (subtraction_used == false){
                String answer = "";
                wrong_answer = first - second;
                answer = first + " - " + second + " = " + wrong_answer;
                results.addElement(answer);
                subtraction_used = true;
            }
            else if(division_used == false){
                String answer = "";
                wrong_answer = first / second;
                answer = first + " / " + second + " = " + wrong_answer;
                results.addElement(answer);
                division_used = true;
            }
            else{
                String answer = "";
                if(first != 2){
                    wrong_answer = second + second;
                    answer = second + " + " + second + " = " + wrong_answer;
                }
                else{
                    wrong_answer = second * 3;
                    answer = second + " + " + second + " + " + second + " = " + wrong_answer;
                }
                results.addElement(answer);
            }
        }
                
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, first, second, third));
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

    public String CreateHint(String hint, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = first + "Equal rows means to multiply.";

        } else {
            results = hint;
        }

        return results;
    }
}
