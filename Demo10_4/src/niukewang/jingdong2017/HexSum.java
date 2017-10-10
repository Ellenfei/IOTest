package niukewang.jingdong2017;

import java.util.Scanner;

/*
 * 进制均值
 * 注意：分子分母同时除以最大公约数， 化成最简形式
 */
public class HexSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int num = in.nextInt();
			System.out.println(maxCommonDivisor(allSum(num), num-2));
			System.out.printf("%d/%d\n", allSum(num)/maxCommonDivisor(allSum(num), num-2),
					(num-2)/maxCommonDivisor(allSum(num), num-2));
		}
	}
	//对某个进制的各个位求和
	public static int oneSum(int num, int hex) {
		int sum = 0;
		while(num>0) {
			sum = sum+num%hex;
			num = num/hex;
		}
		return sum;
	}
	//对所有hex的数求和
	public static int allSum(int num) {
		int sum = 0;
		for(int hex=2; hex<num; hex++) {
			sum = sum+oneSum(num, hex);
		}
		return sum;
	}
	//分子分母约分处理，求最大公约数
	public static int maxCommonDivisor(int numerator, int denominator) {
		//int maxCommonDivisor;
		//if(numerator>denominator) {			
			while(numerator%denominator!=0) {
				int tmp = denominator;	
				denominator = numerator%denominator;
				numerator = tmp;
			}
			//maxCommonDivisor = denominator;
		//} 
		return denominator;
	}
}
