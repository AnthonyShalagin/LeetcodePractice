/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?


3 = 011

9 = 1001


*/


public class powerOfThree326 {
	public static void main (String[] args) {
		System.out.println(isBoolean(81));
		System.out.println(isBoolean(1));
		System.out.println(isBoolean(72));

	}

	static boolean isBoolean(int n) {
		
		if (n <= 0) {
			return false; 
		}

		int current = 1; 

		while (current <= n) {
			
			if (current == n) {
				return true; 
			}

			current = current * 3; 
		}

		return false; 
	}

}