package method.overriding;

public class ExamTestOverridingMethods extends NewAnimal {

	public void eat() {

	}

	public static void main(String args[]) {

		NewAnimal animal = new ExamTestOverridingMethods();
		ExamTestOverridingMethods testOverridingMethods = new ExamTestOverridingMethods();

		testOverridingMethods.eat(); // allowed
		animal.eat(); // unhandled exception

	}
}

class NewAnimal {

	public void eat() throws Exception {

	}
}