package niukewang.jingdong2017;

import java.util.Scanner;

/*
 * ���ƾ�ֵ
 * ע�⣺���ӷ�ĸͬʱ�������Լ���� ���������ʽ
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
	//��ĳ�����Ƶĸ���λ���
	public static int oneSum(int num, int hex) {
		int sum = 0;
		while(num>0) {
			sum = sum+num%hex;
			num = num/hex;
		}
		return sum;
	}
	//������hex�������
	public static int allSum(int num) {
		int sum = 0;
		for(int hex=2; hex<num; hex++) {
			sum = sum+oneSum(num, hex);
		}
		return sum;
	}
	//���ӷ�ĸԼ�ִ��������Լ��
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
