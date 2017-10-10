package algorithms;

public class sameTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(7);
		
		TreeNode root1 = new TreeNode(2);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		//root1.right = new TreeNode(7);
		
		System.out.println(isSameTree(root,root1));
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		return p==null || q==null ? p==q : p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
}
