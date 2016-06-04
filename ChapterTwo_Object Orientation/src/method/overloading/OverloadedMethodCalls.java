package method.overloading;

public class OverloadedMethodCalls {

	public static void main(String args[]) {

		Test test = new Test();
		Parent parent = new Parent();
		Child child = new Child();

		test.doStuff(parent);
		test.doStuff(child);

		/**
		 * Output: do stuff with parent is called do stuff with Child is called
		 */

		Parent withChildRef = new Child();
		test.doStuff(withChildRef); // this will go by reference.. Means, parent
		// Because, this decision is not runtime, it is compiled time.

		/**
		 * Output : do stuff with parent is called
		 */

		System.out.println("===================================================");
		// ===================================================
		Parent p = new Parent();
		p.methodOfParent(); // methodOfParent

		Child c = new Child();
		c.methodOfParent(); // overridden of child

		Parent parentRef = new Child();
		parentRef.methodOfParent(); // Instance method, runtime, overridden of
									// child
		parentRef.methodOfParent("overloaded"); // compiled time, on reference type, can not find symbol

		Child child2 = new Child();
		child2.methodOfParent("overloaded"); // overloaded method in child

		Parent p2 = new Parent();
		p2.methodOfParent("overloaded"); // Can not find symbol
	}
}

class Parent {

	public void methodOfParent() {
		System.out.println("methodOfParent");
	}
}

class Child extends Parent {

	@Override
	public void methodOfParent() {
		System.out.println("overridden method in child");
	}

	public void methodOfParent(String s) {
		System.out.println("overloaded method in child");
	}
}

class Test {

	public void doStuff(Parent p) {
		System.out.println("do stuff with parent is called");
	}

	public void doStuff(Child c) {
		System.out.println("do stuff with Child is called");
	}
}
