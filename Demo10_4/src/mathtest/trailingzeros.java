package mathtest;

public class trailingzeros {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(27));
	}
	public static int trailingZeroes(int n) {
       // int res = 0;
        
        /*while(n/5>0) {
        	res += n/5;
        	n /=5 ;
        }
        return res;*/
		
		return n==0 ? 0 : n/5+trailingZeroes(n/5);
    }
}
