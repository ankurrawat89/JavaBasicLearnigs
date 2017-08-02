package Serialization.serializationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String args[]) throws ClassNotFoundException{
	Dog d = new Dog();
	try {
		FileOutputStream fos = new FileOutputStream("abc.ser");//this line will create the 'abc.ser in the current working directory if its not present there'
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println(d1);
		System.out.println(d1.k+" : "+d1.l+" : "+d1.m+" : "+d1.o);
		 
	} catch (FileNotFoundException e) {
		System.out.println("File not present");
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
