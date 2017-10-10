package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 310. Minimum Height Trees(0-n-1)
 * Solution:
 * 1.不断删除叶子节点，逐渐逼近根节点的方法，在删除叶子节点的同时，会有一些新的节点成为叶子节点，
 * 于是继续循环删除，直至不能删除为止，那么剩下的节点就是高度最小的根。
 * 2.最终会剩下1个节点或者2个节点，1个节点的情况比较好理解，如{0,1}{0,2}，同时删除了叶子节点1和2，
 * 就剩下0；而两个节点的情况为{0,1}，此时0和1的邻居均为1，都是叶子节点，在下一轮操作后，0和1均没有邻居，
 * 所以这两个节点都是正确的答案。
 * 3.当n等于1时，需要特殊处理，直接返回{0}。
 * example:
 * 		0---1---2
 *			|
 * 			|
 * 			3
 * 			|
 * 			|
 * 			4
 * 			|
 * 			|
 * 			5
 * return {3,4}
 */	 		
public class minHeightTrees {
	public static void main(String[] args) {
		int n = 6;
		int[][] edges = {{0,3},{1,3},{2,3},{4,3},{5,4}};
		//edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]
		System.out.println(findMinHeightTrees(n, edges));
	}
	public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
		List<Integer> leafs = new ArrayList<Integer>();
        if(n<=1) {
        	leafs.add(0);
        	return leafs;
        }
        //构建图
        Map<Integer,ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++) graph.put(i, new ArrayList<Integer>());
        
        int[] neighbors = new int[n];//每个node的邻居数
        for(int[] edge : edges) {
        	neighbors[edge[0]]++;
        	neighbors[edge[1]]++;
        	graph.get(edge[0]).add(edge[1]);
        	graph.get(edge[1]).add(edge[0]);
        }
        for(int i=0; i<n; i++) {
        	if(graph.get(i).size()==1)
        		leafs.add(i);
        }
        while(n>2) {
        	List<Integer> newLeafs = new ArrayList<Integer>();
        	for(int leaf : leafs) {
        		n--;
        		for(int newLeaf : graph.get(leaf)) {
        			if(--neighbors[newLeaf]==1) 
        				newLeafs.add(newLeaf);
        		}
        	}
        	leafs = newLeafs;
        }
        return leafs;
    }
}

