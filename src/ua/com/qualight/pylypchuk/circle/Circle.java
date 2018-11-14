package ua.com.qualight.pylypchuk.circle;

import ua.com.qualight.pylypchuk.AbstractShape;

public class Circle extends AbstractShape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
	
	

}
