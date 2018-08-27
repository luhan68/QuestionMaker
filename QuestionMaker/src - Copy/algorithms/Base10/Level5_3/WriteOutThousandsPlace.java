/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Base10.Level5_3;

import PlaceChart.WordsToNumbersPlace;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class WriteOutThousandsPlace {

    public String HintImg = "hundredschart.jpg";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            int decimal = 0;
            boolean foundit = false;
            while (foundit == false) {

                if (decimal < 1000 && decimal > 99) {
                    foundit = true;
                } else {
                    decimal = rn.nextInt(high_threshold);
                }
            }
            second = decimal;

            if (first >= low_threshold && first <= high_threshold) { // matches criteria
                WordsToNumbersPlace numbers = new WordsToNumbersPlace();
                String temp = first + "." + decimal + "";
                correct_answer = temp;
                String Text = numbers.ConvertNumberToWords(Double.parseDouble(temp));
                String question = "What Is The Numeral Of The Words " + Text + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, second);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, second);
                results.addElement(answer + "0");
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = minusone(first);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;
                if (randomanswer == first) {
                    randomanswer = randomanswer + 5;
                }
                results.addElement(randomanswer + "010");

            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, first, first, second, third));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public String Inverse(int first, int second, int correct) {
        String results = "";
        // This method creates an answer that is the inverse operation of the correct answer

       results = first + "." + second + "0";


        return results;
    }

    public int plusone(int correctanswer) {

        int results = correctanswer + 1;

        return results;
    }

    public int minusone(int correctanswer) {

        int results = correctanswer - 1;
        if (results < 1) {
            results = 0;
        }
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
            results = "Use The Hundreds Chart";

        } else {
            results = hint;
        }

        return results;
    }
}
