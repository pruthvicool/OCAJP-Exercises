package assignmentopeartors;

public class AssignmentTest {

	public static void main(String[] args) {

		/**
		 * Any expression involving int-sized or lower size variable, result
		 * will always be int
		 */
		byte b = 3;
		b += 7;  // compiler won't create any problem
		
		byte b2 = 3; 
		b2 = b2+3 // Compiler report issue because resulting express is int
		b2 = (byte) (b2+3); // Explicit cast requires 
		
		/**
		 * +=, -=, *= ... operators does casting by default
		 */
		
		
	}
}
