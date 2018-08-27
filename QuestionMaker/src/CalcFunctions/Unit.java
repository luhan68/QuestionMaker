
package CalcFunctions;

import java.util.*;

public class Unit {
	
	public ArrayList<String> terms = new ArrayList<String>();
	public ArrayList<String> operations = new ArrayList<String>();
	public Double ans;

	public double solve(String s){
		if(!validate(s))
			ans = Double.parseDouble(s);
		else{
			parser(s);
			go();
		}
		return ans;
	}
	
	public boolean validate(String s){
		boolean valid = s.contains("*") || s.contains("/") || s.contains("+") || s.contains("-")|| s.contains("^");
		return valid;
	}
	
	private void parser(String s){
		// build terms array
		s = s.replace("-", "+-");
		String[] ter = s.split("([\\+\\*\\/\\^])");
		for(String t : ter)
			terms.add(t);
		
		// build operations array
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='+'||s.charAt(i)=='^')
				operations.add(s.charAt(i)+"");
	}
	
	private void go(){
		if(operations.size() == 0) // finished when no operations left
			ans = Double.parseDouble(terms.get(0));
		else {
			for(int i=0;i<operations.size();i++){
				
				boolean ex = operations.contains("^");
				
				if(ex){
					if(operations.get(i).contains("^")){
						expo(i);
						break;
					}
				}
				else {				
					boolean md = operations.contains("*") || operations.contains("/"); // are there still multi or div ops
	
					if(md){
						// resolve multiplication and division
						if(operations.get(i).contains("*")){
							multiply(i);
							break;
						} else if(operations.get(i).contains("/")) {
							divide(i);
							break;
						}
					}
					else {
						// when not mult or div left, resolve add/sub
						if(operations.get(i).contains("+")){
							add(i);
							break;
						}
					}
				}
			}
			go();
		}
	}
	
	private void expo(int x){
		double val = Math.pow(Double.parseDouble(terms.get(x)), Double.parseDouble(terms.get(x+1)));
		update(x,val);	
	}
	
	private void multiply(int x){
		double val = Double.parseDouble(terms.get(x)) * Double.parseDouble(terms.get(x+1));
		update(x,val);	
	}
	
	private void divide(int x){
		double val = Double.parseDouble(terms.get(x)) / Double.parseDouble(terms.get(x+1));
		update(x,val);
	}

	private void add(int x){
		double val;
		// compute 0-Z when -Z is leading term in expression
		if(terms.get(x).isEmpty())
			val = 0 + Double.parseDouble(terms.get(x+1));
		else
			val = Double.parseDouble(terms.get(x)) + Double.parseDouble(terms.get(x+1));
		
		update(x,val);
	}
	
	private void update(int x, double val){
		// update array with results
		terms.set(x,val+"");
		terms.remove(x+1);
		operations.remove(x);
	}
}
