package ua.com.qalight.pylypchuk.circle;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.com.qualight.pylypchuk.circle.Circle;

public class CircleTest {

	@Test
	public void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(3);
		double result = circle.getArea();
		
		assertNotNull(circle.getArea());
		assertEquals(28.1, result, 1);
		assertTrue(result > 28.0 && result < 29.0);
		
		
	}

}
