package foundation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * ʵ������ָ���ļ�/ָ��λ�ò������ݵĹ���
 */
public class InsertContent {
	public static void main(String[] args) throws IOException {
		insert("F://java//eclipse//internship//Demo10_4//src//foundation//InsertContent.java", 45, "���������\r\n");
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
			//������������ݶ��뵽��ʱ�ļ���
			byte[] buff = new byte[64];
			int hasRead = 0;
			while((hasRead=raf.read(buff))!=-1) {
				tmpOut.write(buff, 0, hasRead);
			}
			//��������
			raf.seek(pos);
			raf.write(insertContent.getBytes());
			//׷����ʱ�ļ��е�����
			while((hasRead=raf.read(buff))!=-1) {
				raf.write(buff, 0, hasRead);
			}
		}
	}
}
