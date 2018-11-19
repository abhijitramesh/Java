

public class TestExceptionpropagation {
	void error() {
		throw new ArithmeticException("error");
	}
	
	void showerror() {
		error();
	}
		void execute() {
			try {
				showerror();
			}catch(Exception e) {System.out.println("exception handled");}
					
		}

	public static void main(String[] args) {
		TestExceptionpropagation object = new TestExceptionpropagation();
		object.execute();
		System.out.println("Good night");

	}

}
