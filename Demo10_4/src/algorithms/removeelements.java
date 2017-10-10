package algorithms;

public class removeelements {
	public static void main(String[] args) {
		int[] nums={2,2,3,3};
		System.out.println(removeElement(nums, 3));
	}
	
	public static int removeElement(int[] nums, int val) {
        int m=0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]!=val) {
        		nums[m]=nums[i];
        		m++;
        	}
        }
        return m;
    }
}
