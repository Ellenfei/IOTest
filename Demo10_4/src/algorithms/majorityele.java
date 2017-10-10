package algorithms;



public class majorityele {
	public static void main(String[] args){
		int[] nums = {3,3,4};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		/*int res = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++) {
        	if(map.containsKey(nums[i])) 
        		map.put(nums[i], map.get(nums[i])+1);
        	else map.put(nums[i], 1);
        	
        	
        	if(map.get(nums[i])>nums.length/2)
        		res = nums[i];
        }
        return res;*/
		
		int[] bit = new int[32];
	    for (int num: nums)
	        for (int i=0; i<32; i++) 
	            if ((num>>(31-i) & 1) == 1)
	                bit[i]++;
	    int ret=0;
	    for (int i=0; i<32; i++) {
	        bit[i]=bit[i]>nums.length/2?1:0;
	        ret += bit[i]*(1<<(31-i));
	    }
	    return ret;
    }
}
