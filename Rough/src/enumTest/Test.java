package enumTest;

public class Test {
public static void main(String args[]){
	Beer[] arr = Beer.values();
	for(Beer b : arr){
		System.out.print(b+"...."+b.getPrice()+".....");
		b.getName(b);
	}
	Integer  i = chk();
	System.out.println(i);
}
public static int chk(){
	return true?null:0;//null pointer exception because during autoUnboxing it will internally call xxxValue() method on null.
}
}
