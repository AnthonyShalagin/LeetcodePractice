/*
Reverse a singly linked list.

1-2-3-4

1 <- 2 <- 3 <- 4 

4-3-2-1

https://ide.geeksforgeeks.org/index.php

*/

public class reverseLL206 {
	
	public static void main (String[] args) {
		System.out.println("H");
	}

	static Node reverseListIteratively (Node head) {
		Node prev = null; 
		Node curr = head; 
		Node n = null;

		while(curr != null) {
			n = curr.next;
			curr.next = prev;
			prev = curr; 
			curr = n;
		}
		return prev; 

	}


	static void reverseRecursively (Node curr) {
		if (curr == null) {
			return;
		}

		if (curr.next == null) {
			head = curr; 
			return; 
		}

		reverseRecursively(curr.next);
		curr.next.next = curr;  
		curr.next = null

	}

	//https://www.youtube.com/watch?v=MRe3UsRadKw

}