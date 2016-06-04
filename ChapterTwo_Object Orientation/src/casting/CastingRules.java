package casting;

public class CastingRules {

	public static void main(String args[]) {

		/**
		 * Downcasting
		 */

		Animal[] a = { new Animal(), new Dog(), new Dog(), new Animal() };

		for (Animal animal : a) {
			animal.makeNoise();

			// To call playDead() of dog, do downcast

			if (animal instanceof Dog) {
				// animal.playDead(); // Compilation error without casting
				((Dog) animal).playDead(); // Down casting
			}

		}

		Animal animal = new Animal();
		Dog d = (Dog) animal; // Compiler allows it because both type belongs to
								// same
								// Inheritance tree
								// This will fail at runtime by
								// classCastException

		/**
		 * Upcasting
		 */

		Dog dog = new Dog();
		Animal a1 = dog; // Implicit upcasting
		Animal a2 = (Animal) dog; // Explicit upcasting
	}
}

class Animal {

	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Dog extends Animal {

	@Override
	void makeNoise() {
		System.out.println("bark");
	}

	void playDead() {
		System.out.println("roll over");
	}
}
