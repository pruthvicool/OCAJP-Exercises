package initializationblocks;

public class InitializationBlockTypes {

	static int x = 5;
	int y = 5;

	static {
		// This is static initialization block type
		// Called only once
		// Can only access static variables
		System.out.println("static block: " + x);
		// System.out.println("cannot access not static variables" + y); //
		// compilation error
	}

	{
		// This is instance initialization block
		// Can be called as many times as instantiation happens
		// Can access static and non static variables
		System.out.println("instance block " + x + " " + y);
	}
	
	{
		// Init block executes in the sequence of their order
		System.out.println("Second instance block " + x + " " + y);
	}

	public static void main(String args[]) {

		InitializationBlockTypes one = new InitializationBlockTypes();
		InitializationBlockTypes two = new InitializationBlockTypes();
		InitializationBlockTypes three = new InitializationBlockTypes();

	}
}
