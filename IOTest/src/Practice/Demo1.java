/* Date:2016/7/21
 * Name:Wangfei
 * ��ϰ����ȡ����̨���룬���������һ���ļ��д洢�������洢��ʽ�ǣ���ʱ�� �����ݡ��������磺2015-01-24 ���Ǻǡ�
 * ����ʱ�䣺������Date�����Calendar��
 */
package Practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) throws IOException{
		
		writeTest();
	}
	public static void writeTest() throws IOException{
		Calendar rightNow = Calendar.getInstance();
		int year= rightNow.get(Calendar.YEAR);
		int month=rightNow.get(Calendar.MONTH)+1;
		int day=rightNow.get(Calendar.DAY_OF_MONTH);
		String strInput;
		String str;
		//Ŀ���ļ�
		File file=new File("F:\\java\\IOTest\\Demo1.txt");
		//��������ͨ��
		FileWriter fileWrite=new FileWriter(file,true);
		//д������
		Scanner user=new Scanner(System.in);
		System.out.println("�����룺");
		strInput=user.nextLine();
		str=year+"��"+month+"��"+day+"��"+" "+"��"+strInput+"��";
		fileWrite.write(str);
		fileWrite.close();
	}
}
