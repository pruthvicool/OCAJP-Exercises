package variable.shadowning;

public class PrimitiveTest {

	static int size = 7;

	// Using same variable name as argument
	static void changeIt(int size) {
		size = size + 200;
		System.out.println("size in changeIt(): " + size); // This will be local
															// copy
	}

	public static void main(String[] args) {

		System.out.println("size value : " + size);

		changeIt(size);

		System.out.println("after size value : " + size);

	}

}
