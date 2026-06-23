package com.advance;

public class MergeTwoLists{

	public ListNode mergeTwoLists(ListNode list1, ListNode list2){
		
		ListNode dummy = new ListNode(-1);
		
		ListNode current = dummy;
		
		while(list1 != null && list2 != null){
			
			if(list1.val <= list2.val){
			
			current.next = list1;
				list1 = list1.next;
		}
		
		else{
			
			current.next = list2;
			list2 = list2.next;
		}		
 			current = current.next;
			
		}
	     
		if(list1 != null){
			
			current.next = list1;
			
			
		}	
		else{
			
			current.next = list2;
		}	
			
		
		return dummy.next;
	}
	public static void main(String[] args) {
		
		//first sorted Linked List 
		ListNode list1 = new ListNode(1);
		
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);
		
		//Second sorted Linked List
		ListNode list2 = new ListNode(2);
		
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);
		
		MergeTwoLists obj = new MergeTwoLists();
		
		ListNode result = obj.mergeTwoLists(list1, list2);
		
		while(result != null){
			
			System.out.println(result.val + " ");
			
			result = result.next;
		}
		
	}
	
}
