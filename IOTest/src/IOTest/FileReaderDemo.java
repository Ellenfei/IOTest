/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:��ȡ�ļ����ݵ������ַ���
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
		//Ŀ���ļ�
		File file=new File("F:\\java\\IOTest\\reader.txt");
		//��������ͨ��
		FileReader fileReader=new FileReader(file);
		//�����ַ������ȡ����
		char[] buf=new char[1024];
		int length=0;
		while((length=fileReader.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
		//�ر���Դ
		fileReader.close();
	}
}
