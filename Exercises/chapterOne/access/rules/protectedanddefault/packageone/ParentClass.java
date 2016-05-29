package access.rules.protectedanddefault.packageone;

public class ParentClass {

	String defaultMethod() {
		return "defaultMethod() called";
	}

	protected String protectedMethod() {
		return "protectedMethod() called";
	}
	
	private String privateMethod(){
		return "privateMethod() called";
	}
}
