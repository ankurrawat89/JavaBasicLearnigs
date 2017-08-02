package Serialization.customizedSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationDemo {
public static void main(String args[]) throws Exception{
	Account a1 = new Account();
	System.out.println("UserName : "+a1.userName+" Password : "+a1.pwd+" Pin : "+a1.pin);
	FileOutputStream fos = new FileOutputStream("customizedabc.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);//will call write object defined in Account class
	FileInputStream fis = new FileInputStream("customizedabc.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account a2 = (Account)ois.readObject();//will call readObject defined in Account class.
	System.out.println("UserName : "+a2.userName+" Password : "+a2.pwd+" Pin : "+a1.pin);
}
}
