package GeeksForGeeks.stringExmp;

import java.util.HashSet;

public class PatternMatching {
public static boolean match(String str, String pattern){
	boolean matchFound = true;
	HashSet<Character> patternSet = new HashSet<Character>();
	for(int i=0;i<pattern.length();i++){
		patternSet.add(pattern.charAt(i));
		}
	StringBuilder modifiedString = new StringBuilder(str);
	for(int i=modifiedString.length()-1;i>=0;i--){
		if(!patternSet.contains(modifiedString.charAt(i))){
			modifiedString.deleteCharAt(i);
		}
	}
	System.out.println("Modifed String after dleting characters not present in pattern : "+modifiedString.toString());
	for(int i=modifiedString.length()-1;i>0;i--){
		if(modifiedString.charAt(i)==modifiedString.charAt(i-1)){
			modifiedString.deleteCharAt(i);
		}
	}
	System.out.println("Modifed String after dleting duplicate characters : "+modifiedString.toString());
	if(modifiedString.length()!=pattern.length()){
		System.out.println("Pattern and String do not match.");
		matchFound=false;
	}
	for(int i=0;i<modifiedString.length();i++){
		if(modifiedString.charAt(i)!=pattern.charAt(i)){
			matchFound =  false;
			break;
		}
	}
	return matchFound;
}
public static void main(String args[]){
	System.out.println(PatternMatching.match("engineers rock", "er"));
	System.out.println("-----------------------------------------------------------------");
	System.out.println(PatternMatching.match("engineers rock", "egr"));
}
}
