package stringpractice;
/*
 *  520. Detect Capital
 *  
 *  ��Ŀ��һ���ж�һ����ĸ�Ƿ��Сд��ȷ��Ҫôȫ�Ǵ�д��Ҫôȫ��Сд����������ĸ��д����Сд����������Ҫ��
 *  
 *  ������
 *  1. �ü򵥵��ж������
 *  2. ��java�Դ��Ĵ�Сдת���������ַ����ıȽ������
 *  3. ����������ʽ�����
 *  
 *  65��90Ϊ26����дӢ����ĸ,97��122��Ϊ26��СдӢ����ĸ
 */
public class detectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("Leetcode"));
	}
	
	public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(char ch : word.toCharArray()) {
        	if('Z'-ch >=0) cnt++;		//��д��ĸ�ĸ���
        }
        return (cnt==word.length() || cnt==0 || (cnt==1 && 'Z'-word.charAt(0)>=0));
    }
}
