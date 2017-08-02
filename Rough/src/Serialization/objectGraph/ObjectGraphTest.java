package Serialization.objectGraph;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphTest {
	//Here Dog , Cat , Rat all the three classes must implemnet Serializable interface otherwise during serializing the dog object it will give runtime error for not serializable exception forthe particular class which will not be implementing the srializable interface.
public static void main(String args[]) throws Exception{
	Dog d1 = new Dog();
	FileOutputStream fos = new FileOutputStream("abc1.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);//here all the three dog,cat and rat object will be serialized
	FileInputStream fis = new FileInputStream("abc1.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();
	System.out.println(d2.c.r.i+"......"+d2.c.r.j);
}
}
