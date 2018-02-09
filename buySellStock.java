/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

*/

public class buySellStock {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		//int[] arr = {7, 6, 4, 3, 1};
		System.out.println(maxProfit1(arr));
	}

	// O(N) approach
	// Track min and profit at each step 
	static int maxProfit1(int[] arr) {
		int profit = 0; 
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			profit = Math.max(profit, arr[i] - min);
			min = Math.min(min,arr[i]);
		}
		return profit; 
	}

	//O(N^2)
	static int maxProfit2(int[] arr) {
		int profit = 0; 

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					profit = Math.max(profit, arr[j] - arr[i]); 
				}
			}
		}
		return profit;
	}

}