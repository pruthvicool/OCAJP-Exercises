package chapter.one.declaration.and.access.control;

public class MainMethodVariation {

	// Valid method
	/*public static void main(String args[]){
		System.out.println("valid main method");
	}*/
	
/*	static public void main(String args[]){
	System.out.println("valid method");	
	}
*/	
	/*public static void main (String...x){
		System.out.println("valid method");
	}*/
	
	static public void main (String anyArgumentNamesWillWork[]){
		System.out.println("valid method");
	}
	
	// Illegal sequence of keywords
	// First will be access modifier, then return type
	/*void static public main(String args[]){
		
	}*/
	
	
}
