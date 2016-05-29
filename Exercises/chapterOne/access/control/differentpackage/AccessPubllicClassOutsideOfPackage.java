package access.control.differentpackage;

import access.control.*;

public class AccessPubllicClassOutsideOfPackage extends ClassWithPublicAccess {

	public AccessPubllicClassOutsideOfPackage() {
		
		// It can use public access class outside of this package
		// It requires import statement
		ClassWithPublicAccess access = new ClassWithPublicAccess();
		
	}
}
