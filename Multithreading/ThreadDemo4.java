
public class ThreadDemo4 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(()->
		{
			for(int i = 0; i<10;i++) {
				System.out.print(i+"");
				try{Thread.sleep(200);}catch(Exception e) {}
				
			}
		});
		Thread thread2 = new Thread(()->
		{
			for(int j = 2; j<21;j = j+2) {
				System.out.print(" "+j);
				System.out.println();
				try{Thread.sleep(200);}catch(Exception e) {}
			}
		});
		
		thread1.start();
		try{Thread.sleep(100);}catch(Exception e) {}
		thread2.start();
		try{thread1.join();}catch(Exception e) {}
		try{thread2.join();}catch(Exception e) {}
		System.out.println();
		System.out.println("*****************");
	}

}
