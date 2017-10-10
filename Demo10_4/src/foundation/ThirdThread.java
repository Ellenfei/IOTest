package foundation;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * Callable接口
 */
public class ThirdThread {
	public static void main(String[] args) {
		//创建Callable对象
		ThirdThread rt = new ThirdThread();
		//使用FutureTask包装Callable对象
		FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int i=0;
				for(; i<100; i++) {
					System.out.println(Thread.currentThread().getName()+"循环变量的值i："+i);
				
				}
				return i;
			}
			
		});
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+"循环变量的值i："+i);
			if(i==10) {
				new Thread(task, "有返回值的线程  ").start();;
			}
		}
		try {
			System.out.println("子线程的返回值："+task.get());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
