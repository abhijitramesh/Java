import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo4 {

	public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	numbers.add(521);
	numbers.add(615);
	numbers.add(777);
	numbers.add(911);
	numbers.add(552);
	
	Comparator <Integer> c = new Comparator<>() {
		public int compare(Integer i,Integer j) {
			if(i%10>j%10)
				return 1;
			else 
				return -1;
		}
		
	};
	
	Collections.sort(numbers,c);
	
	for(Object o : numbers) {
		System.out.println(o);
	
	}
	System.out.println();
	
	Collections.sort(numbers,(i,j) -> i%100>j%100?1:-1);
	for(Object o : numbers) {
		System.out.println(o);
	}
	
	}

}
