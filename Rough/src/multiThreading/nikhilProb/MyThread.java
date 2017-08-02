package multiThreading.nikhilProb;

public class MyThread implements Runnable{
	@Override
	public void run() {
			
		System.out.println("start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("stop");
	}
}
