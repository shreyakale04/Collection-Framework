package com.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(10,50,30,90,20);
		
		//Second Largest
		Collections.sort(list);
		
		System.out.println("Second Largest no : " + list.get(list.size()- 2));
        
		//Smallest no
		
		int smallest = Collections.min(list);
		
		System.out.println("Smallest no : " + smallest);
	}

}
