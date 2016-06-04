package constructors;

public class DefaultConstructorRules {

}

class A {

	// Compiler will provide default constructor

}

class B {

	// Compiler will not provide default constructor

	public B() {
	}

	public B(String s) {
	}
}

class C {

	// Compiler will not provide default constructor

	public C(String s) {
	}
}

class D {

	// Yes. compiler will provide default constructor because,
	// Below method is not a constructor
	void D() {

	}
}