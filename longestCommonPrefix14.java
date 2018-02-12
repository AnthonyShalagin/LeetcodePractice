/*
	Write a function to find the longest common prefix string amongst an array of strings.

	abcde
	abe
	abzf

	longest common prefix = "ab"

	Use the first word as the "keyword"

	check first char (a)
	check first+second char (ab)
	

*/

public class longestCommonPrefix14 {


	public static void main(String[] args) {
		// String[] strs = {"abcdefgh", "abcde", "abcdefg"};
		String[] strs = {"a", "b", "c"};
		
		System.out.println(longestCommonPrefix(strs));
	}

	static String longestCommonPrefix(String[] strs) {

		if (strs.length == 1) {
			return strs[0];
		}

		//Edge case for string of length 1
		if (strs[0].substring(0,1) != strs[1].substring(0,1)) {
			return "";
		}
 
		String shortestWord = getShortestWord(strs);

		String longestPref = ""; 

		for (int i = 0; i < shortestWord.length(); i++) {

			longestPref = shortestWord.substring(0,i+1);

			for (String word: strs) {
				if (!longestPref.equals(word.substring(0,i+1))) {
					//System.out.println(longestPref + ", " + word.substring(0,i));
					return longestPref;
				}
			}
			
		}
		return longestPref; 
	}

	static String getShortestWord(String[] strs) {
		
		String shortestWord = strs[0];

		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < shortestWord.length()) {
				shortestWord = strs[i];
			}
		}

		return shortestWord;

	}

}