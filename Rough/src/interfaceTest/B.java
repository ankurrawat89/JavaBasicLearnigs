package interfaceTest;

public class B implements A{
public static void main(String args[]){
	a.concat("Rawat");
	//b=10; since interface data members are by default final , hence can not be initialised here.
	System.out.println(a);
}
}
