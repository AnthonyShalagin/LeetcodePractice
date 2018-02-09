/*
	Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.

	Use hashset and add to the hashset if the character is not there
	If it is, then return that index

	O(N), O(1) time


*/
import java.util.*;
public class firstUniqueChat387 {
	public static void main(String[] args) {
		System.out.println(firstUnique("leetcode"));
		System.out.println(firstUnique("loveleetcode"));
		// firstUniqChar("abzde");
	}

	static int firstUnique(String s) {
		if (s == null || s.length() == 1) {
			return -1; 
		}

		HashMap<Character,Integer> charMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (!charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i),1);
			} else {
				charMap.put(s.charAt(i),2);
			}
		}

		for (int j = 0; j < s.length(); j++) {
			if (charMap.get(s.charAt(j)) != 2) {
				return j; 
			}
		}

		return -1; 
	}

	static void firstUniqChar(String s) {
        int freq [] = new int[26];
        
        for(int i = 0; i < s.length(); i ++) {
        	freq[s.charAt(i) - 'a'] ++;
        }

        for (int x: freq) {
        	System.out.println(x);
        }
    }
     

}