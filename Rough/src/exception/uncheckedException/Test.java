package exception.uncheckedException;

import java.io.IOException;

public class Test {

public void m(){
	System.out.println("m1");
	//int data = 50/0;
	throw new ArithmeticException();
	//System.out.println("m2");
}
public void n(){
	System.out.println("n1");
	m();
	System.out.println("n2");
}
public void p(){
	try{
		System.out.println("p1");
		n();
		System.out.println("p2");
	}catch(Exception e){
	System.out.println("exception propogated and handeled");
	}
}
public static void main (String args[]){
	Test t = new Test();
	/*try{
	t.p();
	}
	catch(Exception e){
		System.out.println("catching inside main");
	}*/
	t.p();
	System.out.println("In Main");
}

}
