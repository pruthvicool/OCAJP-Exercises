package chapter.one.declaration.and.access.control;

/**
 * As per rule: <br>
 * 1. A-Z, a-z, 0-9 , '$' and '_' are valid characters for identifiers. <br>
 * 2. It should always starts with A-Z, a-z, '$' and '_' <br>
 * 3. Starting with digits in not allowed. <br>
 * 4. No max length <br>
 * 5. Identifiers are case Sensitive <br>
 * 6. Can't use Java keywords {@link KeyWords}
 * 
 */
public class Identifiers {

	/*
	 * Valid Identifiers
	 */

	int _a;
	int $c;
	int _________2;
	int $2;
	int _____2_W;
	int W;
	int w;
	int _$;
	int this_is_very_large_name_for_an_Idenfier_WITH_CAPITALS_and_8989___$$;
	int String; 
	int Integer;
	int ArrayList;
	
	void _myMethod(){	}
	void $NewMethod(){}
	void MYMETHOD(){}
	void $2(){}
	
	class _myClass{}
	class NEWCLASS{}
	class $2{}
	
	/*
	 * In valid Identifiers
	 */
	int 4;
	int :b;
	int -d;
	int e#;
	int u^&^&;
	int .f;
	int 7g;
	
	void 1(){}
	void :b_(){}
	void ***(){}
	
	class 4{}
	class :b_{}
	class ***{}
	
	// Keywords
	int this;
	int float;
	int static;
	
	void static(){}
	void default(){}
	
	class extends{}
	class implements{}
	
	
	
	
	

}
