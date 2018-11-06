
interface yello{
	void display();
}

	

public class LambdDemo {
	public static void main(String[] args) {
	yello object = () ->System.out.println("yello world");

	object.display();
	
}
}

