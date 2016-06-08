package wrappers;

public class WrapperTest {

	public static void main(String[] args) {

		/**
		 * Each primitive types has wrapper class - object that holds the value
		 * of primitives
		 */

		Long longWrapper = new Long(10l);
		Integer intWrapper = new Integer(0b101);
		Float floatWrapper = new Float(20.20f);
		Double doubleWrapper = new Double(20.33d);
		Byte byteWrapper = new Byte((byte) 101);
		Short shortWrapper = new Short((short) 10);

		Long newLongWrapper = longWrapper;

		System.out.println("Before == longWrapper: " + longWrapper
				+ " newLongWrapper: " + newLongWrapper);

		newLongWrapper = new Long(20l);

		System.out.println("Before == longWrapper: " + longWrapper
				+ " newLongWrapper: " + newLongWrapper);

	}
}
