/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Statistics.Level7_8;

import RandomItems.GetRandomItems;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class WordTiles_FirstLetter {
    public String HintImg = "";
    public String SubjectType = "Geometry";
    public String SubjectImage = "";
    GetRandomItems rnd_items = new GetRandomItems();
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; //  numerator
        int second = 1; //  denominator
        String correct_answer = ""; // 
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        String item = "";
        String word = "";
        int size = 0;
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            item = rnd_items.OneItem();
            word = "pipe"; // TEMPORARY 
            word = word.toUpperCase();
            size = word.length();
            char firstLetter = word.charAt(0);
            int denominator = size;
            int numerator = 1;
            first = 1;
            second = 1;
            char current = ' ';
 
            for(int j = 1; j < size; j++){ // check if letter appears more than once
                if(firstLetter == word.charAt(j)){
                    numerator++;
                }
            }
            first = numerator;
            second = denominator;
            correct_answer = first + "/" + second; // needs simplification
            
            if (size <= 6) { // matches criteria
                // add question
                String question = "If each of the letters of the word " + word + " is on a tile and drawn at random,"
                        + " what is the probability that you will draw " + Character.toUpperCase(firstLetter)
                        + " as the first letter?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, correct_answer, size);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusOne(first, second, correct_answer, size);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = minusOne(first, second, correct_answer, size);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomDenom = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                if (randomDenom == second) {
                    randomDenom += 2;
                }
                String answer = first + "/" + randomDenom;
                results.addElement(answer);
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
    
    public String Inverse(int first, int second, String correct, int size) {
        String answer = second + "/" + first;
        return answer;
    }

    public String plusOne(int first, int second, String correct, int size) { // plus one to num

        return (first + 1) + "/" + second;
    }

    public String minusOne(int first, int second, String correct, int size) { // plustwo to num
        return (first + 2) + "/" + size;

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

    public String CreateHint(String hint, String correct_answer, int first, int second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Think about how many letters there are total. Also think about"
                    + " how likely you are to pick the correct letter at random.";

        } else {
            results = hint;
        }

        return results;
    }
}
