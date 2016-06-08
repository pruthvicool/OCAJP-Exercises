package operator.equality;

import javax.swing.JButton;

/**
 * For object equal operation will compare bit pattern = reference.
 * 
 */
public class ObjectEquality {

	public static void main(String[] args) {

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = b1;

		System.out.println("b1==b2 " + (b1 == b2)); // false
		System.out.println("b3==b1 " + (b3 == b1)); // true

		/**
		 * Corner case
		 */
		boolean b = false;
		if (b = true) { // This is set to true
			System.out.println("b is true");
		} else {
			System.out.println("b is false");
		}

	}
}
