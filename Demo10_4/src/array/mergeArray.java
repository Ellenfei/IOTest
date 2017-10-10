package array;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+start+" "+end+"]";
	}
	
}
public class mergeArray {
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(5,8));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));
		for(Interval interval : intervals) {			
			System.out.print(interval.toString());
		}
		System.out.println();
		//merge(intervals);
		for(Interval interval : merge(intervals)) {			
			System.out.print(interval.toString());
		}
	}
	/*
	 * intervals中的Interval先按照start排序，start相等的再按照end排序，然后进行merge
	 */
	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<>();
		if(intervals.size()==0 || intervals==null) {
			return result;
		}
        Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				if(o1.start==o2.start){
					return o1.end - o2.end;
				} else {										
					return o1.start - o2.start;
				}
			}
		});               
        result.add(intervals.get(0));     
        for(int i=1,j=0; i<intervals.size(); i++) {        	
        	if(result.get(j).end <intervals.get(i).start ) {
        		j++;
        		result.add(j,intervals.get(i));
        	} else if(result.get(j).end <intervals.get(i).end){
        		result.get(j).end = intervals.get(i).end;
        	}
        }
        return result;
    }
}
