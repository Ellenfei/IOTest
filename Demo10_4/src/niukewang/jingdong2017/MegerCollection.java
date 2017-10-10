package niukewang.jingdong2017;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 给你两个集合，要求{A}+{B}。
 */
public class MegerCollection {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int A = in.nextInt();
			int[] arrA = new int[A];
			int B = in.nextInt();
			int[] arrB = new int[B];
			for(int i=0; i<A; i++) {
				arrA[i] = in.nextInt();
			}
			for(int i=0; i<B; i++) {
				arrB[i] = in.nextInt();
			}
			merge(arrA, arrB);
		}
	}
	
	public static void merge(int[] arrA, int[] arrB) {
		int[] result = new int[arrA.length+arrB.length];
		for(int i=0; i<result.length; i++) {
			if(i<arrA.length) {
				result[i] = arrA[i];
			} else {
				result[i] = arrB[i-arrA.length];
			}
		}
		Arrays.sort(result);
		System.out.print(result[0]);
		for(int i=1; i<result.length; i++) {
			if(result[i]==result[i-1]) {
				continue;
			}
			System.out.print(" "+result[i]);
		}
	}	
}
