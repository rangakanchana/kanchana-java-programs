package com.oops;

public class Circle extends Shape implements ShapeConstants{
	double radius;
	public Circle(){
		radius = 3;
		 noOfSides=0;
	}
	@Override
	public double calculateArea() {
		area = pi*radius*radius;
		return area;
	}
	@Override
	public double calculatePerimeter() {
		perimeter = 2*pi*radius;
		return perimeter;
	}
	@Override
	public void setSides() {
      noOfSides = 0;		
	}

}
