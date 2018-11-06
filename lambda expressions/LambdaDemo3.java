/**
 * Java Lambda Expression Example: No Parameter
 * @author abhijit
 * 
 *
 */
interface talking{
	public String talk();
}
public class LambdaDemo3. {
	

	public static void main(String[] args) {
		talking object1 = ()->{
			return "i am talking";
				
		};
		System.out.println(object1.talk());
		

	}

}
