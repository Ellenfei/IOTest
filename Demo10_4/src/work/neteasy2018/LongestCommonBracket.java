package work.neteasy2018;
import java.util.HashSet;
/*
 * s和t为合法的括号
 * 修改为1时的s和t的最长公共子序列最长
 */
import java.util.Scanner;
import java.util.Set;

public class LongestCommonBracket {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(getLSC(str));
	}
	
	public static int getLSC(String s) {
		Set<String> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			StringBuilder sb = new StringBuilder(s);
			char c = sb.charAt(i);
			sb.deleteCharAt(i);
			for(int j=0; j<s.length(); j++) {
				sb.insert(j, c);
				if(isValid(sb.toString())) {
					//System.out.println(sb.toString());
					set.add(sb.toString());
				}
				sb.deleteCharAt(j);//delete the element index of j
			}
		}
		return set.size()-1;
	}
	public static boolean isValid(String t) {
		int count = 0;
		for(int i=0; i<t.length(); i++) {
			if(t.charAt(i)=='(') {
				count++;
			} else {
				count--;
			}
			if(count<0) {
				return false;
			}
		}
		return true;
	}
}
