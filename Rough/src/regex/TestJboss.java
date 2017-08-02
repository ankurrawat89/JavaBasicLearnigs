package regex;

import java.net.IDN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestJboss {
	  private static String ATOM = "[a-z0-9!#$%&'*+/=?^_`{|}~-]";
	  private static String DOMAIN = ATOM + "+(\\." + ATOM + "+)*";
	  private static String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";

	  private static Pattern localPattern = Pattern.compile(ATOM + "+(\\." + ATOM + "+)*", 2);

	  private static Pattern domainPattern = Pattern.compile(DOMAIN + "|" + IP_DOMAIN, 2);

  public static void main(String args[]){
	  CharSequence testString = "skdfhskjfhdskhfkdshkfdshkfshdfksdfksdfdsfsfgsjdfgjdsgfjsdgfjsgdjfkjdsfkdslhgfdhsdhdsghsdfh@gmail.com";
	  System.out.println(isValid(testString));
  }
	  public static boolean isValid(CharSequence value)
	  {
	    if ((value == null) || (value.length() == 0)) {
	      return true;
	    }

	    String[] emailParts = value.toString().split("@");
	    if (emailParts.length != 2) {
	      return false;
	    }

	    if ((emailParts[0].endsWith(".")) || (emailParts[1].endsWith("."))) {
	      return false;
	    }

	  /*  if (!matchPart(emailParts[0], localPattern)) {
	      return false;
	    }*/

	    return matchPart(emailParts[1], domainPattern);
	  }

	  private static boolean matchPart(String part, Pattern pattern) {
	    try {
	      part = toASCII(part);
	    }
	    catch (IllegalArgumentException e)
	    {
	      return false;
	    }
	    Matcher matcher = pattern.matcher(part);
	    return matcher.matches();
	  }
	  public static String toASCII(String input) {
	        return toASCII(input, 0);
	    }
	  public static String toASCII(String input, int flag)
	    {
	        int p = 0, q = 0;
	        StringBuffer out = new StringBuffer();

	        while (p < input.length()) {
	            q = searchDots(input, p);
	           // out.append(toASCIIInternal(input.substring(p, q),  flag));
	            p = q + 1;
	            if (p < input.length()) out.append('.');
	        }

	        return out.toString();
	    }
	  private static int searchDots(String s, int start) {
	        int i;
	        for (i = start; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c == '.' || c == '\u3002' || c == '\uFF0E' || c == '\uFF61') {
	                break;
	            }
	        }

	        return i;
	    }
	  /*private static String toASCIIInternal(String label, int flag)
	    {
	        // step 1
	        // Check if the string contains code points outside the ASCII range 0..0x7c.
	        boolean isASCII  = isAllASCII(label);
	        StringBuffer dest;

	        // step 2
	        // perform the nameprep operation; flag ALLOW_UNASSIGNED is used here
	        if (!isASCII) {
	            UCharacterIterator iter = UCharacterIterator.getInstance(label);
	            try {
	                dest = namePrep.prepare(iter, flag);
	            } catch (java.text.ParseException e) {
	                throw new IllegalArgumentException(e);
	            }
	        } else {
	            dest = new StringBuffer(label);
	        }

	        // step 3
	        // Verify the absence of non-LDH ASCII code points
	        //   0..0x2c, 0x2e..0x2f, 0x3a..0x40, 0x5b..0x60, 0x7b..0x7f
	        // Verify the absence of leading and trailing hyphen
	        boolean useSTD3ASCIIRules = ((flag & USE_STD3_ASCII_RULES) != 0);
	        if (useSTD3ASCIIRules) {
	            for (int i = 0; i < dest.length(); i++) {
	                int c = dest.charAt(i);
	                if (!isLDHChar(c)) {
	                    throw new IllegalArgumentException("Contains non-LDH characters");
	                }
	            }

	            if (dest.charAt(0) == '-' || dest.charAt(dest.length() - 1) == '-') {
	                throw new IllegalArgumentException("Has leading or trailing hyphen");
	            }
	        }

	        if (!isASCII) {
	            // step 4
	            // If all code points are inside 0..0x7f, skip to step 8
	            if (!isAllASCII(dest.toString())) {
	                // step 5
	                // verify the sequence does not begin with ACE prefix
	                if(!startsWithACEPrefix(dest)){

	                    // step 6
	                    // encode the sequence with punycode
	                    try {
	                        dest = Punycode.encode(dest, null);
	                    } catch (java.text.ParseException e) {
	                        throw new IllegalArgumentException(e);
	                    }

	                    dest = toASCIILower(dest);

	                    // step 7
	                    // prepend the ACE prefix
	                    dest.insert(0, ACE_PREFIX);
	                } else {
	                    throw new IllegalArgumentException("The input starts with the ACE Prefix");
	                }

	            }
	        }

	        // step 8
	        // the length must be inside 1..63
	        if(dest.length() > MAX_LABEL_LENGTH){
	            throw new IllegalArgumentException("The label in the input is too long");
	        }

	        return dest.toString();
	    }*/
}
