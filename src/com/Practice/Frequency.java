package com.Practice;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		
		String[]arr = {"apple", "banana","apple", "mango", "banana", "mango",  "mango"};
		
		HashMap<String, Integer>map = new HashMap<>();
		
		for(String str : arr){
			
			map.put(str, map.getOrDefault(str, 0)+1);
			
			
		}
            System.out.println(map);
	}

}
