package operator.turnery.or.conditional;

public class Test {

	public static void main(String[] args) {

		/**
		 * Syntax is like <br>
		 * x = (boolean express) ? value if true : value if false;
		 * 
		 */

		int x = (5 > 6) ? 10 : 20;
		System.out.println(x); // 20

		int noOfPets = 3;
		String status = (noOfPets < 4) ? "pet limit not exceeded"
				: "too may pets";
		System.out.println(status);

		int sizeOfYard = 10;
		status = (noOfPets < 4) ? "pet count ok"
				: (sizeOfYard > 8) ? "pet limit on edge" : "too many pets";
		System.out.println(status);

		int multipleConditions = (10 < 20) ? (12 > 15) ? 10 : 9 : 10 <= 10 ? 10
				: 15;
		
		System.out.println(multipleConditions); // 9
	}
}
