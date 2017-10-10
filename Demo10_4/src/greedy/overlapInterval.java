package greedy;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start;
	int end;
	Interval() { 
		start = 0; 
		end = 0; 
	}
	Interval(int s, int e) { 
		start = s; 
		end = e; 
	}
}
/**
 * 
 * @author lenovo
 *����������endֵ�����������������ص����֣�ɾ���������count��1���൱���ڽ��бȽϵ�����������ɾ����һ�����䣩��
 *�����޸ıȽϵ�ָ��
 */
public class overlapInterval {
	public static void main(String[] args) {
		Interval[] intervals = new Interval[4];
		intervals[0] = new Interval(1,100);
		intervals[1] = new Interval(11,22);
		intervals[2] = new Interval(2,12);
		intervals[3] = new Interval(1,11);
		System.out.println(eraseOverlapIntervals(intervals));
	}
	public static int eraseOverlapIntervals(Interval[] intervals) {
		if(intervals.length==0 || intervals == null) return 0;
        int count = 0;
        
        Arrays.sort(intervals,new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.end-o2.end;
			}        	
		});
        int end = intervals[0].end;
        for(int i=1; i<intervals.length; i++) {
        	if(end > intervals[i].start) {
        		count++;
        	} else {
        		end = intervals[i].end;
        	}
        }
        return count;
    }
}
