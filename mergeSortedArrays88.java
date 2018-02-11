
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.

nums1 = [2,5,6,8,9,0,0,0] //8
nums2 = [1,4,10]	      //3

put elements from n2 into n1
	1,4,10,2,5,6,8,9
	then use a sorting algo like mergesort or quicksort 
		nLogn


Approach #1 O(n)
	- go through the arrays backwards and push when necessary

	-Approach is similar to combining two sorted arrays into a third sorted one

*/


public class mergeSortedArrays88 {

	public static void main (String[] args) {
		int[] arr1 = {1,3,6,8,0,0,0};
		int[] arr2 = {2,5,9};

		mergeArrays(arr1, arr2);

	}

	static int[] mergeArrays(int[] nums1, int[] nums2) {
		int length1 = nums1.length-nums2.length; 
		int length2 = nums2.length; 

		while (length1 > 0 && length2 > 0) {
			if (nums1[length1-1] > nums2[length2-1]) {
				nums1[length1+length2-1] = nums1[length1-1];
				length1--; 
			} else {
				nums1[length1+length2-1] = nums2[length2-1];
				length2--; 
			}
		}

		while (length2 > 0) {
			nums1[length1+length2-1] = nums2[length2-1];
			length2--; 
		}

		for (int x: nums1) {
			System.out.print(x + ",");
		}
		

		return nums1; 
	}

	

}









