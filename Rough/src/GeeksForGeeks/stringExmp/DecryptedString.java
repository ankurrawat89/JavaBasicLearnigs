package GeeksForGeeks.stringExmp;

public class DecryptedString {
public static char getKthCharacter(String str,int position){
	StringBuilder decryptedString= new StringBuilder();
	StringBuilder currentString = new StringBuilder();
	for(int i=0;i<str.length();i++){
		char a = str.charAt(i);
		if(a>=49 && a<=57){
			int freq = 0;
			while(str.charAt(i)>=49 && str.charAt(i)<=57){
				freq=freq*10+Character.getNumericValue(str.charAt(i));
				i++;
				if(i>=str.length()){
					break;
				}
			}
			i--;
			int iterations = 1;
			/*while(iterations<Character.getNumericValue(str.charAt(i))){
				decryptedString.append(currentString);
				iterations++;
			}*/
			while(iterations<freq){
				decryptedString.append(currentString);
				iterations++;
			}
			currentString.delete(0, currentString.toString().length());
		}
		else{
		currentString.append(a);
		decryptedString.append(a);
		}
		System.out.println(decryptedString.toString());
	}
	
	return decryptedString.toString().charAt(position-1);
}
public static void main(String args[]){
	char characterFound = DecryptedString.getKthCharacter("abz12cd3e5", 5);
	System.out.println(characterFound);
}
}
