package com.in28minutes.oops.level2;

public class Rectangle {
	
	// state
	private int length;
	private int width;
	
	// constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// method
	
	// getter & setter
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	// calculate area
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width); 
	}
	
	// 출력
	public String toString() {
		return String.format("length - %d, width - %d,  area - %d, perimeter - %d", length, width, area(), perimeter());
	}
	
	
	

}
