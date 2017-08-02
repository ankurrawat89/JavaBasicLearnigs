package Serialization.serialVersionUidTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class Receiver {
public static void main(String args[]) throws Exception{
	FileInputStream fis = new FileInputStream("sender.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();
	System.out.println("i : "+d2.i+" j : "+d2.j);
}
}


/*
 Notes : 
   
 1.Sender serialized the Object in which k field was not present, now you added new field in Dog class at receiver side,so receiver now have the different version of class file, here on
  de-serialization k value will be 0
  
 2.
 */