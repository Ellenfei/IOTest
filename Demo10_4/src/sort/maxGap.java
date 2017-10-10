package sort;

import java.util.Arrays;
/*
 * 164. Maximum Gap
 * 解决方法：桶排序
 */
public class maxGap {
	public static void main(String[] args) {
		int[] nums = {5,9,8,3,15,10,7};
		System.out.println(maximumGap(nums));
	}
	/*
	 * 桶排序：maxGap一定大于gap=(max-min)/nums.length+1
	 * 利用两个桶分别存放差值在gap内的最小值和最大值
	 */
	public static int maximumGap(int[] nums) {
        if(nums.length<2 || nums==null) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
        	min = Math.min(min, num);
        	max = Math.max(max, num);
        }
        int gap = (max-min)/nums.length+1;
        int[] bucketMin = new int[nums.length];
        int[] bucketMax = new int[nums.length];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        //把元素放入桶中
        for(int num : nums) {
        	if(num==min || num==max)
        		continue;
        	int index = (num-min)/gap;
        	bucketMin[index] = Math.min(num, bucketMin[index]);
        	bucketMax[index] = Math.max(num, bucketMax[index]);
        }
        //找maxGap
        int maxGap = Integer.MIN_VALUE;
        
        int previous = min;
        for(int i=0; i<nums.length; i++) {
        	if(bucketMin[i]==Integer.MAX_VALUE && bucketMax[i]==Integer.MIN_VALUE)
        		continue;
        	maxGap = Math.max(maxGap, bucketMin[i]-previous);
        	//更新previous
        	previous = bucketMax[i];
        }
        return Math.max(maxGap, max-previous);
    }
}
