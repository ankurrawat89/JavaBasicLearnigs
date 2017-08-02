package GeeksForGeeks.Bleak;

public class Test {
	//method to find number is not bleak i.e it can be represented in the form : n = x + countSetBits(x)
	static boolean bleakTest(int n){
		for(int x=1;x<n;x++){
			if(n == x+countSetBits(x)){
				return false;
			}
		}
		return true;
	}
	//method to count the number of 1's in binary representation of a number
	static int countSetBits(int n){
		int count = 0;
		while(n>0){
			count = count+(n & 1);
			n = n>>1;
		}
		return count;
	}
public static void main(String args[]){
	System.out.println(bleakTest(3));
	System.out.println(bleakTest(4));
}
}
