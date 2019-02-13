/**
 * Abstract superclass for shape objects. 
 * All known subclasses: Circle, Rectangle, Square, Triangle
 * @author Tanner Yilmaz
 * @version 1.0
 */
public abstract class Shape implements Displayable, Comparable<Shape> {

	protected static int shapeCount;
	
	public Shape() {
		shapeCount++;
	}
	
	/**
	 * Calculates and returns the object's area.
	 * @return double value of object's area. 
	 */
	public abstract double area();
	
	/**
	 * Calculates and returns object's perimeter.
	 * @return double value of object's perimeter. 
	 */
	public abstract double perimeter();
	
	/**
	 * Returns a string representation of the object.
	 * @return A string representing the object. 
	 */
	public abstract String getShape();
	
	@Override
	public void display() {
		System.out.println("Object type: " + this.getShape());
		System.out.println("Area: " + this.area());
		System.out.println("Perimeter: " + this.perimeter());
		System.out.println("");
	}
	
	/**
	 * Returns -1 if parameter object's area is greater than this object's area. Returns 1 if parameter object's 
	 * area is less than this object's area. Returns 0 if both object's have equal areas. 
	 * @param shape object being compared to this object.
	 * @return integer representing the result of the comparison.
	 * @see Comparable#compareTo()
	 */
	@Override
	public int compareTo(Shape shape) {
		if(this.area() < shape.area()) {
			return -1;
		}
		else if(this.area() > shape.area()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
