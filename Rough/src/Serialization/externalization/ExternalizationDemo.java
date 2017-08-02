package Serialization.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {
public static void main(String args[]) throws Exception{
	A a  = new A("Ankur",10,20,"Rawat");
	System.out.println("name  : "+a.name+" i : "+a.i+" j : "+a.j+"Last Name : "+a.lastname);
	FileOutputStream fos  = new FileOutputStream("externalizationFile.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a);//since a ref is of type A which implements Externizable interface so writeExternal will be called and only properties mentioned in this method will go to file
	FileInputStream fis = new FileInputStream("externalizationFile.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	A a1 = (A)ois.readObject();//Here jvm will create the new object (by calling the public no argumenmt constructor of the wexternalizable implemented class) with default values of instance variable and after that the readExternal will be called and the mentioned properties values will be assigned to yhe current object.
	System.out.println("name  : "+a1.name+" i : "+a1.i+" j : "+a1.j+"Last Name : "+a1.lastname);
}
}
