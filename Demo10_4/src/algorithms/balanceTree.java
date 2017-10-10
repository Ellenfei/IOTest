package algorithms;

public class balanceTree {
	private static boolean result = true;
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		//root.left.left = new TreeNode(4);
		//root.left.left.left = new TreeNode(4);
		root.right = new TreeNode(7);
		
		System.out.println(isBalanced(root));
	}
	
	 public static boolean isBalanced(TreeNode root) {
	     height(root);
	     return result;
	 }
	 
	 public static int height(TreeNode root){
		 if(root == null)
			 return 0;
		 int l = height(root.left);
		 int r = height(root.right);
		 
		 if(Math.abs(l-r) > 1) {
			 result = false;
		 }
		 return 1+Math.max(l, r);
	 } 
}
