package array;

public class searchmatrix2 {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,4,7,11},
				{2,11,16,20},
				{3,30,34,50}
	};
		System.out.println(searchMatrix(matrix, 10));
}
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0 || matrix[0].length==0) return false;
        int column = matrix[0].length-1;
        int row = 0;
        while(row<matrix.length && column>-1) {
        	if(matrix[row][column]==target)
	        	return true;
	        else if(matrix[row][column]<target)
	        	row++;
	        else if(matrix[row][column]>target) 
	        	column--;
	        }	
	        	
       	return false;       
    }
}
