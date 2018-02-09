/*
Given an array of integers, find if the array contains any duplicates. 

Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.

3,2,5,3,1,7 --> true
3,2,5,1,7 --> false

Brute Force
	O(N^2), O(1) space

Use hashset 
	O(N) time, O(N) space

*/

import java.util.*;
public class containsDuplicate217 {
	public static void main (String[] args) {
		int[] arr = {};
		System.out.println(hasDuplicate(arr));
	}

	static boolean hasDuplicate(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();

		if (arr.length == 0) {
			return false; 
		}

		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i])) {
				return true; 
			}
			hs.add(arr[i]);
		}
		return false; 
	}
}


