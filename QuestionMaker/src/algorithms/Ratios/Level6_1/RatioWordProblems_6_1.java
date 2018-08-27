/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level6_1;

//import RandomItems.CreateImageFromBase;
import RandomItems.GetRandomItems;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class RatioWordProblems_6_1 {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    GetRandomItems rnd_items = new GetRandomItems();
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

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
        second = 99999;
        //Request Random Items
        String item = rnd_items.OneItem();
        String location = "";
        
        while (found == false) { // try to produce a formula that is within the bounds
            location = rnd_items.OneLocation();
            
            first = rn.nextInt(high_threshold - low_threshold) + 1; // boys
            first += low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + 1; // girls
            second += low_threshold;
            
            correct_answer = first + " to " + second; // needs simplifying
            
            if (true) { // matches criteria
                String question = "There were " + first + " boys and " + second + " girls in a "
                        + location + ". What is the ratio of boys to girls?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, correct_answer);
                results.addElement(answer);
                inverse_used = true;
            } else if (plusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusNum(first, second, correct_answer);
                results.addElement(answer);
                plusone_used = true;
            } else if (minusone_used == false) { // check if one of the answers used yet is an inverse
                String answer = plusDenom(first, second, correct_answer);
                results.addElement(answer);
                minusone_used = true;
            } else { // random question within the threshold
                int randomNum = rn.nextInt(high_threshold - low_threshold) + 1; // boys
                first += low_threshold;
                int randomDenom = rn.nextInt(high_threshold - low_threshold) + 1; // girls
                second += low_threshold;
                if (randomNum == first && randomDenom == second) {
                    randomNum += 3;
                }
                String randomAnswer = randomNum + " to " + randomDenom;
                results.addElement(randomAnswer);

            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third, item));
        results.addElement(HintImg(item, first, second));
        results.addElement(level);
        results.addElement("1"); //Hard coded subject = math
        results.addElement(SubjectType());
        results.addElement("0"); //uid =0 means ALL users get it
        results.addElement("0"); //sid = 0; means all students get it
        results.addElement(SubjectImage()); //subject image image

        return results;
    }
    
    public String Inverse(int first, int second, String correct) {
 
        return second + " to " + first;
    }

    public String plusNum(int first, int second, String correct) {

        return (first + 1) + " to " + second;
    }

    public String plusDenom(int first, int second, String correct) {
     
        return first + " to " + (second + 1);
    }

    public String HintImg(String item, int first, int second) {
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third, String item) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "A ratio is a comparison of two quantities. Remember that the order matters." ;

        } else {
            results = hint;
        }

        return results;
    }
}
