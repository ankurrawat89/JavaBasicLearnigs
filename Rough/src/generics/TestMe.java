package generics;

import java.util.ArrayList;

public class TestMe {
public static void main(String args[]){
	ArrayList<String> l = new ArrayList<String>();
	l.add("ankur");
	//since here l is generic to accept only strings so no other type can be added to it
	//l.add(10); compile time error
	m1(l);
	m2(l);
	//m3(l); CE: as type parameter do not support polymorphism
	m4(l);//can pass any type of aarayList to this method
	//m5(l); CE:  As only arraylist of type number and its child can passed to it
	m5(new ArrayList<Integer>());
	m5(new ArrayList());
	m6(new ArrayList<Integer>());
	m6(new ArrayList<Number>());
	m6(new ArrayList<Object>());
	System.out.println(l);
	System.out.println(l.get(3)); //run time type casting error as Integer can not be cast to String
	
	ArrayList<?> arr = new ArrayList<String>();
	arr.add(null);
	//arr.add("Ankur"); CE: can add only null
	ArrayList<? extends Number> arr1 = new ArrayList<Integer>();
	arr.add(null);
	//arr.add(Integer.valueOf(10)); //CE: can add only null
	//ArrayList<T> arr3 = new ArrayList<String>(); can not take type parameter in declaration
}
public static void m1(ArrayList l){
	//since here l is non generic so anything can be added to it
	l.add(null);
	l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);
}
public static void m2(ArrayList<String> l){
	//since here l is a arraylist whicjh takes only strings so here only string and null could be added
	l.add(null);
	l.add("rawat");
	/*l.add(10);
	l.add(true);
	l.add(10.5);*/
}
public static void m3(ArrayList<Object> l){
	//since here l is a arraylist which takes object so anything can be added to it
	l.add(null);
	l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);
}
public static void m4(ArrayList<?> l){
	//here you can pass any list but can only add null to it..main purpose of it is to read the arrayList
	l.add(null);
	/*l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);*/
}
public static void m5(ArrayList<? extends Number> l){
	//here you can pass  list which takes Number or its children but can only add null to it..main purpose of it is to read the arrayList
	l.add(null);
	/*l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);*/
}
public static void m6(ArrayList<? super Integer> l){
	//here you can pass list of type Integer or its SuperType like Number,Object and can  add null and Integer to it but not Number
	l.add(null);
	l.add(10);
	l.add(Integer.valueOf(10));
	l.add(new Integer(10));
	Number n = 10;
	//l.add(n); can not add Number
	//l.add(new Object()); can not add Object
	/*l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);*/
}
public static <T> void m7(ArrayList<T> l,T param){
	//here you can pass anyList but only null can be added
	l.add(null);
	l.add(param);
/*	l.add(10);
	l.add(Integer.valueOf(10));
	l.add(new Integer(10));
	Number n = 10;
	l.add(n);
	l.add(new Object());
	l.add("rawat");
	l.add(10);
	l.add(true);
	l.add(10.5);*/
}
}
