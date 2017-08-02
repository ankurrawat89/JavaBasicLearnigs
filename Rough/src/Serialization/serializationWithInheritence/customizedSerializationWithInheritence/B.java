package Serialization.serializationWithInheritence.customizedSerializationWithInheritence;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class B extends A implements Serializable{
	int b =20;
	public B() {
		System.out.println("B constructor");
	}
	private void writeObject(ObjectOutputStream oos) throws Exception{
	}
	private void readObject(ObjectInputStream ois) throws Exception{
	}
	
	//here we have provided our cutomized serialization and also does not included the call to defult serialization..so default value will be stored in serialized object.
}
