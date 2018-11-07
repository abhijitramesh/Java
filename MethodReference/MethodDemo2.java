/**
 * predefined functional interface Runnable to refer static method.
 * @author abhijit
 *
 */
public class MethodDemo2 {
	public static void ThreadStatus() {
		System.out.println("Thread is runnung");
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(MethodDemo2::ThreadStatus);
		t1.start();
	}

}
