package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class mystack {
	
/*	Queue<Integer> q = new LinkedList<Integer>();
	  // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for(int i=1; i<q.size(); i++) {
        	q.add(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }*/
	
	//两个队列
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	 public void push(int x) {
	        if(q1.isEmpty()) {
	        	q1.add(x);
	        	for(int i=0; i<q2.size(); i++) {
	        		q1.add(q2.poll());
	        	}
	        } else {
	        	q2.add(x);
	        	for(int i=0; i<q1.size(); i++) {
	        		q2.add(q1.poll());
	        	}
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	    	if(!q1.isEmpty()){
	    		q1.poll();
	    	}else{
	    		q2.poll();
	    	}
	        
	    }

	    // Get the top element.
	    public int top() {
	        return q1.isEmpty() ? q2.peek() : q1.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return q1.isEmpty() && q2.isEmpty();
	    }
}
