package algorithms.Base10.Level2_8;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class minus_10_or_100_base10_2_8 {
    
    public String HintImg = "placechart.png"; // number lines
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;  Vector results = new Vector();
        int first = 0;
        int second = 0; // must be either 10 or 100
        int third = 0; // not in use
        int correct_answer = 20;
        int Random_correct_letter = 0;
        int random_second = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        //set second to either 10 or 100
        random_second = rn.nextInt(2) + 1;
        if(random_second == 1){
            second = 10;
        }
        else{
            second = 100;
        }
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            correct_answer = first - second;
            if (first >= low_threshold && first <= high_threshold) {
                String question = first + " - " + second + " = ?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                int answer = Inverse(first, second, high_threshold, correct_answer);
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

    public int Inverse(int first, int second, int high_threshold, int correct) {
        int results = 0;
        // This method creates an answer that is the inverse operation of the correct answer
         results = second + first;
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

    public String CreateHint(String hint, int correct_answer, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "Use sketch pad. Rewrite the problem vertically according to place value.";

        } else {
            results = hint;
        }

        return results;
    }
}
