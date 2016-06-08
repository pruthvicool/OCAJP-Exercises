package operator.instanceofcheck;

public class IncompatibleTypesTest {

	/**
	 * Instanceof with incompatible types will result in compilation error
	 */

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		System.out.println(a instanceof B); // Compilation error
		System.out.println(b instanceof B);
	}
}

class A {

}

class B {

}
