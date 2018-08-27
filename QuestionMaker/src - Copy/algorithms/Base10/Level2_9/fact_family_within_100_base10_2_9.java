/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level2_9;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class fact_family_within_100_base10_2_9 {
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        Vector question_text = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean wrong_1_used = false;
        boolean wrong_2_used = false;
        boolean wrong_3_used = false;
        boolean wrong_4_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            do{
            second = rn.nextInt(high_threshold) + 1;
            }while(second == first);
            third = first + second;
            correct_answer = third + " - " + first + " = " + second;
            
            String line_1 = first + " + " + second + " = " + third;
            String line_2 = second + " + " + first + " = " + third;
            String line_3 = third + " - " + second + " = " + first;
            question_text.addElement(line_1);
            question_text.addElement(line_2);
            question_text.addElement(line_3);
            if (third >= low_threshold && third <= high_threshold) {
                String question = "Complete the fact family~" +
                    line_1 + "~" + line_2 + "~" + line_3;
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
            else{
                question_text.clear();
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (wrong_1_used == false) { // check if one of the answers used yet is an inverse
                String answer = wrong_1(first, second, third, question_text);
                results.addElement(answer);
                wrong_1_used = true;
            } else if (wrong_2_used == false) { // check if one of the answers used yet is an inverse
                String answer = wrong_2(first, second, third, question_text);
                results.addElement(answer);
                wrong_2_used = true;
            } else if (wrong_3_used == false) { // check if one of the answers used yet is an inverse
                String answer = wrong_3(first, second, third);
                results.addElement(answer);
                wrong_3_used = true;
            } else { // wrong_4
                String answer = wrong_4(first, second, third);
                results.addElement(answer);
                wrong_4_used = true;             
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

    public String wrong_1(int first, int second, int third, Vector question) { // add or subtract by one
        String results = "";
        int wrong_first = first;
        int wrong_second = second;
        do{
            results = (--wrong_first) + " + " + (++wrong_second) + " = " + third;         
        }while(question.contains(results));
        
        return results;
    }

    public String wrong_2(int first, int second, int third, Vector question) { // add or subtract by one
        String results = "";
        int wrong_first = first;
        int wrong_second = second;
        do{
            results = third + " - " + (--wrong_second) + " = " + (++wrong_first);         
        }while(question.contains(results));
        
        return results;
    }
    
    public String wrong_3(int first, int second, int third) { // inverse sign
        String results = "";
        results = third + " + " + first + " = " + second;
        return results;
    }
    
    public String wrong_4(int first, int second, int third) {
        String results = "";
        results = (third + second) + " + " + first + " = " + (first + second + third);
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Fact families are groups of related addition and"
                    + "subtraction facts made from the same 3 numbers.";

        } else {
            results = hint;
        }

        return results;
    }
}