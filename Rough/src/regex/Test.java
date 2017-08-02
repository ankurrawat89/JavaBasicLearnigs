package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {
		 private static String ATOM = "[^\\x00-\\x1F^\\(^\\)^\\<^\\>^\\@^\\,^\\;^\\:^\\\\^\\\"^\\.^\\[^\\]^\\s]";
		  private static String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)*";
		  private static String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";
		public static void main(String args[]){
			String value = "skdfhskjfhdskhfkdshkfdshkfshdfksdfksdfdsfsfgsjdfgjdsgfjsdgfjsgdjfkjdsfkdslhgfdhsdhdsghsdfh@gmail.com";
			  Pattern pattern = Pattern.compile("^" + ATOM + "+(\\." + ATOM + "+)*@" + DOMAIN + "|" + IP_DOMAIN + ")$", 2);
			  Matcher m = pattern.matcher(value);
			  System.out.println(m.matches());
			  System.out.println(value.length());
			 
			  }
}
