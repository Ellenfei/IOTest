package leetcode;
/*
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * ���⣺��֤һ���ַ����Ƿ�Ϊ���ģ�ֻ����ĸ�����������ַ��������ִ�Сд��
 * 
 * isdigit���ж��ַ��Ƿ�������(0 �C 9)
 * isalpha���ж��ַ��Ƿ�����ĸ(A �C Z or a �C z)
 * isxdigit���ж��Ƿ���ʮ�������ַ�(A �C F, a �C f, or 0 �C 9)
 * isalnum���ж��Ƿ������ֺ���ĸ(A �C Z, a �C z, or 0 �C 9)
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
