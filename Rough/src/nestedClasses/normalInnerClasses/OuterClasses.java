package nestedClasses.normalInnerClasses;

public class OuterClasses {
int a = 10;
private int b = 20;
private String c = "Ankur";
int outerD = 40;
class InnerClasses{
	//inner class can access private members of an outer class
	//if outer class and inner class have variables with same name then use OuterClaas.this.membername to access outer class variable
	int a = 11;
	int b = 21; 
    int innerD = 30;//can not be accessed from outer class object
	public void printValue(){
		System.out.println(OuterClasses.this.a+":"+OuterClasses.this.b+" : "+c+" :"+outerD);
	}
}
}
