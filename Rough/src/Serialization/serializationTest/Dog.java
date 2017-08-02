package Serialization.serializationTest;

import java.io.Serializable;
//class should implements Serializable interface to get its object serialzed.Otherwise class will compile bot will give runtime exception when try to serialize its object
public class Dog implements Serializable {
/*v imp if you have serialized the object before giving any serial version id and after that you have added serial version id to the class, 
	now when you try to deserialze the object you will get an error : 
	java.io.InvalidClassException: Serialization.serializationTest.Dog; local class incompatible: stream classdesc serialVersionUID = -5875616817669470286, 
	local class serialVersionUID = 1*/
private static final long serialVersionUID = 1L;
public int i = 10;
public int j = 20;
public transient int k = 30;
public static int l = 50;
public static transient int m = 60; //since static variable do not participate in serialization making them as transient is of no use as their value will always be fetched from class level method area and hence will always give the original value in the deserialized object.
public final int n = 70;
public final transient int o = 80; //since final variable are replaced by its value at compile time only, so during serialization they will directly go as a value in the serialized object and not as a varibale.Hence marking it as transient will not make any difference as transienet only applies to varibale and final varibale is not variable anymore but its a value now.
public Dog() {
	k = 40;
}
}
