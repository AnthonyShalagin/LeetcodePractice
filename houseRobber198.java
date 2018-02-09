/*
You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that 
adjacent houses have security system connected and it will automatically 
contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.


[ 1,6,4,7,5]

dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i])

1,6,6,13,13

even = 10
odd = 13

*/


public class houseRobber198 {

	

	public static void main(String[] args) {
		int[] arr = {1,6,4,7,5};
		System.out.println(robHouse1(arr));
	}

	//DP solution
	static int robHouse1(int[] arr) {

		int[] dp = new int[arr.length];

		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1]);
		}

		return dp[arr.length-1];

	}

	//Even/Odd Solution
	static int rob2(int[] num) {
		if(num==null || num.length == 0)
			return 0;
	 
		int even = 0;
		int odd = 0;
	 
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				even += num[i];
				even = even > odd ? even : odd;
			} else {
				odd += num[i];
				odd = even > odd ? even : odd;
			}
		}
 
	return even > odd ? even : odd;
}

}