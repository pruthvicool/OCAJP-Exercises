package operator.equality;

public class EnumEquality {

	enum Color {
		RED, BLUE
	};

	public static void main(String[] args) {

		Color c1 = Color.RED;
		Color c2 = Color.RED;
		Color c3 = Color.BLUE;

		if (c1 == c2) { // true

			System.out.println("== compares value");
		}

		if (c1.equals(c2)) { // true

			System.out.println("equals compares value");
		}
		
		if(c1.equals(c3) && (c1==c3)){
			System.out.println("not possible");
		}else{
			System.out.println("working");
		}

	}
}
