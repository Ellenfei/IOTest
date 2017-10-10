package algorithms;

import java.util.HashSet;

public class containduplicatek {
	public static void main(String[] args) {
		int[] nums={1,5,4,1,3,2,7,3};
		System.out.println(containNearbyDuplicate(nums,2));
	}
	
	public static boolean containNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(i>k) set.remove(nums[i-k-1]);
			if(!set.add(nums[i])) return true;
		}
		return false;
	}
}
