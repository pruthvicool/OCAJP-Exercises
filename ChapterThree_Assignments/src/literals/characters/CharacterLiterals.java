package literals.characters;

public class CharacterLiterals {

	public static void main(String[] args) {

		char c = 'c';

		System.out.println(c);

		char atRate = '@';
		System.out.println(atRate);

		char unicode = '\u004E'; // Value of N
		System.out.println(unicode);

		System.out.println("-------------------");
		/**
		 * Characters are 16 bit signed integers under the hood. Meaning, means
		 * 2^16 = 65536-1 = 65535 are supported
		 */

		char decimal = 15;
		char decimalInRange = 65535;
		char decimalOutOfRange = (char) 65536;
		System.out.println(decimal);
		System.out.println(decimalInRange);
		System.out.println(decimalOutOfRange); // Precision lost

		char octal = 01;

		char hexaDecimal = 0x11;

		char binary = 0b11;

		System.out.println(octal);
		System.out.println(hexaDecimal);
		System.out.println(binary);

		/**
		 * we can use "\" for special characters
		 */

		char s1 = '\'';
		System.out.println(s1);
		
		char s2 = '\"';
		System.out.println(s2);
	
		char s3 = '\t';
		System.out.println(s3);
		
	}
	
}
