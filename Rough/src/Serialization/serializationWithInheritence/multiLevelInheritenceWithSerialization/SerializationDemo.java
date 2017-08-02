package Serialization.serializationWithInheritence.multiLevelInheritenceWithSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;

import Serialization.serializationWithInheritence.childImplSerializable.Dog;

public class SerializationDemo {
public static void main(String args[]) throws Exception{
	C c  = new C();
	System.out.println("A : "+c.a+" B : "+c.b+" C : "+c.c+" D : "+c.dRef.d);
	c.a = 40;
	c.b = 50;
	c.c = 60;
	c.dRef.d = 90;
	System.out.println("A : "+c.a+" B : "+c.b+" C : "+c.c+" D : "+c.dRef.d);
	FileOutputStream fos = new FileOutputStream("multi.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(c);
	FileInputStream fis = new FileInputStream("multi.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	C c2 = (C)ois.readObject();
	System.out.println("A : "+c2.a+" B : "+c2.b+" C : "+c2.c+" D : "+c2.dRef.d);
	/*vImp Since here class A is not serializable so during serialization original value will be ignored by jvm and default value will be stored for 
	the instance variables present in class A  and similarly during deserialization jvm will run the instance work flow for class A as it is
	not serializable class. Important point here is that since class A is not serializable so for class D irresepective of whether class D is serializable or
	not Instance wrokflow will be executed for class D as well.*/
}
}
