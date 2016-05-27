package chapter.one.declaration.and.access.control;

import java.io.Serializable;

public abstract class KeyWords {

	abstract void abstractMethod();

	boolean value;

	void methodHavingBreak() {
		while (true) {
			break;
		}
	}

	byte byteValue;

	void switchCase() {

		switch (1) {
		case 1:
			break;
		default:
			break;
		}
	}

	void tryCatch() {
		try {
		} catch (Exception e) {
		} finally{
			
		}
	}

	char charValue;

	class innerClass {

	}
	
	// Its a reserved but unused keyword in Java
	const constantValue;
	
	// Its a reserved but unused keyword in Java
	void gotoMethod(){
		
		goto 9; 
	}
	
	void continueMethod(){
		while(true)
			continue;
	}
	
	void doMethod(){
		do{
			
		}while(true);
	}

	double doubleValue;
	
	void ifElse(){
		
		if(true){
			
		}else{
			
		}
	}
	
	class ExtendClass extends Identifiers{
	}
	
	final int finalValue;
	
	// Not a valid place after int
	int final finalAfterIsNotValid;
	
	float floatValue;
	
	void forLoop(){
		for(int i=0;i<10;i++){
			
		}
	}
	
	class Implements implements Serializable{}
	
	
	Object newKeyWordCheck = new Object();
	
	boolean checkInstanceOf = ( newKeyWordCheck instanceof Identifiers) ? true : false;
	
	long longValue;
	
	native void nativeMethod();
	
	private int privateInt;
	
	protected int protectedInt;
	
	public int publicInt;
	
	String methodWithReturn(){
		return "string";
	}
	
	short shortValue;
	
	static int STATIC;
	
	/**
	 * strictfp is a keyword in the Java programming language that restricts 
	 * floating-point calculations to ensure portability. 
	 */
	strictfp class StrictFPClass {
	    double num1 = 10e+102;
	    double num2 = 6e+08;
	    double calculate() {
	        return num1 + num2;
	    }
	}
	
	interface StrictFPInterface {
	    double calculate();
	    strictfp double compute();    // compile error
	}
	
	strictfp interface StrictFPInterfaceWithoutMethod {
	    double calculate();
	    double compute();    // compile error
	}
	
	class StrictFPMethod {
	    strictfp double computeTotal(double x, double y) {
	        return x + y;
	    }
	}
	strictfp class StrictFPClassWithMethod {
	    strictfp double computeTotal(double x, double y) {
	        return x + y;
	    }
	}
	
	
	class CheckSuperKeywordClass extends Identifiers{
		public CheckSuperKeywordClass() {
			super();
		}
	}
		
	/**
	 * A synchronized block in Java is synchronized on some object. 
	 * All synchronized blocks synchronized on the same object can only have one thread 
	 * executing inside them at the same time.
	 */
	
	synchronized void synchronizedMethod(){}
	
	void synchronizedBlock(){
		//Only object can be provided
		synchronized(newKeyWordCheck){
			
		}
	}
	
	void methodWithThrow(){
		if(true)
			throw new RuntimeException();
	}
	
	void methodWithThrows() throws Exception{
		
	}
	
	/**
	 * transient is a Java keyword which marks a member variable not to be serialized 
	 * when it is persisted to streams of bytes. 
	 * When an object is transferred through the network, 
	 * the object needs to be 'serialized'. 
	 * Serialization converts the object state to serial bytes.
	 */
	
	transient int s;
	transient Identifiers identifiers;
	
	/**
	 * The value of this variable will never be cached thread-locally: 
	 * all reads and writes will go straight to "main memory"; 
	 * Access to the variable acts as though it is enclosed in a synchronized block, 
	 * synchronized on itself.
	 */
	
	volatile int volatileValue;
	volatile Identifiers  volatileIdentifiers;
	
	// Assert added from 1.4
	
	/**
	 * java -ea Keywords 15
	 * 
	 * 		A java.lang.AssertionError error will be thrown:
	 
			Exception in thread "main" java.lang.AssertionError
	 
	       at AssertionExample.main(AssertionExample.java:6)
	 * 
	 */
	
	    public static void main(String[] args) {
	        // get a number in the first argument
	        int number = Integer.parseInt(args[0]);
	 
	        assert number <= 10; // stops if number > 10
	 
	        System.out.println("Pass");
	 
	    }
	    
	    /**
	     * 
	     * An enum type is a special data type that enables for a variable 
	     * to be a set of predefined constants.
	     *
	     */
	    enum myEnum{
	    	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	        THURSDAY, FRIDAY, SATURDAY 
	    }
}
