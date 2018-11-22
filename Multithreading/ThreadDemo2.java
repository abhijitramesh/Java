class Bill implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print("Bill ");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	
	
}
class Gates implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.print("Gates");
			System.out.println();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Bill object1 = new Bill();
		Gates object2 = new Gates();
		Thread thread1 = new Thread(object1);
		Thread thread2 = new Thread(object2);
		thread1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		thread2.start();
		
	

	}

}
