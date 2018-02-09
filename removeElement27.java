/*
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

{1 2 3 2 4, val = 2}

if arr[j] != val
	we add it, and increment j



Your function should return length = 2, with the first two elements of nums being 2.
*/

public class removeElement27 {

	static int removeElement (int[] arr, int val) {
		int j = 0; 

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				arr[j] = arr[i];
				j++;
			}
		}

		return j;
	}

	public static void main(String[] args) {
		//int[] arr = {3,2,2,3};
		int[] arr = {1,2,3,2,4};		
		System.out.println(removeElement(arr,2));

	}


}