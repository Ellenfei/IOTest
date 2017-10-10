package algorithms;


import java.util.Arrays;
import java.util.HashMap;

public class twosum2 {
	public static void main(String[] args) {
		int[] nums = {7,2,11,13};
    	int target = 15;
    	System.out.println(Arrays.toString(twoSum(nums,target))); 
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();		
		int[] result = new int[2];
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				result[1] = i;
				result[0] = map.get(target-nums[i]);
			}
			map.put(nums[i], i);
		}
		return result;
    }
}
