package method.overriding;

import java.nio.channels.AcceptPendingException;

public class OverridingRules extends Parent {

	/**
	 * Argument list must match that of parent
	 */

	public void parentMethodWithArguments(String s, int i) {
		// do child specific work
	}

	/**
	 * Return type must be same as of parent
	 */
	public String methodWithReturnType() {
		// do child specific work
		return "String";
	}

	/**
	 * Access level can't be more restrictive
	 */

	private void parentMethodWithPublic() {
		// Can't reduce access level from public to private
	}

	/**
	 * Access level CAN BE less restrictive
	 */

	public void parentMethodWithProtected() {
		// Can increase restriction from protected to public
	}

	protected void parentMethodWithDefault() {
		// Can increase restriction from default to protected
	}

	/**
	 * Can override any method which is not marked as private or final
	 */

	private void parentMethodWithPrivate() { // This will not give any
												// compilation error

	}

	/**
	 * Overriding method CAN throw any unchecked exception regardless of whether
	 * it declares or not
	 */
	@Override
	public void parentMethodWithoutException() {
		if (true)
			throw new RuntimeException();
	}

	/**
	 * Overriding methods MUST NOT throw checked exception that are new of
	 * broader than those declared by overridden methods.
	 */
	public void parentMethodWithCheckedException() throws IllegalStateException {

		int i = 0;
		if (i < 10) {
			throw new IllegalAccessException(); // Not allowed to throw new
		} else {
			throw new AcceptPendingException(); // Allowed, bcz it is a child of
												// IllegalStateException
		}

	}

	/**
	 * Overriding methods CAN THROW narrower or fewer exceptions.
	 */
	public void parentMethodWithMultipleExceptions() {
		// child can narrow or throw fewer exception than parent
	}

	/**
	 * Can not override STATIC methods
	 */
	public static void parentStaticMethod() { // No compilation error, treated
												// as separate method
		System.out.println("childStaticMethod");
	}

	
	public static void main(String args[]) {

		Parent.parentStaticMethod();
		OverridingRules.parentStaticMethod();

	}
}

class Parent {

	public void parentMethodWithPublic() {

	}

	protected void parentMethodWithProtected() {

	}

	void parentMethodWithDefault() {

	}

	private void parentMethodWithPrivate() {

	}

	public final void parentMethodWithFinal() {

	}

	public void parentMethodWithArguments(String s, int i) {

	}

	public String methodWithReturnType() {
		return "";
	}

	public void parentMethodWithoutException() {

	}

	public void parentMethodWithCheckedException() throws IllegalStateException {

	}

	public void parentMethodWithMultipleExceptions()
			throws IllegalStateException, ArrayIndexOutOfBoundsException,
			IllegalArgumentException {
	}

	public static void parentStaticMethod() {
		System.out.println("parentStaticMethod");
	}
}
