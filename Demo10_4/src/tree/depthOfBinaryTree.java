package tree;
/*
 * 543. Diameter of Binary Tree
 * �����������������������֮���ټ�2����ô����ֻҪ��ÿһ���������������������֮��,Ȼ���2���½��
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
