package multiThreading.synchrizedExample;

public class Display {
public synchronized void wish(String name){
	for(int i=0;i<5;i++){
	System.out.print("Good Morning : ");
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		System.out.println(name +" got interrupted");
	}
	System.out.println(name);
	}
}
}
