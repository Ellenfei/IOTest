package tree;
/*
 * 114. Flatten Binary Tree to Linked List
 */
public class fattenTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);
		flatten(root);
		System.out.println(root.right.value);
	}
	
	public static void flatten(TreeNode root) {
        helper(root);
    }
	public static TreeNode helper(TreeNode root) {
		if(root==null) {
			return null;
		}
		
		TreeNode leftLast = helper(root.left);
		TreeNode rightLast = helper(root.right);
		
		if(leftLast!=null) {
			leftLast.right = root.right;
			root.right = root.left;
			root.left = null;
		}
		if(rightLast!=null) {
			return rightLast;
		}
		if(leftLast!=null) {
			return leftLast;
		}
		
		return root;
	}
}
