package leetcode;
/*
 * 467. Unique Substrings in Wraparound String
 * 找出以’a-z’每个字符结尾的情况下，最长的子串有多长，然后将其相加
 */
public class FindSubstring467 {
	public static void main(String[] args) {
		String p = "zab";
		System.out.println(findSubstringInWraproundString(p));
	}
	public static int findSubstringInWraproundString(String p) {
        int[] p_int = new int[p.length()];
        int[] count = new int[26]; 	//存放以’a-z’每个字符结尾的最长字符串的数量
        int maxLen = 0;
        int result = 0;
        for(int i=0; i<p.length(); i++) {
        	p_int[i] = p.charAt(i)-'a';
        }
        for(int i=0; i<p.length(); i++) {
        	if(i>0 && (p_int[i-1]+1)%26==p_int[i]) {
        		maxLen++;
        	} else {
        		maxLen = 1;
        	}
        	count[p_int[i]] = Math.max(count[p_int[i]] , maxLen);
        }
        for(int i=0; i<26; i++) {
        	result += count[i];
        }
        return result;
    }
}
