package algorithms;

import java.util.Arrays;
import java.util.Random;

/*
 * 564. Find the Closest Palindrome
 * 分析：
 * 题目大意：给定一个由正整数n组成的字符串，长度不超过18，找到与n最接近的回文数字（不包括本身）。
 * 思路：
 * 1.定义标准的回文数字：取n的前一半，对折得到target。例如：n=1234；target=1221；
 * 2.因为要与n最接近，所以将（n.length-1）/2的位置上的数字+1，0（target），-1，然后将左半边的赋值给右半边，
 * 分为三种情况，并考虑特殊情况；
 * 3.中间数字为9，+1时，比如12922---->13031，比n大一位；中间数字为0，-1时，比如10003---->9999，比n小一位。
 * 
 * 注意：
 * 1.正整数n长度不超过18，用long型表示；
 * 2.如果big-target=target-small，返回small；
 */
public class nearestPalindromic564 {
	public static void main(String[] args) {
		/*Random random = new Random();
		Long num = random.nextLong();
		System.out.println(num);
		num =Math.abs(num);
		System.out.println(num);
		System.out.println(nearestPalindromic(String.valueOf(num)));*/
		System.out.println(nearestPalindromic(String.valueOf(11)));
	}

	public static String nearestPalindromic(String n) {
        Long num = Long.parseLong(n);
        Long big = findBigPalindrome(num+1);
        Long small = findSmallPalindrome(num-1);
        return (big-num)<(num-small) ? String.valueOf(big) : String.valueOf(small);
        
    }
	public static Long findBigPalindrome(Long num) {
		String nStr = String.valueOf(num);
		char[] c = nStr.toCharArray();
		int len = c.length;
		//char[] target = c;
		char[] target = Arrays.copyOf(c, len);
		for(int i=0; i<len/2; i++) {
			target[len-1-i] = c[i];
		}
		for(int i=0; i<len; i++) {
			if(c[i]<target[i]) {
				return Long.parseLong(String.valueOf(target));
			}else if(c[i]>target[i]) {
				for(int j=(len-1)/2; j>=0; j--) {
					if(++target[j]>'9')
						target[j]='0';
					else
						break;
				}

				for(int k=0; k<len/2; k++) {
					target[len-1-k] = target[k];
				}
				return Long.parseLong(String.valueOf(target));
			}
		}
		return Long.parseLong(String.valueOf(target));
	}
	public static Long findSmallPalindrome(Long num) {
		String nStr = String.valueOf(num);
		char[] c = nStr.toCharArray();
		int len = c.length;
		//char[] target = c;
		char[] target = Arrays.copyOf(c, len);
		for(int i=0; i<len/2; i++) {
			target[len-1-i] = c[i];
		}
		
		for(int i=0; i<len; i++) {
			if(c[i]>target[i]) {
				return Long.parseLong(String.valueOf(target));
			}else if(c[i]<target[i]) {
				for(int j=(len-1)/2; j>=0; j--){
					if(--target[j]<'0')
						target[j]='9';
					else 
						break;
				}
				if(target[0]=='0') {
					char[] tar2 = new char[len-1];
					Arrays.fill(tar2, '9');
					return Long.parseLong(String.valueOf(tar2));
				}
				for(int k=0; k<len/2; k++) {
					target[len-1-k] = target[k];
				}
				return Long.parseLong(String.valueOf(target));
			}
			
		}
		return Long.parseLong(String.valueOf(target));
	}
}
