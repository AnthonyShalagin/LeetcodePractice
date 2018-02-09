/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.


For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.


	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {

			sum += arr[j]

			Math.max(maxSum, sum);
		}
		sum = 0; 
	}

	O(n^2)

*/

public class maxSubarray53 {
	public static void main (String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(arr));
	}


	static int maxSum(int[] arr) {
		int newSum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			newSum = Math.max(newSum + arr[i], arr[i]); //previous sum + new element OR just new element
			max = Math.max(newSum, max); 
		} 

		return max; 

	}

	//Brute force
	static int maxSum1(int[] arr) {
		int sum = 0; 
		int maxSum = 0; 

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
			sum = 0; 
		}

		return maxSum;
	}

}