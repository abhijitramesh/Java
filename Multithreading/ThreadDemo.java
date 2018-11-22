class steve extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print("Steve ");
			try {Thread.sleep(500);} catch(Exception e ) {}
		}
	}
}
class jobs extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print("Jobs");
			System.out.println();
			
			try {Thread.sleep(500);} catch(Exception e ) {}
		}
	}
}

public class ThreadDemo{
	public static void main(String[] args) {
		steve object1 = new steve();
		jobs object2 = new jobs();
		object1.start();
		try {Thread.sleep(100);}catch(Exception e ) {}
		object2.start();
	}
}
