package algorithms;

import java.util.HashSet;

public class isValidSoduku {
	public static void main(String[] args) {
		
	}
	
	public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        
        for(int i=0; i<9; i++) {
        	for(int j=0; j<9; j++) {
        		if(board[i][j]!='.' && !rows.add(board[i][j])) 
        		return false;
        		
        		if(board[i][j]!='.' && !columns.add(board[i][j])) 
            	return false;
        		
        		int RowIndex = 3*(i/3);
        		int ColIndex = 3*(i%3);
        		if(board[RowIndex+j/3][ColIndex+j%3]!='.' && !cube.add(board[RowIndex+j/3][ColIndex+j%3])) 
                return false;
        		
        	}
        }
        return true;
    }
}
