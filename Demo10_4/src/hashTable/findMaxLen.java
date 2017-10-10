package hashTable;

import java.util.HashMap;

/*
 * 525. Contiguous Array
 *  ����һ��ֻ����0,1���������飬�ҵ����������һ�������У���������1�ĸ�����0�ĸ�����ͬ��
 *  ��������0��Ϊ-1
 *  ��map����sum��sum��Ӧ���±��ֵ����������ÿ�μ������鵱ǰ��sum�������ǰsum֮ǰ�Ѿ����ֹ���
 *  ����˵֮ǰ�й�һ��sum = 2��������sum = 2�ˣ�˵���ڵ�һ��sum����2��ʱ����ǰ������Ԫ�ؼ������ܺ���2��
 *  ��ô����ǰ��ȥ��2��Ԫ��1��������0��ͬ��ǰ��sum = 2Ҳ����ͨ��ȥ����ǰ���2��Ԫ��1ʹsum = 0��
 *  ���Կ���i - m[sum]�Ƿ��֮ǰ�����ֵ�������֮ǰ���ֵ��͸������ֵ
 *  
 *  ���ĳ��������֮���ڹ�ϣ��������ˣ�˵����ǰ�������ȥ��ϣ���д���Ǹ������֣�
 *  �õ��Ľ�����м�һ��������֮�ͣ���ȻΪ0��˵��0��1�ĸ�����ȣ����Ǹ��½��
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
