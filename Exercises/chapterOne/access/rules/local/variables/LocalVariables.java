package access.rules.local.variables;

public class LocalVariables {

	void someMethod() {

		/**
		 * Only "final" and default access modifier is permitted to local
		 * variables.
		 */

		int defaultLocal = 1;

		final int finalLocal = 1;

		public int publicLocal = 1;

		private int privateLocal = 1;

		protected int protectedLocal = 1;

	}
}
