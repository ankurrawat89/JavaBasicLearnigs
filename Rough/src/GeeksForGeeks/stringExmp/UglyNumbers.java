package GeeksForGeeks.stringExmp;

public class UglyNumbers {
public static int maxDivisible(int a, int b){
	while(a%b==0){
		a=a/b;
	}
	return a;
}
public static int isUgly(int input){
	input = maxDivisible(input, 2);
	input = maxDivisible(input, 3);
	input = maxDivisible(input, 5);
	return input==1?1:0;
}
public static void printUglyNumbers(int numbersRequired){
	int i=1;
	int count=0;
	while(count<numbersRequired){
		int uglyvalue = isUgly(i);
		if(uglyvalue==1){
			System.out.print(i+" ");
			count++;
		}
		i++;
	}
}
public static void main(String args[]){
	printUglyNumbers(150);
}
}
