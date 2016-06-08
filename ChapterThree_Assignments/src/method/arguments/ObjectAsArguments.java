package method.arguments;

public class ObjectAsArguments {

	public static void main(String[] args) {

		/**
		 * Passing object as argument is actually passing address of that object
		 * as bit pattern to the argument, so both of them are pointing to same
		 * object in heap
		 */
		ObjectAsArguments test = new ObjectAsArguments();

		AnyClass anyClass = new AnyClass(10);

		System.out.println("ObjectIDs -Before:"
				+ System.identityHashCode(anyClass));

		System.out.println("value " + anyClass.intValue);

		test.modifyValue(anyClass);

		System.out.println("ObjectIDs -after modifyValue:"
				+ System.identityHashCode(anyClass));

		System.out.println("after modifyValue " + anyClass.intValue);

		/**
		 * Method can change the state of the object passed as argument, but
		 * cannot let object passed as argument to point to different object.
		 * Not possible...
		 */
		
		test.modifyObject(anyClass);

		System.out.println("ObjectIDs -after modifyObjct:"
				+ System.identityHashCode(anyClass));

		System.out.println("after modifyObject " + anyClass.intValue);

	}

	public void modifyValue(AnyClass anyClass) {
		System.out.println("ObjectIDs - inside method:"
				+ System.identityHashCode(anyClass));
		anyClass.setIntValue(20);
	}

	public void modifyObject(AnyClass anyClass) {
		System.out.println("ObjectIDs - inside method:"
				+ System.identityHashCode(anyClass));
		anyClass = new AnyClass(30); // This is the local copy, so now it will
										// point to other object
		System.out.println("ObjectIDs - after new:"
				+ System.identityHashCode(anyClass));
	}
}

class AnyClass {

	int intValue;

	public AnyClass(int intValue) {
		super();
		this.intValue = intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}