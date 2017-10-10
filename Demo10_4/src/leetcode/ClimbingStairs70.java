package leetcode;
/*
 * 70. Climbing Stairs
 * ��̬�滮��쳲�����������
 * ���⣺��n��¥�ݣ���һ�ο�����һ����������������n��¥���ж�����������������һ��ͬѧ����Ѷʱ���ʵ������⡣
 * ���͵�쳲��������С� 
 * ˼·����Ϊһ��������һ�������������Գ�ȥ��һ�Σ�n��������f(n)���Ե���f(n-1)+f(n-2)����ľ���쳲��������С� 
 */
public class ClimbingStairs70 {
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
	public static int climbStairs(int n) {
        if(n<=0) {
        	return 0;
        } else if(n==1) {
        	return 1;
        } else if(n==2) {
        	return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<n+1; i++) {
        	dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
