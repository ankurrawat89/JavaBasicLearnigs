package string.hashCodeAndEquls;

public class Person {
private String name;
private int age;
public Person(String name,int age){
	this.name = name;
	this.age =  age;
}
public String toString(){
	return this.name+" "+this.age;
}
public boolean equals(Object o){
	Person p;
	if(this==o){
		return true;
	}
	if(o instanceof Person){
		p=(Person)o;
		if(this.age == p.age){
			return true;
		}
	}
	return false;
}
public int hashCode(){
	return this.age;
}
}
