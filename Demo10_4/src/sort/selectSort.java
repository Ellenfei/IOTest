package sort;

public class selectSort {
	public static void main(String args[]){
		int[] arr = {12,15,34,5,67,13,30,27,9,22,18,20};
		//selsort(arr);
		//selsort1(arr);
		heapSort(arr);
		System.out.println("÷±Ω”—°‘Ò(∂—)≈≈–Ú£∫");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		
	}
	
	public static void selsort(int[] a){
		int temp;
		for(int i=0; i<a.length-1; i++){
			//min = a[i];
			for(int j=i+1; j<a.length; j++){
				if(a[j]<a[i]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void selsort1(int[] a){
		int small,temp;
		for(int i=0; i<a.length-1; i++){
			small = i;
			for(int j=i+1; j<a.length; j++){
				if(a[j]<a[small])
					small = j;
			}
			
			if(small != i){
				temp = a[small];
				for(int j=small; j>i; j--){
					a[j] = a[j-1];
				}
				a[i] = temp;
			}
		}
	}
/*
 * 
 * ∂—≈≈–Ú£∫heap
 * 
 * */	
	public static void heapSort(int[] a){
		
		int temp;
		int n = a.length;
		
		initcreatHeap(a);
		
		for(int i=n-1; i>0; i--){
			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			
			creatHeap(a,i,0);
		}
	}
	
	public static void creatHeap(int[] a, int n, int h){
		
		int i = h;
		int temp = a[i];
		int left = 2*i+1;
		int flag = 0;
		while(left<n && flag !=1){
			
			if(left<n-1 && a[left]<a[left+1])
				left++;
			if(left<n && temp>a[left])
				flag = 1;
			else{
				a[i] = a[left];
				i=left;
				left = 2*i+1;
			}
		}
		a[i] = temp;
	}
	
	public static void initcreatHeap(int[] a){
		int n = a.length;
		for(int i=(n-1)/2; i>=0; i--){
			creatHeap(a,n,i);
		}
		
	}
}
