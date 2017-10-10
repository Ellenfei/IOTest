package dividealgorithms;

import java.util.Arrays;

/*
 * 4. Median of Two Sorted Arrays
 * Solution: divide and conquer
 * 1.���nums1[k/2-1]==nums2[k/2-1],return nums1[k/2-1];
 * 2.���nums1[k/2-1]<nums2[k/2-1],˵��nums1ǰk/2��Ԫ�ض�С������ĵ�k��Ԫ�أ�ɾ��nums1[0,1,...,k/2-1];
 * 2.���nums1[k/2-1]>nums2[k/2-1],˵��nums2ǰk/2��Ԫ�ض�С������ĵ�k��Ԫ�أ�ɾ��nums2[0,1,...,k/2-1];
 * ѭ����ֹ������
 * 1.nums1��nums2Ϊnullʱ��return nums1[k-1]/nums2[k-1];
 * 2.when k==1, return min(nums1[0],nums2[0]);
 * 3.when nums1[k/2-1]=nums2[k/2-1], return nums1[k/2-1];
 *  
 *   left_part           |        right_part
A[0], A[1], ..., A[i-1]  |  A[i], A[i+1], ..., A[m-1]
B[0], B[1], ..., B[j-1]  |  B[j], B[j+1], ..., B[n-1]
��Ҫ����������
1) len(left_part) == len(right_part)
2) max(left_part) <= min(right_part)  

 */
public class findMedian {
	public static void main(String[] args) {
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        int len = m+n;
        if((len&0x1)==1){
        	len >>= 1;
        	return find_Kth(nums1, m, nums2, n, len+1);
        } else {
        	len >>= 1;
        	return (find_Kth(nums1, m, nums2, n, len)+
        			find_Kth(nums1, m, nums2, n, len+1))/2.0;
        }
	}
	
	public static double find_Kth(int[] nums1, int m, int[] nums2, int n, int k) {
		//�ҵ�k�������
		if(m > n) return find_Kth(nums2, n, nums1, m, k);
		if(m==0) return nums2[k-1];
		if(k==1) return Math.min(nums1[0], nums2[0]);//????
		//��k�ֳ�������		
		int p1 = Math.min(k/2, m), p2 = k-p1;
		if(nums1[p1-1]<nums2[p2-1]) 
			return find_Kth(Arrays.copyOfRange(nums1, p1, m), m-p1, nums2, n, k-p1);
		else if(nums1[p1-1]>nums2[p2-1])
			return find_Kth(nums1, m, Arrays.copyOfRange(nums2, p2, n), n-p2, k-p2);
		else 
			return nums1[p1-1];
	}
}
