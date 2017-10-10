package niukewang.jingdong2017;

import java.util.Arrays;
import java.util.Scanner;

public class XOR4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = in.nextInt();
		}
		//System.out.println(Arrays.toString(arr1));
		for(int i=0; i<n; i++) {
			arr2[i] = in.nextInt();
		}
		getXOR(n, arr1, arr2);
	}
	
	//XOR
	public static void getXOR(int n, int[] arr1, int[] arr2) {
		int result = 0;
		for(int i=0; i<n; i++) {
			if(arr1[i]==arr2[i]) {
				continue;
			} else {
				result += Math.pow(2, n-1-i);
			}
		}
		System.out.println(result);
	}
}
