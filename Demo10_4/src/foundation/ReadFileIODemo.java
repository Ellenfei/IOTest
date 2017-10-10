package foundation;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


/*
 * IO����ȡ�ļ�
 */
public class ReadFileIODemo {
	public static void main(String[] args) throws IOException {
		//ȷ���ļ�λ��
		File file = new File("F:\\java\\IOTest\\reader.txt");
		//��������������
		FileReader read = new FileReader(file);
		//����������
		BufferedReader buffer = new BufferedReader(read);
		String line = null ;
		while((line=buffer.readLine())!=null ){
			System.out.println(line);
		}
		buffer.close();
	}
}
