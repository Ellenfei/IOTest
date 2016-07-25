/*
 * Date:2016/7/23
 * Name:Wangfei
 * Demo:Runnable接口练习
 */

package NInterfaceTest;

//1.实现Runnable接口
class Ticket implements Runnable{
	private int a=50;
	public void run(){
		while(true){
			if(a>0){
			
				System.out.println(Thread.currentThread().getName()+"sail---"+a--);
			}
		}
	}
}
public class RunnableDemo {
	public static void main(String[] args){
		Ticket ticket = new Ticket();
		Thread t1=new Thread(ticket);
		Thread t2=new Thread(ticket);
		Thread t3=new Thread(ticket);
		Thread t4=new Thread(ticket);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

