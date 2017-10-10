package DP;
/*
 * 494. Target Sum
 * ���⣺�ڸ���������ǰ����ӡ�+������-���ţ�ʹ�����ĺ�Ϊ������target
 * ������DP
 * ���ǰ���ӡ�+���ļ��ϼ�ΪP����-����ΪN����
 * sum(P)-sum(N)=target
 * sum(P)+sum(N)=sum
 * ��ʽ��� ---> sum(p)=(target+sum)/2
 * �����Ϊ����nums������������P��P��Ϊ(target+sum)/2
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
		//��Ϊ0�������
		dp[0] = 1;
		for(int num : nums) {
			for(int i=S; i>=num; i--) {
				//��Ϊi�������
				dp[i] += dp[i-num];
			}
		}
		return dp[S];
	}
}
