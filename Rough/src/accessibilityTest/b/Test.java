package accessibilityTest.b;

import accessibilityTest.a.A;

public class Test {
public static void main(String args[]){
	A a  = new A();
	//a.a1(); a1() is private not accessible
	//a.a2(); a2() is protected can only be accessed by the child classes
	//a.a3(); a3() is default so accessible only in the same package
	a.a4();//only accessible method
}
}
