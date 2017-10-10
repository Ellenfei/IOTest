package algorithms;

import java.util.Arrays;
import java.util.Random;

/*
 * 564. Find the Closest Palindrome
 * ������
 * ��Ŀ���⣺����һ����������n��ɵ��ַ��������Ȳ�����18���ҵ���n��ӽ��Ļ������֣�������������
 * ˼·��
 * 1.�����׼�Ļ������֣�ȡn��ǰһ�룬���۵õ�target�����磺n=1234��target=1221��
 * 2.��ΪҪ��n��ӽ������Խ���n.length-1��/2��λ���ϵ�����+1��0��target����-1��Ȼ�����ߵĸ�ֵ���Ұ�ߣ�
 * ��Ϊ������������������������
 * 3.�м�����Ϊ9��+1ʱ������12922---->13031����n��һλ���м�����Ϊ0��-1ʱ������10003---->9999����nСһλ��
 * 
 * ע�⣺
 * 1.������n���Ȳ�����18����long�ͱ�ʾ��
 * 2.���big-target=target-small������small��
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
