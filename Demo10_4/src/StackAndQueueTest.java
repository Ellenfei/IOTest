import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueTest {
	static void StackTest(){
		Stack stack = new Stack();
		stack.add("a");
		stack.push("b");
		stack.push("cd");
		stack.push("12");
		System.out.println("栈中的元素："+stack);
		stack.pop();		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("pop后的："+stack);
		
	}
	
	static void QueueTest(){
		Queue queue = new LinkedList();
		queue.offer("ab");
		queue.offer("c");
		queue.add("12");
		queue.offer("f");
		System.out.println("队列中的元素："+queue);
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		
	}
	
	public static void main(String args[]){
		StackTest();
		QueueTest();
	}
}
