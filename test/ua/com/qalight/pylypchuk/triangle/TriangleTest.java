package ua.com.qalight.pylypchuk.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.com.qalight.pylypchuk.triangle.Triangle;

public class TriangleTest {

	@Test
	public void test() {
		Triangle triangle = new Triangle();
		triangle.setBase(12);
		triangle.setHeight(21);
		assertNotNull(triangle.getArea());
		}

}
