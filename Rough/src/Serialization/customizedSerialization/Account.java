package Serialization.customizedSerialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
String userName = "Durga";
transient String pwd = "Anushka";
transient int pin = 1234;
private void writeObject(ObjectOutputStream oos) throws Exception{
	oos.defaultWriteObject();//to perform default serialization
	String epwd = "123"+pwd;
	int epin = 1111+pin;
	oos.writeObject(epwd);
	oos.writeInt(epin);
}
private void readObject(ObjectInputStream ois) throws Exception{
	ois.defaultReadObject();//to perform default deserialization
	String epwd = (String)ois.readObject();
	int epin = ois.readInt();
	pwd = epwd.substring(3);
	pin = pin-1111;
}
}
