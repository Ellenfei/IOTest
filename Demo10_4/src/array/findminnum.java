package array;

public class findminnum {
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,8,8,9,9,10,1,2,3};
		System.out.println(findMin(nums));
		
	}
	public static int findMin(int[] nums) {
		//¶þ·Ö·¨
		if(nums.length==0 || nums==null) return 0;
		if(nums.length==1) return nums[0];
        int low = 0;
        int high = nums.length-1;
        while(low<high) {
        	int mid = (low + high)/2;
        	if(nums[mid]>nums[mid+1] ) return nums[mid+1];
        	if(nums[low]<nums[mid]) {
        		low = mid;
        	}else if(nums[high]>nums[mid]) {
        		high = mid;
        	}
        }
        return nums[0];
    }
}
