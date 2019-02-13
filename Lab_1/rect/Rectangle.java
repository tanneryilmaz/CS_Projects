package rect;

/**
 * This class represents Rectangle objects. Square extends this class.
 * @author Tanner Yilmaz
 * @version 1.0
 */

public class Rectangle {

	private double length, height;
	private static int counter = 0;
	private int rectangleID;
	
	public Rectangle() {
		length = 0.0;
		height = 0.0;
		rectangleID = 0;
	}
	
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
	
	@Override
	public String toString() {
		return "Rectange: length: " + this.length + "height: " + this.height;
	}
}

