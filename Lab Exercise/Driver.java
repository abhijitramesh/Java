
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
	        p.setX(7);
	        p.setY(-3);
	        q.setX(4);
	        q.setY(10);
	        System.out.println(p.sum(q));
	        p.sum(q).print();
	        q.sum(p).print();
	        p.setX(5);
	        p.setY(8);
	        q.setX(3);
	        q.setY(8);
	        System.out.println("Slope ="+p.slope(q));
	        p.setX(1);
	        p.setY(1);
	        q.setX(3);
	        q.setY(3);
	        System.out.println(p.absoulte(q));
	        System.out.println(p.distance(q));
	        p.setX(2);
	        p.setY(7);
	        q.setX(-3);
	        q.setY(1);
	        p.equationOfLine(q);
		
		p.setX(3);
		p.setY(-7);
		q.setX(-2);
		q.setY(0);
		Point r = new Point(0,11);
		if ( p.isClockwise(q,r) )
			System.out.println("Clockwise");
		else if ( p.isCounterClockwise(q,r) )
			System.out.println("Counter-clockwise");
		else
			System.out.println("Collinear");
		
		
		
}
}
