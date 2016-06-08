package variable.shadowning;

public class ObjectTest {

	// Make instance variable
	Foo foo = new Foo();

	// copy of original variable - in this case copy of reference
	void changeIt(Foo foo) {
		System.out.println("foo.barNumber before assignment in changeIt(): "
				+ foo.barNumber);
		foo.barNumber = 10; // Same object but values are updated.
		System.out.println("foo.barNumber in changeIt(): " + foo.barNumber);

		foo = new Foo(); // New object but it is still local
		foo.barNumber = 20;
		System.out.println("foo.barNumber in changeIt() is now: "
				+ foo.barNumber);
	}

	public static void main(String[] args) {

		ObjectTest test = new ObjectTest();
		System.out.println("test.foo.barNumber is " + test.foo.barNumber);
		test.changeIt(test.foo);
		System.out.println("test.foo.barNumber after changeIt is "
				+ test.foo.barNumber);
	}
}

class Foo {

	int barNumber; // Default to zero
}