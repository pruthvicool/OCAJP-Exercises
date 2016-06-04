package polymorphism;

/**
 * A class which is passing more than two IS-A tests can be considered as
 * polymorphic. Meaning, all classes in Java is polymorphic.
 * 
 */
public class ISATestWithPolymorphism {

	public static void main(String args[]) {

		AnyClass anyClass = new AnyClass();
		System.out.println(anyClass instanceof AnyClass);
		System.out.println(anyClass instanceof Object);
	}

}

class AnyClass {

}
