package dfs;
/*
 * 547. Friend Circles
 *未提交
 * 方法：DFS+标志数组
 */
public class findFriendsCircle {
	public static void main(String[] args) {
		int[][] M = {
				{1,1,0},
				{1,1,0},
				{0,0,1}
		};
		System.out.println(findCircleNum(M));
	}
	
	public static int findCircleNum(int[][] M) {
	    if(M==null || M.length==0) return 0;
	    boolean[] flag = new boolean[M.length];
	    flag[0] = true;
	    int result = 0;
	    for(int i=0; i<M.length; i++) {
	    	if(i==0 || i!=0 && !flag[i]) {
	    		helper(M,i,flag);
	    		result++;
	    	}
	    }
	    return result;
	}
	
	public static void helper(int[][] M, int i, boolean[] flag) {
		for(int j=0; j<M.length; j++) {
			if(i!=j && M[i][j]==1 && !flag[j]) {
				flag[j] = true;
				helper(M,j,flag);
			}
		}
	}
}
