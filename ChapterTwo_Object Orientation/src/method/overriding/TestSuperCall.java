package method.overriding;

public class TestSuperCall {

	public static void main(String args[]) {
		
		Animal animal = new Animal();
		Horse horse = new Horse();
		
		animal.printAnimal();
		horse.printAnimal();
	}
}

class Animal {
	public void printAnimal() {
		System.out.println("Animal");
	}
}

class Horse extends Animal {

	@Override
	public void printAnimal() {
		super.printAnimal();
		/**
		 * Only immediate superClass method is allowed to called
		 */
		super.super.clone() // Not allowed
	}
}
