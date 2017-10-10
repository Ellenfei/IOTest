package sort;
/*
 * 147. Insertion Sort List
 * 
 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class insertionSortLinked {
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		head.next  = new ListNode(4);
		head.next.next = new ListNode(6);
		System.out.println(insertionSortList(head).val);
	}
	public static ListNode insertionSortList(ListNode head) {
        if(head==null)
        	return head;
        ListNode helper = new ListNode(0);
        ListNode cur = head;
        ListNode pre = helper;
        ListNode next = null;
        while(cur != null) {
        	next = cur.next;
        	while(pre.next!=null && pre.next.val<cur.val) {
        		pre = pre.next;
        	} 
        	cur.next = pre.next;
        	pre.next = cur;
        	pre = helper;
        	cur = next;
        }
        return helper.next;
    }
}
