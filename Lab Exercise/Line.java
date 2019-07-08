package lab_1;

public class Line {
	private Point point1;
	private Point point2;
	
	Line(){
		this.point1 = new Point();
		this.point2 = new Point(1,1);
	}
	
	Line(Point p1,Point p2){
		this.point1 = p1;
		this.point2 = p2;
		
	}
	Line(int x1,int y1,int x2,int y2){
		this.point1 = new Point(x1,y1);
		this.point2 =  new Point(x2,y2);
		
	}
	
	public Point getPoint1() {
		return this.point1;
	}
	public Point getPoint2() {
		return this.point2;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public double Slope(Line l1) {
		return (double)((l1.point2.getY()-l1.point1.getY())/(l1.point2.getX()-l1.point1.getX()));
		
	}
	

}
