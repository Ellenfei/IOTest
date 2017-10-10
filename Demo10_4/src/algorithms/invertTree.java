package algorithms;

import java.util.Deque;
import java.util.LinkedList;

public class invertTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(7);
		
		System.out.println(invertree(root).val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		//System.out.println(root.left.left.val);
	}
	
	/* public static TreeNode invertree(TreeNode root) {
		 if(root == null) {
			 return null;
		 }
		 
		 TreeNode temp;
		 temp = root.left;
		 root.left = root.right;
		 root.right = temp;
		 invertree(root.left);
		 invertree(root.right);
		 return root;
	} */
	
	public static TreeNode invertree(TreeNode root) {
		if(root == null) {
			 return null;
		 }
		final Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			final TreeNode node = stack.pop();
			final TreeNode left = node.left;
			node.left = node.right;
			node.right = left;
			if(node.left != null){
				stack.push(node.left);
			}
			if(node.right != null) {
				stack.push(node.right);
			}
			
		}
		return root;
	}
}
