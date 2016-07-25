/*
 * Date:2016/7/18
 * Name:Wangfei
 * Demo:Interable接口练习
 */
package InterfaceTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator; 
public class person implements Iterable<person>{
	public static void main(String[] args){
		printStrings();
	}
	//实现Iterable接口中要求实现的方法
	@Override
	public Iterator<person>  iterator(){
		return new MyIterator();//返回一个MyIterator实例对象  
	}
	class MyIterator implements Iterator<person>{
		private int index=0;
		@Override
		public boolean hasNext(){
			return index!=p.size();
		}
		@Override
		public person next(){
			return p.get(index++);
		}
		@Override
		public void remove(){
		}		
		
	}
//	 private String name;  
//	 private int age;
	 private List<person> p=new ArrayList<person>();
//	 public void add(person p){
//		 this.p.add(p);
//	 }
//	public person(String name,int age){
//		this.name=name;
//		this.age=age;
//	}
//	public String getName(){
//		return name;
//	}
//	public int getAge() {  
//        return age;  
//    }  
//    public void setAge(int age) {  
//        this.age = age;  
//    }
//	@Override
//	public String toString() {
//		return "p [name=" + name + ", age=" + age + "]"; 
//	}  
    private static void printStrings(){
    	System.out.println("printStrings() method running"); 
    	String[] s={"a","b","c","d"};
    	for(String ss: s){
    		System.out.println("ss:  "+ss);
    	}
    	System.out.println("printStrings() method end\n");   
    }
}
	

