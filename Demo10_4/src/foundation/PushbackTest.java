package foundation;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/*
 * 推回输入流
 */
public class PushbackTest {
	public static void main(String[] args) {
		try(
				PushbackReader pr = new PushbackReader(new FileReader("F://java//eclipse//internship//Demo10_4//src//foundation//PushbackTest.java"), 64)) 
		{
			char[] buf = new char[32];
			String lastContent = "";//用于上次读取的字符串内容
			int hasRead = 0;
			while((hasRead=pr.read(buf))!=-1) {
				String content = new String(buf, 0, hasRead);
				int targetIndex = 0;
				if((targetIndex = (lastContent+content).indexOf("new PushbackReader"))>0) {
					pr.unread((lastContent+content).toCharArray());
					if(targetIndex>32) {
						buf = new char[targetIndex];
					}
					//目标字符串之前的内容
					pr.read(buf, 0, targetIndex);
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				} else {
					System.out.print(lastContent);
					lastContent = content;
				}
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}
