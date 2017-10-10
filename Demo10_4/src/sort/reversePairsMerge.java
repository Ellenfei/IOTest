package sort;
/*
 * 题目：在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。给你一个数组，求出这个数组中逆序对的总数。
 * 概括：如果a[i] > a[j] 且 i < j， a[i] 和 a[j] 构成一个逆序对。
 * 方法：逆序对定义：a[i]>a[j]，其中i<j
 * 思路：利用归并排序的思想，先求前面一半数组的逆序数，再求后面一半数组的逆序数，然后求前面一半数组比后面一半数组中大的数
 * 的个数（也就是逆序数），这三个过程加起来就是整体的逆序数目了。
 *  
 */
public class reversePairsMerge {
	static int count;
	public static void main(String[] args) {
		int[] A = {3,2,1};
		System.out.println(reversePairs(A));
	}
	public static long reversePairs(int[] A) {	
        // Write your code here
		mergeSort(A, 0, A.length-1);
		return count;
    }
	public static void mergeSort(int[] nums, int left, int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(nums,left,mid);
			mergeSort(nums, mid+1, right);
			merge(nums,left,mid,right);
		}
	}
	public static void merge(int[] nums, int left, int mid, int right) {
		int[] temp = new int[nums.length];
		int i = left;
		int j = mid+1;
		int k = i;
		while(i<=mid && j<=right) {
			if(nums[i]<=nums[j]){
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
				count = count+mid-i+1;
			}				
		}
		while(i<=mid) {
			temp[k++]=nums[i++];
			//count = count+
		}
		while(j<=right) {
			temp[k++] = nums[j++];
		}
		for(int index=left; index<=right; index++) {
			nums[index]=temp[index];
		}
	}
}
