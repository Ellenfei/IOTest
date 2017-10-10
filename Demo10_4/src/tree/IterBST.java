package tree;

import java.util.Stack;

/*
 * 173. Binary Search Tree Iterator
 * ��ʵ���ǰ������������˳����У�������ʵ��˼·��
 * 1������BST��ʱ��ֱ��Ԥ�����£������һ���������������list��ÿ�ζ�ȡlist��Ԫ�ؼ��ɡ�
 * 2��������Ԥ�����������������˼·ʹ��Stack��̬�Ľ��д���
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
