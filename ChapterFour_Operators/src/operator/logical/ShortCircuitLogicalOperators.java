package operator.logical;

public class ShortCircuitLogicalOperators {

	public static void main(String[] args) {

		/**
		 * && and || are short circuit logical operators. if first condition is
		 * false for &&, it will not check second condition. <br>
		 * They only work on boolean operands.
		 */

		if (checkFirstCondition() && checkSecondCondition()) {

		}

		System.out.println();

		if (checkFirstCondition() || checkSecondCondition()) { // anyone can be
																// true
			System.out.println("pass");
		}
	}

	private static boolean checkSecondCondition() {
		System.out.println("checking Second condition");
		return true;
	}

	private static boolean checkFirstCondition() {
		System.out.println("checking first condition");
		return false;
	}
}
