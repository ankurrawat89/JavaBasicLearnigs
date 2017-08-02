package Serialization.serializationWithInheritence.parentImplSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
public static void main(String args[]) throws Exception{
	Dog d1 = new Dog();
	FileOutputStream fos = new FileOutputStream("dog.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	FileInputStream fis = new FileInputStream("dog.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();
	System.out.println("i : "+d2.i+" j : "+d2.j);
}
}
