package primitive.assignments;

public class RuleOfExpression {

	public static void main(String[] args) {

		/**
		 * an expression involving anything int-sized or smaller will always
		 * result in int
		 */

		byte b1 = 3;

		byte b2 = 3;

		byte c = b1 + b2; // Compilation error

		short s1 = 1;
		short s2 = 2;

		short s3 = s1 + s2;
	}
}
