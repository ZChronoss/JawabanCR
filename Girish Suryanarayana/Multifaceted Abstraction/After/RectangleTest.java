import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(r.area(), 15);
		assertEquals(r.perimeter(), 16);
		
		BorderRectanglePrinter brp = new BorderRectanglePrinter(r);
		brp.print();
		System.out.println("");
		FullRectanglePrinter frp = new FullRectanglePrinter(r);
		frp.print();
	}

}
