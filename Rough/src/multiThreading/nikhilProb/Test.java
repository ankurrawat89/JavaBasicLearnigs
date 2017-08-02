package multiThreading.nikhilProb;

public class Test {
public static void main(String args[]) throws InterruptedException{
	MyThread m = new MyThread();
	Thread t = new Thread(m);
	t.start();
	t.join(60000);
	if(t.isAlive()){
		t.stop();
		System.out.println("My thread execution stops.");
	}else{
		System.out.println("isAlive="+t.isAlive());
	}
}
}
