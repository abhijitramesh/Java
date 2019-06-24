
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

}
