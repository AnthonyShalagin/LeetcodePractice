public class reverseString344 {

	/*
		Write a function that takes a string as input and returns the string reversed.

		Example:
		Given s = "hello", return "olleh".

		use char array
		reverse the char array in place

	*/

	public static void main (String[] args) {
		System.out.println(reverseString("abcde"));	
	}

	static String reverseString (String s) {
		char[] charArr = s.toCharArray(); 
		int sLength = s.length(); 

		for (int i = 0; i < (sLength-1)/2; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[sLength-1-i]; 
			charArr[sLength-1-i] = temp; 
		} 	

		return new String(charArr);
	}



 }