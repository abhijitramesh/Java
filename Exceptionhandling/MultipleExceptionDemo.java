
public class MultipleExceptionDemo {

	public static void main(String[] args) {
		
		try {
		int a[] = new int[5];
		a[6]=100/0;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		catch(ArithmeticException e) {System.out.println(e);}
		catch(Exception e) {System.out.println(e);}
		
		System.out.println("Continue..........");
	
		
				

	}

}
