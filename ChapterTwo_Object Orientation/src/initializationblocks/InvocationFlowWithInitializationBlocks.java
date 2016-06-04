package initializationblocks;

/**
 * 
 * Rules : <br>
 * 
 * 1. init blocks executes in the order in which they appear.<br>
 * 2. static init block runs only once. <br>
 * 3. instance init block runs per instance <br>
 * 4. instance init block runs after the constructor's call to super(). Meaning
 * prior to any statement of constructor. prior to constructor.
 * 
 * 
 * 
 */
public class InvocationFlowWithInitializationBlocks {

	public InvocationFlowWithInitializationBlocks(int x) {
		System.out.println("1 args constructor");
	}

	public InvocationFlowWithInitializationBlocks() {
		System.out.println("No args constructor");
	}

	static {
		System.out.println("1st static init block");
	}

	{
		System.out.println("1st instance init block");
	}

	{
		System.out.println("2nd instance init block");
	}

	static {
		System.out.println("2nd static init block");
	}

	public static void main(String args[]) {

		/**
		 * Output: <br>
		 * 1st static init block <br>
		 * 2nd static init block <br>
		 * 1st instance init block <br>
		 * 2nd instance init block <br>
		 * No args constructor
		 */
		InvocationFlowWithInitializationBlocks i = new InvocationFlowWithInitializationBlocks();

		System.out.println("----------------------------");
		/**
		 * 1st instance init block <br>
		 * 2nd instance init block <br>
		 * 1 args constructor;
		 */
		InvocationFlowWithInitializationBlocks j = new InvocationFlowWithInitializationBlocks(
				5);
	}
}
