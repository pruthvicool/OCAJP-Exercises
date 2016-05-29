package access.rules.methods;

public class Moo extends Zoo {

	public void callMyCoolMethodByInheritance(){
		System.out.println(this.coolMethod());
		System.out.println(coolMethod()); // Both of above statements are same
										 // as "this." is implicit
	}
	
	public void callMyCoolMethodByRefence(){
		Zoo zoo = new Zoo();
		System.out.println(zoo.coolMethod());
	}
	
	@Override
	public String coolMethod() {
		return "Moo's coolMethod() is called";
	}
	
	public static void main(String args[]){
		
		Moo moo = new Moo();
		moo.callMyCoolMethodByInheritance();
		System.out.println("======");
		moo.callMyCoolMethodByRefence();
	}
}
