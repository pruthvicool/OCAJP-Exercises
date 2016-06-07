package literals.integer.and.longtype;

/**
 * Can be represented by 0b or 0B prefix
 * 
 */
public class BinaryLiterals {

	public static void main(String[] args) {

		int i = 0B001; // 0B - 4,2,1
		System.out.println(i);

		int j = 0b010; // 0B - 4,2,1
		System.out.println(j);

		int k = 0B100000; // 0B - 32,16,8,4,2,1
		System.out.println(k);
		

		long l1 = 0B001l; // 0B - 4,2,1
		System.out.println(l1);

		long l2 = 0b010L; // 0B - 4,2,1
		System.out.println(l2);

		long l3 = 0B100000L; // 0B - 32,16,8,4,2,1
		System.out.println(l3);

		
	}
}
