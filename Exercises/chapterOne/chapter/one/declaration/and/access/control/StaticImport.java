package chapter.one.declaration.and.access.control;

import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;

public class StaticImport {

	void methodWithoutStaticImport() {
		System.out.println("print int max value " + Integer.MAX_VALUE);
	}
	
	void methodWithStaticImport(){
		out.println("print int max value " + MAX_VALUE);
	}
}
