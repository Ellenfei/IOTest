package leetcode;
/*
 * 50. Pow(x, n)
 * 首先要注意负数和倒数的问题。其次就是要合理的利用己经算出来的值来算下一个，
 * 如计算2^4，我们计算了2*2=4之后，就可以用4*4来计算2^4，减少计算的次数。 
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
		//递归
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
