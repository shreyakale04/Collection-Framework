package com.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumber {

	public static void main(String[] args) {
		
		Queue<String>que = new LinkedList<>();
		
		que.add("1");
		
		for(int i = 1; i<=5; i++){
			
			String value = que.remove();
			
			System.out.print(value + " ");
			
			que.add(value + "0");
			que.add(value + "1");
			
		}
		
		
		

	}

}
