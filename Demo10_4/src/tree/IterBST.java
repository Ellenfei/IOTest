package tree;

import java.util.Stack;

/*
 * 173. Binary Search Tree Iterator
 * 其实就是按照中序遍历的顺序出列，有两种实现思路：
 * 1、构造BST的时候直接预处理下，构造出一条按照中序遍历的list，每次读取list的元素即可。
 * 2、不进行预处理，按照中序遍历的思路使用Stack动态的进行处理
 */
class BSTIterator {
	private Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        if(root!=null) {
        	pushLeft(root);
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode top = stack.peek();
        stack.pop();
        if(top.right!=null) {
        	pushLeft(top.right);
        }
        return top.value;
    }
    public void pushLeft(TreeNode root) {
    	/*stack.push(root);
    	TreeNode rootTemp = root.left;*/
    	while(root!=null) {
    		stack.push(root);
    		root = root.left;
    	}
    }
}
public class IterBST {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left = new TreeNode(1);
		/*root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);*/
		BSTIterator bst = new BSTIterator(root);
		System.out.println(bst.next());
	}
	
}
