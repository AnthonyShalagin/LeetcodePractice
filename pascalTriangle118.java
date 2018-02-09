/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1], 				0
    [1,1],				0,1
   [1,2,1],				0,1,2
  [1,3,3,1],			0,1,2,3
 [1,4,6,4,1]
]


//initialize the first two rows

//store previous row in a list


For row = 2
// temp(0) = 1
// temp(1) = prev(0) + prev(1) //2
// temp(2) = 1

For row = 3
// temp(0) = 1
// temp(1) = prev(0) + prev(1) // 2 + 1
// temp(2) = prev(1) + prev(2) // 2+1
// temp(3) = 1

*/
import java.util.*; 

public class pascalTriangle118 {
	public static void main(String[] args) {	
		generatePascal(5);
	}

	static void generatePascal (int n) {
		System.out.println("[1]" );
		System.out.println("[1,1]" );

		ArrayList<Integer> prev = new ArrayList<>();
		
		ArrayList<Integer> temp = new ArrayList<>();

		prev.add(1);
		prev.add(1);

		for (int j = 2; j < n; j++) {
			temp.add(1);
			for (int i = 0; i < prev.size()-1; i++) {
				temp.add(prev.get(i) + prev.get(i+1)); 
			}
			temp.add(1);
			printList(temp); //prints 1, followed by contents of temp, and 1 again
			
			//Clean the lists 
			prev.clear(); 
			prev = new ArrayList<Integer>(temp);

			temp.clear();
		}
	}

	static void printList(ArrayList<Integer> temp) {
		System.out.print("[");
		for (int x: temp) {
			System.out.print(x + ",");
		}
		System.out.print("]");
		System.out.println();
	}

}