package enums.rules;

public class HowEnumWorks {

	enum CoffeSizeEnum {
		BIG, HUGE, OVERWHELMING
	}

	static class CoffeTest {
		CoffeSizeEnum coffeSizeEnum;
		CoffeSizeClass coffeSizeClass;
	}

	public static void main(String[] args) {
		CoffeTest test = new CoffeTest();
		test.coffeSizeEnum = CoffeSizeEnum.BIG;
		test.coffeSizeClass = CoffeSizeClass.BIG;
		System.out.println(test.coffeSizeEnum);
		System.out.println(test.coffeSizeClass);

	}

	static class CoffeSizeClass {

		public static final CoffeSizeClass BIG = new CoffeSizeClass("BIG", 0);
		public static final CoffeSizeClass HUGE = new CoffeSizeClass("HUGE", 1);
		public static final CoffeSizeClass OVERWHELMING = new CoffeSizeClass(
				"OVERWHELMING", 2);

		String name;

		public CoffeSizeClass(String name, int i) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}

	}
}
