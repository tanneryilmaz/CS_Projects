package rect;

/**
 * This class represents square objects and extends the Rectangle class
 * @author Tanner Yilmaz
 * @version 1.0
 */

public class Square extends Rectangle {
	
	private double size;
	
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
}
