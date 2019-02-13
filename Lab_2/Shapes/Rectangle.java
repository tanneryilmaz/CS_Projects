/**
 * This class represents Rectangle objects. 
 * All known superclasses: Shape
 * All known subclasses: Square
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class Rectangle extends Shape {

	private final double LENGTH, HEIGHT;

	/**
	 * Initializes the length and height attributes to 1.0;
	 */
	public Rectangle() {
		this.LENGTH = 1.0;
		this.HEIGHT = 1.0;	
	}
	
	/**
	 * This constructor takes two parameters and initializes the length and height attributes
	 * @param length double value for rectangle's length
	 * @param height double value for rectangle's height
	 */
	public Rectangle(double length, double height) {
		this.LENGTH = length;
		this.HEIGHT = height;
	}
	
	@Override
	public double area() {
		return LENGTH * HEIGHT;
	}
	
	@Override
	public double perimeter() {
		return 2 * LENGTH + 2 * HEIGHT;
	}
	
	@Override
	public String getShape() {
		return "rectangle";
	}
}

