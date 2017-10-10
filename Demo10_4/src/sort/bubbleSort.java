package sort;

public class bubbleSort {
	public static void main(String args[]){
		int[] arr = {12,15,34,5,67,13,30,27,9,22,18,20};
		
		bubsort(arr);
		System.out.println("√∞≈›≈≈–Ú£∫");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void bubsort(int[] a){
		int temp,flag=1;
		for(int i=0; i<a.length-1 && flag == 1 ; i++){
			flag = 0;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					flag = 1;
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
