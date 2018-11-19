package ua.com.qalight.pylypchuk.triangle;

import ua.com.qalight.pylypchuk.AbstractShape;

public class Triangle extends AbstractShape {

	private double height;
	private double base;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double getArea() {
		return base*height*0.5;
	}
	
	
	
}
