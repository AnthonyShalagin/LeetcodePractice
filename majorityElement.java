/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊n/2⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

[3,1,3,5,6,3] ==> 3/6

[3,2,3,2,6,3] ==> 3/6

Approach #3 
	O(N) time, O(1) space

	initialize count = 1
	intilize element = arr[0]

	go thru array

		if the element is the same as arr[i]
			add one
		else count--
	
		else if count == 0
			make element = arr[i]
			count++

[3,1,3,5,6,3] ==> 3/6

[3,2,3,2,6,3] ==> 3/6
*/

public class majorityElement {
	public static void main(String[] args) {
		//int[] arr = {3,2,3,2,6,3,3};
		int[] arr = {2,2,2,3,2,2,3,3,3};
		System.out.println(getMajorityElement(arr));
	}

	static int getMajorityElement (int[] arr) {

		int element = arr[0];
		int count = 1; 

		for (int i = 1; i < arr.length; i++) {
			
			if (element == arr[i]) {
				count++; 
			} 
			else if (element != arr[i] && (count > 0)) {
				count--; 
			}

			else if (count == 0) {
				element = arr[i];
				count++; 
			}
		}

		return element;
	}
}