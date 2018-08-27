/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Statistics.Level6_5;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class FindMedianModeMean {
    public String HintImg = "";
    public String SubjectType = "NumberSystem";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0; // 
        int third = 0;
        int lowest = 0;
        int highest = 0;
        int[] scores = new int[10];
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;

        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(5) + 4; // number of scores
            
            lowest = 100;
            highest = 0;
            for(int i = 0; i < first; i++){
                int random = 0;
                do{
                     random = rn.nextInt(high_threshold - low_threshold) + low_threshold; // from 80 to 100
                }while(random % 5 != 0);
                scores[i] = random;
                if (scores[i] < lowest){
                    lowest = scores[i];
                }
                if(scores[i] > highest){
                    highest = scores[i];
                }
            }
            
            correct_answer = highest - lowest; // the range

            if (true) { // matches criteria
                // add question
                String question = "The following are test grades for " + first + " students in your class: "
                        + printScores(scores, first) + ". What is the median, mode, and mean of the scores?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { //
                results.addElement(highest + lowest);
                inverse_used = true;
            } else if (plusone_used == false) { // + 1
                results.addElement(correct_answer + 1);
                plusone_used = true;
            } else if (minusone_used == false) { //- 6
                results.addElement(correct_answer - 6);
                minusone_used = true;
            } else { // 
                int random = correct_answer;
                while(random == correct_answer || results.contains(random)){
                    random = rn.nextInt(high_threshold - low_threshold) + low_threshold;
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

    public String printScores(int[] a, int first){
        String line = "" + a[0];
        
        for(int i = 1; i < first; i++){
            line = line + ", " + a[i];
        }
        return line;
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
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "The range is the difference between the highest and lowest value.";
        } else {
            results = hint;
        }

        return results;
    }
}
