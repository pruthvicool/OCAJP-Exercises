package operator.instanceofcheck;

public class NullTest {

	/**
	 * Any instanceof comparison with null will result in false
	 */
	public static void main(String[] args) {

		Object nullObject = null;
		
		System.out.println(nullObject instanceof Object);
	}
}
