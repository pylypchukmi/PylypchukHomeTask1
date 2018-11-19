package ua.com.qualight.pylypchuk;

import java.util.logging.Logger;

import ua.com.qualight.pylypchuk.circle.Circle;
import ua.com.qualight.pylypchuk.square.Square;
import ua.com.qualight.pylypchuk.triangle.Triangle;

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
