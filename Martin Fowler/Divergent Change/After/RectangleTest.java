package divergent_change.after;

import org.junit.jupiter.api.Test;

class RectangleTest {
	

	@Test
	void test() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(r.area(), 15);
		assertEquals(r.perimeter(), 16);
		
		System.out.println("");
		
		FullRectanglePrinter frp = new FullRectanglePrinter(r);
		frp.print();
		System.out.println("");
		BorderRectanglePrinter brp = new BorderRectanglePrinter(r);
		brp.print();
	}

	private void assertEquals(int area, int i) {
		// TODO Auto-generated method stub
		
	}

}