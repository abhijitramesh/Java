/**
 * @author abhijit
 *Java Lambda Expression Example: Multiple Parameters
 */
interface multiply{
	int multi(int a,int b);
	
}
public class JavaLambdaDemo5 {
	public static void main(String[] args) {
		multiply object1 =(a,b)->(a*b);
		System.out.println(object1.multi(10,20));
		multiply object2 =(int a,int b)->(a*b);
		System.out.println(object2.multi(100,200));
	}
		

}
