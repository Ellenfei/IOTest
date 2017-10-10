package DP;

import java.util.ArrayList;
import java.util.List;

/*
 * 120. Triangle
 * Solution:用自底向上的求解思路：
 * example:
 * [
 *    [2],
 *   [3,4],
 *  [6,5,7],
 * [4,1,8,3]
 * ]
 * 过程如下：
 * MP(3,0)=triangle[3][0]=4;
 * MP(3,1)=triangle[3][1]=1;
 * MP(3,2)=triangle[3][1]=8;
 * MP(3,3)=triangle[3][1]=3;
 * MP(2,0)=min{MP(3,0),MP(3,1)}+triangle[2][0]=1+6=7;
 * MP(2,1)=min{MP(3,1),MP(3,2)}+triangle[2][1]=1+5=6;
 * MP(2,2)=min{MP(3,2),MP(3,3)}+triangle[2][2]=3+7=10;
 * MP(1,0)=min{MP(2,0),MP(2,1)}+triangle[1][0]=6+3=9;
 * MP(1,1)=min{MP(2,1),MP(2,2)}+triangle[1][1]=6+6=12;
 * MP(0,0)=min{MP(1,0),MP(1,1)}+triangle[0][0]=9+2=11;
 *  
 */
public class minSum {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		a.add(2);
		List<Integer> b = new ArrayList<>();
		b.add(3);b.add(4);
		List<Integer> c = new ArrayList<>();
		c.add(6);c.add(5);c.add(7);
		List<Integer> d = new ArrayList<>();
		d.add(4);d.add(1);d.add(8);d.add(3);
		list.add(a);list.add(b);
		list.add(c);list.add(d);
		System.out.println(minimumTotal(list));
		
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0 || triangle==null) {
        	return 0;
        }
        int rows = triangle.size();
        int[] dp = new int[rows];
        
        for(int i =rows-1; i>=0; i--) {
        	for(int j=0; j<=i; j++) {
        		if(i==rows-1) {
        			dp[j]=triangle.get(i).get(j);
        		} else {
        			dp[j] = Math.min(dp[j], dp[j+1])+triangle.get(i).get(j);
        		}
        	}
        }
        return dp[0];
    }
}
