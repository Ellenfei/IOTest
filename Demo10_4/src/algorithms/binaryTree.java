package algorithms;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int val) {
		this.val = val;
	}
}

public class binaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(7);
		
		System.out.println(maxDepth(root));
	}
	public static int maxDepth(TreeNode root) {
		
		if(root == null ) {
			return 0;
		}
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}
}
