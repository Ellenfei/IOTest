package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ƥ���ʼ���ַ�Ƿ����Ҫ��
 */
public class MatchesMail {
	public static void main(String[] args) {
		String[] mails = {"kongyeelu@163163.com",
				"kongyeelu@gmail.com",
				"liqing@crayit.org",
				"lihao@abc.net"};
		String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
		Pattern mailPattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for(String mail : mails) {
			if(matcher==null) {
				matcher = mailPattern.matcher(mail);
			} else {
				matcher.reset(mail);
			}
			String result = mail+(matcher.matches() ? "��" : "����")
					+"һ����Ч�������ַ";
			System.out.println(result);
		}
	}

}
