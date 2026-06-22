package com.Practice;


import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {

	public static void main(String[] args) {
		
		String str = "aaabbcddeed";
		
       Map<Character, Integer>map = new LinkedHashMap<>();
       
       for(char ch : str.toCharArray()){
    	   
    	   map.put(ch, map.getOrDefault(ch, 0)+1);
    	   
       }
       for(char ch : map.keySet()){
    	   
    	   if(map.get(ch)==1){
    		   
    		   System.out.println(ch);
    		   
    		   break;
    	   }
       }
       
	}

}
