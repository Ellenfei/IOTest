package algorithms;

public class numberPrime {
	public static void main(String[] args) {
		System.out.println(countPrimes(8));
	}
	
	public static int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        for(int i=2; i<n; i++) {
        	primes[i] = true;
        }
        for(int i=2; i*i<n; i++) {
        	for(int j=i*i; j<n; j+=i) {
        		primes[j] = false;
        	}
        }
        int count = 0;
        for(int i=2; i<n; i++) {
        	if(primes[i]) count++;
        }
        return count;
    }
}
