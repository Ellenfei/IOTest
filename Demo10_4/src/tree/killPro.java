package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 582. Kill Process
 * ���ȸ��ݸ�����pid��ppid�б�����HashMap�洢
 */
public class killPro {
/*
 * utIfAbsent()����������map�н�����ӡ����������Ҫ��ӵ�ConcurrentMap�еļ���ֵΪ������
 * ������ͨ��put()����������ֻ����map�����������ʱ�����ܽ������뵽map�С����map�Ѿ������������
 * ��ô�����������ֵ�ͻᱣ����
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
