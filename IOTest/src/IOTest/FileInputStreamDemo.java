/*
 * Date:2016/7/16
 * Name:Wangfei
 * Demo:��ȡ�ļ����ݵ������ֽ���
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
		//�ҵ�Ŀ���ļ�
		File file=new File("F:\\java\\IOTest\\input.txt");
		//��������ͨ��
		FileInputStream fileInputStream=new FileInputStream(file);
		//ʹ�û��������ȡ����
		int length=0;
		byte[] buf=new byte[1024];
		while((length=fileInputStream.read(buf))!=-1){
			System.out.print(new String(buf,0,length));
		}
		//�ر���Դ
		fileInputStream.close();
	}
}
