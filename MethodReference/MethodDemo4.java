/**
 * Bi function in Java
 */
import java.util.function.BiFunction; 
class Maths{
	public static int add(int a, int b) {
		return a+b;
	}
}
public class MethodDemo4 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>adder = Maths::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}

}
