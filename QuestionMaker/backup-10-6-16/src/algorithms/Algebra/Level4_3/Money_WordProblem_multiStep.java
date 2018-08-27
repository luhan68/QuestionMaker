/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level4_3;

import RandomItems.GetRandomItems;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class Money_WordProblem_multiStep {

    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";
    GetRandomNames names = new GetRandomNames();
    GetRandomItems rnd_items = new GetRandomItems();

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        double first = 0;
        double second = 0;
        double third = 0;
        double correct_answer = 20;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;

        //Request Random Items
        String Name = names.OneName();
        String Name2 = Name;
        while (Name2 == Name) {
            Name2 = names.OneName();

        }

        String item = rnd_items.OneItem();

        while (found == false) { // try to produce a formula that is within the bounds

            first = rn.nextInt(high_threshold) + 1;
            int first_cents = rn.nextInt(99);
            first = round(first + (first_cents * 0.01), 2);

            second = rn.nextInt(high_threshold) + 1;
            int second_cents = rn.nextInt(99);
            second = round(second + (second_cents * 0.01), 2);

            third = rn.nextInt(high_threshold) + 1;
            int third_cents = rn.nextInt(99);
            third = round(third + (third_cents * 0.01), 2);



            correct_answer = round((first + second) - third, 2);
            if (correct_answer >= low_threshold && correct_answer <= high_threshold) { // matches criteria
                String question = "Add $" + first + " + $" + second + ". Subtract "
                        + "$" + third + " From That Total To Get Your Answer.";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement("$" + round(correct_answer, 2));
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                double answer = round(Inverse(first, second, correct_answer), 2);
                results.addElement("$" + round(answer, 2));
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = round(plusone(correct_answer), 2);
                results.addElement("$" + round(answer, 2));
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                double answer = round(minusone(correct_answer), 2);
                results.addElement("$" + round(answer, 2));
                minusone_used = true;
            } else { // random question within the threshold
                double randomanswer = round(rn.nextInt(high_threshold) + 1, 2);
                if (randomanswer == correct_answer) {
                    randomanswer = randomanswer + 5;
                }
                results.addElement("$" + round(randomanswer, 2));

            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, item));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public double Inverse(double first, double second, double correct) {
        double results = 0;
        // This method creates an answer that is the inverse operation of the correct answer

        if ((first >= second)) {
            //first is the largest
            results = first - second;
            if (results < 0) {
                results = 0;
            }
        }
        if ((second > first)) {
            //first is the largest
            results = second - first;
            if (results < 0) {
                results = 0;
            }
        }


        return results;
    }

    public double plusone(double correctanswer) {

        double results = correctanswer + 1;

        return results;
    }

    public double minusone(double correctanswer) {

        double results = correctanswer - 1;
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

    public String CreateHint(String hint, double correct_answer, double first, double second, double third, String item) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = third + " - (" + first + " + " + second + ") = _ " + "?";

        } else {
            results = hint;
        }

        return results;
    }
}
