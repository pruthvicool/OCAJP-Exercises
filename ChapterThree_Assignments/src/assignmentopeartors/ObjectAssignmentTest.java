package assignmentopeartors;

public class ObjectAssignmentTest {

	public static void main(String[] args) {

		/**
		 * You can use a reference variable to refer any object that is subclass
		 * of declared reference type
		 */

		Foo foo = new Bar(); // Allowed, bar is subclass of foo
		// Bar bar = new Foo(); // Not allowed

		/**
		 * Object assignments are by reference
		 */

		Class firstRef = new Class(10);
		Class secondRef = firstRef;

		System.out.println("Before == firstRef: " + firstRef.i + " secondRef: "
				+ secondRef.i);
		System.out.println("Object ref before - firstRef: "
				+ System.identityHashCode(firstRef) + " SecondRef:"
				+ System.identityHashCode(secondRef));

		secondRef.setI(20); // Both reference point to same object in heap

		System.out.println("Before == firstRef: " + firstRef.i + " secondRef: "
				+ secondRef.i);
		System.out.println("Object ref after - firstRef: "
				+ System.identityHashCode(firstRef) + " SecondRef:"
				+ System.identityHashCode(secondRef));

	}

}

class Class {

	int i;

	public Class(int i) {
		this.i = i;
	}

	public void setI(int i) {
		this.i = i;
	}
}