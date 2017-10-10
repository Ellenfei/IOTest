package algorithms;

import java.util.HashSet;

public class containduplicate {
	public static void main(String[] args) {
		int[] nums={1,5,4,2,7,3};
		System.out.println(containDuplicate(nums));
	}
	
	public static boolean containDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			if(set.contains(num))
				return true;
			set.add(num);
		}
		return false;
	}
}
