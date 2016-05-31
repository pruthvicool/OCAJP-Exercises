package enums.rules;

public class EnumHavingConstructorAndMethods {

	Coffesize coffesize;

	public enum Coffesize {

		BIG(8), HUGE(10), OVERWHELMING(16) {

			@Override
			public String getLidCode() {
				return "B";
			}
		};

		private int ounce;

		Coffesize(int ounce) {
			this.ounce = ounce;
		}

		public int getOunce() {
			return this.ounce;
		}

		public String getLidCode() {
			return "A";
		}
	}

	public static void main(String[] args) {

		EnumHavingConstructorAndMethods testOne = new EnumHavingConstructorAndMethods();
		testOne.coffesize = Coffesize.BIG;

		EnumHavingConstructorAndMethods testTwo = new EnumHavingConstructorAndMethods();
		testTwo.coffesize = Coffesize.OVERWHELMING;

		System.out.println(testOne.coffesize.getOunce());
		System.out.println(testTwo.coffesize.getOunce());
		
		System.out.println("----------------------------------");
		
		for (Coffesize coffesize : Coffesize.values()) {
			System.out.println(coffesize.getOunce());
			System.out.println(coffesize.getLidCode());

		}
	}
}
