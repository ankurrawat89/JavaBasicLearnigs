package instanceControlFlow;

public class Parent {
int i = 10;
{
	m1();
	System.out.println("Parent Instance Block");
}
Parent(){
	System.out.println("Parent constructor");
}
public static void main(String args[]){
	Parent p = new Parent();
	System.out.println("Parent main");
}
public void m1(){
	System.out.println(j);
}
int j = 20;
}
