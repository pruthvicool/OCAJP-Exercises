import food.*;
import static java.lang.System.out;

/**
 * 
 * Run this class using javac and java
 * 
 * 	javac C:\Git\OCAJP\OCAJP-Exercises\Exercises\exercise1-1\Apple.java
 *  it will throw package food does not exist error
 *  
 *  set class path 
 *  set CLASSPATH=C:\Git\OCAJP\OCAJP-Exercises\Exercises\exercise1-1
 *  
 *  after that run above javac command again, it will work
 *  
 *  Now, 
 *  java Apple
 *  
 */

class Apple extends Fruit {

	public static void main(String args[]) {

		out.println(Fruit.callingFruit());
	}
}
