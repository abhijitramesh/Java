
public class ThreadDemo3 {

	public static void main(String[] args) {
		int[] a = new int [500];
	Runnable object1 =() -> 
	{
				for(int i = 0; i< 500; i++) {
				try {Thread.sleep(100);}catch(Exception e) {}
				a[i] = i;			
				System.out.print(a[i]+" ");
							}
	};
	Runnable object2 = () ->
	{
				for(int i = 0; i< 500; i++) {
				try {Thread.sleep(100);}catch(Exception e) {}
				a[i] = a[i]*2;
				System.out.print(a[i]);
				System.out.println();
								
							}
	};
	Thread thread1 = new Thread(object1);
	Thread thread2 = new Thread(object2);
	thread1.start();
	try {Thread.sleep(10);}catch(Exception e) {}
	thread2.start();
	
	
	
	}

}	
