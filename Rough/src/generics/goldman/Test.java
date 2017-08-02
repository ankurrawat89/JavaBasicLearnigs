package generics.goldman;

public class Test {
public static void main(String args[]){
	MyClass<Maruti> obj = new MyClass<Maruti>(new Maruti());
	System.out.println(obj.getObject());
	MyClass obj1 = new MyClass(new Bullet());
	System.out.println(obj1.getObject());
	MyClass obj2 = new MyClass();
	System.out.println(obj2.getObject());
	//MyClass obj3 = new MyClass(new MotorBoat()); CE: no constructor MyClass(MotorBoat)
}
}
