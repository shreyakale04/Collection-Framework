package com.Practice;

import java.util.Stack;

public class ValidParenthesis {

	public static boolean check(String s){
		
		Stack<Character>stk = new Stack<>();
		
		for(char ch: s.toCharArray()){
			
			if(ch == '(' || ch == '{' || ch == '['){
				
			stk.push(ch);
			}
			else{
				
				if(stk.isEmpty())
					return false;
				
				char top = stk.pop();
				
				if(ch==')' && top!='(' ||
					ch=='}' && top != '{' ||
					ch ==']' && top != '[');
				
				return false;
			}
		}
		return stk.isEmpty();
	}
	
	public static void main(String[] args) {
		
		System.out.println(check("({[]})"));
	}
}
