package genericparadigm;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ͷ���
 */
public class GenericMethodTest {
	public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for(T o : a) {
			c.add(o);
		}
	}
	public static void main(String[] args) {
		Object[] object = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//T����Object
		fromArrayToCollection(object, co);
		String[] str = new String[100];
		//T����Object
		fromArrayToCollection(str, co);
		Collection<String> cs = new ArrayList<>();
		//T����String
		fromArrayToCollection(str, cs);
		Integer[] ia = new Integer[100];
		Collection<Number> cn= new ArrayList<>();
		//T����Number
		fromArrayToCollection(ia, cn);
		//T����Object
		fromArrayToCollection(ia, co);
		//T����String  Number����String�����String�࣬�������
		//fromArrayToCollection(ia, cs);  
		
	}
}
