package work.neteasy2018;

import java.util.Scanner;

/*
 * 2018ÍøÒ×Ğ£ÕĞ
 */
public class MagicCoin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(getMachine(n));
	}
	
	public static String getMachine(int n) {
		String result = "";
		while(n!=0) {
			if(n%2==0) {
				n = (n-2)/2;
				result = "2"+result;
			} else {
				n = (n-1)/2;
				result = "1"+result;
			}
		}	
		return result;
	}
}
