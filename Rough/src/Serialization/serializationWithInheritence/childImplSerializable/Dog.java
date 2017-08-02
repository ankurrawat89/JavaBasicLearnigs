package Serialization.serializationWithInheritence.childImplSerializable;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	int j = 20;
public Dog() {
	System.out.println("Dog constructor called");
	j=21;
}
}
