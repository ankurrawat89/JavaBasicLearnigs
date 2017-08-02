package generics.goldman;

import java.util.HashMap;

public class MyClass<T extends Tyre & Car> {
T obj;
MyClass(T obj){
	this.obj=obj;
}
MyClass(){
	
}
public T getObject(){
	return obj;
}
}
