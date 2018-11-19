package ua.com.qalight.pylypchuk;

import java.util.logging.Logger;

import ua.com.qalight.pylypchuk.circle.Circle;
import ua.com.qalight.pylypchuk.square.Square;
import ua.com.qalight.pylypchuk.triangle.Triangle;

public class AppRunner {
	Triangle triangle = new Triangle();
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		triangle.setBase(12);
		triangle.setHeight(21);
		
		Circle circle = new Circle();
		circle.setRadius(10);
		
		Square square = new Square();
		square.setSide(7);
		
		logger.info(String.valueOf(triangle.getArea()));
		logger.info(String.valueOf(circle.getArea()));
		logger.info(String.valueOf(square.getArea()));
		
	}
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
		
	
	

}
