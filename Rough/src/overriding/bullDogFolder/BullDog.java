package overriding.bullDogFolder;

import overriding.Dog;

public class BullDog extends Dog{
	//here visibolity of m1 increased to public
	@Override
 public void m1(){
	 System.out.println("BullDog m1 is called");
 }
	@Override
	public void m2() {
		System.out.println("m2 of BullDog is called");
	}

}
