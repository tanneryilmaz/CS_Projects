/**
 * This class represents Square objects. 
 * All known superclasses: Rectangle
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class Square extends Rectangle {
	
	private final double SIZE;
	
	/** 
	 * Initializes side length to default value of 1.0
	 */
	public Square() {
		this.SIZE = 1.0;
	}
	
	/** 
	 * Initializes side length
	 * @param size Side length of the object
	 */
	public Square(double size) {
		this.SIZE = size;
	}
	
	@Override
	public double area() {
		return SIZE * SIZE;
	}
	
	@Override
	public double perimeter() {
		return 4.0 * SIZE;
	}
	
	@Override
	public String getShape() {
		return "square";
	}
}








