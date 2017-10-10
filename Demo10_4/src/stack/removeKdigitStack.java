package stack;

import java.util.Stack;

public class removeKdigitStack {
	public static void main(String[] args) {
		String num = "10200";
		System.out.println(removeKdigits(num, 1));
	}
	
	public static String removeKdigits(String num, int k) {
		if(num.length()==0 ) return "0";
        String res;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        while(stack.size() < num.length()-k){
        	for(int i=1; i<num.length(); i++) {
	        	if(!stack.isEmpty() && stack.peek()>num.charAt(i) && i<k+1) 
	        		stack.pop();
	        		//stack.push(num.charAt(i));
	        	 	stack.push(num.charAt(i));
	        	
        	}
        } 	
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        res = sb.reverse().toString();
        for(int i=0; i<res.length(); i++) 
        	if(res.charAt(i)!='0') return res.substring(i,res.length());
        return "0";
    }
}
