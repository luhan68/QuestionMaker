/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Expressions_Level6_6;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class ExpressionWordProblem_6_6 {
    
    public String HintImg = "";
    public String SubjectType = "Expressions";
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
        boolean Last_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            second = rn.nextInt(5) + 1;
            third = rn.nextInt(high_threshold) + 1;
           

            correct_answer = "("+first+"/x)*$"+second+"."+third;
            if (third >= low_threshold && third <= high_threshold) { // matches criteria
                String question = "Your car travels x miles per gallon of gas.  You travel "
                        + first + " miles to your friend's house.  Gas costs $" + second + "."+third +" per gallon.  "
                        + "Which expression shows how much you will spend for gas on the trip? ";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E

                found = true;


            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, third, third);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusone(first, second, third);
                results.addElement(answer);
                plusone_used = true;
            } else if (Last_used == false) { // check if one of the answers used yet is an inverse
                String answer = Last(first, second, third);
                results.addElement(answer);
                Last_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = minusone(first, second, third);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(high_threshold) + 1;
                if (randomanswer == second) {
                    randomanswer = second + 5;
                }
                String results2 = "";
                int rndm_first = first + randomanswer;
                if (rndm_first + randomanswer != third) {
                    results2 = rndm_first + " + " + randomanswer + " = " + first + " + " + second;
                } else {
                    results2 = (rndm_first + 1) + " + " + randomanswer + " = " + first + " + " + second;
                }

                results.addElement(results2);

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

    public String Inverse(int first, int second, int third, int correct) {
        String results = "("+second+"*x)/$"+second+"."+third;

        // This method creates an answer that is the inverse operation of the correct answer
        return results;
    }

    public String plusone(int first, int second,int third) {

      String results = "("+first+"+x)*$"+second+"."+third;


        // This method creates an answer that is the inverse operation of the correct answer
        return results;
    }

    public String minusone(int first, int second, int third) {

        String results = ""+first+"*x+$"+second+"."+third;

        //  String results = "x - " +  first;
        return results;
    }

    public String Last(int first, int second, int third) {
      String results =   "("+first+"*x + y)";

        //   String results = "x - " +  (first+1);
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
        String results = "Use Inverse Operations To Solve The Equations";


        return results;
    }
}
