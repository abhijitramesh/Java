/**
 * 
 * @author abhijit
 *Java Lambda Expression Example: with or without return keyword
 */
interface multiply{
	int multi(int a, int b);
}
public class LambdaDemo6 {

	public static void main(String[] args) {
		multiply object1 = (a,b)->(a*b);
		System.out.println(object1.multi(10,20));
		multiply object2 = (a,b)->{
			return a*b;
			
		};
		System.out.println(object1.multi(100, 200));
		

	}

}
