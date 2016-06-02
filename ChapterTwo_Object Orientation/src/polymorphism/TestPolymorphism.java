package polymorphism;

import inheritance.GameShape;
import inheritance.PlayerPiece;

public class TestPolymorphism {

	public static void main(String args[]) {

		// Polymorphism
		GameShape p1 = new PlayerPiece();
		GameShape p2 = new GameShape();
		Object p3 = new PlayerPiece();

	}
}
