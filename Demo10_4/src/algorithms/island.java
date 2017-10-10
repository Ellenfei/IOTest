package algorithms;

public class island {
	public static void main(String[] args) {
		
	}
	
	 public static int islandPerimeter(int[][] grid) {
		 int island=0,neighbours=0;
		 for(int i=0; i<grid.length; i++){
			 for(int j=0; j<grid[i].length; j++){
				 if(grid[i][j]==1) {
					 island++;
					 if(i<grid.length && grid[i+1][j]==1) neighbours++;
					 if(j<grid[i].length && grid[i][j+1]==1) neighbours++;
				 }
			 }
		 }
		 
		 return 4*island-2*neighbours;
	}
}
