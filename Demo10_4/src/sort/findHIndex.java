package sort;

import java.util.Arrays;

/*
 * 274. H-Index
 * Solution:这道题的思路是先对数组排序，然后从后向前遍历，维护一个count变量，当count值大于或等于现在的值时，
 * 就可以返回了。如果到最后退出循环时，仍未返回，那表示数组中的数都大于count，那么就返回count。因为此时有0个数
 * 小于count，有count数大于count。
 */
public class findHIndex {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	public static int hIndex(int[] citations) {
        int length = citations.length;
        if(length==0) { 
        	return 0;
        }
        Arrays.sort(citations);
        int count = 0;
        for(int i=length-1; i>=0; i--) {
        	if(count>=citations[i])
        		return count;
        	count++;
        }
        return count;
    }
}
