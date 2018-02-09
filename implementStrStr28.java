public class implementStrStr28 {
	
	/*
		Implement strStr().

		Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.	

		Example 1:
		Input: haystack = "hello", needle = "ll"
		Output: 2
		
		Example 2:
		Input: haystack = "aaaaa", needle = "bba"
		Output: -1

	*/

	public static void main(String[] args) {
		String haystack = "helalao";
		String needle = "lala";
		System.out.println(strStr(haystack, needle));
	}

	static int strStr(String haystack, String needle) {
		int startIndex = -1; 

		for (int i = 0; i < haystack.length(); i++) {
			
			int j = 0;  

			if (haystack.charAt(i) == needle.charAt(j)) {
				startIndex = i; 
				while (haystack.charAt(i) == needle.charAt(j) && (j < needle.length()) ) {
					i++; 
					j++;
					if (j == (needle.length())) { //Found needle return startIndex
						return startIndex; 
					}
				}
				startIndex = -1; 
			}
		}
		return startIndex; 
	}

}