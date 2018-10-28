
class A{
final int a = 10;
	public final void show() {
		System.out.print("in A show");
	}
}
class B extends A{
	
}
public class FinalDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
	
	}

}
