public class Triangle implements Shape {

	protected double side,side1,side2;
	
	@Override
	public double area() {
		return Math.sqrt((this.perimeter()/2)*((this.perimeter()/2)-side)*((this.perimeter()/2)-side1)*((this.perimeter()/2)*side2));
	}

	@Override
	public double perimeter() {
		return (side+side1+side2);
	}

}
