package foundation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileIODemo {
	public static void main(String[] args) throws IOException {
		//ȷ���ļ�λ��
		File file = new File("F:\\java\\IOTest\\input.txt");
		//�������������
		FileWriter writer = new FileWriter(file);
		//����������
		BufferedWriter buf = new BufferedWriter(writer);
		buf.write("happiness ellen");
		buf.flush();
		buf.close();
	}

}
