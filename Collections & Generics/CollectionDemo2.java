import java.util.List;
import java.util.ArrayList;



public class CollectionDemo2 {

	public static void main(String[] args) {
		List values= new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(2,4);
		for (Object o : values) {
			System.out.println(o);
		}

	}

}
