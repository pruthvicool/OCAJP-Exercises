package primitive.casting;

/**
 * 
 * Implicit casting : happen when you are doing widening conversion, putting
 * small thing into big container,<br>
 * Explicit Casting : Large thing into smaller container
 * 
 */
public class PrimitiveCasting {

	public static void main(String[] args) {

		int i = 'A'; // Putting char into int requires no casting
		System.out.println(i);

		long l = i; // Putting int into long - no casting - explicit casting
		System.out.println(l);

		float f = 10.20f;
		i = (int) f; // Putting float into int requires explicit casting
		System.out.println(i); // It will lost the precision and will display
								// only 10

		long longBiggerThanByte = 128; // byte is of 8 bits where 1 bit is sign
										// bit 2^7 = 128-1 = 127 is the largest
										// value
		byte b = (byte) longBiggerThanByte;

		System.out.println(b); // it will display -128

		float floatValue = 234.56F;
		short shortValue = (short) floatValue;
		System.out.println(shortValue); // precision lost - it will display 234

		floatValue = 32768.11f; // It is larger then short
		shortValue = (short) floatValue;
		System.out.println(shortValue); // precision lost - it will display
										// -32768 as it goes out of range of
										// short

	}
}
