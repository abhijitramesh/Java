
public class MultipleExeptionDemo1 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Dividing");
				int a = 6/0;
			}
			catch(ArithmeticException e) {System.out.println(e);
			}
			
		try {
			int b[] = new int[5];
			b[6]=7;
		}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);
		}
			
		}catch(Exception e) {System.out.println(e);}
		System.out.println("Continued....");
		}

	}


