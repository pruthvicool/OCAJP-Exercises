package interfaces.rules;

public interface PublicAccessInterface {

	/**
	 * By default, all Interface methods are "public" "abstract"
	 */
	void methodWithoutPublicAccessModifier();

	public void methodWithPublicAccessModifier();

	public static final int DEFINED_CONSTANT = 1;

	int implicitConstant = 1;
	
	final int finalConstant = 1;
}
