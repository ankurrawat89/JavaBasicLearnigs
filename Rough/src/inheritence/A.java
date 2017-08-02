package inheritence;

public class A {
public  int a = 10;
public int b=75;
A (int a){
	System.out.println("inside parametrized constructor A");
	this.a = a;
}
A(){
System.out.println("inside constructor A");	//if you create any other conmstructor then default is not created .You need to explicitly create the default constructor.
}
public void diplayClassName(){
	System.out.println("Class is A");
}
}
