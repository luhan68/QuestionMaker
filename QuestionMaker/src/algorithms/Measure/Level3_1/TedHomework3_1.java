/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.Measure.Level3_1;

import RandomItems.GetRandomNames;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Karl
 */
public class TedHomework3_1 {
    public String HintImg = "";
    public String SubjectType = "Measure";
    public String SubjectImage = "";

public Vector generate(int low_threshold, int high_threshold, String hint, String level, String subjectype) {
        SubjectType = subjectype;

        Vector results = new Vector();
        int first = 0; // starting hour
        int second = 0;// starting minute
        String third = "";// time (hours:minutes)
        int correctHours = 0;
        int correctMinutes = 0;
        int hoursLater = 0;
        int minutesLater = 0;
        String correct_answer = "";
        String fourth = "";
        int Random_correct_letter = 0;
        boolean plusone_used = false;
        boolean minusone_used = false;
        boolean inverse_used = false;
        //choose a random number between the threshold
        Random rn = new Random();
        GetRandomNames namesHelper = new GetRandomNames();
               
        boolean found = false;
        while (found == false) { // try to produce a formula that is within the bounds
            first = rn.nextInt(12) + 1;
            second = randomMinutes();          
            third = first + ":" + second;
            if(second == 0){
                third = third + "0";
            }
            hoursLater = rn.nextInt(3) + 1;
            minutesLater = randomMinutes();
            fourth = addTime(first, second, hoursLater, minutesLater);
            if(fourth.length() == 5){
                correctHours = Integer.parseInt(fourth.substring(0, 2));
                correctMinutes = Integer.parseInt(fourth.substring(3));
            }else{
                correctHours = Integer.parseInt(fourth.substring(0, 1));
                correctMinutes = Integer.parseInt(fourth.substring(2));
            }
            
            String nameOne = namesHelper.OneName();
            if (true) { //the question
                String hours = "";
                String minutes = "";
                if(hoursLater == 1){
                    hours = "1 hour";
                }else{
                    hours = hoursLater + " hours";
                }
                
                if(minutesLater == 0){
                    minutes = "";
                }else{
                    minutes = " and " + minutesLater + " minutes";
                }
                
                correct_answer = hours + minutes;
                
                String question = nameOne + " started his homework at " + third
                        + " and ended at " + fourth + ". How long did " + namesHelper.HisHersFinder(nameOne)
                        + " spend doing his homework?";
                
                //String question = nameOne + " started cleaning the house at " + third
                  //      + ". It took " + hours + minutes + " to clean the whole thing. "
                    //    + "At what time was the cleaning all done?";
                results.addElement(question);
                Random_correct_letter = rn.nextInt(5) + 1; // A,B,C,D,E
                found = true;
            }
        }
        for (int i = 1; i < 6; i++) { //mix in the random answers with the correct answer
            if (i == Random_correct_letter) { //this is the randomly selected letter
                results.addElement(correct_answer);
            } else if (inverse_used == false) { // add one hour
                int hoursWrong = hoursLater + 1;
                int minutesWrong = minutesLater;
                
                String timeHours = "";
                String timeMinutes = "";
                
                if(hoursWrong == 1){
                    timeHours = "1 hour";
                }else{
                    timeHours = hoursWrong + " hours";
                }
                
                if(minutesWrong == 0){
                    timeMinutes = "";
                }else{
                    timeMinutes = " and " + minutesWrong + " minutes";
                }
                
                String wrongAnswer = timeHours + timeMinutes;
                
                results.addElement(wrongAnswer);
                inverse_used = true;
            } else if (plusone_used == false) { // add 15 minutes
                int hoursWrong = hoursLater;
                int minutesWrong = minutesLater + 15;
                if(minutesLater >= 60){
                    minutesLater = minutesLater - 15;
                }
                
                String timeHours = "";
                String timeMinutes = "";
                
                if(hoursWrong == 1){
                    timeHours = "1 hour";
                }else{
                    timeHours = hoursWrong + " hours";
                }
                
                if(minutesWrong == 0){
                    timeMinutes = "";
                }else{
                    timeMinutes = " and " + minutesWrong + " minutes";
                }
                
                String wrongAnswer = timeHours + timeMinutes;
                
                results.addElement(wrongAnswer);
                plusone_used = true;
            } else if (minusone_used == false) { // add 30 minutes
                int hoursWrong = hoursLater;
                int minutesWrong = minutesLater + 30;
                
                if(minutesLater >= 60){
                    minutesLater = minutesLater - 30;
                }
                String timeHours = "";
                String timeMinutes = "";
                
                if(hoursWrong == 1){
                    timeHours = "1 hour";
                }else{
                    timeHours = hoursWrong + " hours";
                }
                
                if(minutesWrong == 0){
                    timeMinutes = "";
                }else{
                    timeMinutes = " and " + minutesWrong + " minutes";
                }
                
                String wrongAnswer = timeHours + timeMinutes;
                
                results.addElement(wrongAnswer);
                minusone_used = true;
            } else { // add 2 hours
                int hoursWrong = hoursLater + 2;
                int minutesWrong = minutesLater;
                String timeHours = "";
                String timeMinutes = "";
                
                if(hoursWrong == 1){
                    timeHours = "1 hour";
                }else{
                    timeHours = hoursWrong + " hours";
                }
                
                if(minutesWrong == 0){
                    timeMinutes = "";
                }else{
                    timeMinutes = " and " + minutesWrong + " minutes";
                }
                
                String wrongAnswer = timeHours + timeMinutes;
                
                results.addElement(wrongAnswer);
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
    
    public int randomMinutes(){
        Random r = new Random();
        int random = r.nextInt(4);
        int minutes = 0;
        switch(random){
            case 0:
                minutes = 0;
                break;
            case 1:
                minutes = 15;
                break;
            case 2:
                minutes = 30;
                break;
            case 3:
                minutes = 45;
                break;
            default:
                minutes = -5;
                break;
        }
        return minutes;
    }
    
    public String addTime(int hourOne, int minuteOne, int hourTwo, int minuteTwo){
        int hour = hourOne + hourTwo;
        int minute = minuteOne + minuteTwo;
        int addHours = 0;
        
        while(minute >= 60){
            minute -= 60;
            addHours++;
        }
        hour += addHours;
        
        while(hour > 12){
            hour -= 12;
        }
        String result = hour + ":" + minute;
        if(minute == 0){
            result = result + "0";
        }    
        return result;
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

    public String CreateHint(String hint, String correct_answer, int first, int second, String third) {
        String results = "There are 60 minutes in an hour.";
        
        if (hint.contains("Algorithm Generated")) {
            results = "";
        } else {
            results = hint;
        }

        return results;
    }
}
