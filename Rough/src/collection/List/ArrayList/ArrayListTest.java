package collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
public static void main(String args[]){
	ArrayList l = new ArrayList();
	l.add("A");
	l.add(10);
	l.add("A");
	l.add(null);
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	System.out.println(l.get(2));
	//System.out.println(l.get(3)); index out of bound
	l.add(2, "M");
	System.out.println(l);
}
}
