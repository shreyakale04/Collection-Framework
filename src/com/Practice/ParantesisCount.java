package com.Practice;

public class ParantesisCount {
	
	public static boolean check(String s){

	    int count = 0;

	    for(char ch : s.toCharArray()){

	        if(ch == '(')
	            count++;
	        else
	            count--;

	        if(count < 0)
	            return false;
	    }
        return count == 0;
	}

	public static void main(String[] args) {
		
		 System.out.println(check("((()))"));   // true
	        System.out.println(check("(()"));      // false
	        System.out.println(check("())"));      // false
	        System.out.println(check("()()"));     // true
	}

}
