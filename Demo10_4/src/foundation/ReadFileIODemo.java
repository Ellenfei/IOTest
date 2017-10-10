package foundation;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


/*
 * IO流读取文件
 */
public class ReadFileIODemo {
	public static void main(String[] args) throws IOException {
		//确定文件位置
		File file = new File("F:\\java\\IOTest\\reader.txt");
		//创建输入流对象
		FileReader read = new FileReader(file);
		//创建缓冲区
		BufferedReader buffer = new BufferedReader(read);
		String line = null ;
		while((line=buffer.readLine())!=null ){
			System.out.println(line);
		}
		buffer.close();
	}
}
