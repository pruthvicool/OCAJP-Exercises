package operator.equality;

/**
 * For primitives, equality operator will compare values - bit patterns
 * 
 */
public class PrimitiveEquality {

	public static void main(String[] args) {

		System.out.println("char 'a' == 'a' " + ('a' == 'a')); // true
		System.out.println("char 'a' == 'b' " + ('a' == 'b')); // false
		System.out.println("int 5 != 6 " + (5 != 6)); // true
		System.out.println("double long 5.0 == 5L " + (5.0 == 5L)); // true
		System.out.println("boolean true == false " + (true == false)); // false
	}
}
