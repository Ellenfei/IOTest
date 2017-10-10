package array;

public class searchmatrix1 {
	public static void main(String[] args) {
		/*int[][] matrix = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,50}				
		};*/
		int[][] matrix = {};
		System.out.println(searchMatrix(matrix, 8));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        //二分查找法
		if(matrix.length==0 || matrix[0].length==0) return false;
		int n = matrix.length;
		int m = matrix[0].length;
		int l=0, r=n*m-1;
		while(l<r) {
			int mid = (l+r)>>1;
			if(matrix[mid/m][mid%m] < target) {
				l = mid+1;
			}else
				r = mid;
		}
		return matrix[r/m][r%m]==target;
    }
}
