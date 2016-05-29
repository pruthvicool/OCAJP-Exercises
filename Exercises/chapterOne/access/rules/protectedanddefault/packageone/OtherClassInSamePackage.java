package access.rules.protectedanddefault.packageone;

public class OtherClassInSamePackage {

	public static void main(String args[]){
		
		ParentClass parentClass = new ParentClass();
		
		System.out.println(parentClass.defaultMethod());
		System.out.println(parentClass.protectedMethod());
		 // System.out.println(parentClass.privateMethod());
		
		
	}
}
