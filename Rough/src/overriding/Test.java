package overriding;

import overriding.bullDogFolder.BullDog;

public class Test {
public static void main(String args[]){
	Animal a = new BullDog();
	Dog d = new BullDog();
	BullDog bd = new BullDog();
	a.m1();
	a.m2();
	d.m1();
	d.m2();
	bd.m1();
	bd.m2();
}
}
