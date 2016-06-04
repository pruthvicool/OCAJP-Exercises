package interfaces;

public class InheritanceWithAbstractClass {

}

abstract class AbstractClass implements Interface {
	// Abstract doesn't have to provide concrete implementation
}

class ConcreteClass extends AbstractClass {

	@Override
	public void methodWithException() throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodWithOtherException() throws IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String methodForSignature(String s, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
