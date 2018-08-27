/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fractions;

/**
 *
 * @author gene
 */
public class Tester {
    
    public static void main (String []args){
        
        Fraction fraction = new Fraction();
        String res = fraction.Fraction_Math("divide", 1, 2, 4, 1);
   //  String res =   fraction.simplifyFractions(2, 4);
        System.out.println(res);
    }
    
    
}
