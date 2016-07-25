/*
 * Date:2016/7/17
 * Name:Wangfei
 * Demo:Cloneable½Ó¿ÚÁ·Ï°
 */
package InterfaceTest;
class professer{
	String name;
	int age;
	professer(String name,int age){
		this.name=name;
		this.age=age;
	}
}
 public class student implements Cloneable {
	String name;
	int age;
	professer p;
	student(String name,int age,professer p){
		this.name=name;
		this.age=age;
		this.p=p;
	}
	public Object clone(){
		student o=null;
		//Object o=null;
		try{
			o=(student)super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e.toString());
		}
		//o.p=(professer)p.clone();
		return o;
	}
	public static void main(String[] args){
		professer p=new professer("Davil",50);
		student s1=new student("Jin",20,p);
		//System.out.println("name£º"+s1.p.name+","+"age£º"+s1.p.age);
		student s2=(student)s1.clone();
		s2.p.name="Mr.Li";
		s2.p.age=38;
		System.out.println("name£º"+s1.p.name+","+"age£º"+s1.p.age);
		System.out.println("name£º"+s2.p.name+","+"age£º"+s2.p.age);
	}//Ç³¿ËÂ¡
}
