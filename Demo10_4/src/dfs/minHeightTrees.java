package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 310. Minimum Height Trees(0-n-1)
 * Solution:
 * 1.����ɾ��Ҷ�ӽڵ㣬�𽥱ƽ����ڵ�ķ�������ɾ��Ҷ�ӽڵ��ͬʱ������һЩ�µĽڵ��ΪҶ�ӽڵ㣬
 * ���Ǽ���ѭ��ɾ����ֱ������ɾ��Ϊֹ����ôʣ�µĽڵ���Ǹ߶���С�ĸ���
 * 2.���ջ�ʣ��1���ڵ����2���ڵ㣬1���ڵ������ȽϺ���⣬��{0,1}{0,2}��ͬʱɾ����Ҷ�ӽڵ�1��2��
 * ��ʣ��0���������ڵ�����Ϊ{0,1}����ʱ0��1���ھӾ�Ϊ1������Ҷ�ӽڵ㣬����һ�ֲ�����0��1��û���ھӣ�
 * �����������ڵ㶼����ȷ�Ĵ𰸡�
 * 3.��n����1ʱ����Ҫ���⴦��ֱ�ӷ���{0}��
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
        //����ͼ
        Map<Integer,ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++) graph.put(i, new ArrayList<Integer>());
        
        int[] neighbors = new int[n];//ÿ��node���ھ���
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

