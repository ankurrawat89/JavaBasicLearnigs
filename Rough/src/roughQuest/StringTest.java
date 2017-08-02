package roughQuest;

public class StringTest {
public static void main(String args[]){
	String s1 = new String("Ankur1");
	String s2 = "Ankur1";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1==s2);
	float a = 'a';
	double b = 'a';
	System.out.println(a);
	System.out.println(a==b);
	Boolean x = new Boolean("tRue");
	Boolean y = new Boolean("TRUE");
	System.out.println(x+" : "+y);
	System.out.println(x.equals(y));
	Integer i = new Integer('a');
	Boolean m = Boolean.parseBoolean("ANkur");
	System.out.println(m);
}
}
