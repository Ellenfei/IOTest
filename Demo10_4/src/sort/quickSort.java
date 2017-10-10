package sort;

import java.util.Arrays;

public class quickSort {
	public static void main(String[] args) {
		int[] a = {72,6,57,88,60,42,83,73,48,85};
		int low = 0;
		int high = a.length-1;
		sort(a,low,high);
		System.out.print(Arrays.toString(a));
	}
	public static void sort(int[] a, int low, int high) {
		int left = low;
		int right = high;
		int key = a[low];
		
		while(right > left) {
			while(right>left && key<=a[right]) 
				right--;
			if(key>a[right]){
				int temp = a[right];
				a[right] = a[left];
				a[left] = temp;
			}
					
			while(right>left && key>=a[left])
				left++;
			if(key<a[left]){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}
		if(left>low) sort(a,low,left-1);
		if(right<high) sort(a,right+1,high);
	}
}
