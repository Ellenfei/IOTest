package foundation;
/*
 * ThreadLocal:����Ҫ�������ʵ���Դ���ƶ�ݣ�ÿ���߳�ӵ��һ����Դ��ÿ���߳�ӵ���Լ�����Դ����
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
			System.out.println(account.getName()+"�˻���iֵ:"+i);
		}
	}
}
public class ThreadLocalTest {
	public static void main(String[] args) {
		Account at = new Account("��ʼ��");
		new MyTest(at, "thread jia").start();
		new MyTest(at, "thread yi").start();
	}
}
