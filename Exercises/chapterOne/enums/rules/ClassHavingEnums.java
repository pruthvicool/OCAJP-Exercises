package enums.rules;

public class ClassHavingEnums {

	EnumInsideClass value;

	enum EnumInsideClass {
		SINGLE, DOUBLE, TRIPPLE // Enums are String constants.
	}

	enum WithSemiColons {
		SINGLE, DOUBLE, TRIPPLE
	}; // It is allowed/optional to put semicolon at the end

	public static void main(String args[]) {
		ClassHavingEnums classHavingEnums = new ClassHavingEnums();
		classHavingEnums.value = EnumInsideClass.DOUBLE;
		System.out.println(classHavingEnums.value);
	}
}
