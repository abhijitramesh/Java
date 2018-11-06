/**
 * Java Lambda Expression Example: Foreach Loop
 */
import java.util.*;

public class LambdaDemo7 {

	public static void main(String[] args) {
	List<String>list = new ArrayList <String>();
	list.add("Apple");
	list.add("One plus");
	list.add("Samsung");
	list.add("HTC");
	list.add("Sony");
	
	list.forEach(
	(n)->System.out.println(n)
	);
	}

}
	