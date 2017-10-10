package niukewang.jingdong2017;

import java.util.Scanner;

/*
 * 计算小明通过考试的概率
 */
public class PassExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] probability = new int[n];
		for(int i=0; i<n; i++) {
			probability[i] = in.nextInt();
		}
		getProbability(n, probability);
	}
	
	public static void getProbability(int n, int[] arr) {
		//作对题目个数
		int num = (int)Math.ceil(n*0.6);
		double result = 0;
		double[][] dp = new double[n+1][n+1];//dp[i][j]----前i个题目对j个的概率
		dp[0][0] = 1;
		for(int i=1; i<dp.length; i++) {
			dp[i][0] = dp[i-1][0]*(100-arr[i-1])/100;
			dp[i][i] = dp[i-1][i-1]*arr[i-1]/100;
			for(int j=1; j<i; j++) {
				dp[i][j] = dp[i-1][j]*(100-arr[i-1])/100+dp[i-1][j-1]*arr[i-1]/100;
			}
		}
		for(int i=num; i<=n; i++) {
			result = result+dp[n][i];
		}
		System.out.printf("%.5f\n", result);
	} 
}
