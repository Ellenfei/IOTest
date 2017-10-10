package leetcode;
/*
 * 647. Palindromic Substrings
 * 考虑不同的回文中心，然后从中心扩大，求以某个中心来获得的回文个数。
 * 有两种情况：子串 s[ i - j , ...,  i + j ] 中, i 是回文中心（这是奇数串的情形）。
 * 子串 s[ i - 1 - j , ...,  i + j ] 中，( i - 1 , i ) 是回文中心（这是偶数串的情形）。
 */
public class CountSubstrings647 {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(countSubstrings(s));
	}
	public static int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
        	//回文串长度为奇数
        	for(int j=0; i-j>=0 && i+j<s.length() && s.charAt(i-j)==s.charAt(i+j); j++) {
        		count++;
        	}
        	//回文串长度为偶数
        	for(int j=0; i-j>=0 && i+1+j<s.length() && s.charAt(i-j)==s.charAt(i+1+j); j++) {
        		count++;
        	}
        }
        return count;
    }
	
	
}
