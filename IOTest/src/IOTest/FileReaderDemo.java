/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:读取文件数据的输入字符流
 */
package IOTest;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		readTest();
	}
	public static void readTest() throws IOException{
		//目标文件
		File file=new File("F:\\java\\IOTest\\reader.txt");
		//建立数据通道
		FileReader fileReader=new FileReader(file);
		//缓冲字符数组读取数据
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
		//关闭资源
		fileReader.close();
	}
}
