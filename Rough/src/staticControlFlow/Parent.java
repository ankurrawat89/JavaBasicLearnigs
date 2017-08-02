package staticControlFlow;

public class Parent {
static int i = 10;
static {
	m1();
	System.out.println("Parent static Block");
}
public static void main(String args[]){
	m1();
	System.out.println("Parent main");
}
public static void m1(){
	System.out.println(j);
}
static int j = 20;
}
