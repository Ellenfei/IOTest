package DP;

import java.util.Arrays;

/*
 * 338. Counting Bits
 * 方法1：非DP思路
 * n=0  0
 * n=1  0 1
 * n=3  0 1 1 2
 * n=7  0 1 1 2 1 2 2 3
 * 
 * 方法2：DP算法
 * 当n为奇数：f(n) = f(n/2)+1
 * 当n为偶数：f(n) = f(n/2)
 */
public class countingBits {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
	
	public static int[] countBits(int num) {
		//方法1
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
		
		//方法2
		int[] dp = new int[num+1];
		dp[0] = 0;
		for(int i=1; i<=num; i++) {
			dp[i] = dp[i>>1]+(i&1);
		}
		return dp;
    }
}
