package access.control;

/**
 * Abstract cannot be instantiated, only subclassed
 */
public class AccessAbstractClass extends AbstractClass {

	public AccessAbstractClass() {
		AbstractClass abstractClass = new AbstractClass();
		
		// But, can be compiled and run if you are not instantiating
		AbstractClass.someMethod();
	}

}
