package inheritence;

public class B extends A{
//if class A only had the parametrized constructor and no default constructor than you explicitly have to give super call to the parametrized constructor of the class A in all the constructor of the B class.
/*Since in this example class A already has a default constructor defined so need to give explicit call to super in class B constructos but since I wanted to explicitly wanted to call the parametrized consytructor of class A from the 
	parametrized constructor of class B so I have included the call of super(a) in parametrized constructor of class B , if this would not have been done,
	yhen parametrized constructor of class B ewould have automatically called the default constructor of class A.*/
B(int a) {
		super(a);
	System.out.println("inside parametrized constructor B");
	}

public int a = 12;
B(){
	System.out.println("inside constructor B");
}
public void diplayClassName(){
	System.out.println("Class is B");
}
}
