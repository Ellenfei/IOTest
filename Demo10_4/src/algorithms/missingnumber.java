package algorithms;

public class missingnumber {
	public static void main(String[] args) {
		int[] nums = {0,1,3};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int xor=0;
		for(int i=0; i<nums.length; i++) {
			xor=xor^i^nums[i];
		}
		return xor^nums.length;
		/*int sum=nums.length;
		for(int i=0; i<nums.length; i++) {
			sum+=i-nums[i];
		}
		return sum;*/
	}
}
