package dividealgorithms;

/*312/4/241/472
 * 541. Reverse String II
 * Solution:
 * Author:
 */
public class reverseString {
	public static void main(String[] args) {
		System.out.println(reverseStr("abcdefghijk", 3));
	}
	
	public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		int i = 0, n = arr.length;
		while(i<n) {
			int j = Math.min(i+k-1, n-1);
			swap(arr, i, j);
			i += 2*k;
		}
		return String.valueOf(arr);
    }
	public static char[] swap(char[] arr, int l, int r) {
		while(l<r) {
			char temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
		return arr;
	}
}
