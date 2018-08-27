/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Algebra.Level3_2;

import QuestionManipulation.DuplicateFixer;
import RandomItems.GetRandomItems;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class MovieTheaterHas3_2 {
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
        int other_threshold = 21;
        int other_threshold_low = 4;
        int correct_answer = 20;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        DuplicateFixer dupFix = new DuplicateFixer();

        //Request Random Items
        String place = onePlace();

        while (found == false) { // try to produce a formula that is within the bounds

            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;         
            second = rn.nextInt(other_threshold - other_threshold_low) + other_threshold_low;
            
            correct_answer = first / second;
            
            if (first % second == 0) { // matches criteria
                String question = "A " + place + " has " + first + " seats. There are "
                        + second + " rows with the same number of seats. How many seats are in each row?";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, correct_answer);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = plusone(correct_answer);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                int answer = minusone(correct_answer);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomanswer = rn.nextInt(first) + 1;
                results.addElement(randomanswer);
            }

        }
        
        dupFix.eliminateIntAsStringDuplicates(results, ""+correct_answer, high_threshold, low_threshold, Random_correct_letter);
        
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, place));
        results.addElement(HintImg(place, first, second));
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public String onePlace(){
        String item = "";
        Random rn = new Random();
        int i = rn.nextInt(3);
        switch(i){
            case 0:
                item = "movie theater";
                break;
            case 1:
                item = "cinema";
                break;
            case 2:
                item = "classroom";
                break;
            default:
                item = "INVALID";
                break;
        }
        return item;
    }
    
    public int Inverse(int first, int second, int correct) {
        int results = 0;
            results = first - second;

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

    public String HintImg(String item, int first, int second) {
        // add syntax for hint image generation here
//CreateImageFromBase img = new CreateImageFromBase();
//String HintImg = img.Create(item, first, item, second,true, false ); // first bool is plud, second is minus




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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third, String item) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Divide " + first + " into " + second + " equal groups.";

        } else {
            results = hint;
        }

        return results;
    }
}
