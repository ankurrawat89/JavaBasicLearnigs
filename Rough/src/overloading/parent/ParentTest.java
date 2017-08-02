package overloading.parent;

public class ParentTest {
	public void print(int a){
		System.out.println("int");
		System.out.println(a);
		
		}
	//this method can also take null as a valid value..so if u uncomment this method compile time error will be there in Test class for p.print(null); saying ambigous call
	/*public  void print(int... a){
		System.out.println("var-arg int");
		System.out.println(a);
		
		} */
	public void print(Integer b){
		System.out.println("Integer");
		System.out.println(b);
	}
}
