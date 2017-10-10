import java.util.Scanner;

public class LinListTest{
	
	public class Node{
		Object data;
		Node next;
		/*public Node(Node next){
			this.next = next;
		}
		public Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	}
	
	static Node head;
	Node current;
	int size;
	
	
	public static void main(String args[]){
		LinListTest linListTest = new LinListTest();
	//	linListTest.printList(head);
		
		
	}
	
	public LinListTest(){
		char ch;
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(str);
		head = new Node();
	//	head.next = null;
		size=0;
		while(size<str.length()){
			ch = str.charAt(size);
		//	System.out.println(ch);
			current = new Node();
			current.data = ch;
			current.next = head.next;
			head.next = current;
			size++;
		//	System.out.print(current.data);
		}
		head = head.next;
		for(int i=0; i<size; i++){
			System.out.print(head.data);
			head = head.next;
			
		}
	}
	
	/*public void printList(Object data){
		for(int i=0; i<size; i++){
			System.out.println(head.data);
			Node node = head.next;
			//printList(node);
		}
	}*/
}