package access.control.differentpackage;

import access.control.*;

public class AccessDefaultClassOutsideOfPackage extends ClassWithDefultAccess {

	public AccessDefaultClassOutsideOfPackage() {
		
		// It can not use default access class outside of this package
		ClassWithDefultAccess access = new ClassWithDefultAccess();
		
	}
}
