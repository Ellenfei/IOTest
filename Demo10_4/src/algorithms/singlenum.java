package algorithms;

public class singlenum {
	 public static void main(String[] args) {
		 int[] nums = {1,2,3,4,3,2,4};
		 System.out.println(singleNumber(nums));
	 }
	 
	 public static int singleNumber(int[] nums) {
		 int result=0;
		 for(int i=0; i<nums.length; i++) {
			 result^=nums[i];
		 }
		 return result;
	 }
}
