//package rectangle;

public class Rectangle {

	private double length, height;
	private static int counter = 0;
	private int rectangleID;
	
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
		this.rectangleID = counter;	
		counter += 1;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getLength() {
		return length; 
	}
	
	public double getHeight() {
		return height;
	}
	
	public double area() {
		return length * height;
	}
	
	public double perimeter() {
		return 2 * length + 2 * height;
	}
	
	public int getRectangleID() {
		return rectangleID;
	}
}
