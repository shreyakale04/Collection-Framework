package com.Practice;

import java.util.Arrays;
import java.util.List;

public class SmallestNumber {

	public static void main(String[] args) {
		
		//Smallest Element without using Collections.min().
		List<Integer>list = Arrays.asList(10,50,30,90,20);
		
		int min = list.get(0);
		
		for(int num : list){
			
			if(num < min){
				
				min = num;
			}
		}
		System.out.println("Smallest Element : " + min);
		
		

	}

}
