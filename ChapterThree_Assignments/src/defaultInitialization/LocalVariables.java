package defaultInitialization;

public class LocalVariables {

	public static void main(String[] args) {

		/**
		 * Local variables are required to be assigned before use
		 */
		int i;
		Object o;
		Object unUsedVariable; // compiler allows it as this is not used yet

		int[] array;

		System.out.println(i); // Compiler error
		System.out.println(o); // Compiler error
		System.out.println(array); // Compiler error

		// ---------------

		/**
		 * Compiler will not do runtime decisions, so it will report error
		 */

		if (args[0] != null) {
			i = 10;
		}

		int y = i; // compiler can not take judgment
	}
}
