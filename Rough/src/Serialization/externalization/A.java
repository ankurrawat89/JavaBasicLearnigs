package Serialization.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
//here public no argument constructor is must otherwise during deserialization it will give invalid class exception.
//here transient keyword does not play any role in case of externalizable implemented class as here total data is not saved by jvm instead programmer decide which values to save ..so if he does not want to include particular property toi be written to file he will not include that property in writeExternal() method.
//thus making properties as transient does not make any differnce in case of externalizable implemented class.
public class A implements Externalizable{
String name;
int  i;
int j;
transient String lastname;//irrespective of transient keyword value will be saved as this has been included in writeExternal() call
public A() {
	System.out.println("Default A constructor called");
}
public A(String name , int i , int j, String lastName){
	this .name = name;
	this.i = i;
	this.j = j;
	this.lastname = lastName;
}
public void writeExternal(ObjectOutput oo) throws IOException{
	oo.writeObject(name);
	oo.writeInt(i);
	oo.writeObject(lastname);
	//here we do not want to write j
}
public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException{
	name = (String)oi.readObject();
	i = oi.readInt();
    lastname = (String)oi.readObject();//if this call is omitted then last name will be printed as null(default value) when deserialized.
} 
}
