package operator.logical;

public class LogicalOperators {

	public static void main(String[] args) {

		if (checkFirstCondition() & checkSecondCondition()) {

		}

		System.out.println();

		if (checkFirstCondition() | checkSecondCondition()) { // anyone can be
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
