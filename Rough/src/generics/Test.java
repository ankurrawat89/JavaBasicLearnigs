package generics;

public class Test {
	
public static void main(String[] args) {
	AnimalInterface<Animal> obj = new AnimalInterface<Animal>();
	Dog dog = (Dog)obj.createAnimal(new Dog());
}
}
