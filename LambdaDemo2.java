/**
 * 
 * @author abhijit
 *Java Lambda Expression Example
 */
@FunctionalInterface
interface draw{
	public void draw();
	
}	
public class LambdaDemo2 {

	public static void main(String[] args) {
		int width = 10;
		draw object = ()-> System.out.println("draw "+width);

	
	object.draw();

}
}
