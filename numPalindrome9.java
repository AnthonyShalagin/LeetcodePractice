public class numPalindrome9 {
	
	/*
		Approach #1: Reverse the integer and then compare that against the number (fix for negative num later)

		Approach #2: Extract 1st and last and compare until you get to the middle 
	*/

	static boolean isPalindrome (int num) {
		int numDigits = 0; 
		int temp = num; 
		int original = num;

		while (temp != 0) {
			temp = temp/10; 
			numDigits++; 
		}
		System.out.println(numDigits + " .....numdigits");
		temp = 0;

		while(numDigits >= 0) {
			temp = (int) temp + (int) (num % 10 * Math.pow(10,numDigits-1));
			num = num/10; 
			numDigits--; 
		}

		return temp == original;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1000));
		System.out.println(isPalindrome(10101));
		System.out.println(isPalindrome(83238));
	}
}