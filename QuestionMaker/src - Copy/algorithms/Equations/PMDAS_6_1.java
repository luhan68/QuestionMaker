package algorithms.Equations;

import CalcFunctions.Calc;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author gene
 */
public class PMDAS_6_1 {

    public String HintImg = ""; // highlight columns
    public String SubjectType = "Expression";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int fifth = 0;
        double correct_answer = 20;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        boolean found = false;
        Calc FindAnswer = new Calc();
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold) + 1;
            second = rn.nextInt(high_threshold) + 1;
            third = rn.nextInt(high_threshold) + 1;
            fourth = rn.nextInt(high_threshold) + 1;
            fifth = rn.nextInt(high_threshold) + 1;
            if (fourth > fifth) {
                int temp1 = fifth;
                fifth = fourth;
                fourth = temp1;

            }
            try {
                String pre_question = first + RandomSign(4) + second + RandomSign(4) + third + RandomSign(4) + "(" + fourth + RandomSign(3) + fifth + ")";
                correct_answer = 0;
                try {
                    correct_answer = FindAnswer.solve(pre_question);
                } catch (Exception e) {
                }
                if (correct_answer >= low_threshold && correct_answer <= high_threshold) {
                    if ((first + second) >= low_threshold && (first + second) <= high_threshold) { // add if to other minus algos
                        String question = pre_question + " = ?";
                        results.addElement(question);
                        Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                        found = true;
                    }

                }
            } catch (Exception e) {
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer

            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random question within the threshold
                boolean isDuplicate = true;
                double randomanswer = 0;

                while (isDuplicate == true) { // check for duplicates (add to other algos)
                    boolean tester = false;
                    while (tester == false) {
                        try {
                            String rnd_q = first + RandomSign(4) + second + RandomSign(4) + third + RandomSign(4) + "(" + fourth + RandomSign(3) + fifth + ")";

                            randomanswer = FindAnswer.solve(rnd_q);
                            tester = true;
                        } catch (Exception e) {
                        }
                    }
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

        results.addElement(CreateHint(hint, 0, first, second, third));
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
        int results = 0;
        // This method creates an answer that is the inverse operation of the correct answer
        results = second + first;
        return results;
    }

    public String RandomSign(int num) {
        Random rn = new Random();

        int rnd = rn.nextInt(num);
        String mathString;
        switch (rnd) {
            case 1:
                mathString = "+";
                break;
            case 2:
                mathString = "-";
                break;
            case 3:
                mathString = "*";
                break;
            case 4:
                mathString = "/";
                break;
            default:
                mathString = "+";
                break;
        }

        return mathString;


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
            results = "Use The Proper Order Of Operations. First Parenthesis Then Multiply Then Divide Then Add Then Subtract";

        } else {
            results = hint;
        }

        return results;
    }
}
