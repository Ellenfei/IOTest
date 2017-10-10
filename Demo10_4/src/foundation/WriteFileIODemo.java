package foundation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileIODemo {
	public static void main(String[] args) throws IOException {
		//确定文件位置
		File file = new File("F:\\java\\IOTest\\input.txt");
		//创建输出流对象
		FileWriter writer = new FileWriter(file);
		//创建缓冲区
		BufferedWriter buf = new BufferedWriter(writer);
		buf.write("happiness ellen");
		buf.flush();
		buf.close();
	}

}
