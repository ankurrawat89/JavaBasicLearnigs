package overriding;

public abstract class Dog extends Animal {

	//in case of overriding , in child class we can not reduce the visibility of the parent method though we can increase it
	//here visibility of m1 is increased to protected otherwise it will not be visible to the BullDog Class as BullDog class is in the different folder, now will be accessible by its child class irrespective of the package
	@Override
	protected void m1() {
		System.out.println("m1 of Dog is called");
	}
	//here we overrided parent class non-abstract method m2 and made it abstract , now this need to be implemented by its child classes
	@Override
    public abstract void m2();
}
