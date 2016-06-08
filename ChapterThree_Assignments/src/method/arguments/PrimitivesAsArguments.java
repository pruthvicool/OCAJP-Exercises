package method.arguments;

public class PrimitivesAsArguments {

	public static void main(String[] args) {

		int a = 1;

		PrimitivesAsArguments test = new PrimitivesAsArguments();

		System.out.println("Before : " + a + " ID: "
				+ System.identityHashCode(a));

		test.modify(a);

		System.out.println("after : " + a + " ID: "
				+ System.identityHashCode(a));

	}

	// Argument is a copy of passing variable.
	
	public void modify(int i) {

		System.out.println("------------------------------");
		System.out.println("before value change in method: " + i + " ID: "
				+ System.identityHashCode(i));
		/**
		 * Here, variable i is the local copy
		 */
		i += 1;
		System.out.println("afer value change in method: " + i + " ID: "
				+ System.identityHashCode(i));
		System.out.println("------------------------------");
	}
}
