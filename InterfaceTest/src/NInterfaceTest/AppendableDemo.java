/*
 * Date:2016/7/22
 * Name:Wangfei
 * Demo:Appendable½Ó¿ÚÁ·Ï°
 */
package NInterfaceTest;
import java.io.IOException;
import java.io.StringWriter;
 
public class AppendableDemo {
	public static void main(String[] args) throws IOException{
		StringWriter writer=new StringWriter();
		writer.append("H");
		writer.append("ello");
		System.out.println(writer);
		append(writer,"12 abcdefg345",2,9);
		System.out.println(writer);
	}
	public static void append(Appendable appendable,CharSequence csq, int start, int end) throws IOException{
		 appendable.append(csq,start,end);
	}
}
