/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level6_2;

import RandomItems.GetRandomNames;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MoneyWordProblem {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        double first = 0; // the cost
        int second = 0; // the discount
        double correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        DecimalFormat formatter = new DecimalFormat("$#####0.00");
 
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            double decimal = (rn.nextInt(100) + 1) / 100.0;
            first += decimal;
            second = rn.nextInt(5) + 2;
            
            correct_answer = first / second;
            
            String food = oneFood();
            
            if (true) { // matches criteria               
                // add question
                String question = "You spent " + formatter.format(first) + " on a " + second 
                        + " pound bag of" + food + ". How much does one pound of" + food + " cost?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(formatter.format(correct_answer));
            } else if (inverse_used == false) { // multiply instead
                double answer = first * second;
                results.addElement(formatter.format(answer));
                inverse_used = true;
            } else if (plusone_used == false) { //  plus 2
                double answer = correct_answer + 2;
                results.addElement(formatter.format(answer));
                plusone_used = true;
            } else if (minusone_used == false) { //  - .20
                double answer = correct_answer - .20;
                if(answer < 0){
                    answer = 0;
                }
                results.addElement(formatter.format(answer));
                minusone_used = true;
            } else { // + .40
                double randomNum = correct_answer + .40;
                results.addElement(formatter.format(randomNum));
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

    public String oneFood(){
        Random rn = new Random();
        int i = rn.nextInt(6);
        String food = "";
        
        switch(i){
            case 0:
                food = " apples";
                break;
            case 1:
                food = " oranges";
                break;
            case 2:
                food = " carrots";
                break;
            case 3:
                food = " melons";
                break;
            case 4:
                food = " cucumbers";
                break;
            case 5:
                food = " cherries";
                break;
            default:
                food = " INVALID";
                break;
        }
        return food;
    }
    
    public String oneUnit(){ //
        Random rn = new Random();
        int i = rn.nextInt(3);
        String place = "";
        
        switch(i){
            case 0:
                place = " lb";
                break;
            case 1:
                place = " g";
                break;
            case 2:
                place = " kg";
                break;
            default:
                place = "INVALID";
                break;
        }
        return place;
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

    public String CreateHint(String hint, double correct_answer, double first, double second) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "A unit rate is the amount per one unit. "
                    + "What operation do you need to use to find the amount per one unit?";
        } else {
            results = hint;
        }

        return results;
    }
}