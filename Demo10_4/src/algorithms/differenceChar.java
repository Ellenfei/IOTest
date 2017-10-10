package algorithms;

public class differenceChar {
	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		System.out.println(findTheDifference(s,t));
	}
	
	public static char findTheDifference(String s, String t) {
        int n = t.length();
        char c = t.charAt(n-1);
        for(int i=0; i<n-1; i++) {
        	c^=s.charAt(i);
        	c^=t.charAt(i);
        }
        return c;
    }
	
}
