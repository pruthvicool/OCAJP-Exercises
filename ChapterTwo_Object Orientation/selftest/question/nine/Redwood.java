package question.nine;

public class Redwood extends Tree {

	public static void main(String args[]) {

		/**
		 * Exception in thread "main" java.lang.ClassCastException:
		 * question.nine.Tree cannot be cast to question.nine.Redwood at
		 * question.nine.Redwood.go2(Redwood.java:27) at
		 * question.nine.Redwood.go(Redwood.java:20) at
		 * question.nine.Redwood.main(Redwood.java:15)
		 */

		new Redwood().go();
	}

	void go() {

		go2(new Tree(), new Redwood());

		go2((Redwood) new Tree(), new Redwood());
	}

	void go2(Tree t1, Redwood r1) {

		Redwood r2 = (Redwood) t1; // Allowed, down casting
		Tree t2 = (Tree) r1; // Explicit Up casting same as below
		Tree t3 = r1;

	}
}

class Tree {

}