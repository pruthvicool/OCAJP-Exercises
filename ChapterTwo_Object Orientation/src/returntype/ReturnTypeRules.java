package returntype;

public class ReturnTypeRules {

	/**
	 * You can return null for object ref, not primitives
	 */
	public String methodWithObjectRefReturn() {
		return null;
	}

	public int methodWithPrimitiveRefReturn() {
		return null; // Not allowed
	}

	/**
	 * Array is perfectly legal return type as this is also an object
	 */
	public int[] getArray() {
		return new int[5];
	}

	/**
	 * In case of primitive return type, you can return implicitly converted
	 * return type
	 */
	public int getInt() {
		return 'c';
	}

	/**
	 * In case of primitive return type, with casting
	 */

	public int getIntTwo() {
		return (int) 5.5;
	}

	/**
	 * A method having object return type, you can return any subtype
	 */

	public Object getObject() {
		return new ReturnTypeRules();
	}

	
}
