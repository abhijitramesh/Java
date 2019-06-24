
public class Driver {

	public static void main(String[] args) {
		Point p = new Point();
		Point p1 = new Point();
		p.setX(2);
		p.setY(5);
		p.print();
		p1.setX(0);
		p1.setY(0);
		
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
		System.out.println(p.isOrigin());
		System.out.println(p1.isOrigin());
		 Point p3 = new Point();
		  System.out.println( p3.whichQuadrant() );

		  Point q = new Point(4,3);
		  System.out.println( q.whichQuadrant() );

		  q.setX(-8); 
		  System.out.println( q.whichQuadrant() );

		  q.setY(q.getY() * -1);
		  System.out.println( q.whichQuadrant() ); 

		  q.setX(q.getX() / -2);
		  System.out.println( q.whichQuadrant() );
		  
		  q.xProjection();
		  q.print();
		  q.yProjection();
		  q.print();
		  
		  Point y = new Point(3,8);
	        y.scalarMultiply(5);
	        y.print();
	}

}
