package question.three;

public class Clidlet extends Clidder {

	public final void flipper() {
		System.out.println("Clidlet");
	}
	
	public static void main(String arg[]){
		new Clidlet().flipper();
	}
}

class Clidder {

	private final void flipper() {
		System.out.println("Clidder");

	}

}