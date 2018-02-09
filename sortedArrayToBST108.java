/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree 
in which the depth of the two subtrees of every node never differ by more than 1.


Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5


insert function

sortedArrayToBST(num,0,4);
	mid = (0+4)/2 = 2
	root = num[2] //0
	root.left = sortedArrayToBST(num,0,1)
		mid = (0+1)/2 //0
		root = num[0]
		root.left = sortedArray(num, 0, 0)
			mid = 0+0/2 //0
			root = num[0];



*/

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int x) { 
      	val = x; 
      }
 }

public class Solution {
	public TreeNode sortedArrayToBST(int[] num) {
		if (num.length == 0)
			return null;
 
		return sortedArrayToBST(num, 0, num.length - 1);
	}
 
	public TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}

	//https://www.programcreek.com/2013/01/leetcode-convert-sorted-array-to-binary-search-tree-java/
} 


}