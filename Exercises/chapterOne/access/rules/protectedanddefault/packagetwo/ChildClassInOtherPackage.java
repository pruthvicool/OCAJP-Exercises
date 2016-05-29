package access.rules.protectedanddefault.packagetwo;

import access.rules.protectedanddefault.packageone.*;

public class ChildClassInOtherPackage extends ParentClass {

	public static void main(String args[]) {

		/**
		 * Protected are allowed to access outside of the package 
		 * only through inheritance.
		 */
		ChildClassInOtherPackage child = new ChildClassInOtherPackage();
		System.out.println(child.defaultMethod()); // Cannot access default 
		System.out.println(child.protectedMethod()); // Only child class can access protected method
		System.out.println(child.privateMethod()); // cannot access private
		
		/**
		 * Even though given class is child class, but when you are accessing 
		 * protected member with reference, it is not allowed outside of the package.
		 */
		ParentClass parentClass = new ParentClass();
		System.out.println(parentClass.defaultMethod()); // Cannot access default 
		System.out.println(parentClass.protectedMethod()); // Only child class can access protected method
		System.out.println(parentClass.privateMethod()); // cannot access private
		
		
	}
}
