/**
 * Reference to a Static Method
 * @author abhijit
 *
 */
interface DisplayError{
	void error();
}
public class MethodDemo3 {
	
	public static void Error() {
		System.out.println("Run Time Error");
	}
	public static void main(String[] args) {
		DisplayError object1 = MethodDemo3::Error;
		object1.error();
		
	}

}
