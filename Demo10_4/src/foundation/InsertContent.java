package foundation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 实现了向指定文件/指定位置插入内容的功能
 */
public class InsertContent {
	public static void main(String[] args) throws IOException {
		insert("F://java//eclipse//internship//Demo10_4//src//foundation//InsertContent.java", 45, "插入的内容\r\n");
	}
	
	public static void insert(String fileName, long pos, String insertContent) throws IOException {
		File tmp = File.createTempFile("tmp", null);
		tmp.deleteOnExit();
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
			FileOutputStream tmpOut = new FileOutputStream(tmp);
			FileInputStream tmpIn = new FileInputStream(tmp);
			) {
			raf.seek(pos);
			//将插入点后的内容读入到临时文件中
			byte[] buff = new byte[64];
			int hasRead = 0;
			while((hasRead=raf.read(buff))!=-1) {
				tmpOut.write(buff, 0, hasRead);
			}
			//插入内容
			raf.seek(pos);
			raf.write(insertContent.getBytes());
			//追加临时文件中的内容
			while((hasRead=raf.read(buff))!=-1) {
				raf.write(buff, 0, hasRead);
			}
		}
	}
}
