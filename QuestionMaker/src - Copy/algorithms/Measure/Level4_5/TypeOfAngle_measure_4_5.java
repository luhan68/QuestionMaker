/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level4_5;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class TypeOfAngle_measure_4_5 {
    public String HintImg = "";
    public String SubjectType = "Fractions";
    public String SubjectImage = "";

    public int select = 0;
    
    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        int first = 0; // 
        int second = 0;// 
        int third = 0; //
        String correct_answer = "";
        int Random_correct_letter = 0;
        //choose a random number between the threshold
        Random rn = new Random();
        
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            
            correct_answer = getAngle(first);
            
            if (true) {
                //add question
                String question = "An angle of " + first + "° is";
                results.addElement(question);
                Random_correct_letter = select; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == 1) { 
                results.addElement("acute");
            } else if (i == 2) { 
                results.addElement("right");
            } else if (i == 3) { 
                results.addElement("obtuse");
            } else if (i == 4) { 
                results.addElement("straight");
            } else { 
                results.addElement("none");
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
  
    public String getAngle(int degree){
        String angle = "";
        if(degree < 90){
            angle = "acute";
            select = 1;
        }else if(degree == 90){
            angle = "right";
            select = 2;
        }else if(degree > 90){
            angle = "obtuse";
            select = 3;
        }else{
            angle = "straight";
            select = 4;
        }
        return angle;
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

    public String CreateHint(String hint, String correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "right angle= 90*~" +
                    "acute angle < 90*~" +
                    "obtuse angle > 90*~" +
                    "straight angle = 180*";
        } else {
            results = hint;
        }

        return results;
    }
}
