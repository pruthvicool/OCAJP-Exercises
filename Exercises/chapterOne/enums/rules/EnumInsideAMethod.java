package enums.rules;

public class EnumInsideAMethod {

	public static void main(String[] args) {
		
		/**
		 * Can not declare enum inside a method
		 * Because method only accepts final, not public static final
		 */
		enum Enumation{ single, doubleValue}
	}
}
