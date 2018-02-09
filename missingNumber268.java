/*
15 MINUTES

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Approach 1: Sort the numbers and then use a for loop and find the missing number trivially (n log n)

Approach 2: 


0 -> 5
 0+1+2+3+4+5 = 15

 expectedSum - total = num
 15 - 13 = 2

*/

public class missingNumber268 {
	public static void main (String[] args) {
		int[] arr = {9,6,4,2,3,5,7,0,1};
		System.out.println(getMissingNum(arr));
	}

	static int getMissingNum(int[] arr) {
		
		if (arr.length == 1) {
			return -1;
		}

		int total = 0; 
		int n = arr.length + 1;

		int expectedSum = (n * (n-1))/2;  //6*5/2 = 15

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		return expectedSum - total;
	}

}