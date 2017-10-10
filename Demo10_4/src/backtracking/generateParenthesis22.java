package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 *  22. Generate Parentheses
 *  ���ݷ��������������(�ݹ�����д�)
 *  ��������
 *  
 *  �����ŵ�����>=�����ŵ�����
 *  
 */
public class generateParenthesis22 {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(2));
	}
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateOneByOne(list, "", n, n);
        return list;
    }
	public static void generateOneByOne(List<String> list, String str, int open, int close) {
		if(close<open) return;
		if(open>0) generateOneByOne(list, str+"(", open-1, close);
		if(close>0) generateOneByOne(list, str+")", open, close-1);
		if(open==0 && close==0) {
			list.add(str);
			return;
		}
	}
}
