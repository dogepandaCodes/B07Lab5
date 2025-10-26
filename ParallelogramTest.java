package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParallelogramTest {

	@Test
	void testperimeter() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,2);
		Point p4 = new Point(2,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertEquals(pa1.perimeter(), (2 * (Math.sqrt(5) + 2)));
	}
	
	@Test
	void testarea() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,2);
		Point p4 = new Point(2,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertEquals(pa1.area(), 4);
	}
	
	@Test
	void testisValidTrue() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,2);
		Point p4 = new Point(2,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertTrue(pa1.isValid());
	}
	
	@Test
	void testisValidFalse1() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,4);
		Point p3 = new Point(3,2);
		Point p4 = new Point(2,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertFalse(pa1.isValid());
	}
	
	@Test
	void testisValidFalse2() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,2);
		Point p4 = new Point(4,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertFalse(pa1.isValid());
	}
	
	@Test
	void testisValidFalse3() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,4);
		Point p3 = new Point(2,3);
		Point p4 = new Point(2,1);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertFalse(pa1.isValid());
	}
	
	@Test
	void testisRectangleinvalid() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,3);
		Point p3 = new Point(3,2);
		Point p4 = new Point(3,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertFalse(pa1.isRectangle());
	}
	
	@Test
	void testisRectangleTrue() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,0);
		Point p3 = new Point(2,2);
		Point p4 = new Point(0,2);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertTrue(pa1.isRectangle());
	}
	
	@Test
	void testisRectangleFalse() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,2);
		Point p3 = new Point(3,2);
		Point p4 = new Point(2,0);
		Parallelogram pa1 = new Parallelogram(p1, p2, p3, p4);
		assertFalse(pa1.isRectangle());
	}
	
}