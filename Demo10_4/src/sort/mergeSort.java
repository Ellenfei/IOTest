package sort;

import java.util.Arrays;

public class mergeSort {
	public static void main(String[] args) {
		int[] nums = {2,7,8,3,1,6,9,0,5,4};
		sort(nums,0,nums.length);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sort(int[] nums, int low, int high) {
		//int mid = (low+high)/2;
		while(low<high) {
			int mid = (low+high)/2;
			sort(nums,low,mid);
			
			sort(nums,mid+1,high);
			
			merge(nums,low,mid,high);
			
			//print(nums);
			
		}
		//return nums;
	}
	
	public static void merge(int[] nums,int low,int mid,int high) {
		int[] temp = new int[nums.length];
		int i=low;
		int j=mid+1;
		int k=i;
		while(i<=mid && j<=high) {
			if(nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			}else {
				temp[k++] = nums[j++];
			}
		}
		
		while(i<=mid)
			temp[k++] = nums[i++];
		while(j<=high)
			temp[k++] = nums[j++];
		for(int k1=low; k1<=high; k1++) {
			nums[k1] = temp[k1];
		}
	}
	
	/*public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}*/
}
