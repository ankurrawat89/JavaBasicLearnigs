package overriding;

public abstract class Animal { 
	//here visibility of m1 is default that is in the same package
abstract void m1();
public void m2(){
	System.out.println("Animal m2 is called");
}
}
