package Serialization.deserialzationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Serialization.serializationTest.Dog;

public class DeserializationDemo {
public static void main(String args[]){
	FileInputStream fis;
	try {
		fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d = (Dog)(ois.readObject());
		System.out.println("i value is :"+d.i);
		System.out.println("j value is :"+d.j);
		System.out.println("k value is :"+d.k);
		System.out.println("l value is :"+d.l);
		System.out.println("l value is :"+Dog.l);
		System.out.println("m value is :"+d.m);
		System.out.println("n value is :"+d.n);
		System.out.println("o value is :"+d.o);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
	}
	
}
}
