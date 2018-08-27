/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level3_1;

import CalcFunctions.NumbersToWords;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class how_many_rows_of_numbers_alg_3_1 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";
    NumbersToWords toword = new NumbersToWords();

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0; 
        int minus_iterations = 0;
        int plus_iterations = 0;
        int third = 0; // not in use
        String correct_answer = "";
        int Random_correct_letter = 0;
        
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + 1;
            first = first + low_threshold;
            
            second = rn.nextInt(high_threshold - low_threshold) + 1;
            second = second + low_threshold;
            
            correct_answer = createAnswer(second, first);
            minus_iterations = first;
            plus_iterations = first;
            
            if (second >= low_threshold && second <= high_threshold) {
                String question = "Which of the follow equals " + first + " x " + second+"?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            }else if (minus_iterations == 1){
                plus_iterations++;
                String answer = createAnswer(second, plus_iterations);
                results.addElement(answer);
            }
            else{
                minus_iterations--;
                String answer = createAnswer(second, minus_iterations);
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
    
    public String createAnswer(int number, int howManyTimes){ //make addition string
        String additionLine = "" + number;
        for(int i = 0; i < howManyTimes - 1; i++){
            additionLine = additionLine + " + " + number;
        }
        return additionLine;
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
            results = first + " x " + second + " means " + first + " groups of "
                + second + ". Add " + second + " " + toword.conversion(first) + " times.";

        } else {
            results = hint;
        }

        return results;
    }
}
