/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:读取文件数据的输入字节流
 */
package IOTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		readTest();
	}
	public static void readTest() throws IOException{
		//找到目标文件
		File file=new File("F:\\java\\IOTest\\input.txt");
		//建立数据通道
		FileInputStream fileInputStream=new FileInputStream(file);
		//使用缓冲数组读取数据
		int length=0;
		byte[] buf=new byte[1024];
		while((length=fileInputStream.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
		//关闭资源
		fileInputStream.close();
	}
}
