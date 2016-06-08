package defaultInitialization;

/**
 * 
 * Only instance variables are defined with default values. Not local variables.
 */

public class DefaultValueTest {

	int i = 0;

	int[] unIntializedArray;

	int[] initializedArray = new int[10];

	{
		int blockVariable;
		// System.out.println(blockVariable); // Requires initialization before
		// usage
	}

	public static void main(String[] args) {

		/**
		 * All primitive instance variables are assigned with default values
		 */
		DefaultValueTest test = new DefaultValueTest();
		System.out.println(test.i); // Default value of int is zero
		System.out.println(test.unIntializedArray); // Default value of any
													// object (array)
		// is null
		System.out.println(test.initializedArray); // Assigned

		for (int intValue : test.initializedArray) {
			/**
			 * But, all values inside initialized array will be default based on
			 * type
			 */
			System.out.println(intValue); // in our case, it is int[] so all
											// values will be zero
		}

	}
}
