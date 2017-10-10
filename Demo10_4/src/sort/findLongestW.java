package sort;

import java.util.ArrayList;
import java.util.List;

public class findLongestW {
	public static void main(String[] args) {
		String s = "abpcplea";
		List<String> d = new ArrayList<>();
		d.add("ale");
		d.add("apple");
		d.add("monkey");
		d.add("plea");
		System.out.println(findLongestWord(s,d));
	}
	/*�����ֵ�d����������i��jָ���ж�s��d�е��ַ�����	���i��j�������˵����ǰ�ַ�����s���Ӵ���
	 * �����ǰ�ַ����ĳ��ȱȱ���Ľ��result���ַ������ȳ��������result����󷵻�result��
	 */
	public static String findLongestWord(String s, List<String> d) {
        if(d==null || d.isEmpty()) return "";
        String result = "";
        for (String str : d) {
        	if(str.length() > s.length())
        		continue;
        	
        	int i=0, j=0;
        	
        	while(i<s.length() && j<str.length()) {
        		if(str.charAt(j) == s.charAt(i))
        			j++;
        		i++;   		       		
        	}
        	if(j==str.length() && result.isEmpty()) {
        		result = str;
        		continue;
        	}
        	if(j==str.length() && j>=result.length()) {
        		result = (j>result.length() || str.compareTo(result)<0) ? str : result;
        	}
        }        
        return result;
    }
}
