package access.control;

/**
 * Default access are allowed within same package. <br>
 * No need import statement.
 * 
 */
public class AccessDefaultClassInsideSamePacakge extends ClassWithDefultAccess {

	public AccessDefaultClassInsideSamePacakge() {
		ClassWithDefultAccess access = new ClassWithDefultAccess();
	}
}
