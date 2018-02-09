/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Solution:

Use a hashmap and map out characters of s and their occurence. 

then go through t and decrement the value when we encounter

In the end the hashmap should be empty 


*/

import java.util.*;
public class validAnagram242 {
	public static void main(String[] args) {
		System.out.println(validAnagram("anagram","nagaram"));
		System.out.println(validAnagram("rat", "car"));
	}

	static boolean validAnagram(String s, String t) {
		HashMap<Character, Integer> charHM = new HashMap<>(); 

		if (s == null || t == null) {
			return false; 
		}

		if (s.length() != t.length()) {
			return false; 
		}

		for (int i = 0; i < s.length(); i++) {
			if (!charHM.containsKey(s.charAt(i))){
				charHM.put(s.charAt(i), 1);
			}
			else {
				charHM.put(s.charAt(i), charHM.get(s.charAt(i)) + 1);
			}
		}

		for (int j = 0; j < t.length(); j++) {
			if (!charHM.containsKey(t.charAt(j))) {
				return false; 
			}

			else if (charHM.get(t.charAt(j)) == 1) {
				charHM.remove(t.charAt(j));
			}

			else if (charHM.get(t.charAt(j)) > 1) {
				charHM.put(t.charAt(j), charHM.get(t.charAt(j)) - 1); 
			}
		}

		return charHM.isEmpty(); 

	}
}