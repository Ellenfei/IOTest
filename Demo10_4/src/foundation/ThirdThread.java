package foundation;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * Callable�ӿ�
 */
public class ThirdThread {
	public static void main(String[] args) {
		//����Callable����
		ThirdThread rt = new ThirdThread();
		//ʹ��FutureTask��װCallable����
		FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int i=0;
				for(; i<100; i++) {
					System.out.println(Thread.currentThread().getName()+"ѭ��������ֵi��"+i);
				
				}
				return i;
			}
			
		});
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+"ѭ��������ֵi��"+i);
			if(i==10) {
				new Thread(task, "�з���ֵ���߳�  ").start();;
			}
		}
		try {
			System.out.println("���̵߳ķ���ֵ��"+task.get());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
