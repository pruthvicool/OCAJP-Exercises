package access.rules.protectedanddefault.packagetwo;

import access.rules.protectedanddefault.packageone.*;

public class OtherClassInOtherPackage {

	public static void main(String args[]){
		
		ParentClass parentClass = new ParentClass();
		
		System.out.println(parentClass.defaultMethod());
		System.out.println(parentClass.protectedMethod()); // Only child class can access protected method
		 // System.out.println(parentClass.privateMethod());
		
		
	}
}
