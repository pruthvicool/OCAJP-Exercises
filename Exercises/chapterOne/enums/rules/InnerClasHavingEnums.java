package enums.rules;

import enums.rules.InnerClasHavingEnums.InnerClass.InnerClassEnum;

public class InnerClasHavingEnums {

	public static void main(String args[]) {

		InnerClass innerClass = new InnerClass();
		innerClass.enumValue = InnerClassEnum.valueTwo;
		System.out.println(innerClass.enumValue);
	}

	static class InnerClass {

		InnerClassEnum enumValue;

		enum InnerClassEnum {
			valueOne, valueTwo
		}
	}
}
