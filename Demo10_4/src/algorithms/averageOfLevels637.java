package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 *  637. Average of Levels in Binary Tree
 *  思路：广度优先遍历（BFS）
 *  
 */
public class averageOfLevels637 {
	public static void main(String[] args) {
		
	}
	
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root==null) return null;
        queue.add(root);
        while(!queue.isEmpty()) {
        	int n = queue.size();
        	double sum = 0;
        	for(int i=0; i<n; i++) {
        		TreeNode node = queue.poll();
        		sum += node.val;
        		if(node.left!=null) queue.add(node.left);
        		if(node.right!=null) queue.add(node.right);
        	}
        	result.add(sum/n);
        }
        return result;
    } 

}
