package operator.equality;

public class StringEquality {

	public static void main(String[] args) {

		String s1 = "Bob";
		String s2 = "Bob";

		System.out.println(s1 == s2); // true

		/**
		 * in case of String, equals() method is overridden to check values
		 */

		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1 == o2);

		/**
		 * Check whether == calls equals or not
		 */

		AnyClass a1 = new AnyClass(10);
		AnyClass a2 = new AnyClass(10);
		System.out.println(a1 == a2); // It will not trigger equals() methods
		System.out.println(a1.equals(a2));
	}
}

class AnyClass {

	int value;

	public AnyClass(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		return (this.value == ((AnyClass) obj).value);
	}
}