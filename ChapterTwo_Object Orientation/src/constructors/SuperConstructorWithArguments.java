package constructors;

public class SuperConstructorWithArguments {

}

class Parent {

	// Here, no default constructor

	public Parent(String s) {
	}
}

class Child extends Parent {

	// Compilation error as compiler cannot create default constructor
}

class AnotherChild extends Parent {

	// Compiler will not provide default constructor
	public AnotherChild() {
		super(); // Not allowed as parent is having argument constructor
	}
}

class ThirdChild extends Parent {
	public ThirdChild() {
		super("s"); // Allowed
	}
}