/**
 * This class represents Rectangle objects. 
 * All known superclasses: Shape
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class Triangle extends Shape{
	
	private final double SIDE_1;
	private final double SIDE_2;
	private final double SIDE_3;
	
	/**
	 * Initializes all side lengths to default value of 1.0.
	 */
	public Triangle() {
		this.SIDE_1 = 1.0;
		this.SIDE_2 = 1.0;
		this.SIDE_3 = 1.0;
	}
	
	/**
	 * Initializes all side lengths to default value of 1.0.
	 * @param len1 double value for side length
	 * @param len2 double value for side length
	 * @param len3 double value for side length
	 */
	public Triangle(double len1, double len2, double len3) {
		this.SIDE_1 = len1;
		this.SIDE_2 = len2;
		this.SIDE_3 = len3;
	}
	
	@Override
	public double area() {
		double s = perimeter() / 2.0;
		double area = Math.sqrt(s * (s - SIDE_1) * (s - SIDE_2) * (s - SIDE_3));
		return area;
	}
	
	@Override
	public double perimeter() {
		return SIDE_1 + SIDE_2 + SIDE_3;
	}
	
	@Override
	public String getShape() {
		return "triangle";
	}
}
