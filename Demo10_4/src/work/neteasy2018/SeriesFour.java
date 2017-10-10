package work.neteasy2018;

import java.util.Scanner;

public class SeriesFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] A = new int[n][];
		for(int i=0; i<n; i++) {
			int len = in.nextInt();
			A[i] = new int[len];
			for(int j=0; j<len; j++) {
				A[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(isFourTimes(A[i]));
		}
	}
	
	public static String isFourTimes(int[] subA) {
		//1.仅为2的倍数，相邻排列；2.4的倍数，相间排列
		int count2 = 0;
		int count4 = 0;
		int countOthers = 0;
		for(int i=0; i<subA.length; i++) {			
			if(subA[i]%4==0) {
				count4++;
			} else if(subA[i]%2==0) {
				count2++;
			}
		}
		countOthers = subA.length-count4-count2;
		if(count4<countOthers-1) {
			return "No";
		}
		return "Yes";
	}
}
