/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:写入文件数据的输出字节流
 */
package IOTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		writeTest();
	}
	public static void writeTest() throws IOException{
		//目标文件
		File file=new File("F:\\java\\IOTest\\input.txt");
		//建立数据通道
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		//写出数据
		String data="\r\nHello Ketty......";
		fileOutputStream.write(data.getBytes());
		//关闭资源
		fileOutputStream.close();
	}
}
