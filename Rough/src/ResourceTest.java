import java.net.URL;

public class ResourceTest {
public static void main(String args[]){
	ResourceTest ref= new ResourceTest();
	Class clazz = ref.getClass();
	URL fileUrl = clazz.getResource(".");
	System.out.println(fileUrl);
}
}
