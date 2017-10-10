package array;

import java.util.ArrayList;
import java.util.List;

/*
 * 442. Find All Duplicates in an Array
 * Solution:数组中的元素取值1-n，且有重复元素
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 	数组：	4	3	2	7	8	2	3	1
 * 	下标：	0	1	2	3	4	5	6	7
 * i=0,nums[0]	= 4------> nums[3]------> -nums[3]
 * 			4	3	2	7	-8	 2	 3	 1
 * i=1,nums[1]	= 3------> nums[2]------> -nums[2]
 * 			4	3	2	-7	-8	 2	 3	 1
 * i=2,nums[2]	= 2------> nums[1]------> -nums[1]
 * 			4	-3	-2	-7	 8	 2	 3	 1
 * 同理：		4	-3	-2	-7	 8	 2	 -3	 -1
 * i=5,nums[5]	= 2------> nums[1]=-3<0----->res.add(2)
 * i=6,nums[6]	= 3------> nums[2]=-2<0----->res.add(3)
 * 			-4	-3	-2	-7	 8	 2	 -3	 -1
 */
public class findDupli {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums));
	}
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length==0 || nums==null) return res;
        for(int i=0; i<nums.length; i++) {
        	int index = Math.abs(nums[i])-1;
        	if(nums[index]<0) {
        		res.add(index+1);
        	}
        	nums[index] = -nums[index];
        	
        }
        return res;
    }
}
