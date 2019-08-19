

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
	
	System.out.println("**********************************ARRAYS**********************************");
	
	  Point[] pointss = new Point[20];

	  for (int i = 0; i < 20; i++)
	    pointss[i] = new Point(i*31%11,i*59%11); // i*31(mod 11), i*59(mod 11)

	  for (int i = 1; i < 20; i++)
	    System.out.println( "The slope of " + pointss[0] 
	                        + " and " + pointss[i] 
	                        + " = " + pointss[0].slope( pointss[i]) );
	  Point[] points = new Point[20];
	  
	  for(int i=0;i<20;i++) 
		  points[i] = new Point(i*31%11,i*59%11);
	  Point.sort(points);
	  
	  for(int i =0;i<20;i++) 
		  System.out.println(points[i]);
System.out.println("*********************************Composition************************************************");
		Line l1 = new Line(1,1,2,2);
		System.out.println(l1.getPoint1().getX() +" "+ l1.getPoint1().getY());
		System.out.println(l1.getPoint2().getX()+" "+l1.getPoint2().getY());
System.out.println("*********************************Interfaces************************************************");
		Circle c1 = new Circle();
		c1.radius = 2.6;
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		Triangle t1 = new Triangle();
		t1.side=2;
		t1.side1=3;
		t1.side2=4;
		System.out.println(t1.area());
		System.out.println(t1.perimeter());
		Square s1= new Square();
		s1.side = 2;
		System.out.println(s1.area());
		System.out.println(s1.perimeter());
		
		
}

}
