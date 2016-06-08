package operator.increment.decrement;

public class Test {

	static int players = 0;

	public static void main(String[] args) {

		System.out.println("players online " + players++); // 0

		// 1

		System.out.println("The value of Player is " + players); // 1

		System.out.println("The value of player is now " + ++players); // 2

		testTwo();
	}

	private static void testTwo() {

		int x = 2, y = 3;

		// False | true
		if ((y == x++) | (x < ++y)) {
			System.out.println("x= " + x + " y= " + y);
		}
	}
}
