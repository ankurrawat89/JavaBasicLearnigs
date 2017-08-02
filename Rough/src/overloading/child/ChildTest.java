package overloading.child;

import overloading.parent.ParentTest;

public class ChildTest extends ParentTest{
	@Override
	public void print(int a){
		System.out.println("child int");
		System.out.println(a);
		
		}
}
