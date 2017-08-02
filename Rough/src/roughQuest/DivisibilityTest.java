package roughQuest;

public class DivisibilityTest {
public static void main(String args[]){
	for(int i=1;i<=100;i++){
		if(i%3==0&&i%5==0){
			System.out.println(i+" divisible by 3 nd 5");
		}
		else if(i%3==0){
			System.out.println(i+" divisible by 3");
		}
		else if(i%5==0){
			System.out.println(i+" divisible by 5");
		}
	}
}
}
