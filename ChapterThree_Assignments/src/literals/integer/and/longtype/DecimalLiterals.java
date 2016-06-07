package literals.integer.and.longtype;

public class DecimalLiterals {

	public static void main(String[] args) {

		int i = 10;

		System.out.println(i);

		/**
		 * int is having 32 bit i.e. 2^32 = 4294967296 <br>
		 * It supports both +ve and negative values by 1 bit = signed bit So,
		 * max value int can hold is = (4294967296/2)-1=2147483647
		 * 
		 */
		int j = 2147483647;
		int k = -2147483647;
		
		System.out.println(j);
		System.out.println(k);

	}
}
