package nestedClasses.AnonymousInnerClasses;

public class OuterClasses {
int a = 10;
private int b = 20;
InnerClasses ic = new InnerClasses(){//here object will be created of OuterClasses$1 class(ctreated by jvm itself which internally extends Innerclasses) and refrence varaible will be of type InnerClass.
	int x =9;
	int c = 32;
	int e=43;
	@Override
	public void getData() {
		super.getData();
		System.out.println(super.c);
		System.out.println(c);
		c = 31;
		d = 41;//here d is the variable present in InnerClasses and thus the variable present in Innerclasses will get updated.
		super.e=88;
		System.out.println("C calue in InnerClasses is :"+super.c+" and C value in anaonymous class is : "+c+":"+d+" : "+e);	
	}
};
}
