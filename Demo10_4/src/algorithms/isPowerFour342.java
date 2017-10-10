package algorithms;
/*
 * 342. Power of Four
 * ������ѭ���͵ݹ�
 * 
 * һ���� num������� 2 �� N �η�����ô�У�num & (num - 1) = 0
 * һ���� num ����� 4 �� N �η���ȻҲ�� 2 �� N �η������Կ������ж� num 
 * �Ƿ��� 2 �� N �η���Ȼ���ٽ� 2 �� N �η�����Щ���� 4 �� N �η�����ȥ����
 * 
 * 4����ֻ��������λΪ1����2����ֻ����һ��λ��Ϊ1����
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
