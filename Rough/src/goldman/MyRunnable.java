package goldman;

public class MyRunnable implements Runnable{
	ThreadLocal threadLocal;
 MyRunnable(ThreadLocal threadLocal){
	 this.threadLocal = threadLocal;
 }
	@Override
	public void run() {
		System.out.println(threadLocal.get());
	}

}
