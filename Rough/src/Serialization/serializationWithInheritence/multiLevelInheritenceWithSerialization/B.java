package Serialization.serializationWithInheritence.multiLevelInheritenceWithSerialization;

import java.io.Serializable;

public class B extends A implements Serializable{
	int b =20;
	public B() {
		System.out.println("B constructor");
	}
}
