package sort;

import java.util.Arrays;
/*
 * 164. Maximum Gap
 * ���������Ͱ����
 */
public class maxGap {
	public static void main(String[] args) {
		int[] nums = {5,9,8,3,15,10,7};
		System.out.println(maximumGap(nums));
	}
	/*
	 * Ͱ����maxGapһ������gap=(max-min)/nums.length+1
	 * ��������Ͱ�ֱ��Ų�ֵ��gap�ڵ���Сֵ�����ֵ
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
        //��Ԫ�ط���Ͱ��
        for(int num : nums) {
        	if(num==min || num==max)
        		continue;
        	int index = (num-min)/gap;
        	bucketMin[index] = Math.min(num, bucketMin[index]);
        	bucketMax[index] = Math.max(num, bucketMax[index]);
        }
        //��maxGap
        int maxGap = Integer.MIN_VALUE;
        
        int previous = min;
        for(int i=0; i<nums.length; i++) {
        	if(bucketMin[i]==Integer.MAX_VALUE && bucketMax[i]==Integer.MIN_VALUE)
        		continue;
        	maxGap = Math.max(maxGap, bucketMin[i]-previous);
        	//����previous
        	previous = bucketMax[i];
        }
        return Math.max(maxGap, max-previous);
    }
}
