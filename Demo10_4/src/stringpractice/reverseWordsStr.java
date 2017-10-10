package stringpractice;

public class reverseWordsStr {
	public static void main(String[] args) {
		System.out.println(reverseWords("  "));
	}
	
	public static String reverseWords(String s) {
		if(s.length()==0 || s==null) return s;
		int n=s.length(),end=n;
		StringBuilder sb = new StringBuilder();
		for(int i=n-1; i>=0; i--) {
			if(s.charAt(i)==' ') end=i;
			else if(i==0 || s.charAt(i-1)==' ') {
				if(sb.length() != 0) sb.append(" ");
				sb.append(s.substring(i,end));
			}
			
		}
		return sb.toString();
	}
}
