package InterfaceTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class MyClass implements Serializable{
	/**
	 *  serialVersionUID=1L;
	 */
	private static final long serialVersionUID = 1L;
	String s;
	int i;
	double d;
	public MyClass(String s,int i,double d){
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString(){
		return "s="+s+",i="+i+",d="+d;
	}
}
public class SerializableDemo {
	public static void main(String [] args){
		//序列化
		MyClass object1=new MyClass("Hello",6,2.6e10);
		System.out.println("object1:"+object1);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("serial");
			ObjectOutputStream oos;
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
		//反序列化
		
		MyClass object2;
		FileInputStream fis;
		try {
			fis = new FileInputStream("serial");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object2=(MyClass)ois.readObject();
			ois.close();
			System.out.println("object2:"+object2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
	}
}
