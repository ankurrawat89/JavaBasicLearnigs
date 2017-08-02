package generics;

public class AnimalInterface<T extends Animal> {
private T ref;
public  T createAnimal(T animal){
	ref = animal;
	System.out.println(ref.getClass().getName()+" created");
	return ref;
}
/*public  T getAnimal(){
	return ref;
}*/
}
