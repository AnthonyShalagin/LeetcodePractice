/*
Given an integer n, return the number of trailing zeroes in n!.

1,2,6,24,120,720,5040, 40320, 362880, 39916800.......


Approach: 
	-Make factorial function to get the value of n!

	- Use % 10 to check if the last digit is a 0 (stop if it isn't)
	- Divide by 10 each time you do that

*/

public class factorialTrailingZeros172 {
	public static void main(String[] args) {
		System.out.println(getTrailingZeros(10));

	}

	// O(n)
	static int getFactVal (int n) {
		if (n == 1) {
			return n;
		}

		return n * getFactVal(n-1);
	}

	static int getTrailingZeros(int n) {

		int val = getFactVal(n);

		int count = 0; 

		while (val % 10 == 0) {
			count++; 
			val = val / 10; 
		}

		return count; 
	}

}



