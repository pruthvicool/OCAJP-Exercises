package polymorphism;

/**
 * Instance method will always be called on Object reference object and not the type.
 * Runtime, it will look up for which object reference to call because it is the instance
 * on which the method will be called.
 *
 */
public class InstanceMethodInvocationRule {

	public static void main(String args[]) {

		Parent p1 = new Parent();
		Child c1 = new Child();
		Parent p2 = new Child();
		// Child c2 = new Parent(); // Not legal (Implicit casting or
		// "upcasting")

		p1.call();
		c1.call();
		p2.call(); // Here, even if reference is parent, JVM will call child's method

		// Output predication
		/**
		 * call to parent 
		 * call to child 
		 * call to child
		 */
	}

}

class Parent {
	public void call() {
		System.out.println("call to parent");
	}
}

class Child extends Parent {

	@Override
	public void call() {
		System.out.println("call to child");
	}
}
