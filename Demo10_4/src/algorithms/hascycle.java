package algorithms;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
	val = x;
	next = null;
	}
}
public class hascycle {
	public static void main(String[] args){
		ListNode head = new ListNode(3);
		ListNode node1= new ListNode(4);
	
		head.next = node1;
		//ListNode node1;
		
		node1.next=head;
		System.out.println(hasCycle(head));
		
	}
	public static boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker=head;
        ListNode runner=head;
        while(walker.next != null && runner.next != null){
        	walker = walker.next;
        	runner = runner.next.next;
        	if(walker == runner) return true;
        }
        return false;
    }
}
