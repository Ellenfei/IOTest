/* Date:2016/7/21
 * Name:Wangfei
 * 练习：获取控制台输入，将其输出到一个文件中存储下来，存储格式是：“时间 【内容】”，比如：2015-01-24 【呵呵】
 * 生成时间：可以用Date类或者Calendar类
 */
package Practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) throws IOException{
		
		writeTest();
	}
	public static void writeTest() throws IOException{
		Calendar rightNow = Calendar.getInstance();
		int year= rightNow.get(Calendar.YEAR);
		int month=rightNow.get(Calendar.MONTH)+1;
		int day=rightNow.get(Calendar.DAY_OF_MONTH);
		String strInput;
		String str;
		//目标文件
		File file=new File("F:\\java\\IOTest\\Demo1.txt");
		//建立数据通道
		FileWriter fileWrite=new FileWriter(file,true);
		//写出数据
		Scanner user=new Scanner(System.in);
		System.out.println("请输入：");
		strInput=user.nextLine();
		str=year+"年"+month+"月"+day+"日"+" "+"【"+strInput+"】";
		fileWrite.write(str);
		fileWrite.close();
	}
}
