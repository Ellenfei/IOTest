package dfs;

import java.util.Stack;

/*
 * 98. Validate Binary Search Tree（二叉搜索树）
 * 二叉搜索树特点：左子树<根<右子树
 * 方法1：递归
 * 方法2：中序遍历
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val = val;
	}
}

public class isValiBST {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		System.out.println(isValidBST(root));
	}
	public static boolean isValidBST(TreeNode root) {
       //递归： return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
		//方法2：中序遍历
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		TreeNode pre = null;
		while(!stack.isEmpty() || cur!=null) {
			if(cur!=null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				TreeNode node = stack.pop();
				if(pre!=null && node.val<=pre.val) {
					return false;
				}
				pre = node;
				cur = node.right;
			}			
		} 
		return true;
    }
	//方法1：递归
	/*public static boolean isValidBST(TreeNode root, int minVal, int maxVal) {
		if(root==null) return true;
		if(root.val >= maxVal || root.val <= minVal) return false;
		return isValidBST(root.left, minVal, root.val) &&
				isValidBST(root.right, root.val, maxVal);
	}*/
}
