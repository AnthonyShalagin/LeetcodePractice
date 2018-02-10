/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Time to solve: 0:15

Use a stack
	push when [,{,(

	pop when 
		encounter ], pop [
		encounter ), pop (
		encounter }, pop {

/*Solved this with a hashmap before. Decided to try doing it without one*/


import java.util.*;
public class validParen20 {



	public static void main (String[] args) {
		//String s = "()[]{}";
		// String s = "([)]";
		String s = "([)";
		System.out.println(validParen(s));
	}

	static boolean validParen (String s) {

		Stack<Character> stk = new Stack<>();

		if (s.length() < 2) {
			return false; 
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stk.push(s.charAt(i));
			}

			else {

				char curr = stk.pop();

				if (s.charAt(i) == ')') {
					if (curr != '(') {
						return false; 
					}
				}

				else if (s.charAt(i) == ']') {
					if (curr != '[') {
						return false; 
					}
				}

				else if (s.charAt(i) == '}') {
					if (curr != '{') {
						return false; 
					}
				}
			}
		}

		return stk.isEmpty();

	}

}