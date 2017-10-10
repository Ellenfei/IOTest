package dividealgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 315. Count of Smaller Numbers After Self
 * Solution:
 * 1.���������½�һ����������sorted����Ž�ԭ���飨�������󣩴�С���������½�һ���������result�����������
 * 2.�Ӻ���ǰ����ԭ���飬�ź�����뵽sorted�����У�
 * 3.����findIndex���ڻ�ȡԭ�����е�ǰԪ���ұ߱ȵ�ǰ����Ԫ��С��Ԫ�ظ�����
 * ע�⣺sorted�������Ԫ��ʱ����indexѰ��Ԫ��λ��
 * 			nums				sorted				result
 * ||	 5	 6	 2	(1)			1					(0)
 * ||	 5	 6	(2)	 1			1	2				(1)	0
 * ||	 5	(6)	 2	 1			1	2	6			(2)	1	0
 * ||	(5)	 6	 2	 1			1	2	5	6		(2)	2	1	0
 */
public class countSmallerNum {
	public static void main(String[] args) {
		int[] nums = {5,6,2,1};
		System.out.println(countSmaller(nums));
	}
	public static List<Integer> countSmaller(int[] nums) {
        List<Integer> sorted = new ArrayList<>();
        Integer[] result = new Integer[nums.length];
        for(int i=nums.length-1; i>=0; i--) {        	      	
        	int index = findIndex(sorted, nums[i]);
        	result[i] = index;
        	sorted.add(index,nums[i]);
        }
        return Arrays.asList(result);
    }
	//find first element smaller target
	public static int findIndex(List<Integer> nums, int target) {
		if(nums.size()==0)
			return 0;
		int start=0, end=nums.size()-1;
		if(nums.get(end) < target)
			return end+1;
		if(nums.get(start)>=target)
			return start;
		
		while(start+1<end) {
			int mid = (start+end)/2;
			if(nums.get(mid)<target) {
				start = mid;
			} else {
				end = mid;
			}
		}		
		if(nums.get(start)>=target) 
			return start;
		return end;
	}
}
