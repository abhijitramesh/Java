interface Writer{
	void write() ;
		
}
class Pen implements Writer{
	public void write() {
		System.out.println("i am a pen");
		
	}
}
class pencil implements Writer{
	public void write() {
		System.out.println("i am a pencil");
	}
}

class kit{
	public void doSomething(Writer p) {
		p.write();
			
	}
}
public class Interfaces {

	public static void main(String[] args) {
kit k = new kit();
Writer p = new Pen();
Writer pc = new pencil();
k.doSomething(p);
	}

}
