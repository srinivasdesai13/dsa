package com.sd.dsa.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Calling the reverseLinkedList function
       
        ListNode reversedHead = reverseLinkedList(head);

        // Printing the reversed linked list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
	}

	private static ListNode reverseLinkedList(ListNode head) {

		ListNode current = head;
		ListNode prev = null;
		while(current!=null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		
			
		}
		
		
		return prev;
	}

}

 class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val = val;
    }
}


