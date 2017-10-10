package sort;

import java.util.Arrays;

public class wiggleSort2 {
	public static void main(String[] args) {
		int[] nums = {1,2,2,1,2,1,1,1,1,2,2,2};
		//except:[1,2,1,2,1,2,1,2,1,2,1,2]
		wiggleSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void wiggleSort(int[] nums) {
        if(nums.length==0 || nums==null) return;
        
        int median = findKth(nums, nums.length/2, 0, nums.length-1);
        int i = 0;
        int left=0, right=nums.length-1;
        while(i<right) {
        	int mapIndex = newIndex(i,nums.length);
        	if(nums[mapIndex]<median) {
        		int mapRightIndex = newIndex(right, nums.length);
        		swap(nums, mapIndex, mapRightIndex);        		
        		right--;
        	}else if (nums[mapIndex]>median) {
        		int mapLeftIndex = newIndex(left, nums.length);
        		swap(nums, mapIndex, mapLeftIndex);        		
        		left++;
        	}else {
        		i++;
        	}
        		
        }
    }
	
	public static int newIndex(int index, int n) {
		return (1+2*index)%(n|1);
	}
	
	public static int findKth(int[] nums, int pos, int start, int end) {
		int left = start;

		int pivot = nums[end];
		for(int i=start; i<end; i++) {
			if(nums[i] <= pivot) {
				swap(nums,i,left);
				left++;
			}
		}
		swap(nums,end,left);
		if(left==pos) return nums[left];
		else if(left<pos) return findKth(nums,pos,left+1, end);
		else return findKth(nums, pos, start, left-1);
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp;
		temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
