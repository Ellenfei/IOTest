package DP;
/*
 * 494. Target Sum
 * 题意：在给定的数组前面添加‘+’、‘-’号，使得最后的和为给定的target
 * 方法：DP
 * 我们把添加‘+’的集合记为P，‘-’记为N，则
 * sum(P)-sum(N)=target
 * sum(P)+sum(N)=sum
 * 上式相加 ---> sum(p)=(target+sum)/2
 * 问题简化为：在nums中找其子数组P，P和为(target+sum)/2
 */
public class targetSum {
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1};
		System.out.println(findTargetSumWays(nums, 3));
	}
	
	public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int num : nums) {
        	sum += num;
        }
        return sum<S || (sum+S)%2==1 ? 0 : subsetSum(nums, (sum+S)>>1);
    }
	
	public static int subsetSum(int[] nums, int S) {
		int[] dp = new int[S+1];
		//和为0的组合数
		dp[0] = 1;
		for(int num : nums) {
			for(int i=S; i>=num; i--) {
				//和为i的组合数
				dp[i] += dp[i-num];
			}
		}
		return dp[S];
	}
}
