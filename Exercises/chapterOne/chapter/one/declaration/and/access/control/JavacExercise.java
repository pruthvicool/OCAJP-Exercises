package chapter.one.declaration.and.access.control;


/**
 * 
 * Run this class from command prompt. 
 * 1. Without setting JAVA_HOME and "path" you can not run javac command.
 * 2. Set JAVA_HOME from environment variable - C:\Program Files\Java\jdk1.8.0_92
 * 3. Append path variable - C:\Program Files\Java\jdk1.8.0_92\bin
 * 4. Syntax is like javac [option] source
 * 5. Try javac -help  and java -version
 * 
 * It will be difficult to run java classes without setting class path
 * Class path is where your package name will start. in this case,
 * from C:\ [to] \Exercise\src
 *  
 * 	
 *  6. run command to set class path like set CLASSPATH=C:\Users\pruthviraj\git\OCAJP-Exercises\Exercises\src
 *  		Note: This will only remains true until you close the command prompt. 
 *  
 *  7. run javac like javac C:\Users\pruthviraj\git\OCAJP-Exercises\Exercises\src\chapter\one\declaration\and\access\control\JavacExercise.java
 *  8. run java like java chapter.one.declaration.and.access.control.JavacExercise
 *  9. run java with argument like java chapter.one.declaration.and.access.control.JavacExercise firstArgument
 *  
 */
public class JavacExercise {

	public static void main(String args[]) {

		System.out.println("class is running with argument: " + args[0]);
	}
}
