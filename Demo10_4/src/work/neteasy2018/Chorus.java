package work.neteasy2018;

import java.util.Scanner;

/*
 * �ϳ���ʹ���Ѷ���С
 * СQ��ţ��ʿ�ϳ�һ�׸���,���׸�����n���������,ÿ��������һ����������ʾ��
 * ����ÿ������Ҫô��СQ�ݳ�Ҫô��ţ��ʿ�ݳ�,����һϵ�������ݳ����Ѷȵ����������������仯����֮��,
 * ����һ������������8, 8, 13, 12, ��ô�����Ѷȵ���|8 - 8| + |13 - 8| + |12 - 13| = 6(����||��ʾ����ֵ)��
 * ����Ҫ�԰���n�����������СQ��ţ��ʿ,�������ݳ����Ѷ�֮����С,����������С���ѶȺ��Ƕ��١�
 * ��������ʾ: СQѡ���ݳ�{5, 6}�Ѷ�Ϊ1, ţ��ʿѡ���ݳ�{1, 2, 1}�Ѷ�Ϊ2,�Ѷ�֮��Ϊ3,��һ������С�ѶȺ͵ķ����ˡ� 
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
