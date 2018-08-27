/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcFunctions;

/**
 *
 * @author gene
 */
public class NumbersToWords {
    
    
    public String conversion(int num){
        String results = "";
        switch (num) {
            case 1:  results = "one";
                     break;
            case 2:  results = "two";
                     break;
            case 3:  results = "three";
                     break;
            case 4:  results = "four";
                     break;
            case 5:  results = "five";
                     break;
            case 6:  results = "six";
                     break;
            case 7:  results = "seven";
                     break;
            case 8:  results = "eight";
                     break;
            case 9:  results = "nine";
                     break;
         
        }

        return results;
    }
    
    
}
