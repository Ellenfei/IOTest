package map;

import java.util.HashMap;

/*
 * 560. Subarray Sum Equals K
 * ����sum(i,j)Ϊ������nums[i,j]֮��ĺͣ�sum(k)Ϊ������nums[0...k]֮��ĺͣ�
 * ��ô�У�sum(i,j) = sum(j) - sum(k)
 * 
 * ���磺һ������nums={-2,-1,2,1}��k=1
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
