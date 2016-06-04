package statics;

public class StaticExample {

	public static void main(String args[]) {

		Animal a[] = { new Animal(), new Dog(), new Dog(), new Animal() };

		for (Animal animal : a) {
			animal.doStuff(); // This can be called directly on class

		}

		System.out.println("---------------------");
		
		for (Animal animal : a) {
			if (animal instanceof Dog) {
				((Dog) animal).doStuff();
			}else{
				animal.doStuff();
			}
		}

	}
}

class Animal {

	static void doStuff() {
		System.out.println("animal - doStuff");
	}
}

class Dog extends Animal {

	// This is not method overriding - static can not be overrid
	static void doStuff() {
		System.out.println("Dog - doStuff");
	}
}
