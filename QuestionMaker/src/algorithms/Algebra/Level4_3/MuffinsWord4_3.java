/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level4_3;

import RandomItems.GetRandomItems;
import RandomItems.GetRandomNames;
import QuestionManipulation.DuplicateFixer;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MuffinsWord4_3 {
    public String HintImg = "";
    public String SubjectType = "Algebra";
    public String SubjectImage = "";
    GetRandomNames names = new GetRandomNames();
    GetRandomItems rnd_items = new GetRandomItems();

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int totalMade = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        DuplicateFixer dupFix = new DuplicateFixer();
        
        //request random items
        String food = randomFood();
        String food2 = randomFood();
        String food3 = randomFood();
        while (food2.equals(food)){
            food2 = randomFood();
        }
        while(food3.equals(food2) || food3.equals(food)){
            food3 = randomFood();
        }

        while (found == false) { // try to produce a formula that is within the bounds

            first = rn.nextInt(4) + 1;
            second = rn.nextInt(4) + 1;
            third = rn.nextInt(4) + 1;
            totalMade = (first * 12 + second * 12 + third * 12);
            fourth = rn.nextInt(totalMade - 1) + 1;
            correct_answer = totalMade - fourth;
            
            if (correct_answer < totalMade && totalMade < 80) { // matches criteria
                String question = "The bakery made " + first + " dozen " + food +", "
                        + second + " dozen " + food2 + ", and " + third
                        + " dozen " + food3 + ". They sold " + fourth
                        + " muffins. How many muffins are left?";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // 
                int wrong = totalMade - (first + second + third);
                results.addElement(wrong);
                inverse_used = true;
            } else { // random question within the threshold
                int random = rn.nextInt(high_threshold) + 1;
                while (results.contains(random)) {
                    random = rn.nextInt(high_threshold) + 1;
                }
                results.addElement(random);
            }

        }
        
        dupFix.eliminateIntAsStringDuplicates(results, "" + correct_answer,
                high_threshold, low_threshold, Random_correct_letter);
                
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

    public String randomFood(){
        Random rn = new Random();
        int i = rn.nextInt(5);
        String food = "";
        
        switch(i){
            case 0:
                food = "oatmeal muffins";
                break;
            case 1:
                food = "raisin muffins";
                break;
            case 2:
                food = "chocolate chip muffins";
                break;
            case 3:
                food = "corn muffins";
                break;
            case 4:
                food = "blueberry muffins";
                break;
            default:
                food = "INVALID";
                break;
        }
        return food;
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
            results = "Add the total of all the muffins and subtract " + fourth
                    + " to get the answer.";

        } else {
            results = hint;
        }

        return results;
    }
}
