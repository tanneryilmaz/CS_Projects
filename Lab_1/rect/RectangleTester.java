package rect;

public class RectangleTester {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0, 6.0);
		Rectangle r1 = new Rectangle(5.0, 6.0);
		
		Square sq1 = new Square(5.5);
		Square sq2 = new Square(5.5);
		
		System.out.println("testing rectangle equivalence using ==: " + (r == r1));
		System.out.println("testing rectangle equivalence using .equals(): " + r.equals(r1));
		
		System.out.println("testing square equivalence using ==: " + (sq1 == sq2));
		System.out.println("testing square equivalence using .equals(): " + sq1.equals(sq2));
	}
}
