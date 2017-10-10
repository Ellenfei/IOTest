package work.neteasy2018;

import java.util.Scanner;

public class MagicCity {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cityNum = in.nextInt();
		int maxWalk = in.nextInt();
		int[] parent = new int[cityNum-1];
		for(int i=0; i<cityNum-1; i++) {
			parent[i] = in.nextInt();
		}
		System.out.println(getTravelCity(cityNum, maxWalk, parent));
	}
	
	public static int getTravelCity(int cityNum, int maxWalk, int[] parent) {
		int maxLen = getMaxDepth(cityNum, parent);
		if(maxLen<maxWalk) {
			return Math.min(cityNum, maxLen+1+(maxWalk-maxLen)/2);
		} 
		return maxWalk+1;
		
	}
	//DPËã·¨
	public static int getMaxDepth(int cityNum, int[] parent) {
		int maxLen = 0;
		int[] dp = new int[cityNum+1];
		for(int i=0; i<cityNum-1; i++) {
			dp[i+1] = dp[parent[i]]+1;
			maxLen = Math.max(maxLen, dp[i+1]);
		}	
		return maxLen;
	}
}
