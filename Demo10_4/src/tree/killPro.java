package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 582. Kill Process
 * 首先根据给定的pid和ppid列表，利用HashMap存储
 */
public class killPro {
/*
 * utIfAbsent()方法用于在map中进行添加。这个方法以要添加到ConcurrentMap中的键的值为参数，
 * 就像普通的put()方法，但是只有在map不包含这个键时，才能将键加入到map中。如果map已经包含这个键，
 * 那么这个键的现有值就会保留。
 */
	public static void main(String[] args) {
		List<Integer> pid = new ArrayList<>();
		pid.add(1);	pid.add(3);pid.add(10);pid.add(5);
		List<Integer> ppid = new ArrayList<>();
		ppid.add(3);ppid.add(0);ppid.add(5);ppid.add(3);
		System.out.println(killProcess(pid, ppid, 5));
	}
	public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<ppid.size(); i++) { 
        	map.putIfAbsent(ppid.get(i), new ArrayList<Integer>());
        	map.get(ppid.get(i)).add(pid.get(i));
        }
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(kill);
        while(!q.isEmpty()) {
        	int pro = q.poll();
        	res.add(pro);
        	if(map.containsKey(pro)) {
        		q.addAll(map.get(pro));
        	}
        }
        return res;
    }
	
}
