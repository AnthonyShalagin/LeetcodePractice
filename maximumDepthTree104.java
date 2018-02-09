
/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/


public class maximumDepthTree104 {
	public static void main(String[] args) {
		System.out.println("H");
	}

	static int maxHeight(Node root) {
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
	}
	//https://www.quora.com/What-is-the-maximum-height-of-a-tree-with-32-nodes



	int maxDepth(Node node) {
    	if (node == null) {
    		return 0;
    	}
            
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
}

