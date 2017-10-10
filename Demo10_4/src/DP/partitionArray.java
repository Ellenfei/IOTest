package DP;
/*
 * 416. Partition Equal Subset Sum
 * 方法：DP--01背包问题
 * dp[i][j]表示将前i个数放在大小为j的背包内的最大价值
 * 空间压缩dp[]/boolean
 * 递推公式：dp[i][j]=max{dp[i-1][j],dp[i-1][j-num[i]]+num[i]}
 */
public class partitionArray {
	public static void main(String[] args) {
		int[] nums = {1,5,10,1,5};
		System.out.println(canPartition(nums));
	}
	public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) {
        	sum += num;       	
        }
        if(sum%2==1) return false;
        sum = sum >> 2;
        int len = nums.length;
        int[][] dp = new int[len+1][sum+1];
        //初始化dp,将i件物品放入大小为0的背包中的最大价值
        for(int i=0; i<len; i++) {
        	dp[i][0] = 0;
        }
        //01背包递推
        for(int i=1; i<=len; i++) {
        	for(int j=sum; j>=nums[i-1]; j--) {
        		dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i-1]]+nums[i-1]);
        	}
        }
        return dp[len][sum]==sum;
    }
}
