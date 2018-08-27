/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionManipulation;

/**
 *
 * @author gene
 */
public class CapitalizeFirstLetter {

    public String Capitalize(String text) {

        String results = "";

        text = text.toLowerCase();
        //Capitalize the first letter

        char[] letters = text.toCharArray();
        boolean next_letter_is_capital = false;
        for (int i = 0; i < letters.length; i++) {
            String test = "";
            test = test + letters[i];
            if(i == 0 && isAlpha(test)){
                test = test.toUpperCase();
            }
            
            if (next_letter_is_capital && isAlpha(test)) {
                test = test.toUpperCase();
                next_letter_is_capital = false;
            } else {
                if (test.contains(".")) {
                    next_letter_is_capital = true;
                }
            }
            results = results + test;
        }
  //      System.out.println(results);

        return results;
    }

    public boolean isAlpha(String val) {
        return val.matches("[a-zA-Z]+");
    }
    
}
