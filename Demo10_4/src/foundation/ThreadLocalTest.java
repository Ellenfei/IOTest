package foundation;
/*
 * ThreadLocal:将需要并发访问的资源复制多份，每个线程拥有一份资源，每个线程拥有自己的资源副本
 */

class Account {
	private ThreadLocal<String> name = new ThreadLocal<>();
	public Account(String str) {
		this.name.set(str);
	}
	public String getName() {
		return name.get();
	}
	public void setName(String str) {
		name.set(str);
	}
}
class MyTest extends Thread {
	private Account account;
	public MyTest(Account account, String name) {
		super(name);
		this.account = account;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			if(i==6) {
				account.setName(getName());
			}
			System.out.println(account.getName()+"账户的i值:"+i);
		}
	}
}
public class ThreadLocalTest {
	public static void main(String[] args) {
		Account at = new Account("初始名");
		new MyTest(at, "thread jia").start();
		new MyTest(at, "thread yi").start();
	}
}
