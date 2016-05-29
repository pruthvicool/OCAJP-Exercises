package access.control;

/**
 * One can access and use final class but can not extend it
 * 
 */
public class AccessFinalClass {

	public AccessFinalClass() {
		FinalClass finalClass = new FinalClass();
		finalClass.someMethod();
	}

	
	class ExtendedFinalClass extends FinalClass {

	}
}
