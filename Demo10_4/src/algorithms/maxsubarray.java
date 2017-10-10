package algorithms;

public class maxsubarray {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max=dp[0];
        for(int i=1; i<nums.length; i++) {
        	dp[i] = nums[i] + (dp[i-1]>0 ? dp[i-1] :0);
        	max = Math.max(max, dp[i]);
        }
        return max;
    }
}