/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level6_2;

import java.text.DecimalFormat;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MilesWordProblem6_2 {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // the cost
        int second = 0; // the discount
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        DecimalFormat formatter = new DecimalFormat("$#####0.00");
        GetRandomNames nameHelper = new GetRandomNames();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(7) + 2;
            
            correct_answer = first / second;
            
            String name = nameHelper.OneName();
            String pronoun = nameHelper.GenderFinder(name);
            
            if (first % second == 0) { // matches criteria               
                // add question
                String question = name + " drove " + first + " miles in " + second + " hours. "
                        + "At this rate, how many miles can " + pronoun + " drive in 1 hour?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer + " miles");
            } else if (inverse_used == false) { // multiply instead
                int answer = first * second;
                results.addElement(answer + " miles");
                inverse_used = true;
            } else if (plusone_used == false) { // minus 7
                int answer = correct_answer - 7;
                results.addElement(answer + " miles");
                plusone_used = true;
            } else if (minusone_used == false) { // + 33
                int answer = correct_answer + 33;
                if(answer < 0){
                    answer = 0;
                }
                results.addElement(answer + " miles");
                minusone_used = true;
            } else { // + 11
                int answer = correct_answer + 11;
                results.addElement(answer + " miles");
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
