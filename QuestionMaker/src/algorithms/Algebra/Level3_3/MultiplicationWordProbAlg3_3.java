/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level3_3;

import QuestionManipulation.CapitalizeFirstLetter;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MultiplicationWordProbAlg3_3 {
    public String HintImg = "";
    public String SubjectType = "OPERATIONS";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0; // 
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        CapitalizeFirstLetter capital = new CapitalizeFirstLetter();

        Random rn = new Random();
        GetRandomNames namesHelper = new GetRandomNames();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = first * second;
            
            String name = namesHelper.OneName();
            if (first > second) { // matches criteria
                // add question
                String question = name+" runs "+first+" days a week. "+capital.Capitalize(namesHelper.HisHersFinder(name))+" runs "+second+" miles each day."
                        + " How many miles does "+namesHelper.HisHersFinder(name)+" run in all?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer            
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //inverse sign
                if (first >= second){
                    results.addElement(first / second);
                }else{
                    results.addElement(second / first);
                }
                inverse_used = true;
            } else { // 
                int random = correct_answer;
                while(random == correct_answer || results.contains(random)){
                    random = rn.nextInt(50) + 1;
                }
                results.addElement(random);
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

    public String CreateHint(String hint, int correct_answer, int first, int second) {
        String additionLine = "" + first;
        for(int i = 0; i < second - 1; i++){
            additionLine = additionLine + " + " + first;
        }
            
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = first + " x " + second + " = " + additionLine;
        } else {
            results = hint;
        }

        return results;
    }
}
