package method.overloading;

public class OverloadingRules {

	public void method() {

	}

	/**
	 * Overloaded method must change argument list
	 */
	public void method() {
		// Not allowed
	}

	public void method(String s) {
		// Allowed
	}

	/**
	 * Overloaded method CAN change return type
	 */
	public String method() { // Duplicate by arguments, not allowed
		return "";
	}

	public String method(int i) {
		return "";
	}

	/**
	 * Overloaded method can change Access modifier
	 */
	private void method(int i, int j) {

	}

	/**
	 * Overloaded method can declare new or broader checked exception
	 */
	public void method(String s1, String s2) throws RuntimeException {

	}

	/**
	 * Method can be overloaded by same class and also by subclass
	 */
	public static void main(String args[]) {
		SubClass child = new SubClass();
		child.method(); // To parent
		child.method(6.0); // To child
	}
}

class SubClass extends OverloadingRules {

	public void method(double d) {
	}
}