/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:д���ļ����ݵ�����ֽ���
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
		//Ŀ���ļ�
		File file=new File("F:\\java\\IOTest\\input.txt");
		//��������ͨ��
		FileOutputStream fileOutputStream=new FileOutputStream(file,true);
		//д������
		String data="\r\nHello Ketty......";
		fileOutputStream.write(data.getBytes());
		//�ر���Դ
		fileOutputStream.close();
	}
}
