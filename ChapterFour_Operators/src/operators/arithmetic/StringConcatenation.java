package operators.arithmetic;

public class StringConcatenation {

	public static void main(String[] args) {

		String a = "String";

		int b = 3;

		int c = 7;

		System.out.println(a + b + c); // String37
		System.out.println("" + b + c); //37
		System.out.println(b + c); //10
	}
}
