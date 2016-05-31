package constructor.rules;

public class ClassWithConstructor {

	/**
	 * Must share the same name as class and must not have return type
	 */
	ClassWithConstructor() {

	}

	/**
	 * Can have any access modifiers, except - static, final and abstract
	 */

	private ClassWithConstructor(int x) {

	}

	protected ClassWithConstructor(String x) {
	}

	/**
	 * Can also have var-args
	 */

	public ClassWithConstructor(int... x) {

	}
}
