package constructors;

public class StackOverFlowError {

	public void doStuff() {
		go();
	}

	public void go() {
		doStuff();
	}

	/**
	 * Exception in thread "main" java.lang.StackOverflowError at
	 * constructors.StackOverFlowError.doStuff(StackOverFlowError.java:6) at
	 * constructors.StackOverFlowError.go(StackOverFlowError.java:10)
	 * 
	 */
	public static void main(String args[]) {

		StackOverFlowError error = new StackOverFlowError();
		error.doStuff();
	}
}

class MyClass {

	public MyClass() {
		this("s"); // Detected by compiler
	}

	public MyClass(String s) {
		this();
	}
}
