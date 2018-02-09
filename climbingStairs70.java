/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps


Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Approach
	
input = 1 --> 1;  			[ 1 ]
input = 2 --> 1,1; 2 		[ 2 ]
input = 3 --> 1,1,1 1,2 2,1 [ 3 ]
input = 4 --> 1,1,1,1; 1,2,1,1; 1,1,2; 2,2; 1,2,1 [5]

ways(0) = 0
ways(1) = 1
ways(2) = 2
ways(3) = 3

0,1,1,2,3,5,8
0,1,2,3,5 

ways(n) = ways(n-1) + ways(n-2)


*/


public class climbingStairs70 {
	public static void main(String[] args) {
		System.out.println(numWays(1));
		System.out.println(numWays(2));
		System.out.println(numWays(3));
		System.out.println(numWays(4));
	}

	static int numWays (int n) {
		return fibNum(n+1);
	}

	static int fibNum(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibNum(n-1) + fibNum(n-2);
	}

}


