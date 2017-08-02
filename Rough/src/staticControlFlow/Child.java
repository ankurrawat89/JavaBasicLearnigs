package staticControlFlow;

public class Child extends Parent{
	static int x = 100;
	static{
		m2();
		System.out.println("Child First static Block");
	}
	public static void main(String args[]){
		m2();
		System.out.println("Child main");
	}
	public static void m2(){
		System.out.println(y);
	}
	static {
		System.out.println("Child Second static Block");
	}
	static int y = 200;
}
