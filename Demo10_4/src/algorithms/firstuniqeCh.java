package algorithms;

import java.util.HashSet;

public class firstuniqeCh {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
	}
	
	public static int firstUniqChar(String s) {
        if(s == null) return -1;
        /*HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
        	if(!set.add(s.charAt(i))) return i;
        }
        return -1;*/
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
        	freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
        	if(freq[s.charAt(i)-'a'] == 1)
        		return i;
        }
        return -1;
    }
}
