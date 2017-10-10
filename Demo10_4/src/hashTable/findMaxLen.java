package hashTable;

import java.util.HashMap;

/*
 * 525. Contiguous Array
 *  给定一个只含有0,1的整数数组，找到数组中最长的一个子序列，该序列中1的个数和0的个数相同。
 *  方法：把0变为-1
 *  令map保存sum和sum对应的下标的值，遍历数组每次计算数组当前的sum，如果当前sum之前已经出现过，
 *  比如说之前有过一个sum = 2，现在又sum = 2了，说明在第一次sum等于2的时候，它前面所有元素加起来总和是2，
 *  那么在它前面去掉2个元素1就能满足0，同理当前的sum = 2也可以通过去掉最前面的2个元素1使sum = 0，
 *  所以看看i - m[sum]是否比之前的最大值大，如果比之前最大值大就更新最大值
 *  
 *  如果某个子数组之和在哈希表里存在了，说明当前子数组减去哈希表中存的那个子数字，
 *  得到的结果是中间一段子数组之和，必然为0，说明0和1的个数相等，我们更新结果
 */
public class findMaxLen {
	public static void main(String[] args) {
		int[] nums = {0,1,0};
		System.out.println(findMaxLength(nums));
	}	
	public static int findMaxLength(int[] nums) {
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]==0)
        		nums[i]=-1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum=0,max=0;
        for(int i=0; i<nums.length; i++) {
        	sum += nums[i];
        	if(map.containsKey(sum)) {
        		max = Math.max(max, i-map.get(sum));
        	} else {
        		map.put(sum, i);
        	}
        }
        return max;
    }
}
