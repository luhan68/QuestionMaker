/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions_5_7;

import Fractions.Fraction;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class FractionDivision {

    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int numerator = 0;
        int deno = 0;
        int whole = 0;
        int whole_deno = 1;
        String correct_answer = "40";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fraction = new Fraction();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = 1;
            second = rn.nextInt(high_threshold) + 1;
            third = rn.nextInt(high_threshold) + 1;

            if (first < second) {
                numerator = first;
                deno = second;
            } else {
                numerator = second;
                deno = first;
            }

            String Fraction_text = numerator + "/" + deno;
            whole = third;

            correct_answer = fraction.Fraction_Math("divide", numerator, deno, whole, whole_deno);
            // System.out.println(correct_answer);
            //      (numerator * whole_deno) + "/" + (deno * whole) ;
            // boolean match = true;
            //     if (match) { // matches criteria
            String question = Fraction_text + " Divided By " + whole + " = ?";
            results.addElement(question);
            Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
            found = true;
            //   }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(numerator, deno, whole, whole_deno);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusone(numerator, deno, whole, whole_deno);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = minusone(numerator, deno, whole, whole_deno);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                // int randomanswer = rn.nextInt(high_threshold) + 1;
                boolean fin = false;
                while (fin == false) {
                    int first2 = rn.nextInt(high_threshold) + 1;
                    int second2 = rn.nextInt(high_threshold) + 1;
                    int third2 = rn.nextInt(high_threshold) + 1;
                    int numerator2 = 0;
                    int deno2 = 0;
                    if (first2 > second2) {
                        numerator2 = first2;
                        deno2 = second2;
                    } else {
                        numerator2 = second2;
                        deno2 = first2;
                    }
                    String randomanswer = fraction.Fraction_Math("divide", numerator2, deno2, whole, 1);

                    if (randomanswer != correct_answer) {
                        results.addElement(randomanswer);
                        fin = true;
                    }
                    //  results.addElement(randomanswer);
                }
            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, numerator, deno, whole, whole_deno));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public String Inverse(int first, int second, int third, int fourth) {
        Fraction fraction = new Fraction();
        String results = fraction.Fraction_Math("multiply", first, second, third, fourth);



        return results;
    }

    public String plusone(int first, int second, int third, int fourth) {

        Fraction fraction = new Fraction();
        String results = "";
        if (third < 9) {
            third = third + 1;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);

        } else {
            third = third - 2;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);
        }

        return results;
    }

    public String minusone(int first, int second, int third, int fourth) {

        Fraction fraction = new Fraction();
        String results = "";
        if (third > 1) {
            third = third - 1;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);

        } else {
            third = third + 2;
            results = fraction.Fraction_Math("divide", first, second, third, fourth);
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

    public String CreateHint(String hint, int first, int second, int third, int fourth) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Try " + first + "/" + second + " x " + fourth + "/" + third;

        } else {
            results = hint;
        }

        return results;
    }
}
