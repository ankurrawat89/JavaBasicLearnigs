package roughQuest;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
public static void main(String args[]){
	HashSet<Dog> dogSet = new HashSet<Dog>();
	Dog d1 = new Dog("A",10);
	Dog d2 = new Dog("B",20);
	Dog d3 = new Dog("C",30);
	Dog d4 = new Dog("A",20);
	boolean addFlag = false;
	addFlag = dogSet.add(d1);
	System.out.println(addFlag);
	addFlag = dogSet.add(d2);
	System.out.println(addFlag);
	addFlag = dogSet.add(d3);
	System.out.println(addFlag);
	addFlag = dogSet.add(d4);
	System.out.println(addFlag);
	Iterator<Dog> dogItr = dogSet.iterator();
	while(dogItr.hasNext()){
		Dog dogRef = dogItr.next();
		System.out.println(dogRef.name+":"+dogRef.weight);
	}
}
}
