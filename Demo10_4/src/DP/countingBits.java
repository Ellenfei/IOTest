package DP;

import java.util.Arrays;

/*
 * 338. Counting Bits
 * ����1����DP˼·
 * n=0  0
 * n=1  0 1
 * n=3  0 1 1 2
 * n=7  0 1 1 2 1 2 2 3
 * 
 * ����2��DP�㷨
 * ��nΪ������f(n) = f(n/2)+1
 * ��nΪż����f(n) = f(n/2)
 */
public class countingBits {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
	
	public static int[] countBits(int num) {
		//����1
        /*int[] result = new int[num+1];
        result[0] = 0;
        int pos = 1;
        for(int i=1, t=0; i<=num; i++, t++) {
        	if(i==pos) {
        		pos *=2;
        		t = 0;
        	}
        	result[i] = result[t]+1;
        }
        return result;*/
		
		//����2
		int[] dp = new int[num+1];
		dp[0] = 0;
		for(int i=1; i<=num; i++) {
			dp[i] = dp[i>>1]+(i&1);
		}
		return dp;
    }
}
