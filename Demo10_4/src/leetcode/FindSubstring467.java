package leetcode;
/*
 * 467. Unique Substrings in Wraparound String
 * �ҳ��ԡ�a-z��ÿ���ַ���β������£�����Ӵ��ж೤��Ȼ�������
 */
public class FindSubstring467 {
	public static void main(String[] args) {
		String p = "zab";
		System.out.println(findSubstringInWraproundString(p));
	}
	public static int findSubstringInWraproundString(String p) {
        int[] p_int = new int[p.length()];
        int[] count = new int[26]; 	//����ԡ�a-z��ÿ���ַ���β����ַ���������
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
