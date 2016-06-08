package operator.logical;

public class ExorOperator {

	public static void main(String[] args) {
		
		/**
		 * XOR ^ will be true only if there is only one operand is true
		 */
		System.out.println(true ^ false); // true, One must be true
		System.out.println(false ^ false); // false
		System.out.println(true ^ true); // False
		System.out.println(false ^ true); // true
	}
}
