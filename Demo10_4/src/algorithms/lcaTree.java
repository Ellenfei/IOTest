package algorithms;

public class lcaTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(7);
		
		System.out.println(lowestCommonAncestor(root,root.left,root.left.left).val);
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	/*	if(root == null) return root;
		int i = Integer.compare(p.val, root.val);
		int j = Integer.compare(q.val, root.val);
		if(i<0 && j<0 && root.left != null) {
			return lowestCommonAncestor(root.left,p,q);
		} else if(i>0 && j>0 && root.right != null) {
			return lowestCommonAncestor(root.right,p,q);
		} else {
			return root;
		}*/
		//if(root == null || p==null || q==null) return root;
		while(root != null && p!=null && q!=null && (root.val-p.val)*(root.val-q.val)>0){
			root = p.val<root.val ? root.left : root.right;
		}
		return root;
	}
}
