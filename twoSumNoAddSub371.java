/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Given a = 1 and b = 2, return 3.

Use OR 
*/






public class twoSumNoAddSub371 {
	public static void main(String[] args) {
		System.out.println(twoSum(3,4));
	}

	static int twoSum (int a, int b) {
		return a | b; 
	}
}