package ua.com.qalight.pylypchuk.square;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.com.qualight.pylypchuk.square.Square;

public class SquareTest {

	@Test
	public void test() {
		Square square = new Square();
		square.setSide(7);
		assertNotNull(square.getArea());
	}

}
