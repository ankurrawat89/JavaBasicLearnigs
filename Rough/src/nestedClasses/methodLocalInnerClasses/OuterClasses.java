package nestedClasses.methodLocalInnerClasses;

public class OuterClasses {
int a = 10;
private int b = 20;
public void printValue(final int d){
	final int c = 30;
	    class InnerClasses{
		public void printValue(){
			System.out.println(a+":"+b);
			System.out.println(c);//c can only be used if it is marked final
			System.out.println(d);//d can only be used if it is marked final
		}
	}
	InnerClasses ic = new InnerClasses();
	ic.printValue();
	
	//ic.c & ic.d not valid as method local inner class object can not access the local variables or variables of the method in which it is defined.
	//method local inner class can only access final variables and parameters of the method in which it is defined.
	//method local inner class is also called local inner class.
	//instance of local inner class can only be created from inside the method in which it is defined.
	//local inner class can access the private members of the outer class
}
}
