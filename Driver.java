
public class Driver {

	public static void main(String[] args) {
		Point p = new Point();
		Point p1 = new Point();
		p.setX(2);
		p.setY(5);
		p.print();
		p1.setX(10);
		p1.setY(5);
		
		if(p.getX() == p1.getX()) {
			System.out.println("Same X");
		}
		else if(p.getY() == p1.getY()) {
			System.out.println("Same y");
		}
		if(p == p1) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");

		}
		Point p2 = new Point(2,3);
		p2.print();
	}

}
