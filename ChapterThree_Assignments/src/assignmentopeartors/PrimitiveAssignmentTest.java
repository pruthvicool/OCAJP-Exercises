package assignmentopeartors;

public class PrimitiveAssignmentTest {

	public static void main(String[] args) {

		/**
		 * All primitives are assign by value
		 */

		int a = 30;
		int b = a; // this will copy value (bit patterns) of 'a' into bit
					// patterns of 'b'
		System.out.println("Before == a: " + a + " b: " + b);
		b = 20; // Changing bit patter of 'b' won't change bit pattern of 'a'
		System.out.println("after == a: " + a + " b: " + b);
		
	}
}
