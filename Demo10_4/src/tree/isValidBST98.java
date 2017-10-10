package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 98. Validate Binary Search Tree
 * 230. Kth Smallest Element in a BST
 * ���죺�������ı���
 * ˼·1���������
 */
public class isValidBST98 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		System.out.println(kthSmallest(root, 2));
	}
	//���������������������е�k����Сֵ
	public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()) {
        	while(root!=null) {
        		stack.push(root);
        		root = root.left;
        	}
        	root = stack.pop();
        	if(--k==0) break;
        	root = root.right;
        }
        return root.value;
    }
	public boolean isValidBST(TreeNode root) {
		if(root==null) return true;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while(root!=null || !stack.empty()) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if(pre!=null && root.value<=pre.value) return false;
			pre = root;
			root = root.right;
		}
		return true;
	}
	
	//�������
	public List<Integer> inorderTravel(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root==null) return list;
		Stack<TreeNode> stack = new Stack<>();
		while(root!=null || !stack.empty()) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			list.add(root.value);
			root = root.right;
		}
		return list;
	}
}
