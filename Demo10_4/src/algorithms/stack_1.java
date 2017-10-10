package algorithms;

import java.util.Stack;

public class stack_1 {
	public static void main(String[] args) {
		String s = ")";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid (String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
//				return false;
//			}
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek()=='(' ) {
				stack.pop();
			} else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek()=='[' ) {
				stack.pop();
			} else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek()=='{' ) {
				stack.pop();
			} else {
				return false;
			}
		}
		
		return s.isEmpty();
	}
}
