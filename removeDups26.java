/*
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.

[1,1,1,2,3,3] ==> 3

Go thru array
	-keep track of the current value
		-if the next value == current value
			-replace with a marker (maybe something like -1)
			-count how many zeroes there are
		
		-else
			-update the current value and move on

	
	return orignal length of the array - numZeros


*/

public class removeDups26 {

	static int removeDups (int[] arr) {

		if (arr.length == 1) {
			return 1; 
		}

		int numZeros = 0; 
		int current = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (current == arr[i]) {
				arr[i] = 0; 
				numZeros++; 
			} else {
				current = arr[i];
			}
		}

		return arr.length - numZeros; 
	}

	public static void main (String[] args) {
		// int[] arr = {1,1,1,2,3,3};
		// int[] arr = {1,1,2};
		int[] arr = {1,2,3,4,5};

		System.out.println(removeDups(arr));
	}
}