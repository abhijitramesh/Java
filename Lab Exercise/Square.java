
public class Square implements Shape {

	protected double side;
	
	@Override
	public double area() {
		return side*side;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}

}
