/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], 
	return [2, 2].


nums1 = [1, 5, 3, 1], nums2 = [1, 2], 
	return [1]

Approach 1: 
	For each number in nums1, 
		check if it exists in num2
			put into result array and remove from num2 (maybe overwrite with -1);

	O(n^2)

Approach 2: 
	Sort both array (n log n)
		Traverse both arrays number by number (sliding fashion)

Approach 3: 
	HashMap 
		map all values of num1 and their occurences

	Go thru nums2 and find if it exists in the hashmap 
*/
import java.util.*;
public class twoArrayIntersection350 {

	public static void main (String[] args) {
		// int[] arr1 = {1,2,2,1};
		// int[] arr2 = {2,2};
		int[] arr2 = {1,5,3,1};
		int[] arr1 = {1};


		//bruteForceIntersection(arr1, arr2);
		//slightlyBetter(arr1,arr2);
		//hmApproach(arr1,arr2);
	}


	static ArrayList<Integer> hmApproach(int[] arr1, int[] arr2) {
		ArrayList<Integer> intersection = new ArrayList<>();

		HashMap<Integer, Integer> firstArrayOccurrences = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			if (!firstArrayOccurrences.containsKey(arr1[i])) {
				firstArrayOccurrences.put(arr1[i], 1);
			}
			else if (firstArrayOccurrences.containsKey(arr1[i])) {
				firstArrayOccurrences.put(arr1[i], firstArrayOccurrences.get(arr1[i]) + 1);
			}
		}

		for (int j = 0; j < arr2.length; j++) {
			if (firstArrayOccurrences.containsKey(arr2[j]) && firstArrayOccurrences.get(arr2[j]) >= 1) {
				intersection.add(arr2[j]);
				firstArrayOccurrences.put(arr2[j], firstArrayOccurrences.get(arr2[j])-1);
			}
		}

		for (int x: intersection) {
			System.out.print(x + ", ");
		}

		return intersection;

	}

	static ArrayList<Integer> slightlyBetter(int[] arr1, int[] arr2) {
		ArrayList<Integer> intersection = new ArrayList<>();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0; 
		int j = 0; 

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				intersection.add(arr1[i]);
				i++;
				j++;
			}

			else if (arr1[i] > arr2[j]) {
				j++;
			}

			else if (arr1[i] < arr2[j]) {
				i++;
			}

		}

		for (int x: intersection) {
			System.out.print(x + ", ");
		}

		return intersection;

	}

	static ArrayList<Integer> bruteForceIntersection (int[] arr1, int[] arr2) {

		ArrayList<Integer> intersection = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j] && arr1[i] != -1) {
					intersection.add(arr1[i]);
					arr2[j] = -1; 
					arr1[i] = -1; 
				}
			}
		}

		for (int x: intersection) {
			System.out.print(x + ", ");
		}

		return intersection;
	}



}