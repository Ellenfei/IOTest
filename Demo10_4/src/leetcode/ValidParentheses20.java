package leetcode;

import java.util.Scanner;
import java.util.Stack;

/*
 * 20. Valid Parentheses
 * 用一个栈，如果是左括号入栈，如果是右括号，则出栈与右括号比，如果最后栈空了，也没的右括号了，则证明正确。 
 */
public class ValidParentheses20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
				stack.push(s.charAt(i));
			} else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			} else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[') {
				stack.pop();
			} else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{') {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
