package ua.com.qualight.pylypchuk;

import java.util.logging.Logger;

import ua.com.qualight.pylypchuk.triangle.Triangle;

public class AppRunner {
	Triangle triangle = new Triangle();
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		triangle.setBase(12);
		triangle.setHeight(21);
		
		logger.info(String.valueOf(triangle.getArea()));
		
	}
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
		
	
	

}
