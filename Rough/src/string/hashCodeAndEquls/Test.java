package string.hashCodeAndEquls;

import java.util.HashSet;

public class Test {
public static void main(String args[]){
	HashSet<Person> ref = new HashSet<Person>();
	System.out.println(ref.add(new Person("Ankur",20)));
	System.out.println(ref.add(new Person("Ankit",20)));
	System.out.println(ref);
}
}
