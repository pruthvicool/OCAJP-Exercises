package operator.relational;

/**
 * Relational operators are <,<=,>,>=, == and !=
 * 
 * Each expression having relational operators will result into boolean
 * 
 */
public class Test {

	public static void main(String[] args) {

		boolean b = 100 > 9;
		System.out.println(b);

		int x = 99;
		double y = 99.99;

		boolean result = x >= y;
		System.out.println(result);

		int i = 100;
		char c = 'N'; // 78
		System.out.println("int value of 'N' is: " + (int) c);
		System.out.println(i < c);
	}
}
