
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

}
