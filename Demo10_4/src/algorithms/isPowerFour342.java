package algorithms;
/*
 * 342. Power of Four
 * 不能用循环和递归
 * 
 * 一个数 num，如果是 2 的 N 次方，那么有：num & (num - 1) = 0
 * 一个数 num 如果是 4 的 N 次方必然也是 2 的 N 次方。所以可以先判断 num 
 * 是否是 2 的 N 次方。然后再将 2 的 N 次方中那些不是 4 的 N 次方的数去掉。
 * 
 * 4的幂只能是奇数位为1，而2的幂只有有一个位置为1就行
 */
public class isPowerFour342 {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
	}
	
	public static boolean isPowerOfFour(int num) {
        if(num<=0) return false;
        /*if((num & (num-1))==0) return false;
        if((num & 0x55555555)==num) return true;
        return false;*/
        
        return ((num & (num-1))==0) && ((num & 0x55555555)==num);
    }
}
