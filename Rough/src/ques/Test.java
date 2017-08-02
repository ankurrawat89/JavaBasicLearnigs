package ques;

public class Test {
//Test t =  new Test();
public Test(){
	char[] charArr = null;
	//System.out.println(null); The method println(char[]) is ambiguous for the type PrintStream
	System.out.println("inside Test");
}
public int show(){
	return true?null:0;
}
public static void main(String args[]){
	Test t = new Test();
	int a = t.show();
	System.out.println(a);
}
}
