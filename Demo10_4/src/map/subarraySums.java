package map;

import java.util.HashMap;

/*
 * 560. Subarray Sum Equals K
 * 假设sum(i,j)为子数组nums[i,j]之间的和，sum(k)为子数组nums[0...k]之间的和，
 * 那么有：sum(i,j) = sum(j) - sum(k)
 * 
 * 比如：一个数组nums={-2,-1,2,1}，k=1
 * sum[2]=nums[0]+nums[1]+nums[2]
 *   sum[0]+k=sum[2]
 *   k=nums[1]+nums[2]=sum[2]-sum[0]
 */
public class subarraySums {
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		System.out.println(subarraySum(nums, 2));
	}

	public static int subarraySum(int[] nums, int k) {
        int sum=0, result=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++) {
        	sum += nums[i];
        	if(map.containsKey(sum-k)) {
        		result += map.get(sum-k);
        	}
        	map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return result;
    }
}
