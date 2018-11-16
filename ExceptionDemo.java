
public class ExceptionDemo {

	public static void main(String[] args) {
	try {
		int i =7;
		int j = 0;
		int k = i/j;
		System.out.println(k);
		
			
	}
	catch(Exception e) {
		System.err.println("Error");
	
		
	}
	System.out.println("Bye");
	}

}
