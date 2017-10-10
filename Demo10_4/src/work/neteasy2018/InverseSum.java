package work.neteasy2018;

import java.util.Scanner;

public class InverseSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(getInverse(n));
	}
	
	public static int getInverse(int n) {
		int result;
		String str = String.valueOf(n);
		String inverse = "";
		for (int i=str.length()-1; i>-1; i--) {
			inverse = inverse+str.charAt(i);
		} 
		result = Integer.valueOf(inverse)+n;
		return result;
	}

}
