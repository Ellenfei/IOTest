/*
 * Date:2016/7/17
 * Name:Wangfei
 * Demo:д���ļ����ݵ�����ַ���
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
		//Ŀ���ļ�
		File file=new File("F:\\java\\IOTest\\reader.txt");
		//��������ͨ��
		FileWriter fileWrite=new FileWriter(file,true);
		//д������
		String data="\r\n����Ƶ��������Ϸ��㣬�������ǷǺú���";
		fileWrite.write(data);
		fileWrite.close();
	}
}