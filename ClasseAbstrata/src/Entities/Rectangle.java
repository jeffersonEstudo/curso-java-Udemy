package Entities;

import Entities.enums.Color;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
