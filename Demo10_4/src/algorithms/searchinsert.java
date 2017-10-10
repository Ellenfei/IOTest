package algorithms;

public class searchinsert {
	public static void main(String[] args) {
		int[] nums = {1,3,5,7};
		System.out.println(searchInsert(nums, 4));
	}
	
	public static int searchInsert(int[] nums, int target) {
        /*if(nums==null || nums.length==0) return 0;
        for(int i=0; i<nums.length-1; i++) {
        	if(target<=nums[i]) return i;
        	else {
        		if(target>nums[i] && target<nums[i+1]) return i+1;
        	}
        }
        if(target<=nums[nums.length-1]) return nums.length-1;
        return nums.length;*/
		int low=0, high=nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(target==nums[mid]) return mid;
			else if(target<nums[mid]) high=mid-1;
			else low = mid +1;
		}
		return low;
    }
}
