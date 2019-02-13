package rectangle;
public class RectangleTester {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0, 6.0);
		Rectangle r1 = new Rectangle(5.0, 6.0);
		Rectangle r2 = new Rectangle(5.0, 6.0);
		Rectangle r3 = new Rectangle(5.0, 6.0);
		
		System.out.print(r.getArea() + " " + r.getHeight() + r.getRectangleID() + r3.getRectangleID());
	}
}
