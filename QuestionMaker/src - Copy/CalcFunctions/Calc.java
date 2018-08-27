/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcFunctions;

/**
 *
 * @author gene
 */
public class Calc {
	
	private String expr; // input expression
	public String paren; // parenthetical expression to be evaluated
	public Double ans;
	
	public double solve(String s){
		expr = s;
		go();
		return ans;
	}
	
	private void go(){
		if(!expr.contains("(")){
			// solve remaining expression
			Unit temp = new Unit();
			ans = temp.solve(expr);		
		} else {
			int open = 0;
			int close = 0;
			
			// find index of right most inner most open parenthesis
			for(int i=0;i<expr.length();i++){
				if(expr.charAt(i)=='(')
					open = i;
			}
			
			// find corresponding close parenthesis
			for(int i=open;i<expr.length();i++){
				if(expr.charAt(i)==')'){
					close = i;
					break;
				}
			}
			
			// extract parenthetical
			paren = expr.substring(open+1, close);

			// solve parenthetical
			Unit temp = new Unit();
			double tempVal = temp.solve(paren);

			 //update expression string
			expr = expr.replace(expr.substring(open, close+1),tempVal+"");

			// reiterate
			go();
		}
	}

}
