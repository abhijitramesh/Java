package lab_1;

public class Point {
	private int x;
	private int y;
	Point(){
		this.x=0;
		this.y=0;
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void print() {
		System.out.println("x = "+this.x+"\ny = "+this.y);
	}
	public boolean isOrigin() {
		if(this.x == 0&& this.y==0) {
			return true;
		}
		else 
			return false;
	}
	public int whichQuadrant() {
		if(this.x==0&&this.y==0) {return 0;}
		else 
			if(this.x>0&&this.y>0) {return 1;}
			else 
				if(this.x<0&&this.y<0) {return 2;}
				else
					if(this.x<0&&this.y<0) {return 3;}
					else
						return 4;
	}
	public Point xProjection() {
		this.setY(0);
		return this;
	}
	public Point yProjection() {
		this.setX(0);
		return this;
	}
	public void scalarMultiply(int c) {
		this.x = x*c;
		this.y = y*c;
	}
	/** This method adds two Points and returns the sum */ 
	public Point sum(Point q) {
		return new Point(this.x+q.x,this.y+q.y);
		
	}
	public double slope(Point p) {
		return (double)(p.y-this.y)/(p.x-this.x);
	}
	public int absoulte(Point p) {
		return Math.abs((p.x-this.x)+(p.y-this.y));
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.y-this.y), 2)+Math.pow(p.x-this.x, 2));
	}
	public double yintercept(Point p) {
		return this.y-slope(p)*this.x;
	}
	public void equationOfLine(Point p) {
		double m = slope(p);
		double c = yintercept(p);
		System.out.println("y ="+m+"x + "+c);
	}
	public boolean isClockwise(Point q,Point r) {
		if(this.slope(q)>this.slope(r))
				{return true;}
		else return false;
		
	}
	public boolean isCounterClockwise(Point q,Point r) {
		if(this.slope(q)<this.slope(r))
				{return true;}
		else return false;
		
	}
	public boolean isCollinear(Point q,Point r) {
		if(this.slope(q)==this.slope(r))
				{return true;}
		else return false;
		
	}
	public static Point[] sort(Point[] points) {
		int length = points.length;
		int n = length -1;
		for(int i =0;i<n;i++) {
			 int k = minimumX(i, n,points);
			points[i].swap(points[k]);
		}
		return points;
	}
	public static int minimumX(int start,int end,Point[] points) {
		int minIndex = start;
		 for (int j = start+1; j <= end; j++) {
		        if (points[j].getX() < points[minIndex].getX())
		          minIndex = j;
		      }
		      return minIndex;
	}
	public void swap(Point q) {
		Point temp = new Point();
		temp.x = this.x;
		temp.y = this.y;
		
		this.x = q.x;
		this.y= q.y;
		
		q.x = temp.x;
		q.y = temp.y;
	}
	



}
