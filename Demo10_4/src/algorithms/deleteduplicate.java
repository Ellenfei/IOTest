package algorithms;

public class deleteduplicate {
	public static void main(String[] args){
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		/*ListNode result = null;
        while(head != null  ) {
        	if(head.val == head.next.val){
        		result.val = head.next.val;
        		result.next = head.next.next;
        		head.next.val = head.next.next.val;
        		head.next = head.next.next;
        	}
        	head = head.next;
        	result = result.next;
        }
        return result;*/
		
		if(head==null && head.next == null) return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
    }
}


