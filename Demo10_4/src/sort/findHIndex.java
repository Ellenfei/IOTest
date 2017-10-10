package sort;

import java.util.Arrays;

/*
 * 274. H-Index
 * Solution:������˼·���ȶ���������Ȼ��Ӻ���ǰ������ά��һ��count��������countֵ���ڻ�������ڵ�ֵʱ��
 * �Ϳ��Է����ˡ����������˳�ѭ��ʱ����δ���أ��Ǳ�ʾ�����е���������count����ô�ͷ���count����Ϊ��ʱ��0����
 * С��count����count������count��
 */
public class findHIndex {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	public static int hIndex(int[] citations) {
        int length = citations.length;
        if(length==0) { 
        	return 0;
        }
        Arrays.sort(citations);
        int count = 0;
        for(int i=length-1; i>=0; i--) {
        	if(count>=citations[i])
        		return count;
        	count++;
        }
        return count;
    }
}
