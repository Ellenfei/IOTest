package genericparadigm;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型方法
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
		//T代表Object
		fromArrayToCollection(object, co);
		String[] str = new String[100];
		//T代表Object
		fromArrayToCollection(str, co);
		Collection<String> cs = new ArrayList<>();
		//T代表String
		fromArrayToCollection(str, cs);
		Integer[] ia = new Integer[100];
		Collection<Number> cn= new ArrayList<>();
		//T代表Number
		fromArrayToCollection(ia, cn);
		//T代表Object
		fromArrayToCollection(ia, co);
		//T代表String  Number不是String子类或String类，编译错误
		//fromArrayToCollection(ia, cs);  
		
	}
}
