package com.Practice;

import java.util.Stack;

public class RemoveStar {

public static void main(String[] args) {
	
	String s = "pro**gra*m*m";
	
	Stack<Character>stk = new Stack<>();

	for(char ch : s.toCharArray()){
		
		if(ch == '*'){
			
			if(!stk.isEmpty()){
				stk.pop();
			}
		}
		else{
			stk.push(ch);
		}
		
	}
	
	StringBuilder result = new StringBuilder();
    for(Character c :stk){
	   result.append(c);
	
}
    System.out.println(result);
	}

       
  
}
