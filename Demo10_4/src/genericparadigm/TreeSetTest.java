package genericparadigm;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet(Comparator<? super E> c)  ͨ�������
 */
public class TreeSetTest {
	public static void main(String[] args) {
		//Comparator������ΪTreeSet���͵ĸ���
		TreeSet<String> ts1 = new TreeSet<>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return o1.hashCode()>o2.hashCode() ? 1 : o1.hashCode()<o2.hashCode() ? -1 : 0;
			}
		});
		ts1.add("hello");
		ts1.add("abd");
		//Comparator��������TreeSet������ͬ
		TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.length()>s2.length() ? 1 : s1.length()<s2.length() ? -1 : 0;
			}
			
		});
		ts2.add("sfffdd");
		ts2.add("abb");
		System.out.println(ts1);
		System.out.println(ts2);
	}
}
