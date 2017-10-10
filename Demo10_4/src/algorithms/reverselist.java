package algorithms;

public class reverselist {
	public static void main(String[] args){
		
	}
	
	public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null) {
        	ListNode next = head.next;
        	newHead = head;
        	head.next = newHead;
        	head = next;
        }
        return newHead;
    }
}
