package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 15. 3Sum
 * 这个其实是以第一个题目为基础，首先进行排序。然后从数组第一位开始遍历，如第一位为1，
 * 在剩余后面的数组[3,-1,0,-3]中找出和为-1的两个数。用的就是第一题的思路。 
 */
public class ThreeSum15 {
	public static void main(String[] args) {
		int[] nums = {-2,0,0,2,2};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0; i<nums.length-2; i++) {
			if(i==0 || (i>0 && nums[i]!=nums[i-1])) {
				int start = i+1;
				int end = nums.length-1;
				int sum = -nums[i];
				while(start<end) {
					if(start<end && nums[start]+nums[end]==sum) {
						res.add(Arrays.asList(nums[i], nums[start], nums[end]));
						start++;
						end--;
						
						while(start<end && nums[start]==nums[start-1]) start++;
						while(start<end && nums[end]==nums[end+1]) end--;
					} else if(start<end && nums[start]+nums[end]<sum) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
		return res;
	}
	
	
	
	public static List<List<Integer>> threeSum(int[] nums, int k) {
		Arrays.sort(nums); 	
		int len = nums.length;
		List<List<Integer>> res = null;
		for(int i=0; i<len; i++) {
			if(i<len-1 && nums[i]==nums[i+1]) {
				continue;
			}
			int sum = k-nums[i];
			//System.out.println(sumK(nums, i, len-1, nums[i], sum));
			res = sumK(nums, i, len-1, nums[i], sum);
		}
		return res;
		
		
		
		/*Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<List<Integer>>();      
        for(int i=0; i<nums.length; i++) {        	
        	for(int j=i+1; j<nums.length; j++) {
        		int temp = nums[i]+nums[j];
        		for(int k=j+1; k<nums.length; k++) {
        			if(temp+nums[k]==0 && j!=k) {
        				List<Integer> list = new ArrayList<>();
        				list.add(nums[i]);
        				list.add(nums[j]);
        				list.add(nums[k]);
        				result.add(list);
        			}
        		}
        	}
        	
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.addAll(result);
        return res;*/
		
		
		
    }
	
	public static List<List<Integer>> sumK(int[] nums, int start, int end, int num, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		while(start<end) {
			while(start<end && nums[start]==nums[start+1]) {
				start++;
			}
			while(start<end && nums[end]==nums[end-1]) {
				end--;
			}
			if(nums[start]+nums[end]==k) {
				List<Integer> list = new ArrayList<>();
				list.add(num);
				list.add(nums[start]);
				list.add(nums[end]);
				System.out.println(list);
				res.add(list);
				start++;
			}
			if(nums[start]+nums[end]<k) {
				start++;
			}
			if(nums[start]+nums[end]>k) {
				end--;
			}
		}
		System.out.println(res);
		return res;
	}
}
