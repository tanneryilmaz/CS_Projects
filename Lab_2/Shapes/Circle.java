/**
 * This class represents Circle objects. 
 * All known superclasses: Shape
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class Circle extends Shape {
	
	private final double RADIUS;
	
	/**
	 * Initializes radius to default value of 1.0. 
	 */
	public Circle() {
		RADIUS = 1.0;
	}
	
	/**
	 * Initializes radius of object.
	 * @param radius of object
	 */
	public Circle(double radius) {
		RADIUS = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(RADIUS, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * RADIUS;
	}
		
	@Override
	public String getShape() {
		return "circle";
	}
}
