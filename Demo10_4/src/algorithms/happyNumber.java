package algorithms;

import java.util.HashSet;

public class happyNumber {
	public static void main(String[] args) {
		
		System.out.println(isHappy(20));
	}
	
	public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum,remain;
        while(set.add(n)) {
        	sum = 0;
        	while(n>0) {
        		remain = n%10;
        		sum+=remain*remain;        		
        		n/=10;
        	}
        	if(sum==1) return true;
        	else
        		n = sum;
        }
        return false;
    }
}
