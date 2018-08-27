/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level4_2;

import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class HowMuchChangeMeasure4_2 {
    public String HintImg = "";
    public String SubjectType = "Measure";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // 
        int second = 0;// 
        int third = 0;
        int correct_answer = 0;
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        GetRandomNames namesHelper = new GetRandomNames();
               
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(high_threshold - low_threshold) + low_threshold; //money in cents
            second = rn.nextInt(4001) + 1000; // starting money in cents
            correct_answer = second - first;
            
            String name = namesHelper.OneName();
            String item = oneItem();
            
            if (second % 1000 == 0) { //the question
                String question = name + " had " + formatMoney(second) + " and bought a " + item + " for "
                        + formatMoney(first) + ". How much change will " + namesHelper.HisHersFinder(name) + " get back?";

                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(formatMoney(correct_answer));
            } else if (inverse_used == false) { // add instead
                int answer = first + second;
                results.addElement(formatMoney(answer));
                inverse_used = true;
            } else if (plusone_used == false) { // add 15 cents
                int answer = correct_answer + 15;
                results.addElement(formatMoney(answer));
                plusone_used = true;
            } else if (minusone_used == false) { // minus 5 cents
                int answer = correct_answer - 5;
                results.addElement(formatMoney(answer));
                minusone_used = true;
            } else { // random
                String formatted = "";
                do{
                    int answer = rn.nextInt(high_threshold - low_threshold) + low_threshold;
                    formatted = formatMoney(answer);
                }while(results.contains(formatted));
                results.addElement(formatted);
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
    
    public String oneItem(){
        String item = "";
        Random rn = new Random();
        int i = rn.nextInt(5);
        switch(i){
            case 0:
                item = "pen";
                break;
            case 1:
                item = "pencil";
                break;
            case 2:
                item = "eraser";
                break;
            case 3:
                item = "stapler";
                break;
            case 4:
                item = "notebook";
                break;
            default:
                item = "INVALID";
        }
        return item;
    }

    public String formatMoney(int amount){
        int afterDecimal = amount%100;
        String asString = "";
        if(afterDecimal < 10){
            asString = "0" + afterDecimal;
        }else{
            asString = "" + afterDecimal;
        }
        return "$" + amount/100 + "." + asString;
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

    public String CreateHint(String hint, double correct_answer, int first, int second, int third) {
        String results = "";
        
        if (hint.contains("Algorithm Generated")) {
            results = formatMoney(second) + " - " + formatMoney(first);
        } else {
            results = hint;
        }

        return results;
    }
}
