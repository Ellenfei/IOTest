package tree;

import java.util.Arrays;
import java.util.Random;

/*
 *  34. Search for a Range
 *  利用二分查找
 */
public class seachRange {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] nums = {5,6,7,8,8,8,9,10};
		long start = System.currentTimeMillis();
		searchRange(nums, 8);
		long stop = System.currentTimeMillis();
		long time=stop-start;
		System.out.println(time+"ms");
		System.out.println(Arrays.toString(searchRange(nums, 8)));
	}
	public static int[] searchRange(int[] nums, int target) {
		/*int[] result={-1,-1};
		result[0]=findLeft(nums, target);
		result[1]=findRight(nums,target);
		return result;*/
		int[] result = new int[2];
	    result[0] = findFirst(nums, target);
	    result[1] = findLast(nums, target);
	    return result;
	}
	    
	    private static int findFirst(int[] nums, int target){
	        int idx = -1;
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(nums[mid] >= target){
	                end = mid - 1;
	            }else{
	                start = mid + 1;
	            }
	            if(nums[mid] == target) idx = mid;
	        }
	        return idx;
	    }

	    private static int findLast(int[] nums, int target){
	        int idx = -1;
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(nums[mid] <= target){
	                start = mid + 1;
	            }else{
	                end = mid - 1;
	            }
	            if(nums[mid] == target) idx = mid;
	        }
	        return idx;
	    }
		
        /*int i=0, j=nums.length-1;
        int[] result = {-1,-1};
        //left one
        while(i<j) {
        	int mid=(i+j)/2;
        	if(target>nums[mid]) 
        		i=mid+1;
        	else j=mid;
        }
        if(nums[i]!=target) return result;
        else result[0]=i;
        
        //right one
        j=nums.length-1;
        while(i<j) {
        	int mid=(i+j)/2;
        	if(target<nums[mid])
        		j=mid-1;
        	else i=mid;
        }
        if(nums[j]!=target) return result;
        else result[1]=j;
        
        return result;*/
//}
	/*public static int findLeft(int[] nums, int target) {
		int i=0, j=nums.length-1;
		while(i<j) {
			int mid=(i+j)/2;
			if(nums[mid]<target) i=mid+1;
			else if(nums[mid]>target) j=mid-1;
			else return mid;
		}
		return -1;
	}
	public static int findRight(int[] nums, int target) {
		int i=0, j=nums.length-1;
		while(i<j) {
			int mid=(i+j)/2;
			if(nums[mid]<=target) i=mid;
			else if(nums[mid]>target) j=mid-1;
			//if(nums[mid]==target) return mid;
		}
		if(nums[j]!=target) return-1;
		return j;
	}*/
}
