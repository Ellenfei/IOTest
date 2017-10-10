package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 匹配正则表达式的字符串
 */
public class FindGroup {
	public static void main(String[] args) {
		String str = "I want a book, please call on me , number is 13500006665"
				+ "make friends, the phone 13622263338"
				+ "15899772288";
		//创建一个Pattern对象，并用它建立一个Matcher对象，只抓取13*和15*段的手机号
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
