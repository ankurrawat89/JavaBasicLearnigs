package staticControlFlow;

public class StaticTest {
static int i=10;
static{
	m1();
	System.out.println("First static block");
}
public static void main(String args[]){
	m1();
	System.out.println("Main method");
}
public static void m1(){
	System.out.println(j);
}
static{
	System.out.println("second static block");
	//System.exit(0); if we uncomment this call,jvm will shutdown here and the main method will not be exceuted
	}
static int j=20;
}
