package algorithms.Counting.Level1_4;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class Blank_LESSTHAN_X {

    public String HintImg = "100schart.png";
    public String SubjectType = "COUNTING";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int correct_answer = 20;

        int Random_correct_letter = 0;

        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        second = 99999;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            if (first < 5) {
                first = 5;
            }
            if (first > 95) {
                first = 95;
            }
            second = rn.nextInt(high_threshold) + 1;
            while (second >= first) {
                second = rn.nextInt(high_threshold) + 1;

            }
            if (SubjectType == "BASE10") {

                if (first < 10) {
                    first = first + 10;
                }
                if (second < 10) {
                    second = second + 10;
                }
            }
            correct_answer = second; // this is the last num
            if (first >= low_threshold && first <= high_threshold) { // matches criteria
                String question = "__ < " + first;
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random question within the threshold

                int randomanswer = rn.nextInt(high_threshold) + 1;
                while (randomanswer < first) {
                    randomanswer = rn.nextInt(high_threshold) + 1;
                }

                results.addElement(randomanswer);

            }

        }
        //add in the hint and level
        results.addElement(RandomAnswer(Random_correct_letter));
        //skip qid

        results.addElement(CreateHint(hint, correct_answer, first, second, third));
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use hundreds chart. < equals smaller than. @ equals larger than.";

        } else {
            results = hint;
        }

        return results;
    }
}
