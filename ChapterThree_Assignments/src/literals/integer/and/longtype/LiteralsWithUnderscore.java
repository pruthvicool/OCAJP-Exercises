package literals.integer.and.longtype;

public class LiteralsWithUnderscore {

	// It is allowed from Java 7 that we can use '_' with literals.

	public static void main(String[] args) {

		int i = 1_00_000;
		System.out.println(i);
		
		//int illegal = _111100; // This is illegal, cannot begin with '_'
 
		int j = 10_0000;
		System.out.println(j);

		long l1 = 1_2345_6789L;
		System.out.println(l1);

		double d = 101_11.12_333; // Legal
		System.out.println(d);
		
		//double d2 = 10_._10; // Illegal, cannot put '_' directly next to '.'
		
	}

}
