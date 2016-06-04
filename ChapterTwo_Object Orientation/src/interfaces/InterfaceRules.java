package interfaces;

public class InterfaceRules implements Interface {

	/**
	 * Provide concrete implementation of all interface methods
	 */

	/**
	 * follow rules of legal overrides, like Declare no check exception on
	 * implementation methods other than those declared by the interface methods
	 */
	@Override
	public void methodWithException() throws IllegalAccessException {

	}

	/**
	 * Maintain signature of the method with return type
	 */

	@Override
	public String methodForSignature(String s, int i) {
		return null;
	}

	/**
	 * It is allowed to ignore throws declaration
	 */
	@Override
	public void methodWithOtherException() {

	}

}

interface Interface {

	void methodWithException() throws RuntimeException;

	void methodWithOtherException() throws IllegalStateException;

	String methodForSignature(String s, int i);
}