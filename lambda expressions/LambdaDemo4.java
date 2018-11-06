/**
 * Java Lambda Expression Example: Single Parameter
 * @author abhijit
 *
 */
interface welcome{
	public String Welcome(String name);	
}

public class LambdaDemo4 {

	public static void main(String[] args) {
		welcome object1 =(name)->{
		return "Welcome "+name;
			
	};
	System.out.println(object1.Welcome("abhijit"));
		welcome object2 =(name)->{
			return "Welcome "+name;
			
		};
	System.out.println(object2.Welcome("ramesh"));

}
}
