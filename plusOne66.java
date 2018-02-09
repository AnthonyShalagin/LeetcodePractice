/*

[ 2 8 4] ==> 285

[9 9 9] ==> 1000


//Approach #1
	extract the number
	add 1
	make an array with that number
		-check for the case of 999 --> 1000

	length of 3 ==> 10*10*10-1

//Approach #2 

	go from right to left with carry (if needed)
	if there the last number is 9 and there is a carry
		create new array with arr.length+1

*/


public class plusOne66 {

	public static void main(String[] args) {
		int[] arr = {9,9,9};
		// int[] arr = {1,5,3};

		int[] printArr = plusOne(arr);

		for (int x: printArr) {
			System.out.print(x);
		}

	}

	static int[] plusOne(int[] arr) {

		int num = 0; 
		int count = 0; 

		for (int i = arr.length-1; i >= 0; i--) {
			num = num + arr[i] * (int) Math.pow(10, count);
			count++;
		}

		num = num + 1; 

		if (num != Math.pow(10,arr.length)) {
			for (int i = 0; i < arr.length; i++) {
				arr[arr.length -1 - i] = num % 10;
				num = num / 10; 
			}
			return arr; 	
		} 

		else {
			int[] result = new int[arr.length+1];

			for (int i = 0; i < result.length; i++) {
				result[result.length - 1 - i] = num % 10;
				num = num / 10; 
			}
			return result;

		}




	}

}