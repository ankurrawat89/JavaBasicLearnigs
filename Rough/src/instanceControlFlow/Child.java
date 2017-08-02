package instanceControlFlow;

public class Child extends Parent{
	int x = 100;
	{
		m2();
		System.out.println("Child First Instance Block");
	}
    Child(){
	System.out.println("Child constructor");
	}
	public static void main(String args[]){
		Child p = new Child();
		System.out.println("Child main");
	}
	public void m2(){
		System.out.println(y);
	}
	{
		System.out.println("Child Second Instance Block");
	}
	int y = 200;
}
