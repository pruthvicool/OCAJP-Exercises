package access.rules.protectedanddefault.packageone;

public class ChildClassInSamePackage extends ParentClass {

	public static void main(String args[]){
		
		ChildClassInSamePackage child = new ChildClassInSamePackage();
		System.out.println(child.defaultMethod());
		System.out.println(child.protectedMethod());
		 // System.out.println(child.privateMethod());
	}
}
