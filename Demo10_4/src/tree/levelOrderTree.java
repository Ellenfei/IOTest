package tree;

import java.util.*;

/*
 * 107. Binary Tree Level Order Traversal II
 * BFS
 */
public class levelOrderTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);
		System.out.println(levelOrderBottom(root));
	}
	
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		//if(root==null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> subList = new LinkedList<>();
        	for(int i=0; i<size; i++) {
        		if(queue.peek().left != null) queue.offer(queue.peek().left);
        		if(queue.peek().right != null) queue.offer(queue.peek().right);
        		subList.add(queue.poll().value);
        	}
        	result.add(0,subList);
        }
        return result;
    }
}
