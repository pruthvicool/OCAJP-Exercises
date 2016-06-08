package assignmentopeartors;

public class StringObjectAssignments {

	/**
	 * Strings are immutable objects,
	 */
	public static void main(String[] args) {

		String x = "Java";
		String y = x; // Both points to same object in heap

		System.out.println("Before x: " + x + " y:" + y);
		System.out.println("Object ref before x: " + System.identityHashCode(x)
				+ " y:" + System.identityHashCode(y));

		/*
		 * Changing something to one reference will create new object to that
		 * reference
		 */

		y += "Bean";

		System.out.println("Before x: " + x + " y:" + y);
		System.out.println("Object ref after x: " + System.identityHashCode(x)
				+ " y:" + System.identityHashCode(y));

	}

}
