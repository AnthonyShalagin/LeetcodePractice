/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


2,3,1,3,2

a^a == 0

Use XOR 

2^3

a[0] = (2)010 ^ (3)011 = 001 //0,1
a[0] = (1)001 ^ (1)001 = 000 //0,2
a[0] = (0)000 ^ (3)011 = 011 //0,3
a[0] = (3)011 ^ (2)010 = 001 //0,1

//1

*/


public class singleNumber106 {
	public static void main(String[] args) {
		int[] arr = {2,3,1,3,2};
		getSingleNum(arr);
	}

	static int getSingleNum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[0] = arr[0] ^ arr[i];
			System.out.println(arr[0]);
		}
		return arr[0];
	}

}