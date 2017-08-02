package overloading;

import overloading.child.ChildTest;
import overloading.parent.ParentTest;

public class Test {
	public static void promotinTest(double d){
		System.out.println("promotinTest get called : "+d);
	}
	public static void argTest(ParentTest p){
		System.out.println("parentArgTest called");
	}
	public static void argTest(ChildTest c){
		System.out.println("childArgTest called");
	}
	public static void argTest1(String s){
		System.out.println("String called");
	}
	public static void argTest1(StringBuffer s){
		System.out.println("StringBuffer called");
	}
	public static void genericVarArgTest(int x){
		System.out.println("generic called");
	}
	public static void genericVarArgTest(int... x){
		System.out.println("var called");
	}
	public static void argPositionTest(int a, float b){
		System.out.println("int float called");
	}
	public static void argPositionTest(float a, int b){
		System.out.println("float int called");
	}
public static void main(String args[]){
	//promotinTest calling starts
	byte a = 10;
	promotinTest(a);
	promotinTest('c');
	promotinTest(10);
	promotinTest(11l);
	promotinTest(10.5f);
	promotinTest(10.5);
	//promotinTest calling ends
	ParentTest p = new ParentTest();
	ChildTest c = new ChildTest();
	ParentTest p1 = new ChildTest();
	//parent child argument Test starts
	argTest(p);
	argTest(c);
	argTest(p1);//since ref is of type ParentTest so o/p will be parentArgTest called
	argTest(null);//here null is valid value for both the overloaded methods but since child is always given priority so o/p will be childArgTest called
	//parent child argument Test ends
	argTest1("ankur");//String method will be called
	argTest1(new StringBuffer("ankur"));//StringBuffer method will be called
	//argTest1(null); The method argTest1(String) is ambiguous for the type Test as null is valid value for both the methods and both are at the same level so compiler can not resolve the method call.
	genericVarArgTest(10);//generic will be called
	genericVarArgTest();//var will be called
	genericVarArgTest(null);//var will be called as null is vaild value for var-args method
	argPositionTest(10,10.5f);//int float will be called
	argPositionTest(10.5f,10);//float int will be called
	//argPositionTest(10,10); ambigous call as int can be promoted to float so both methods are valid thus complier can not resolve
	//argPositionTest(10.5f,10.5f); here float can not be passed in place of int so compile time error
	p.print(Integer.parseInt("1"));//parent method will be called
	p.print(1);//parent method will be called
	p.print((Integer)1);//parent method will be called
	p.print(new Integer(1));//parent method will be called
	c.print(2);//child method will be called
	c.print(new Integer(3));//child method will be called
	p1.print(new Integer(4));//parent method will be called
	p1.print(5);//child overriding method will be called
	p.print('a');//int method will be called as there is no matching method found so character got promoted to int
	p.print(new Integer('b'));//integer method will be called for the same same reason as above
    //p.print(29l); The method print(int) in the type ParentTest is not applicable for the arguments (long)
	p.print(null);//since null is a valid value for wrapper type Integer thus integer method will be executed
}
}
