package sort;

import java.util.Arrays;
import java.util.Comparator;

public class largestNum {
	public static void main(String[] args) {
		int[] nums = {3,30,34,59};
		System.out.println(largestNumber(nums));
	}
	/*
	 * 1.将数组转换为字符串数组
	 * 2.对两个字符串s1，s2根据s1+s2与s2+s1进行排序（降序）
	 */
	public static String largestNumber(int[] nums) {
		if(nums.length==0 || nums==null) return null;
        String[] s_nums = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
        	s_nums[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(s_nums, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1+o2;
				String s2 = o2+o1;
				return s2.compareTo(s1);
			}       	
		});
        //System.out.println(Arrays.toString(s_nums));
        if(s_nums[0].charAt(0)=='0') return "0";
        StringBuilder sb = new StringBuilder();
        for(String s_num : s_nums) {
        	sb.append(s_num);
        }
        return sb.toString();
    }
}
