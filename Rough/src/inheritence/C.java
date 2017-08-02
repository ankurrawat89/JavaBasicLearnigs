package inheritence;

public class C extends B{
	public int c = 54;
	public C() {
		System.out.println("inside constructor C");
	}
	C(int a) {
		super(a);
	System.out.println("inside parametrized constructor C");
	}
	public void diplayClassName(){
		System.out.println("Class is C");
	}
	public static void main(String args[]){
		A aa = new C(99);
		A aa1 = new C();
		B bb = new C();
		C cc = new C();
		C cc1 = new C(89);
		System.out.println(aa.a);
		aa.a = 50;
		System.out.println(aa.a);
		System.out.println(aa1.a);
		System.out.println(bb.a);
		System.out.println(cc.a);//here it will print the value of a that is present in class B
		System.out.println(cc1.a);//here it will print the value of a that is present in class B
		System.out.println(cc.b);//here it will print value from class A,as b is not availble in Class C as well as Class B.
		//imp here cc and cc1 ref variable will first search for varaible 'a' in its class first, since it is not available here it will chk in its parent class i.e B, as it is available there,cc.a and cc1.a will always print the value from class B,in case if its not been available there as well then it would have searched in parent class of B i.e A
	    aa.diplayClassName();//class c method
	    bb.diplayClassName();//class c method
	    cc.diplayClassName();//class c method
	    new B().diplayClassName();//class B method
	    //v imp irrespective of the reference type the overrided method of that class will be called of which you have created an object.
	}
}
//v Imp.    If implicit i.e default constructor of the super class is not defined than you have to explicitly call any of the other constructor of the super class from the child class constructor.
//v. Imp    If implicit constructor of the super class is defined than you don't have to explicitly call the other constructor of the super class , child class constructors(all constructor parametrized as well as non parametrized)  will automatically call the implicit constructor of the super class.