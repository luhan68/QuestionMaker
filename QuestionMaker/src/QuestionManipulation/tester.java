/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionManipulation;

/**
 *
 * @author gene
 */
public class tester {
    
    
    public static void main (String [] args){
       
        FruitsPluralizer p = new FruitsPluralizer();
       String val =  p.CheckFruitPlural("this is a test of 2 corn");
        
        
     //   CapitalizeFirstLetter f = new CapitalizeFirstLetter();
  //    String val =  f.Capitalize("this is a test. to see if it works properly.  is the correct way.");
        System.out.println(val);
    }
    
}
