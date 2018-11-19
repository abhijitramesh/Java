
public class throwDemo {
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("not valid");
		else System.out.println("lisence issuable");
	}

	public static void main(String[] args) {
		validate(14);
	}

}
