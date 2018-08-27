package algorithms.Base10.Level2_4;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class blank_greater_than_b_base10_2_4 {
    
    public String HintImg = "";
    public String SubjectType = "Base10";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        String correct_answer = "";
        int Random_correct_letter = 0;
        boolean inverse_used = false;
        boolean equals_used = false;
        boolean lessthan_used = false;
        boolean morethan_used = false;
        String sign = "";
        String results2 = "";
        //choose a random number between the threshold
        Random rn = new Random();
        int randomanswer = rn.nextInt(high_threshold) + 1;
        int randomanswer2 = rn.nextInt(high_threshold) + 1;
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            second = rn.nextInt(high_threshold) + 1;
            
            if (first > second) {
                sign = " > ";
            } else if (second > first) {
                sign = " < ";
            } else {
                sign = " = ";
            }

            correct_answer = first + sign + second;
            
            if (first >= low_threshold && first <= high_threshold
                    && second >= low_threshold && second <= high_threshold) { // matches criteria
                String question = "Which Statement Is True?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E

                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // check if one of the answers used yet is an inverse
                String answer = Inverse(first, second, sign, third);
                results.addElement(answer);
                inverse_used = true;
            } else if (equals_used == false){ // check if one of the answers is an equals
                int temprandomanswer = rn.nextInt(high_threshold) + 1;
                int temprandomanswer2 = rn.nextInt(high_threshold) + 1;
                if(temprandomanswer != temprandomanswer2) {
                    results2 = temprandomanswer + " = " + temprandomanswer2;
                    equals_used = true; 
                }
                results.addElement(results2);
            } else if(randomanswer > randomanswer2){ // add more answers
                if(lessthan_used == false) {   
                    results2 = randomanswer + " < " + randomanswer2;
                    lessthan_used = true;
                }
                else if(morethan_used == false){
                    results2 = randomanswer2 + " > " + randomanswer;
                    morethan_used = true;
                }
                results.addElement(results2);
            } else { // if randomanswer <= randomanswer2
                if (morethan_used == false){
                    results2 = randomanswer + " > " + randomanswer2;
                    morethan_used = true;
                }
                else if (lessthan_used == false){
                    results2 = randomanswer2 + " < " + randomanswer;
                    lessthan_used = true;
                }
            results.addElement(results2);
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

    public String Inverse(int first, int second, String sign, int correct) {
        String results = "";
        if (sign.equals(" > ")) {
            results = first + " < " + second;
        }else {
             results = first + " > " + second;
        }
        // This method creates an answer that is the inverse operation of the correct answer
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
            results = "< less than ~ > more than ~ = equals to";
            //results = "< less than > more than = equals to";
        } else {
            results = hint;
        }

        return results;
    }
}
