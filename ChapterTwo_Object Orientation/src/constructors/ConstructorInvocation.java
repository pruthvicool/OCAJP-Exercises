package constructors;

/**
 * 
 * Constructor chaining :
 * 
 * 1. object construct completes <br>
 * 2. First's instance variables are given their values <br>
 * 3. First's constructor completes <br>
 * 4. Second's instance variables are given their values <br>
 * 5. Second's constructor completes.
 * 
 * 
 */
public class ConstructorInvocation {

	public static void main(String args[]) {

		First first = new First(); // Calls only first's constructor

		System.out.println("---------------------");

		Second second = new Second(); // Calls first's and second's constructor

		System.out.println("---------------------");

		Third third = new Third(); // calls all three constructors

		System.out.println("---------------------");
		
		Concreate concreate = new Concreate(); // calling concreate first call's abstract constructor
	}
}

class First {
	public First() {
		System.out.println("first");
	}
}

class Second extends First {
	public Second() {
		System.out.println("Second");
	}
}

class Third extends Second {
	public Third() {
		System.out.println("Third");
	}
}

abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("AbstractClass");
	}

}

class Concreate extends AbstractClass {

	public Concreate() {
		System.out.println("Concreate");
	}
}
