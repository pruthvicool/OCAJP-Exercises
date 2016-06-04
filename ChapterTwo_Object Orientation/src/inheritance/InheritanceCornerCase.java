package inheritance;

public class InheritanceCornerCase implements Interface {

	@Override
	public void interfaceMethod() {

	}

}

class ChildClass extends InheritanceCornerCase implements Interface {

	/**
	 * Notice that Child class doesn't have to force full provide 
	 * implementation of interfaceMethod() because parent has done this job 
	 * for all of its child.
	 */
}

interface Interface {
	void interfaceMethod();
}++