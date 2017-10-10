package algorithms;

public class isanagram {
	public static void main(String[] args) {
		String s="abcd";
		String t="bcds";
		System.out.println(isAnagram(s,t));
		System.out.println(s.charAt(0)-'a');
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] nums = new int[26];
        for(int i=0; i<s.length(); i++) {
        	nums[s.charAt(i)-'a']++;
        	nums[t.charAt(i)-'a']--;
        }
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] != 0) return false;
        }
        return true;
    }
}
