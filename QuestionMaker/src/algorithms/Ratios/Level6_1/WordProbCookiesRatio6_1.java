/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Ratios.Level6_1;

import RandomItems.GetRandomItems;
import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class WordProbCookiesRatio6_1 {
    public String HintImg = "";
    public String SubjectType = "Ratios";
    public String SubjectImage = "";
    GetRandomItems rnd_items = new GetRandomItems();
    GetRandomNames rnd_names = new GetRandomNames();
    
public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
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
        String item = rnd_items.OneItem() + "s"; // plural
        String name1 = rnd_names.OneName();
        String name2 = rnd_names.OneName();
        String name3 = rnd_names.OneName();
        
        while (found == false) { // try to produce a formula that is within the bounds
            
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            second = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            third = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = first + ":" + third; // needs simplifying
            
            if (second != first && second != third && first != third) { // matches criteria
                String question = name1 + " and " + name2 + " have " + item
                        + " in the ratio of " + first + ":" + second + ". " + name2
                        + " and " + name3 + " have " + item + " in the ratio of "
                        + second + ":" + third + ". What is the ratio of "
                        + name1 + "'s " + item + " to " + name3 + "'s " + item + "?";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // switch the numbers around
                results.addElement(third + ":" + first);
                inverse_used = true;
            } else if (plusone_used == false) { // 
                results.addElement(first + ":" + second);
                plusone_used = true;
            } else if (minusone_used == false) { // 
                results.addElement(second + ":" + first);
                minusone_used = true;
            } else { // random question within the threshold
                results.addElement(third + ":" + second);

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
