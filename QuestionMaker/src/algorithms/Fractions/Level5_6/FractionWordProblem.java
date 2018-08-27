/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Fractions.Level5_6;

import Fractions.Fraction;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class FractionWordProblem {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // num
        int second = 0;// denom
        int third = 0; //num
        int fourth = 1; //  denom
        int newNum = 0;
        int newDenom = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        Fraction fractionHelper = new Fraction();  
        GetRandomNames nameHelper = new GetRandomNames();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            String name = nameHelper.OneName();
            String place = onePlace();
            
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(5) + 1;
            third = rn.nextInt(5) + 1;
            
            String temp = fractionHelper.Fraction_Math("multiply", first, 1, second, third);
            try {
                fourth = Integer.parseInt(temp);
            }catch(Exception e){
                fourth = 0;
            }
            
            correct_answer = first - fourth;
            
            if (fourth != 0 && correct_answer > 0 && second < third) { //the question
                String question = "A " + place + " is " + first + " miles away from " + name 
                        + "'s house. If " + name + " is " + second + "/" + third + " of the way there. "
                        + "How many more miles are left to drive ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add instead
                results.addElement(first + fourth);
                inverse_used = true;
            } else if (plusone_used == false) { // + 3
                results.addElement(correct_answer + 3);
                plusone_used = true;
            } else if (minusone_used == false) { // -1
                results.addElement(correct_answer - 1);
                minusone_used = true;
            } else { // random
                int random = correct_answer;
                while(results.contains(random) || random == correct_answer){
                    random = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                }
                results.addElement(random);
            }
        }
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, fourth));
        results.addElement(HintImg());
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public String onePlace(){ // "to get to a (place)"
        Random rn = new Random();
        int i = rn.nextInt(5);
        String place = "";
        
        switch(i){
            case 0:
                place = "baseball game";
                break;
            case 1:
                place = "soccer practice";
                break;
            case 2:
                place = "meeting";
                break;
            case 3:
                place = "friend's house";
                break;
            case 4:
                place = "restaurant";
                break;
            default:
                place = "INVALID PLACE";
                break;
        }
        return place;
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third, int fourth) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "Step 1: " + first + " x " + second + "/" + third + " = " + fourth
                    + ". Step 2: " + first + " - " + fourth+".";
        } else {
            results = hint;
        }

        return results;
    }
}