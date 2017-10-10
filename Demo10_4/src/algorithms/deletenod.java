package algorithms;

public class deletenod {
	public static void main(String[] args){
		ListNode node = new ListNode(3);
		ListNode node1= new ListNode(4);
		node.next = node1;
		node1.next=null;
		deleteNode(node1);
		
	}
	
	public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
