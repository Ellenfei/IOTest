package work.neteasy2018;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StrFragment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(getFragment(str));
	}
	public static double getFragment(String str) {
		double result; 
		int count = 1;
		if(str.length()==1) {
			return 1.0;
		}
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				count++;
			}
		}
		result = (double)str.length()/count;
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(result);
		//BigDecimal bd = new BigDecimal(result);
		//result = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.printf("%.2f",result);
		return Double.valueOf(df.format(result));
	}
}
