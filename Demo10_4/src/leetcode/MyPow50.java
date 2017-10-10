package leetcode;
/*
 * 50. Pow(x, n)
 * ����Ҫע�⸺���͵��������⡣��ξ���Ҫ��������ü����������ֵ������һ����
 * �����2^4�����Ǽ�����2*2=4֮�󣬾Ϳ�����4*4������2^4�����ټ���Ĵ����� 
 */
public class MyPow50 {
	public static void main(String[] args) {
		double x = -1;
		int n = 2;
		int a = -2147483648;
		a = -a;
		System.out.println(a);
		System.out.println(myPow(x, n));
	}

	public static double myPow(double x, int n) {
		//�ݹ�
        if(n<0) {
        	if(n==Integer.MIN_VALUE) {
        		n++;
                n = -n;
                x = 1/x;
                return x * x * myPow( x*x, n/2 );
        	}
        	n = -n;
        	x = 1/x;
        } else if(n==0) {
        	return 1;
        }
        return (n%2)==0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
	}
}
