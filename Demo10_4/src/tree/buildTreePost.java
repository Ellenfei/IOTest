package tree;

import java.util.HashMap;

/*
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * ��֪��������ͺ������������������
 * �ݹ鷽��
 */
public class buildTreePost {
	public static void main(String[] args) {
		int[] inorder = {4,2,5,1,6,3,7};
		int[] postorder = {4,5,2,6,7,3,1};
		System.out.println(buildTree(inorder, postorder).value);
	}
	
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
        	return null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++) {
        	map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
        
    }
	
	public static TreeNode buildTree(int[] inorder, int is, int ie, 
			int[] postorder, int ps, int pe, HashMap<Integer,Integer> map) {
		if(is>ie || ps>pe) return null;
		TreeNode root = new TreeNode(postorder[pe]);
		int rootIndex = map.get(postorder[pe]);
		//����������:rootIndex-is-1
		//����������:ie-rootIndex   ps+ie-rootIndex; rootIndex; ps+rootIndex-is
		TreeNode leftChild = buildTree(inorder,is,rootIndex-1,postorder,ps,/*rootIndex-1*/ps+rootIndex-is-1,map);
		TreeNode rightChild = buildTree(inorder, rootIndex+1, ie, postorder, rootIndex/*ps+ie-rootIndex*/, pe-1, map);
		root.left = leftChild;
		root.right = rightChild;		
		return root;
	}
}
