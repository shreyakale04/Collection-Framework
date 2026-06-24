package com.advance;

public class AddTwoNos {

	public ListNode addTwoNo(ListNode l1, ListNode l2){
		
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry !=0){
			
			int sum = carry;
			
			if(l1 != null){
				
				sum += l1.val;
				l1 = l1.next;
				
			}
			if(l2 != null){
				
				sum += l2.val;
				l2 = l2.next;
			}
			
			carry = sum/10;
			
			current.next = new ListNode(sum%10);
			current = current.next;
		}
		
		return dummy.next;
	}
	public static void main(String[] args) {
		
		 // First number: 342
        // Linked List: 2 -> 4 -> 3
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		  // Second number: 465
        // Linked List: 5 -> 6 -> 4
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		AddTwoNos n = new AddTwoNos();
		
		ListNode result = n.addTwoNo(l1, l2);
		
		while(result != null){
			
			System.out.println(result.val + " ");
			
			result = result.next;
		}
	}

}
