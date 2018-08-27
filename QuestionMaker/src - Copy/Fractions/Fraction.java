package Fractions;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class Fraction {

    double asNumber = 0;
    int numeratorSimplified = 0;
    int denominatorSimplified = 0;
    int wholeNumber = 0;
    String withoutWholeNumbers = "";
    
    public double getAsNumber(){
        return asNumber; // is set everytime a math calculation is used
    }
    
    public int getNumSimplified(){
        return numeratorSimplified;
    }
    
    public int getDenomSimplified(){
        return denominatorSimplified;
    }
    
    public int getWholeNumber(){
        return wholeNumber;
    }
    
    public String getWithoutWholeNumber(){
        return withoutWholeNumbers;
    }
    
    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    public int findGCD(int num, int denom){
        BigInteger bNum = new BigInteger(""+num);
        BigInteger bDenom = new BigInteger(""+denom);
        BigInteger gcd = new BigInteger(""+bNum.gcd(bDenom));
        return gcd.intValue();
    }
    
    public String simplifyFractions(int numerator, int denominator) {
        int gcd = findGCD(numerator, denominator);
        if(gcd > 1){
            numerator = numerator/gcd;
            denominator = denominator/gcd;
        }
        
        asNumber = (numerator * 1.0) / denominator;
        numeratorSimplified = numerator;
        denominatorSimplified = denominator;
        withoutWholeNumbers = numerator + "/" + denominator;
        
        wholeNumber = 0;
        int otherNumerator = numerator;
        while(otherNumerator >= denominator){
            otherNumerator -= denominator;
            wholeNumber++;
        }
        if(wholeNumber > 0){
            if(otherNumerator == 0){
                return "" + wholeNumber;
            }
            return "" + wholeNumber + " " + otherNumerator + "/" + denominator;
        }
        return numerator + "/" + denominator;
    }

    public String Fraction_Math(String operation, int a, int b, int c, int d) { // a/b, c/d
        String results = "";
        int add, sub, mul, dd;
        int add1, sub1, mul1, dd1;
        //Add
        if (operation == "add") {
            add = (a * d + b * c); 
            add1 = (b * d);
          results =  simplifyFractions(add, add1);
            
        }
        //Subtraction
        if (operation == "subtract") {
            sub = (a * d - b * c);
            sub1 = (b * d);
              simplifyFractions(sub, sub1);
            results = sub + "/" + sub1;
        }
        //Multiplication
        if (operation == "multiply") {
            mul = (a * c);
            mul1 = (b * d);
            results = simplifyFractions(mul, mul1);
        }
        //Division
        if (operation == "divide") {
            dd = (a * d);
            dd1 = (b * c);
            results = simplifyFractions(dd, dd1);
        }
        return results;
    }
}