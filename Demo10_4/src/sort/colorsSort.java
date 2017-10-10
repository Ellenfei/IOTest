package sort;

import java.util.Arrays;

/*
 * 75. Sort Colors
 * Solution: Two points
 * ��������ָ������������飬��֤leftָ����඼��0��rightָ���Ҳ඼��2��
 * 1.��0���� i��left����--->i++��left++����֤left��඼��0��
 * 2.��1������������--->i++
 * 3.��2����i��right����--->i++��right--����֤right�Ҳ඼��2��
 * ���磺
 * 	i									i									i
 * 	2	2	1	1	0	0	--->	0	2	1	1	0	2	--->	0	0	1	1	2	2
 * 	l					r			l				r				l			r
 */
public class colorsSort {
	public static void main(String[] args) {
		int[] nums = {1,2,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
        	return;
        int left=0, right=nums.length-1, i=0;
        while(i<=right) {
        	if(nums[i]==0) {
        		swap(i,left,nums);
        		left++;
        		i++;
        	}else if(nums[i]==1) {
        		i++;
        	} else {
        		swap(i,right,nums);
        		right--;
        		//i++;
        	}
        }
    }
	public static void swap(int i, int index, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[index];
		nums[index] = temp;
	}
}
