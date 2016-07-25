/*
 * Date:2016/7/17
 * Name:Wangfei
 * Demo:写入文件数据的输出字符流
 */
package IOTest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String[] args) throws IOException{
		writeTest();
	}
	public static void writeTest() throws IOException{
		//目标文件
		File file=new File("F:\\java\\IOTest\\reader.txt");
		//建立数据通道
		FileWriter fileWrite=new FileWriter(file,true);
		//写出数据
		String data="\r\n天高云淡，望断南飞雁，不到长城非好汉。";
		fileWrite.write(data);
		fileWrite.close();
	}
}