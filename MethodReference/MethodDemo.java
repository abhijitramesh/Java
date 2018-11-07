/**
 * Reference to a Static Method
 * @author abhijit
 *
 */
interface introduce{
	void intro();
	
	
}	
public class MethodDemo {
public static void Giveintro(){
	System.out.println("Hello this is a static method");
}


	public static void main(String[] args) {
		introduce object1 = MethodDemo::Giveintro;
		object1.intro();

	}

}
