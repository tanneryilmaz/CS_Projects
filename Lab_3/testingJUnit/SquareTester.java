package testingJUnit;

import org.junit.jupiter.api.*;

import junit.framework.*;
import junit.framework.Test;

/**
 * This tester class tests all of Square.java public methods.
 * @author Tanner Yilmaz
 */
public class SquareTester extends TestCase {
	
	private Square s1, s2, s3, s4, s5, s6;
	
	public static void main(String[] args) {
		
		SquareTester tester = new SquareTester();		
		tester.testConstructor();
		tester.testToString();
		tester.testEquals();
	}
	
	/**
	 * Tests all constructors
	 */
	public void testConstructor() {
		
		assertEquals(1.0, s1.getSize());
		assertEquals(5.9, s3.getSize());
		assertEquals(100000.0, s4.getSize());
	}
	
	/**
	 * Testing toString() method
	 */
	public void testToString() {
		
		assertEquals("Square: size: " + s1.getSize(), s1.toString());
		assertEquals("Square: size: " + s4.getSize(), s4.toString());
		assertEquals("Square: size: " + s5.getSize(), s5.toString());
	}
	
	/**
	 * Testing equals() method
	 */
	public void testEquals() {
		assertTrue(s1.equals(s2));
		assertTrue(s5.equals(s6));
		assertFalse(s4.equals(0.0));
		assertFalse(s4.equals(s5));
	}
	
	@Override
	public void setUp() {
		s1 = new Square();
		s2 = new Square();
		s3 = new Square(5.9);
		s4 = new Square(100000.0);
		s5 = new Square(0.0);
		s6 = new Square(0.0);
	}
	
	@Override
	public void tearDown() {
		s1 = null;
		s2 = null;
		s3 = null;
		s4 = null;
		s5 = null;
		s6 = null;
	}
}
