package leetcode;
/*
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 题意：验证一个字符串是否为回文，只看字母（忽略其它字符），不分大小写。
 * 
 * isdigit：判断字符是否是数字(0 – 9)
 * isalpha：判断字符是否是字母(A – Z or a – z)
 * isxdigit：判断是否是十六进制字符(A – F, a – f, or 0 – 9)
 * isalnum：判断是否是数字和字母(A – Z, a – z, or 0 – 9)
 * 
 */
public class ValidPalindrome125 {
	public static void main(String[] args) {
		String s = "0p";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		if(s.length()<1) {
			return true;
		}
        int left = 0;
        int right = s.length()-1;
        while(left<right) {
        	while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
        		left++;
        	}
        	while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
        		right--;
        	}
        	if(s.charAt(left)!=s.charAt(right)) {
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }
}
