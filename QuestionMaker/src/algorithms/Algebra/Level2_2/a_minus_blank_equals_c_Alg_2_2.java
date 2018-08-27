package algorithms.Algebra.Level2_2;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class a_minus_blank_equals_c_Alg_2_2 { // same as algo 1_4
       public String HintImg = "numberline2.png"; // list mental strategies
    public String SubjectType = "OPERATIONS";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;
        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int correct_answer = 20;

        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
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
            third = first - second;
            correct_answer = second;
            if (correct_answer >= low_threshold && correct_answer <= high_threshold) { // matches criteria
                String question =  first + " - _ = " + third + "?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
       for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, third, correct_answer);
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
                boolean isDuplicate = true;
                int randomanswer = 0;
                
                while (isDuplicate == true) { // check for duplicates (add to other algos)
                    randomanswer = rn.nextInt(high_threshold) + 1;
                    if (randomanswer != correct_answer && !results.contains(randomanswer)) {
                        isDuplicate = false;
                    }
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

    public int Inverse(int first, int second, int third, int correct) {
        int results = first + third;
        // This method creates an answer that is the inverse operation of the correct answer      

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

    // wrong type of hint?
    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use number line. Start at " + first + " and subtract " + third + ".";

        } else {
            results = hint;
        }

        return results;
    }

}
