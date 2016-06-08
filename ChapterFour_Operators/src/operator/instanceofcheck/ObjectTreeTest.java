package operator.instanceofcheck;

public class ObjectTreeTest {

	public static void main(String[] args) {

		/**
		 * InstanceOf is IS-A relationship test, remains true for entire
		 * inheritance tree
		 */

		A a = new A();
		B b = new B();
		System.out.println(a instanceof Foo);
		System.out.println(a instanceof A);
		System.out.println(b instanceof Foo);
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println();
		System.out.println(a instanceof B);
	}
}

interface Foo {

}

class A implements Foo {

}

class B extends A {

}