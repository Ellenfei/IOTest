package leetcode;
/*
 * 70. Climbing Stairs
 * 动态规划，斐波那契额数列
 * 题意：有n级楼梯，你一次可以爬一级或两级，问爬上n级楼梯有多少种爬法。这是我一个同学面腾讯时被问到的问题。
 * 典型的斐波那契数列。 
 * 思路：因为一次你能爬一级或两级，所以除去第一次，n级的爬法f(n)可以等于f(n-1)+f(n-2)。求的就是斐波那契数列。 
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
