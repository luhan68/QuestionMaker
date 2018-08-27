/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcFunctions;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		System.out.print("Enter math expression: ");
		Calc calc = new Calc();
                String function = "1+2*3+(4*5)";
                System.out.println(function);
		System.out.println("\n ans: "+calc.solve(function));
	}
}
