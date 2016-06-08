package operator.equality;

public class EqualsMethodTest {

	public static void main(String[] args) {

		/**
		 * For String, equal method will compare values Values are case
		 * sensitive
		 */
		System.out.println("String1".equals("String1")); // true
		System.out.println("Bob".equals("bob")); // False - case sensitive

		/**
		 * For Object, it will call equals and allow developer to implement
		 */
		DumbEquals d1 = new DumbEquals(10);
		DumbEquals d2 = new DumbEquals(10);
		DumbEquals d3 = new DumbEquals(50);
		System.out.println(d1.equals(d2)); // True for all comparision
		System.out.println(d2.equals(d3));
	}
}

class DumbEquals {

	private int value;

	public DumbEquals(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
