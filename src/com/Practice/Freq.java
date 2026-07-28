package com.Practice;

import java.util.HashMap;

public class Freq {

	public static void main(String[] args) {
		
//		String[]arr = {"apple", "banana","apple", "mango", "banana", "mango",  "mango"};
		String name = "aabbbccd"; 
		
		HashMap<Character, Integer>map = new HashMap<>();
		
		
			
	   for(char ch : name.toCharArray()){
		   
		   map.put(ch, map.getOrDefault(ch, 0)+1);
	   }
	   
	   System.out.println("Frequency of each character");
		System.out.println(map);
		
		for(char ch1 : map.keySet()){
			
			if(map.get(ch1)==1){
				
				System.out.println("Non repeating characters = " + ch1);
			}
		}
	   
		}

		
	}


