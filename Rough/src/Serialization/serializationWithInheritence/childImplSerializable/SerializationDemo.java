package Serialization.serializationWithInheritence.childImplSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationDemo {
public static void main(String args[]) throws Exception{
	Dog d1 = new Dog();
	System.out.println("i : "+d1.i+" j : "+d1.j);
	d1.i = 888;
	d1.j = 999;
	System.out.println("i : "+d1.i+" j : "+d1.j);
	FileOutputStream fos = new FileOutputStream("dog.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	FileInputStream fis = new FileInputStream("dog.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();//during de-serialization Animal constructor will again be called due to exceution of Instance control flow.
	System.out.println("i : "+d2.i+" j : "+d2.j);
}
}
