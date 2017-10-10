package DP;
/*
 * 416. Partition Equal Subset Sum
 * ������DP--01��������
 * dp[i][j]��ʾ��ǰi�������ڴ�СΪj�ı����ڵ�����ֵ
 * �ռ�ѹ��dp[]/boolean
 * ���ƹ�ʽ��dp[i][j]=max{dp[i-1][j],dp[i-1][j-num[i]]+num[i]}
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
        //��ʼ��dp,��i����Ʒ�����СΪ0�ı����е�����ֵ
        for(int i=0; i<len; i++) {
        	dp[i][0] = 0;
        }
        //01��������
        for(int i=1; i<=len; i++) {
        	for(int j=sum; j>=nums[i-1]; j--) {
        		dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i-1]]+nums[i-1]);
        	}
        }
        return dp[len][sum]==sum;
    }
}
