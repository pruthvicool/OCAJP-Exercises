package interfaces.rules;

public interface InterfaceRules {

	/**
	 * By default, all methods are "public" and "abstract"
	 * Only public and abstract are supported.
	 */

	void withoutPublicAccessModifier();

	public void withPublicAccessModifier();

	public abstract void withPublicAndAbstractModifier();
	
	private void withPrivateAccessModifier();
	
	protected void withProtectedAccessModifier();
	
	
	/**
	 * All variables, must be public, static and final = constants. <br>
	 * Interfaces can only declare constants and not instanceVariables
	 */
	public static final int CONSTANTS = 1;
	int instanceVariable = 1; // Allowed, but considered as constants only with
								// public access
	final int finaVariable; // Constants
	
	
	/**
	 * Interface methods must not be static
	 */

	static void staticMethod(); //

	public static void publicStaticMethod();

	/**
	 * Because Interface methods are "abstract", they can not be marked as
	 * "final", "strictfp", or "native"
	 */

	final void finalMethod();

	strictfp void strictFpMethod();

	native void nativeMethod();

	/**
	 * Interface can extend one or more interface
	 */

	interface ChildInterface extends PublicAbstractDefinationInterface,
			InterfaceRules, DefaultAccessInterface {

	}
	
	/**
	 * Interface can not extend classes, it can only extends intefaces
	 */
	
	interface ClassExtension extends CheckDefaultAccessOfInterfaceInSamePackage{
		
	}
	
	/**
	 *  Interface cannot implement another interface of class
	 */
	
	interface ChildImpl implements DefaultAccessInterface{
		
	}
	
	/**
	 * Interface types can be used polymorphically
	 */
	
}
