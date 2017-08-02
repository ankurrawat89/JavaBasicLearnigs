package Serialization.objectGraph;

import java.io.Serializable;

public class Rat implements Serializable{
	int  i =10;
transient int j = 20;//since it is declared as transient it will not participate in serialization and will not be saved in serialized object
public Rat() {
	System.out.println("Rat constructor");
	j = 30;
	System.out.println("j is :"+this.j);
}
}
