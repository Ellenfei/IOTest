package work.neteasy2018;

import java.util.Scanner;

/*
 * 合唱，使其难度最小
 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
 * 对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和,
 * 例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6(其中||表示绝对值)。
 * 现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
 * 如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,这一个是最小难度和的方案了。 
 * 
 */
public class Chorus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(getMinSum(arr));
	}
	
	public static int getMinSum(int[] arr) {
		int len = arr.length;
		int[][] dp = new int[len+1][len+1];
		for(int i=len-1; i>-1; i--) {
			for(int j=len-1; j>-1; j--) {
				int next = Math.max(i, j)+1;
				dp[i][j] = Integer.MAX_VALUE;
				dp[i][j] = Math.min(dp[i][j], dp[next][j]+(i==0?0:Math.abs(arr[next-1]-arr[i-1])));
				dp[i][j] = Math.min(dp[i][j], dp[i][next]+(j==0?0:Math.abs(arr[next-1]-arr[j-1])));
				
			}
		}
		return dp[0][0];
	}
}
