package sort;
/*
 * ��Ŀ���������е������������ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ�����飬����������������Ե�������
 * ���������a[i] > a[j] �� i < j�� a[i] �� a[j] ����һ������ԡ�
 * ����������Զ��壺a[i]>a[j]������i<j
 * ˼·�����ù鲢�����˼�룬����ǰ��һ����������������������һ���������������Ȼ����ǰ��һ������Ⱥ���һ�������д����
 * �ĸ�����Ҳ�����������������������̼��������������������Ŀ�ˡ�
 *  
 */
public class reversePairsMerge {
	static int count;
	public static void main(String[] args) {
		int[] A = {3,2,1};
		System.out.println(reversePairs(A));
	}
	public static long reversePairs(int[] A) {	
        // Write your code here
		mergeSort(A, 0, A.length-1);
		return count;
    }
	public static void mergeSort(int[] nums, int left, int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(nums,left,mid);
			mergeSort(nums, mid+1, right);
			merge(nums,left,mid,right);
		}
	}
	public static void merge(int[] nums, int left, int mid, int right) {
		int[] temp = new int[nums.length];
		int i = left;
		int j = mid+1;
		int k = i;
		while(i<=mid && j<=right) {
			if(nums[i]<=nums[j]){
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
				count = count+mid-i+1;
			}				
		}
		while(i<=mid) {
			temp[k++]=nums[i++];
			//count = count+
		}
		while(j<=right) {
			temp[k++] = nums[j++];
		}
		for(int index=left; index<=right; index++) {
			nums[index]=temp[index];
		}
	}
}
