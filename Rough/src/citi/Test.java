package citi;

import java.util.regex.Pattern;


public class Test {
public static  boolean validate(String s){
	String regex = "^[a-zA-Z]*$";
	Pattern pattern = Pattern.compile(regex);
	return pattern.matches(regex, s);
}
public static void main(String args[]){
	String str="abcDe0hGikjh1unmpanhshd";
	String match=null;
	if(str==null){
		return;
	}
	for(int i=0;i<str.length()-1;i++){
		for(int j=i;j<=str.length();j++){
			String subStr = str.substring(i, j);
			if(validate(subStr)){
				if(match==null){
					match=subStr;
				}
				else if(subStr.length()> match.length()){
					match=subStr;
				}
				
			}
			else{
				break;
			}
		}
	}
	System.out.println(match);
}
}
