/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Geometry.Level3_1;

import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class HowManySides_geo3_1 {
    public String HintImg = "";
    public String SubjectType = "Geometry";
    public String SubjectImage = "";

    public Vector generate(int low_threshold, int high_threshold, String hint, String level) {

        Vector results = new Vector();
        String first = ""; // the shape in question
        int second = 0;// 
        String third = "";// 
        int correct_answer = 0; //sides for the shape 
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
               
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            correct_answer = rn.nextInt(high_threshold - low_threshold) + low_threshold;
            first = getShape(correct_answer);
            
            if (true) { //the question
                String question = "How many sides does a " + first + " have?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else { // random
                int number = unusedRandomNumber(3, 13, results);
                results.addElement(number);
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
    
    public int unusedRandomNumber(int low, int high, Vector a){
        Random r = new Random();
        int randomNumber = 0;
        do{
            randomNumber = r.nextInt(high - low) + low;
        }while(a.contains(randomNumber));
        return randomNumber;
    }
    
    public String getShape(int sides){
        String shape = "";
        switch(sides){
            case 3:
                shape = "triangle";
                break;
            case 4:
                shape = "quadrilateral";
                break;
            case 5:
                shape = "pentagon";
                break;
            case 6:
                shape = "hexagon";
                break;
            case 7:
                shape = "heptagon";
                break;
            case 8:
                shape = "octagon";
                break;
            case 9:
                shape = "nonagon";
                break;
            case 10:
                shape = "decagon";
                break;
            default:
                shape = "illegalNumberOfsides";
                break;
        }
        return shape;
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

    public String CreateHint(String hint, int correct_answer, String first, int second, String third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = "";
        } else {
            results = hint;
        }

        return results;
    }
}
