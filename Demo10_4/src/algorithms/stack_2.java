package algorithms;

import java.util.HashMap;
import java.util.LinkedList;

public class stack_2 {
	public static void main (String[] args) {
		String s = "{}";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				if(stack.isEmpty() || !map.get(c).equals(stack.pop())) {
					return false;
				} 
			}else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
		 
}
