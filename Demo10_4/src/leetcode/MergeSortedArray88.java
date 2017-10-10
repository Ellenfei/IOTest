package leetcode;

import java.util.Arrays;

/*
 * 88. Merge Sorted Array
 */
public class MergeSortedArray88 {
	public static void main(String[] args) {
		int[] nums1 = new int[1];
		int[] nums2 = {1};
		merge(nums1, 0, nums2, 1);
		System.out.println(Arrays.toString(nums1));
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1; 
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0) {
        	if(nums2[j]>=nums1[i]) {
        		nums1[k--] = nums2[j--];
        	} else {
        		nums1[k--] = nums1[i--];
        	}
        }
        while(j>=0) {
        	nums1[k--] = nums2[j--];
        }
    }
}
