public class mergeTwoSortedLL21 {
	public static void main (String[] args) {
		System.out.println("H");
	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	/*
		Approach: 
			go thru each list and compare both and append to a new list as necessary 

			Make sure to go thru each fully 


			Input: 1->2->4, 1->3->4
			
			Output: 1->1->2->3->4->4

	*/

  	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    ListNode p1 = l1;
	    ListNode p2 = l2;
	    
	    while( p1 != null && p2 != null ){
	        if( p1.val < p2.val ){
	            p.next = p1;
	            p1 = p1.next;
	        } else {
	            p.next = p2;
	            p2 = p2.next;
	        }
	        p = p.next;
	    }
	 
	    if(p1 != null){
	        p.next = p1;
	    }
	 
	    if(p2 != null){
	        p.next = p2;
	    }
	 
	    return head.next;
}


}