package algorithms;

import java.util.ArrayList;
import java.util.List;

public class findanagram {
	public static void main(String[] args) {
		System.out.println(findAnagrams("bacbab", "ab"));
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int[] nums = new int[256];
        if(s==null || s.length()==0 || p==null || p.length()==0) return result;
        for(int i=0; i<p.length(); i++) {
        	nums[p.charAt(i)]++;
        }
        int left=0, right=0, count = p.length();
        while(right<s.length()) {
        	if(nums[s.charAt(right)]>=1) {
        		count--;
        	}
        	nums[s.charAt(right)]--;
        	right++;
        	if(count==0) {
        		result.add(left);
        	}
        	if(right-left == p.length()){
        		if(nums[s.charAt(left)]>=0) count++;
        		nums[s.charAt(left)]++;
        		left++;
        	}
        }
        return result;
    } 
}
