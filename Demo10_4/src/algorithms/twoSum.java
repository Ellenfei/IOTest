package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
    public static int[] twosum(int[] nums, int target) {
       /* int length = nums.length;
        int[] solution = new int[length];
        int k = 0;
        for(int i = 0; i<length-1; i++) {
            for(int j = i+1; j<length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target) {
                	solution[k] = i;
                	solution[++k] = j;
                	k = k+1;
                }
            }
        }*/
    	Map<Integer,Integer> map = new 	HashMap<Integer,Integer>();
    	int[] result = new int[2];
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(target-nums[i])){
    			result[1] = i;
    			result[0] = map.get(target-nums[i]);
    		}
    		map.put(nums[i], i);
    	}
        return result;
    }
    
    public static void main (String[] args) {
    	int[] nums = {7,2,11,13};
    	int target = 15;
    	System.out.println(Arrays.toString(twosum(nums,target))); 
    	
    }

}