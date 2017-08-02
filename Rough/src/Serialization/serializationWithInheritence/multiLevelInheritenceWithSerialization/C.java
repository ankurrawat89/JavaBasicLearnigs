package Serialization.serializationWithInheritence.multiLevelInheritenceWithSerialization;

import java.io.Serializable;

public class C extends B{
	int c =30;
	public C() {
		System.out.println("C constructor");
	}
}
