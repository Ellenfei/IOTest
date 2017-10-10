package algorithms;

import java.util.Stack;

public class myqueue {
	  // Push element x to the back of queue.
	Stack<Integer> inbox = new Stack();
	Stack<Integer> outbox = new Stack();
    public void push(int x) {
        inbox.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        outbox.pop();
    }

    // Get the front element.
    public int peek() {
        if(outbox.empty()) {
        	while(!inbox.empty()){
        		outbox.push(inbox.pop());
        	}
        }
        return outbox.pop();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return inbox.empty() && outbox.empty();
    }
}
