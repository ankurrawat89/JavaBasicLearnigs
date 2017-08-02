package exception.finallyTest;

public class A {
	int i=0;
public int getValue(){
	try{
		int a = 9/0;
		return 1;
	}
	catch(Exception e){
		return 3;
	}
	finally{
		
		return 2;
	}
}
}
