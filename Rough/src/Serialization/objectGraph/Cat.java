package Serialization.objectGraph;

import java.io.Serializable;

public class Cat implements Serializable {
Rat r = new Rat();
public Cat() {
	System.out.println("Cat constructor");
}
}
