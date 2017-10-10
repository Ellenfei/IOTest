package tree;

import java.util.LinkedList;
import java.util.Queue;



/*
 * 513. Find Bottom Left Tree Value
 * 从右到左遍历整棵树的节点，加入到queue中
 *  
 */

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value) {
		this.value = value;
	}
}
public class findLeftValue {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		System.out.println(findBottomLeftValue(root));
	}
	
	public static int findBottomLeftValue(TreeNode root){
		//if(root==null) return null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			if(root.right != null) {
				queue.add(root.right);
			}
			if(root.left != null) {
				queue.offer(root.left);
			}
		}
		return root.value;
	}
}
