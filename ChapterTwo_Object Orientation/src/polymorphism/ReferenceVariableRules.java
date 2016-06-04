package polymorphism;

public class ReferenceVariableRules {

	public static void main(String args[]) {

		/**
		 * reference variable can be only one type, Once declared, that type can
		 * never be changed.
		 */
		Class referenceVariable = new Class(); // Obj 1
		referenceVariable = new OtherClass(); // Not allowed, you can never
												// change its type

		/**
		 * Reference is a variable, so it can be reassigned
		 */
		referenceVariable = new Class(); // Obj 2

		/**
		 * reference variable's type can determine methods which are allowed to
		 * invoked.
		 */
		/**
		 * reference variable can refer to any subtype
		 */
		Class parent = new Class();
		parent.callToParent(); // Parent can only invoke, its method
		parent.callToChild(); // not found

		ChildClass child = new ChildClass();
		child.callToChild(); // child can call its method
		child.callToParent(); // Child can also call its parent (inheritance)

		Class newchild = new ChildClass(); // Parent reference with child
		newchild.callToParent(); // Only parent method is allowed and visible,
									// not child's

		/**
		 * reference variable can be declared as class type or interface type in
		 * case of interface type, it can take any implementation
		 */
		
		Interface interfaceReference = new FirstImpl();
		Interface interfaceSecondReference = new SecondImpl();
	}
}

class Class {

	void callToParent() {

	}
}

class ChildClass extends Class {

	void callToChild() {

	}
}

class OtherClass {

}

interface Interface {
	void methodOfInterface();
}

class FirstImpl implements Interface {

	@Override
	public void methodOfInterface() {
		
	}

}

class SecondImpl implements Interface{

	@Override
	public void methodOfInterface() {
		// TODO Auto-generated method stub
		
	}
	
}