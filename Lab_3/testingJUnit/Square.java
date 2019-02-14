package testingJUnit;

/**
 * This class represents square objects
 * @author Tanner Yilmaz
 * @version 1.0
 */

public class Square{
	
	private double size;
	
	/**
	 * Initializes size to default value of 1.0
	 */
	public Square() {
		this.size = 1.0;
	}
	
	/**
	 * Initializes size to parameter size
	 * @param side length of square
	 */
	public Square(double size) {
		this.size = size;
	}
	
	/**This method returns a string representation of square objects*/
	@Override
	public String toString()
	{
		return "Square: size: " + size;
	}
	
	/**
	 * Method compares whether two squares are of equal sizes and returns boolean. 
	 * @param object being compared to square object
	 */
	@Override
	public boolean equals(Object obj1) {
				
		if(obj1 instanceof Square) { 
			Square sqObject = (Square) obj1;
			return this.size == sqObject.size;
		}
		else {
			return false;
		}		
	}
	
	/**
	 * Returns the side length of the square.
	 * @return double 
	 */
	public double getSize() {
		return size;
	}
}
