package algorithms;

import java.util.Arrays;

public class bullscows {
	public static void main(String[] args) {
		String secret="1123";
		String guess= "0011";
		System.out.println(getHint(secret,guess));
	}
	
	public static String getHint(String secret, String guess) {
	/*	int bulls=0;
		int cows=0;
		int[] numbers  = new int[10];
		for(int i=0; i<secret.length(); i++) {
			int s = Character.getNumericValue(secret.charAt(i));
			int g = Character.getNumericValue(guess.charAt(i));
			if(s==g)
				bulls++;
			else {
				if(numbers[s]<0) cows++;
				if(numbers[g]>0) cows++;
				numbers[s]++;
				numbers[g]++;
			}
		}
		return bulls+"A"+cows+"B";*/
		
		int bulls = 0;
	    int cows = 0;
	    int[] numbers = new int[10];
	    for (int i = 0; i<secret.length(); i++) {
	        if (secret.charAt(i) == guess.charAt(i)) bulls++;
	        else {
	            if (numbers[secret.charAt(i)-'0']++ < 0) cows++;
	            if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
	        }
	    }
	    System.out.println(Arrays.toString(numbers));
	    return bulls + "A" + cows + "B";
	}
}
