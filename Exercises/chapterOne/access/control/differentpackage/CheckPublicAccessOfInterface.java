package access.control.differentpackage;

import interfaces.rules.PublicAccessInterface;

public class CheckPublicAccessOfInterface {

	class CheckInterfaceAccess implements PublicAccessInterface {

		/**
		 * You can always access all interface methods, with or without public
		 * access.
		 */
		@Override
		public void methodWithoutPublicAccessModifier() {
			int i = DEFINED_CONSTANT;
			int j = implicitConstant;
			
			// You can not change the constant value because it is final 
			finalConstant = 2;
		}

		@Override
		public void methodWithPublicAccessModifier() {
			int i = DEFINED_CONSTANT;
			int j = implicitConstant;

		}

	}
}
