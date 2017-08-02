package Serialization.serializationWithInheritence.childImplSerializable;

public class Animal {
int i=10;
//default constructor is must, either need to be provided by programmer or jvm, otherwise while execution of instance control flow jvm will give run time exception of invalid class.
public Animal() {
	System.out.println("ANimal constructor called");
	i=11;
}
public Animal(int i){
	this.i = i;
}
}
