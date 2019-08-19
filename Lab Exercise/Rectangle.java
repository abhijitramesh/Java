
public class Rectangle implements Shape {

	protected double length,breadth;

	@Override
	public double area() {
		return length*breadth;
	}

	@Override
	public double perimeter() {
		return 2*(length+breadth);
	}

}
