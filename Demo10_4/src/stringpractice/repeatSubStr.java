package stringpractice;

public class repeatSubStr {
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("ababab"));
	}
	
	public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i=length/2; i>0; i--) {
        	if(length%i==0) {
        		int m = length/i;
        		String substr = s.substring(0, i);
        		StringBuilder sb = new StringBuilder();
        		for(int j=0; j<m; j++) {
        			sb.append(substr);
        		}
        		
        		if(sb.toString().equals(s)) return true;
        	}
        }
        return false;
    }
}
