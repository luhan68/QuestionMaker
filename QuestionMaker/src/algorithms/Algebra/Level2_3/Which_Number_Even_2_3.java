package algorithms.Algebra.Level2_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Which_Number_Even_2_3 {
    
    public String HintImg = ""; // divide into two towers
    public String SubjectType = "OPERATIONS";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1; // produces a random value up to high_threshold

            correct_answer = "" + first;
            if (first % 2 == 0) { //is even
                if (first > low_threshold && first <= high_threshold) { // matches criteria
                    String question = "Which Number is Even?";
                    results.addElement(question);
                    Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E

                    found = true;
                }
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random question within the threshold

                boolean odd_found = false;
                int randomanswer = 0;

                while (odd_found == false) {
                    randomanswer = rn.nextInt(high_threshold) + 1; //get a random number
                    if (randomanswer % 2 != 0 && !results.contains(randomanswer)) {
                        // odd
                        odd_found = true;
                    }

                }

                results.addElement(randomanswer);

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
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "A number is even if it can be divided by 2 without a remainder.";
        } else {
            results = hint;
        }

        return results;
    }

}
