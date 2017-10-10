package niukeprac;

import java.util.Scanner;

public class holmesdate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//输入四行字符串并存起来
		String[] str = new String[4];
		System.out.println("please input four strings:");
		for(int i=0; i<4; i++) {
			str[i] = in.nextLine();				
		}
		
		//比较前两个字符串找出星期
		int mark = 0;
		for(int i=0; i<str[0].length()&&i<str[1].length(); i++) {
			if(str[0].charAt(i)==str[1].charAt(i) && str[0].charAt(i)>='A' && 
					str[0].charAt(i)<='Z') {
				switch (str[0].charAt(i)) {
				case 'A': System.out.print("MON ");
				break;
				case 'B': System.out.print("TUE ");
				break;
				case 'C': System.out.print("WED ");
				break;
				case 'D': System.out.print("THU ");
				break;
				case 'E': System.out.print("FRI ");
				break;
				case 'F': System.out.print("SAT ");
				break;
				case 'G': System.out.print("SUN ");
				break;
				}
				mark = i;
				break;
			}
		}
		
		//找出小时
		for(int i=mark+1; i<str[0].length()&&i<str[1].length(); i++) {
			int hour = 0;
			if(str[0].charAt(i)==str[1].charAt(i) && str[0].charAt(i)>='A' && 
					str[0].charAt(i)<='N') {
				hour = str[0].charAt(i)-'A'+10;
				System.out.print(hour+":");
				break;
			} else if(str[0].charAt(i)==str[1].charAt(i) && str[0].charAt(i)>='0' && 
					str[0].charAt(i)<='9') {
				hour = str[0].charAt(i)-'0';
				System.out.printf("%02d",hour);
				System.out.print(":");
				break;
			}
		}
		
		//找出分钟
		for(int i=0; i<str[2].length()&&i<str[3].length(); i++) {
			int min = 0;
			if(str[2].charAt(i)==str[3].charAt(i) && str[2].charAt(i)>='a' && 
					str[2].charAt(i)<='z') {
				min = i;
				System.out.printf("%02d", min);
				break;
			}
		}
	}
}
