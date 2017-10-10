package leetcode;

import java.util.Scanner;
import java.util.Stack;

/*
 * 20. Valid Parentheses
 * ��һ��ջ���������������ջ������������ţ����ջ�������űȣ�������ջ���ˣ�Ҳû���������ˣ���֤����ȷ�� 
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
