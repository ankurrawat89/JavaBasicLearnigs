package roughQuest;

public class Dog {
String name;
int weight;
Dog(String name, int weight){
	this.name = name;
	this.weight = weight;
}
@Override
	public boolean equals(Object obj) {
	System.out.println("inside equals");
	return this.name.equals(((Dog)obj).name);
	}
@Override
	public int hashCode() {
	System.out.println("inside hashcode()");
		return 12*weight+name.hashCode();
	}
}
