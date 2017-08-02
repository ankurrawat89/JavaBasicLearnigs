package nestedClasses.normalInnerClasses;

public class Test {
public static void main(String args[]){
	OuterClasses oc = new OuterClasses();
	OuterClasses.InnerClasses ic = oc.new InnerClasses();
	ic.printValue();
	System.out.println(ic.innerD);
	//inner class object can only access inner class properties
	//outer class object can only access outer class properties
}
}
