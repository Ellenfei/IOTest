package leetcode;
/*
 * 647. Palindromic Substrings
 * ���ǲ�ͬ�Ļ������ģ�Ȼ���������������ĳ����������õĻ��ĸ�����
 * ������������Ӵ� s[ i - j , ...,  i + j ] ��, i �ǻ������ģ����������������Σ���
 * �Ӵ� s[ i - 1 - j , ...,  i + j ] �У�( i - 1 , i ) �ǻ������ģ�����ż���������Σ���
 */
public class CountSubstrings647 {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(countSubstrings(s));
	}
	public static int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
        	//���Ĵ�����Ϊ����
        	for(int j=0; i-j>=0 && i+j<s.length() && s.charAt(i-j)==s.charAt(i+j); j++) {
        		count++;
        	}
        	//���Ĵ�����Ϊż��
        	for(int j=0; i-j>=0 && i+1+j<s.length() && s.charAt(i-j)==s.charAt(i+1+j); j++) {
        		count++;
        	}
        }
        return count;
    }
	
	
}
