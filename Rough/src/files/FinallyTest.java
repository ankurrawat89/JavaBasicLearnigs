package files;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;

public class FinallyTest {
public static void main(String args[]){
	System.out.println(getSecureRandom().nextInt(100000));
}
private  static SecureRandom getSecureRandom(){
	SecureRandom secureRandom=null;
	SecureRandom secureRandom1=null;
	try {
		SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG");
		byte[] randomBytes = new byte[128];
		secureRandomGenerator.nextBytes(randomBytes);
		int seedByteCount = 128;
		byte[] seed = secureRandomGenerator.generateSeed(seedByteCount);

		secureRandom1 = SecureRandom.getInstance("SHA1PRNG");
		secureRandom1.setSeed(seed);
		
	    } catch (NoSuchAlgorithmException e) {
	    	
	    }
	return secureRandom1;
}

}
