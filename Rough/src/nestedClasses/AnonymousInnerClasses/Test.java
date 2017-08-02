package nestedClasses.AnonymousInnerClasses;

public class Test {
public static void main(String args[]){
	OuterClasses o = new OuterClasses();	
	System.out.println(o.ic.c);//since reference varibale ic is of type InnerClasses it will print the value of variable c present in class InnerClasses.
	o.ic.getData();//irrespective of the type of refrence variable the overridedmethod of the class is called of which object is created. Since here in case of anonymous class object will be created of type OuterClasses$1 so getData() of this class will be called.
	System.out.println(o.ic.c);//since reference varibale ic is of type InnerClasses it will print the value of variable c present in class InnerClasses.
	System.out.println(o.ic.d);//since reference varibale ic is of type InnerClasses it will print the value of variable d present in class InnerClasses.but since is modified by getData() call it will print the updated vaue.
	System.out.println(o.ic.e);//since reference varibale ic is of type InnerClasses it will print the value of variable e present in class InnerClasses.but since is modified by getData() call it will print the updated vaue.
	o.ic.superChk();
	System.out.println((true && false==false));
	//o.ic.x is never possible as ic is of type InnerClasses and x is present in OuterClasses$1 class so can not do this.
}
}
