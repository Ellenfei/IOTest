package algorithms;

import java.util.HashMap;

public class numboomerangs {
	public static void main(String[] args) {
		int[][] points = {{0,0}, {3,0}, {6,0}};
		System.out.println(numberOfBoomerangs(points));
		
	}
	
	public static int numberOfBoomerangs(int[][] points) {
		
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<points.length; i++) {
        	for(int j=i+1; j<points.length; j++){
        		if(i==j) continue;
        		int d = getDistance(points[i],points[j]);
        		map.put(d, map.getOrDefault(d, 0)+1);
        	}
        	
        	for(int val : map.values()) {
                res += val * (val-1);
            }            
            map.clear();
        }
        
        return res; 
    }
	
	private static int getDistance(int[] a, int[] b) {
		int dx = a[0]-b[0];
		int dy = a[1]-a[1];
		return dx*dx+dy*dy;
	}
}
