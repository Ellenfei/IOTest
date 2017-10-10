package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 * 515. Find Largest Value in Each Tree Row
 * BFS
 */
public class findLargestValue {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);
		System.out.println(largestValues(root));
	}
	
	public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(root.value);
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	for(int i=0; i<size; i++) {
        		TreeNode node = queue.poll();
        		if(node.left!=null) {
        			queue.offer(node.left);
        			max = max>node.left.value ? max : node.left.value;
        		}
        		if(node.right!=null) {
        			queue.offer(node.right);
        			max = max>node.right.value ? max : node.right.value;
        		}       		
        	}
        	result.add(max);
    		max = Integer.MIN_VALUE;
        }
        result.remove(result.size()-1);
        return result;
    }
}
