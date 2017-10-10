package tree;
/*
 * 543. Diameter of Binary Tree
 * 根结点的左右两个子树的深度之和再加2。那么我们只要对每一个结点求出其左右子树深度之和,然后加2更新结果
 */
/*class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}*/

public class depthOfBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(diameterOfBinaryTree(root));
	}
	static int max=0;
	public static int diameterOfBinaryTree(TreeNode root) {
        //int max=0;
		getDepth(root);
		return max;
    }
	public static int getDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		max = Math.max(max, left+right);
		return Math.max(left,right)+1;
	}
}
