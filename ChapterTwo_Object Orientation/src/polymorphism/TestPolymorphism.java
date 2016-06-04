package polymorphism;

import inheritance.GameShape;
import inheritance.PlayerPiece;

public class TestPolymorphism {

	public static void main(String args[]) {

		// Polymorphism
		GameShape p1 = new PlayerPiece();
		GameShape p2 = new GameShape();
		PlayerPiece p3 = new PlayerPiece();

		// Method can be called with parent as a argument with child values
		doShape(p1);
		doShape(p2);
		doShape(p3);

		/**
		 * As NewPlayerPiece extends Gameshape and implements Animatable, It
		 * passes multiple IS-A test So, you can refer newPlayPeice object
		 * polymorphically like this
		 */
		NewPlayerPiece newPlayerPiece = new NewPlayerPiece();

		Object o = newPlayerPiece; // Allowed for any superType of inheritance
									// tree
		GameShape g = newPlayerPiece; // Allowed for any superType of
										// inheritance tree
		Animatable a = newPlayerPiece; // bcz "implements"

	}

	// Any subtype can be passed here
	public static void doShape(GameShape gameShape) {
		gameShape.displayMessage();
	}

}

interface Animatable {

	void animate();
}

class NewPlayerPiece extends GameShape implements Animatable {

	@Override
	public void animate() {
		// TODO Auto-generated method stub

	}

}
