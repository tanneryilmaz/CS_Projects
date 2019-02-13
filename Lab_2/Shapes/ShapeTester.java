import java.util.ArrayList;
import java.util.Collections;

/**
 * This program adds objects of various types to an ArrayList, sorts the list based on object area, and prints the ArrayList.
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class ShapeTester {

	public static void main(String[] args) {
		
		Circle c = new Circle(10);
		Circle c1 = new Circle(1.);
		Triangle t = new Triangle(3, 4, 5);
		Rectangle r = new Rectangle(5.8, 2.9);
		Square s = new Square(3.4);
		Triangle t1 = new Triangle(3,3,9);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(c);
		shapes.add(t);
		shapes.add(r);
		shapes.add(c1);
		shapes.add(s);
		shapes.add(c1);
		shapes.add(c);
		
		for(Shape o: shapes) { 
			System.out.println(o.getShape());
		}
		
		int counter = 0;
		for(Shape circle: shapes) {
			if(circle instanceof Circle) {
				System.out.println(circle.getShape() + " at index " + counter);
			}
			counter++;
		}
		
		System.out.println("Shape count: " + Shape.shapeCount + "\n");	
		System.out.println("PRINTING UNSORTED SHAPES");
		
		displayArray(shapes);
		
		Collections.sort(shapes);
		
		System.out.println("\nSORTING ARRAY_LIST\n");
		
		displayArray(shapes);
	}
	
	/**
	 * Prints the object type, area, and perimeter of all objects
	 * @param shapes ArrayList of shape objects to be printed
	 * @see Shape#display()
	 */
	public static void displayArray(ArrayList<Shape> shapes) {
		for(Shape shape: shapes) { 
			shape.display();
		}
	}
}

