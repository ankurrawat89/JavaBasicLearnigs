package generics.wildCard;

import java.util.ArrayList;

public class Test {
public static void m1(ArrayList<? super Dog> ref){
	System.out.println(ref);
	ref.add(null);
	ref.add(new Dog());
	ref.add(new DangerDog());
	//ref.add(new Cat());can only add null,Dog or its subtypes
	}
public static void m2(ArrayList<? extends Animal> ref){
	System.out.println(ref);
	ref.add(null);///only valid argument for add method
}
public static void m3(ArrayList<? super Animal> ref){
	System.out.println(ref);	
	ref.add(null);
	ref.add(new Ambhibians());
	ref.add(new Dog());
	ref.add(new DangerDog());
	ref.add(new Cat());
	//ref.add(new Carnivorous());can add only null,Animal and its implementation classes
	}
public static void main(String args[]){
	ArrayList<Animal> animal = new ArrayList<Animal>();
	ArrayList<Dog> dogArr = new ArrayList<Dog>();
	ArrayList<Cat> catArr = new ArrayList<Cat>();
	ArrayList<Carnivorous> arr = new ArrayList<Carnivorous>();
	Test.m1(animal);
	Test.m1(dogArr);
	//Test.m1(catArr);can take only ArrayList of type Dog or its super types
	Test.m2(animal);
	Test.m2(dogArr);
	Test.m2(catArr);
	//Test.m2(arr);can take only ArrayList of type Animal And its implementation classes as the argument
	Test.m3(animal);
	//Test.m3(arr);
	//Test.m3(catArr);can take only Animal or Carnivorous in this case
}
}
