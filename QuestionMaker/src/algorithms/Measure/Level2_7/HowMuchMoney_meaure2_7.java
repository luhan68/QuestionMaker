/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level2_7;

import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class HowMuchMoney_meaure2_7 {
    public String HintImg = "";
    public String SubjectType = "Measure";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // the number of first coin type
        int second = 0;// 
        int third = 0;// 
        int correct_answer = 0;
        String correct_double = "";
        int Random_correct_letter = 0;
        String symbol = "";
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        GetRandomNames namesHelper = new GetRandomNames();
               
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            String typeOne = ""; // type of coin
            String typeTwo = ""; 
            String typeThree = ""; 
            String coinName = ""; // type of coin
            int valueOne = 0; // amount of that coin type * value of that coin
            int valueTwo = 0;
            int valueThree = 0;
            int i = 0;
            while(i < 3)
            {
                int temp = rn.nextInt(high_threshold - low_threshold) + low_threshold; //amount of a particular coin
                int randomCoin = rn.nextInt(5);
                int tempValue = 0;
                switch(randomCoin){
                    case 0:
                        coinName = "dollars";
                        tempValue = 100;
                        break;
                    case 1:
                        coinName = "quarters";
                        tempValue = 25;
                        break;
                    case 2:
                        coinName = "dimes";
                        tempValue = 10;
                        break;
                    case 3:
                        coinName = "nickels";
                        tempValue = 5;
                        break;
                    case 4:
                        coinName = "pennies";
                        tempValue = 1;
                        break;
                    default:
                        coinName = "NA";
                        break;
                }
                if(i == 0){
                    first = temp;
                    typeOne = coinName;
                    valueOne = tempValue * temp;
                    i++;
                }
                else if(i == 1){
                    if(!coinName.equals(typeOne)){
                        second = temp;
                        typeTwo = coinName;
                        valueTwo = tempValue * temp;
                        i++;
                    }
                }
                else{
                    if(!coinName.equals(typeOne) && !coinName.equals(typeTwo)){
                        third = temp;
                        typeThree = coinName;
                        valueThree = tempValue * temp;
                        i++;
                    }
                }
            }    
            correct_answer = valueOne + valueTwo + valueThree;  
            String nameOne = namesHelper.OneName();
            if (correct_answer < 1000) {
                String question = nameOne + " has " + first + " " +typeOne + ", " + second +  " " +typeTwo
                        + ", and " + third + " " + typeThree + ". How much money does " + nameOne + " have?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                symbol = findSymbol(correct_answer);
                results.addElement(symbol + formatMoney(correct_answer));
            } else if (inverse_used == false) { // add 100
                int number = correct_answer + 100;
                symbol = findSymbol(number);
                results.addElement(symbol + formatMoney(number));
                inverse_used = true;
            } else if (plusone_used == false) { // add 10
                int number = correct_answer + 10;
                symbol = findSymbol(number);
                results.addElement(symbol + formatMoney(number));
                plusone_used = true;
            } else if (minusone_used == false) { // minus 5
                int number = correct_answer - 5;
                symbol = findSymbol(number);
                results.addElement(symbol + formatMoney(number));
                minusone_used = true;
            } else { // random number
                int randomanswer = correct_answer;
                while(randomanswer == correct_answer){
                    randomanswer = rn.nextInt(1000) + 1;
                }
                symbol = findSymbol(randomanswer);
                results.addElement(symbol + formatMoney(randomanswer));
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
    
    public String findSymbol(int number){
        String symbol = "";
        if(number >= 100){
            symbol = "$";
        }
        else{
            symbol = "¢";
        }
        return symbol;
    }
    
    public String formatMoney(int amount){
        int afterDecimal = amount%100;
        String asString = "";
        if(afterDecimal < 10){
            asString = "0" + afterDecimal;
        }else{
            asString = "" + afterDecimal;
        }
        return amount/100 + "." + asString;
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
            results = "penny = 1 cent. " +      "nickel = 5 cents. " +
                    "dime = 10 cents. " +
                    "quarter = 25 cents.";
        } else {
            results = hint;
        }

        return results;
    }
}
