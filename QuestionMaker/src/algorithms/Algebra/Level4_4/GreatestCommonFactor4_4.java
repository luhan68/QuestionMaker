/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level4_4;

import Fractions.Fraction;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class GreatestCommonFactor4_4 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";

 public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0; 
        int third = 0; 
        int correct_answer = 20;
        int other_threshold = 8;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction frac = new Fraction();
        DuplicateFixer dupFix = new DuplicateFixer();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            correct_answer = frac.findGCD(first, second);
            
            if (correct_answer != first && correct_answer != second && correct_answer != 1) {
                String question = "What is the Greatest Common Factor of "
                        + first + " and " + second + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // find a random that is not a factor
                int answer = 0;
                do{
                    answer = rn.nextInt(20) + 1;
                }while(results.contains(answer) || answer == correct_answer); //make sure answer is not a factor and is less than first  
                results.addElement(answer);
            }
        }
        
        dupFix.eliminateIntAsStringDuplicates(results, ""+correct_answer, other_threshold, low_threshold, Random_correct_letter);
        
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Factors are the numbers you multiply together to get another number."
                    + " List all of the factors of " + first + ", then list all of the factors of " + second
                    + ". Look through each list and find factors that both " + first + " and " + second
                    + " have. The biggest one that they both have is the Greates Common Factor.";
        } else {
            results = hint;
        }

        return results;
    }
}
