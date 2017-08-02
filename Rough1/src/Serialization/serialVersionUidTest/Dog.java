package Serialization.serialVersionUidTest;

import java.io.Serializable;

public class Dog implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public int i=11;
public int j=12;
public Dog() {
	System.out.println("Receiver Dog constructor called");
}
}
