package literals.integer.and.longtype;

/**
 * Can be represented by '0' as prefix
 * 
 * octals are made from 0 to 7.
 * 
 */
public class OctalLiterals {

	public static void main(String[] args) {

		int i = 01; // value as 1
		System.out.println(i);

		int j = 07; // value as 7
		System.out.println(j);

		int k = 010; // values as 8
		System.out.println(k);

		int l = 011; // value as 9
		System.out.println(l);

		System.out.println("===== Long literals ====");

		long l1 = 01l; // value as 1
		System.out.println(l1);

		long l2 = 07L; // value as 7
		System.out.println(l2);

		long l3 = 010l; // values as 8
		System.out.println(l3);

		long l4 = 011L; // value as 9 (8+1)
		System.out.println(l4);

		long l5 = 0111l; // represents 511 = (64+8+1)
		System.out.println(l5);
	}
}
