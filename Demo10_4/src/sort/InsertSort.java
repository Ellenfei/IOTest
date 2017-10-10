package sort;

public class InsertSort {
	public static void main(String args[]){
		int[] arr = {12,15,34,5,67,13,30,27,9,22,18,20};
		int[] d = {5,2,1};
		int num = 3;
		insertSort(arr);
		int[] arr1 = {12,15,34,5,67,13,30,27,9,22};
		insertSortA(arr1,d,num);
		
		System.out.println("÷±Ω”≤Â»Î≈≈–Ú£∫");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		System.out.println("œ£∂˚≈≈–Ú£∫");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"  ");
		}
	}
	
	public static void insertSortA(int[] a, int[] d, int num){
		int j,k,span,temp;
		int n = a.length;
		for(int m=0; m<num; m++){
			span = d[m];
			for(int i=0; i<span; i++){
				for(k=i; k+span<n; k+=span){
					temp = a[k+span];
					j=k;
					while(j>-1 && temp<a[j]){
						a[j+span] = a[j];
						j-=span;
					}
					a[j+span] = temp;
				}
			}
		}
	}
	
	public static void insertSort(int[] a){
		
		int j,temp;
		int n = a.length;
		
		for(int i=0; i<n-1; i++){
			temp = a[i+1];
			j = i;
			while(j>-1 && temp<a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
}
