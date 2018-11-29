
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo3 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(5);
		values.add(9);
		values.add(12);
		values.add(1);
		
		Collections.sort(values);
		Collections.reverse(values);
		
		for(Object o : values) {
			System.out.println(o);
		}

	}

}
