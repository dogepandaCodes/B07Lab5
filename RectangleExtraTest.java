import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleExtraTest {

	@Test
    public void testPerimeter() {
        Point A = new Point(-1, 1);
        Point B = new Point(1, 1);
        Point C = new Point(1, -1);
        Point D = new Point(-1, -1);

        Rectangle rect = new Rectangle(A, B, C, D);
        assertEquals(8 , rect.perimeter());
    }
	
	@Test
    public void testValid1() {
        Point A1 = new Point(-1, 1);
        Point B1 = new Point(1, 1);
        Point C1 = new Point(1, -1);
        Point D1 = new Point(-1, -1);

        Rectangle rect1 = new Rectangle(A, B, C, D);
        assertTrue(rect1.isValid());
    }
	
	@Test
    public void testValid2() {
        Point A1 = new Point(-1, 1);
        Point B1 = new Point(1, 269);
        Point C1 = new Point(1, -1);
        Point D1 = new Point(-1, -1);

        Rectangle rect1 = new Rectangle(A, B, C, D);
        assertTrue(!rect1.isValid());
    }
	
	@Test
    public void testSquare() {
        Point A1 = new Point(-1, 1);
        Point B1 = new Point(1, 1);
        Point C1 = new Point(1, -1);
        Point D1 = new Point(-1, -1);

        Rectangle rect1 = new Rectangle(A, B, C, D);
        assertTrue(rect1.isSquare());
    }
	
	@Test
    public void testSquare2() {
        Point A1 = new Point(-1, 1);
        Point B1 = new Point(1, 269);
        Point C1 = new Point(1, -1);
        Point D1 = new Point(-1, -1);

        Rectangle rect1 = new Rectangle(A, B, C, D);
        assertTrue(!rect1.isSquare());
    }
}
