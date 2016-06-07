package literals.integer.and.longtype;

/**
 * Can be represented by 0x or 0X
 * 
 */
public class HexaDecimalLiterals {

	public static void main(String[] args) {

		int i1 = 0x0001; // represents 1
		long l1 = 0X1L; // represents 1

		System.out.println(i1 + " - " + l1);
		
		
		int i2 = 0xf; // represents 15
		long l2 = 0XfL; // represents 15

		System.out.println(i2 + " - " + l2);
		
		int i3 = 0xf1; // represents (fx16 = 240) + 1 = 241
		long l3 = 0Xf1L; // represents (fx16 = 240) + 1 = 241

		System.out.println(i3 + " - " + l3);
	}
}
