// 30 minutes

/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?


a --> b --> c --> b --> a 			YES

a --> b --> c --> b --> a --> d 	NO

Approach #1: 
	create a reversed version of the LL 
	compare original with the reversed
		- they should be equal
		- if not return false

O(N) time, O(N) space

*/


public class palindromeLL234 {

	static boolean isPalindrome (ListNode head) {

		ListNode p = head; 
		ListNode prev = new ListNode(p.next.val); //

		while (p.next != null) {

			ListNode temp = new ListNode(p.next.val);
			temp.next = prev; 
			prev = temp; 
			p = p.next;
		}

		ListNode x = head;
		ListNode y = prev;

		while (x.next != null) {
			if (x.val != y.val) {
				return false; 
			}
			x = x.next;
			y = y.next;
		}
 		return true;
	}

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */