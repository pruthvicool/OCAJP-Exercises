package operator.compound;

public class Test {

	public static void main(String[] args) {

		/**
		 * In one expression, operators will take precedence
		 */
		int x = 10;
		x = x + 2 * 5; // first * will take precedence
		System.out.println(x);

		int y = 10;
		y = (y + 2) * 5; // first () will take precedence
		System.out.println(y);
	}
}
