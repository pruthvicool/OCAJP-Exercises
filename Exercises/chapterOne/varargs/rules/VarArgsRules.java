package varargs.rules;

public class VarArgsRules {

	/**
	 * type followed by ... followed by name of the array that holds parameters
	 * received
	 */
	void methodWithIntVarArgs(int... intArray) {
		System.out.println(intArray.length);
	}

	void methodWithStringVarArgs(String...stringArray) {
		System.out.println(stringArray.length);
	}

	/**
	 * Other parameters are also allowed, but varargs should be the last one
	 */
	void methodWithOtherParams(String firstParams, String... stringArray) {
		System.out.println(stringArray.length);
	}

	void invalidMethodWhenVarArgsIsFirst(String... stringArray, String otherParams) {

	}
	
	/**
	 * Only one var-args is allowed 
	 */
	void tooManyVarargs(String ... stringArray, int ...intArray){
		
	}
	
	public static void main(String args[]){
		
		VarArgsRules argsRules = new VarArgsRules(); 
		
		argsRules.methodWithStringVarArgs("first","second","third");
		argsRules.methodWithIntVarArgs(1,2,3,4);
		argsRules.methodWithOtherParams("any params", "first","two");
		
	}
}
