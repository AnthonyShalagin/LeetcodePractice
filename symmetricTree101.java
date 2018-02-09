/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3


But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

*/

public class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) { 
    	val = x;
    }
 }

public class symmetricTree101 {
	public static void main(String[] args) {
		System.out.println("Hi");
	}


	static boolean isSymmetric(TreeNode root) {
		return isSymmetric(root.left, root.right);
	}

	static boolean isSymmetric(TreeNode l, TreeNode r) {
		if (l == null && r == null) {
			return true; 
		}

		else if (r == null || l == null) {
			return false; 
		}

		if (l.val != r.val) {
			return false; 
		}

		if (!isSymmetric(l.left,r.right)) {
			return false; 
		}

		if (!isSymmetric(l.right,r.left)) {
			return false; 
		}

		return true; 

	}


}





