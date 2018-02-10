/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

1-->2-->1-->4
		|	|
		5<--3	

Approach 
	-two pointers
		-slow (move one)
		-fast (move two)

	-if there is a cycle they are guaranteed to intersect at some point
	-if they don't intersect, there is no cycle

Example
	1,2,1,4,3 (slow traversal sequence)
	1,1,3,1,3 (fast traversal sequence)


*/

public class LinkedListCycle141 {

	static boolean hasCycle(ListNode root) {
		
		if (root == null || root.next == null) {
			return false; 
		}

		ListNode slow = root.next;
		ListNode fast = root.next.next;

		while (fast != null && fast.next != null) {
			if (slow == fast) {
				return true; 
			}
			slow = slow.next;
			fast = fast.next.next; 
		}

		return false;
	}

}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */