package algorithms.Algebra.Level2_3;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class Number_Between_Alg_2_3 {
    
    public String HintImg = ""; // divide into two towers
    public String SubjectType = "Algebra";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0;
        int second = 0;
        int third = 0;
        //choose a random number between the threshold
        Random rn = new Random();

        first = rn.nextInt(high_threshold) + 1; // produces a random value up to high_threshold

        String question = "Is the number " + first + " an even number or an odd number?";
        results.addElement(question);
        
        results.addElement("Even");
        results.addElement("Odd");
        
        if (first % 2 == 0) {
            //even
            results.addElement("optionA");
        } else {
            //odd
            results.addElement("optionB");
        }
        
        //add in the hint and level
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
    
    public String CreateHint(String hint, int first, int second, int third) {
        String results = "";
        if (hint.contains("Algorithm Generated")) {
            results = "An Even Number Can Be Divided By 2 Without A Remainder.";
        } else {
            results = hint;
        }

        return results;
    }

}
