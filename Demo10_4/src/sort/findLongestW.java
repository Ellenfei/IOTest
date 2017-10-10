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
	/*遍历字典d，利用两个i和j指针判断s与d中的字符串，	如果i和j遍历完成说明当前字符串是s的子串；
	 * 如果当前字符串的长度比保存的结果result的字符串长度长，则更新result，最后返回result。
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
