package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ƥ��������ʽ���ַ���
 */
public class FindGroup {
	public static void main(String[] args) {
		String str = "I want a book, please call on me , number is 13500006665"
				+ "make friends, the phone 13622263338"
				+ "15899772288";
		//����һ��Pattern���󣬲���������һ��Matcher����ֻץȡ13*��15*�ε��ֻ���
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
