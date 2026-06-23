package com.advance;

public class ReverseList {
	
	public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;


        while(curr != null) {

            // Store next node
            ListNode next = curr.next;

            // Reverse connection
            curr.next = prev;


            // Move pointers
            prev = curr;
            curr = next;
        }


        return prev;
    }

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		
		ReverseList obj = new ReverseList();
		
	      ListNode result = obj.reverseList(head);
	      
	      while(result != null){
	    	  
	    	  System.out.print(result.val + " ");

	            result = result.next;
	      }
	}
}