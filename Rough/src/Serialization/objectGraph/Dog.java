package Serialization.objectGraph;

import java.io.Serializable;

public class Dog implements Serializable{
Cat c = new Cat();
public Dog() {
	System.out.println("Dog constructor");
}
}
