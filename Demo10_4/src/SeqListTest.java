import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class SeqList implements List{
	

	final int defaultSize = 10;
	
	int maxSize;
	int size;
	Object[] listArray;
	
	
	public SeqList(int size){
		initiate(size);
	}
	
	private void initiate(int sz){
		maxSize = sz;
		size = 0;
		listArray = new Object[sz];
	}
	
	@Override
	public void add(int i, Object o) {
		try {
			if(size == maxSize){
				throw new Exception("顺序表已满！");
			}
			if(i<0 || i>size){
				throw new Exception("参数错误！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int j = size; j>i; j--)
			listArray[j] = listArray[j-1];
		
			listArray[i] = o;
			size++;
		
	}

	@Override
	public Object get(int i) {
		try {
			if(i<0 || i>size){
				throw new Exception("参数错误！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listArray[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

class Student{
	private long number;
	private String name;
	private String sex;
	private int age;
	
	public Student(long number, String name, String sex, int age) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;		
	}
	
	public long getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
}

public  class SeqListTest {
	public static void main(String args[]){
		SeqList seqList = new SeqList(100);
		
		Student[] student = new Student[3];
		student[0] = new Student(2016141004,"张三","男",20);
		student[1] = new Student(2016141002,"李四","男",21);
		student[2] = new Student(2016141003,"王五","女",22);
		
		int n = 3;
		for(int i=0; i<n; i++){
			seqList.add(i,student[i]);		
		}
		
		for(int i=0; i<seqList.size; i++){
			Student st = (Student)seqList.get(i);
			System.out.println(st.getNumber()+" "+st.getName()+" "+st.getSex()+" "+st.getAge());
		}
	}
}
