package array;

import java.util.Arrays;

/*
 * 565. Array Nesting
 * Input: A = [5,4,0,3,1,6,2]
 * Output: 4
 * Explanation: 
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
 * One of the longest S[K]:
 * S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * 
 */
public class arrayNest {
	public static void main(String[] args) {
		int[] nums = {5,4,0,3,1,6,2};
		System.out.println(arrayNesting(nums));
		System.out.println(Arrays.toString(nums));
	}
	public static int arrayNesting(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
        	int size = 0;
        	//标记遍历过的元素
        	for(int k=i; nums[k]>=0; size++) {
        		int numsk = nums[k];
        		nums[k] = -1;
        		k = numsk;
        	}
        	System.out.println(Arrays.toString(nums));
        	max = Math.max(max, size);
        }
        return max;
    }
}
