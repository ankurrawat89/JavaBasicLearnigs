package string;

public class StringTest {

public static void main(String args[]){
	String s1 = new String("ankur");
	String s2 = new String("ankur");
	String s5 = s1.toLowerCase();
	String s7 = s1.toUpperCase();
	String s8 = s7.toLowerCase();//as here toLowerCase is performd on String s7 which is "DURGA" and now the result String is "durga" so the content changes thus a new Object will be created in this case
	System.out.println(s1==s2);//false : as both object are different
	System.out.println(s1==s5);//true : as during runtime there is no change in content so it will point to the existing String object pointed by s1
	System.out.println(s2==s5);//false : as both object are different
	System.out.println(s1==s8);//false : as both object are different 
	System.out.println(s2==s8);//false : as both object are different
	String s3 = "ankur1";
	String s4 = "ankur1";
	String s6 = s3.toLowerCase();
	System.out.println(s3==s4);//true : as in scp area before craeting Styring jvm first checks whether any String object is there with same content then it does not create new String in scp area bt points to the existing one.
    System.out.println(s3==s6);//true
    System.out.println(s4==s6);///true
    StringBuffer sb1 = new StringBuffer();
    System.out.println(sb1.capacity());//16:initial default capacity
    sb1.append("abcdefghijklmnopqrstuvwxyz");
    System.out.println(sb1.capacity());//34 : (new capacity = curretncapacity+1)*2 as soon as u try to inesert 17th character the capacity of increase will increase by the providde formula
    StringBuffer sb2 = new StringBuffer("durga");
    System.out.println(sb2.capacity());//21 : capacity = stringlength+16
   
}
}
